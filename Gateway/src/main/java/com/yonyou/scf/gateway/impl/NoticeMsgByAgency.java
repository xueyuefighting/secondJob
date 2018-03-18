package com.yonyou.scf.gateway.impl;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.yonyou.scf.api.tx.notice.Scf1218NoticeRequest;
import com.yonyou.scf.common.helper.MessengerHelper;
import com.yonyou.scf.common.schema1.domain.AccountsFinancingApplication;
import com.yonyou.scf.common.schema1.domain.AccountsFinancingApplicationExample;
import com.yonyou.scf.common.schema1.domain.Capital;
import com.yonyou.scf.common.schema1.domain.Finance;
import com.yonyou.scf.common.schema1.domain.FinancingApplication;
import com.yonyou.scf.common.schema1.domain.FinancingApplicationExample;
import com.yonyou.scf.common.schema1.domain.PlatformInfo;
import com.yonyou.scf.common.schema1.domain.Product;
import com.yonyou.scf.common.schema1.domain.UserCombineStatus;
import com.yonyou.scf.common.schema1.domain.UserCombineStatusExample;
import com.yonyou.scf.common.schema1.mapper.AccountsFinancingApplicationMapper;
import com.yonyou.scf.common.schema1.mapper.CapitalMapper;
import com.yonyou.scf.common.schema1.mapper.FinancingApplicationMapper;
import com.yonyou.scf.common.schema1.mapper.PlatformInfoMapper;
import com.yonyou.scf.common.schema1.mapper.ProductMapper;
import com.yonyou.scf.common.schema1.mapper.UserCombineStatusMapper;
import com.yonyou.scf.common.tx.api.ResultBean;
import com.yonyou.scf.common.tx.notice.Scf1108NoticeRequest;
import com.yonyou.scf.common.tx.notice.Scf1118NoticeRequest;
import com.yonyou.scf.common.tx.notice.Scf1208NoticeRequest;
import com.yonyou.scf.gateway.interf.INoticeMsgByAgency;
import com.yonyou.scf.tools.constant.DefaultConstants;
import com.yonyou.scf.tools.system.CodeException;
import com.yonyou.scf.tools.util.StringUtil;
import com.yonyou.scf.tools.util.TimeUtil;



@Service("noticeMsgByAgency")
public class NoticeMsgByAgency implements INoticeMsgByAgency{
	
	private volatile String platformId;
	
	//商户端角色 10-核心企业 20-融资方
		public final static int USER_ROLE_10 = 10;
		public final static int USER_ROLE_20 = 20;
	//贷前准备状态
	private final static int BEFORE_LOAN_STATUS_20 = 20;
	//贷前准备已完成
	private final static int BEFORE_LOAN_STATUS_40 = 40;
	
	//融资申请变更状态
	public final static int APPLICATION_BILL_STATUS_20 = 20;//审核中
	public final static int APPLICATION_BILL_STATUS_30 = 30;//申请失败
	public final static int APPLICATION_BILL_STATUS_40 = 40;//融资成功
	public final static int APPLICATION_BILL_STATUS_20_T = 20;//审核中  _T 表
	public final static int APPLICATION_BILL_STATUS_31_T = 31;//申请失败
	public final static int APPLICATION_BILL_STATUS_32_T = 32;//融资成功
	
	public final static String agencyAdminRole = "ROLE88888888";//融资方超管
	public final static String companyAdminRole = "ROLE88888888";//融资成功
	

	/**
	 * 采购融资lccbproductmode001
	 */
	public static String FINANCE_MODE_LCCB_01="lccbproductmode001";
	/**
	 * 有追索权应收账款lccbproductmode002
	 */
	public static String FINANCE_MODE_LCCB_02="lccbproductmode002";
	/**
	 * 无追索权应收账款lccbproductmode003
	 */
	public static String FINANCE_MODE_LCCB_03="lccbproductmode003";
	
	/**
	 * 订单融资01
	 */
	public static String FINANCE_MODE_BASE_01="01";
	
	//利率精度
	public final static int NUMBER_PRECISION = 1000000;
	
	@Autowired
	CapitalMapper capitalMapper;
	@Autowired
	PlatformInfoMapper platformInfoMapper;
	@Autowired
	ProductMapper productMapper; 
	@Autowired
	FinancingApplicationMapper financingApplicationMapper;
	@Autowired
	AccountsFinancingApplicationMapper accountsFinancingApplicationMapper;
	@Autowired
	UserCombineStatusMapper userCombineStatusMapper;
	/*
	 * 发送融资服务开通成功通知
	 * @param merchantUserId
	 * @param product
	 * @throws Exception
	 * @throws CodeException
	 */
	public  void noticeMsgByAgencyFor1108Or1118(String merchantUserId, Product product, String platformId) throws Exception,
			CodeException {
		
		this.platformId = platformId;
		
		PlatformInfo platformInfo = getPlatformEntity();
		
		String productCapitalId = product.getProductCapitalId();
		
		String theTypeOfBank = judgeTypeOfBank(productCapitalId);
		
		//1.2如果是非签约银行,发SCF1118
		if("underLine".equals(theTypeOfBank)){
			sendSCF1118(merchantUserId, product, platformInfo);
		}else{//1.1如果是签约银行，发SCF1108
			sendSCF1108(merchantUserId, product, platformInfo);
		}
	}
	@Override
	public  void noticeMsgByAgencyFor1208Or1218(Finance finance, PlatformInfo platformInfo, int status, String mode) throws Exception, CodeException {
		if(FINANCE_MODE_BASE_01.equals(mode) || FINANCE_MODE_LCCB_01.equals(mode)){//订单采购融资
				sendSCF1208(finance, platformInfo, status);
		}else if(FINANCE_MODE_LCCB_02.equals(mode) || FINANCE_MODE_LCCB_03.equals(mode)){//xxx应收帐款
			sendSCF1218(finance, platformInfo, status);
		}
	}
	public PlatformInfo getPlatformEntity() throws Exception {
		//获取当前系统渠道方systemid
		String platformSystemId = getPaltformInfo();
		
		if(platformSystemId==null){
			throw new Exception("获取渠道方主键id有误");
		}
		
		PlatformInfo platformInfo = platformInfoMapper.selectByPrimaryKey(platformSystemId);
		return platformInfo;
	}

	public void sendSCF1108(String merchantUserId, Product product,
			PlatformInfo platformInfo)
			throws CodeException {
		
		if(platformInfo==null){
			try {
				platformInfo = getPlatformEntity();
			} catch (Exception e) {
				e.printStackTrace();
				throw new CodeException(e.getMessage());
			}
		}
		
		final Scf1108NoticeRequest scf1108 = new Scf1108NoticeRequest();
		int typeInt = 20;//信用融资
		//下面如果是换oms 换库 是必须要改动的
		if("01".equals(product.getProductMode())){//订单融资
			typeInt = 10;
		}else {
			typeInt = 30;
		}
		
		String companyId = changeTenantBySCF(product.getProductCompanyId());//商户端企业id
		
		scf1108.setFundId(product.getProductCapitalId());
		scf1108.setProductId(product.getProductId());
		scf1108.setProductName(product.getProductName());
		scf1108.setBeforeLoanStatus(BEFORE_LOAN_STATUS_20);
		scf1108.setCenterCompanyId(companyId);
		scf1108.setFsManagedAccountBankID("0000");
		scf1108.setFsManagedAccountNumber("0000");
		
		scf1108.setFinanceProductionType(typeInt);
		scf1108.setFsId(merchantUserId);
		
		final PlatformInfo platformInf = platformInfo;
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				ResultBean rb = new ResultBean();
				try {
					rb = MessengerHelper.doSend(platformInf.getPlatformId(),
							DefaultConstants.API_SCF1108, 2, platformInf.getInformUrl(), scf1108);
				} catch (CodeException e) {
					e.printStackTrace();
				}
				System.out.println("发送通知返回值:"+rb.toString());
			}
		}).start();
	}

	/**
	 * @param merchantUserId 商户端用户id
	 * @param product 产品
	 * @param platformInfo 平台信息
	 * @param typeInt 融资类型
	 * @throws CodeException
	 */
	public void sendSCF1118(String merchantUserId, Product product,
			PlatformInfo platformInfo) throws CodeException {
		
		if(platformInfo==null){
			try {
				platformInfo = getPlatformEntity();
			} catch (Exception e) {
				e.printStackTrace();
				throw new CodeException(e.getMessage());
			}
		}
		
		int typeInt = 20;//信用融资
		//下面如果是换oms 换库 是必须要改动的
		if("01".equals(product.getProductMode())){//订单融资
			typeInt = 10;
		}else {
			typeInt = 30;
		}
		
		String companyId = changeTenantBySCF(product.getProductCompanyId());//商户端企业id
		
		final Scf1118NoticeRequest scf1118 = new Scf1118NoticeRequest();
		scf1118.setFundId(product.getProductCapitalId());
		scf1118.setProductId(product.getProductId());
		scf1118.setProductName(product.getProductName());
		scf1118.setBeforeLoanStatus(BEFORE_LOAN_STATUS_40);
		scf1118.setCenterCompanyId(companyId);
		scf1118.setFinanceProductionType(typeInt);
		scf1118.setFsId(merchantUserId);
		final PlatformInfo platformInf = platformInfo;
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				ResultBean rb = new ResultBean();
				try {
					rb = MessengerHelper.doSend(platformInf.getPlatformId(),
							DefaultConstants.API_SCF1118, 2, platformInf.getInformUrl(), scf1118);
				} catch (CodeException e) {
					e.printStackTrace();
				}
				System.out.println("发送通知返回值:"+rb.toString());
			}
		}).start();
	}
	
	/*
	 * 判断银行的类型
	 * @return online 线上；underLine 线下
	 */
	public String judgeTypeOfBank(String capitalId) throws Exception {
		Capital capital = capitalMapper.selectByPrimaryKey(capitalId);
		
		if(capital==null){
			throw new Exception("获取资方信息有误");
		}
		
		String capitalBankid = capital.getCapitalBankid();
		
		if("0".equals(capitalBankid)){
			return "underLine";
		}
		
		return "onLine";
	}
	
	public String getPaltformInfo() {
		
		if(!StringUtil.isEmpty(this.platformId)){
			return this.platformId;
		}
		
		InputStream in  = NoticeMsgByAgency.class.getClassLoader().getResourceAsStream("config.properties");
		Properties p = new Properties();
		try {
			p.load(in);
			return p.getProperty("merchant.platformInfo.systemId");
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}finally{
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
					return null;
				}
			}
		}
	}

	/* 
	 * 融资申请状态变更通知
	 */
	private void sendSCF1208(Finance finance,
			PlatformInfo platformInfo, int status) throws CodeException {
		
		if(platformInfo==null){
			try {
				platformInfo = getPlatformEntity();
			} catch (Exception e) {
				e.printStackTrace();
				throw new CodeException(e.getMessage());
			}
		}
		
		final Scf1208NoticeRequest scf1208 = new Scf1208NoticeRequest();
		
		Product product =  productMapper.selectByPrimaryKey(finance.getFinanceProductId());
		
		FinancingApplicationExample example = new FinancingApplicationExample();
		example.createCriteria().andFinancingIdEqualTo(finance.getFinanceId());
		
		List<FinancingApplication> financingApplicationList = financingApplicationMapper.selectByExample(example);
		
		if(financingApplicationList==null || financingApplicationList.size()<=0 || financingApplicationList.size()>1){
			throw new CodeException("商户端融资申请单数据有误，请联系运营人员");
		}
		
		FinancingApplication financingApplication = financingApplicationList.get(0);
		
		String companyId = changeTenantBySCF(product.getProductCompanyId());//商户端企业id
		
		scf1208.setApplicationBillStatus(status);
		scf1208.setBillNo(financingApplication.getBillNo());
		scf1208.setCenterCompanyID(companyId);
		scf1208.setFinanceAmount(finance.getFinanceAmount().multiply(new BigDecimal(100)).intValue());
		scf1208.setFinanceProductionInterest(getInt(product.getProductRate()));
		scf1208.setFinanceProductionType(financingApplication.getFinanceProductionType());
		scf1208.setFinancingApplicationNo(financingApplication.getFinancingApplicationNo());
		scf1208.setFsID(financingApplication.getFsId());
		scf1208.setFundID(product.getProductCapitalId());
		scf1208.setOverdueInterest(getInt(product.getProductOverrate()));

		//		scf1208.setRepayWay(product.getProductRepaytype());
		
		final PlatformInfo platformInf = platformInfo;
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				ResultBean rb = new ResultBean();
				try {
					rb = MessengerHelper.doSend(platformInf.getPlatformId(),
							DefaultConstants.API_SCF1208, 2, platformInf.getInformUrl(), scf1208);
					System.out.println("发送通知返回值:"+rb.toString());
				} catch (CodeException e) {
					e.printStackTrace();
				}
				System.out.println("发送通知返回值:"+rb.toString());
			}
		}).start();
	}
	/* 
	 * 融资申请状态变更通知
	 */
	private void sendSCF1218(Finance finance,
			PlatformInfo platformInfo, int status) throws CodeException {
		
		if(platformInfo==null){
			try {
				platformInfo = getPlatformEntity();
			} catch (Exception e) {
				e.printStackTrace();
				throw new CodeException(e.getMessage());
			}
		}
		
		System.out.println("发送1218通知接口开始，参数：finance："+finance.toString()+"...platformInfo:"+platformInfo.toString());
		final Scf1218NoticeRequest scf1218 = new Scf1218NoticeRequest();
		
		Product product =  productMapper.selectByPrimaryKey(finance.getFinanceProductId());
		
		AccountsFinancingApplicationExample accountsFinancingApplicationExample = new AccountsFinancingApplicationExample();
		accountsFinancingApplicationExample.createCriteria().andFinancingIdEqualTo(finance.getFinanceId());
		
		List<com.yonyou.scf.common.schema1.domain.AccountsFinancingApplication> financingApplicationList = accountsFinancingApplicationMapper.selectByExample(accountsFinancingApplicationExample);
		
		System.out.println("financingApplicationList列表信息："+financingApplicationList.toString());
		if(financingApplicationList==null || financingApplicationList.size()<=0 || financingApplicationList.size()>1){
			System.out.println("商户端融资申请单数据有误，请联系运营人员");
			//throw new CodeException("商户端融资申请单数据有误，请联系运营人员");
		}
		
		AccountsFinancingApplication accountsFinancingApplication = financingApplicationList.get(0);
		
		String companyId = changeTenantBySCF(product.getProductCompanyId());//商户端企业id
		
		scf1218.setApplicationBillStatus(status);
		scf1218.setCenterCompanyID(companyId);
		scf1218.setFinanceAmount(finance.getFinanceAmount().multiply(new BigDecimal(100)).intValue());
		scf1218.setFinanceProductionInterest(getInt(product.getProductRate()));
		scf1218.setFinancingApplicationNo(accountsFinancingApplication.getFinancingApplicationNo());
		scf1218.setFsID(accountsFinancingApplication.getFsId());
		scf1218.setFundID(product.getProductCapitalId());
		scf1218.setOverdueInterest(getInt(product.getProductOverrate()));
		scf1218.setAccountsRecevieVoucherNo(accountsFinancingApplication.getAccountsRecevieVoucherNo());
		
		String vType = accountsFinancingApplication.getAccountsRecevieVoucherType();
		int type= 0;
		
		if(!StringUtils.isEmpty(vType)) {
			type = Integer.parseInt(vType);
		}
		
		scf1218.setAccountsRecevieVoucherType(type);
		scf1218.setRepayWay(changeRepay(product.getProductRepaytype()));
		scf1218.setFinancingProductName(product.getProductName());
		
		//		scf1208.setRepayWay(product.getProductRepaytype());
		
		final PlatformInfo platformInf = platformInfo;
		
//		new Thread(new Runnable() {
			
//			@Override
//			public void run() {
				ResultBean rb = new ResultBean();
				System.out.println("发送前参数列表：：：platformInf:"+platformInf.getPlatformId()+"."+platformInf.getInformUrl()+"。"+DefaultConstants.API_SCF1218+":"+scf1218.toString());
				try {
					rb = MessengerHelper.doSend(platformInf.getPlatformId(),
							DefaultConstants.API_SCF1218, 2, platformInf.getInformUrl(), scf1218);
					System.out.println("发送通知返回值:"+rb.toString());
				} catch (CodeException e) {
					e.printStackTrace();
				}
				System.out.println("发送通知返回值:"+rb.toString());
//			}
//		}).start();
		
	}
	
	public static int changeRepay(String type) {
		int sta = 90;//不存在
		switch(type) {
			case "01":
				sta = 20;
				break;
			case "02":
				sta = 50;
				break;
			case "03":
				sta = 60;
				break;
			case "04":
				sta = 10;
				break;
			case "05":
				sta = 40;
				break;
			case "06":
				sta = 30;
				break;
				default:
					;
					
		}
		return sta;
	}
	public static int getInt(BigDecimal bd){
		if(bd==null) {
			bd = new BigDecimal(0);
		}
		BigDecimal aa = bd.multiply(new BigDecimal(1000000/100));
		int result = (int)aa.doubleValue();
		return result;
	}
	/*
	 * 用平台核心企业id 转换 商户段核心企业id
	 * @param companyId
	 * @return
	 * @throws Exception
	 */
	public String changeTenantBySCF(String companyId){
		if(StringUtils.isEmpty(companyId)) {
			return "";
		}
		
		try {
			
			UserCombineStatusExample UserCombineStatusExample = new UserCombineStatusExample();
			UserCombineStatusExample.createCriteria().andDmtUserIdEqualTo(companyId).andUserRoleEqualTo(USER_ROLE_10);
			List<UserCombineStatus> userCombineStatusList = userCombineStatusMapper.selectByExample(UserCombineStatusExample);
			
			if(userCombineStatusList==null || userCombineStatusList.size()==0) {
				throw new Exception("平台核心企业id转换商户端核心企业id时有误，原因：平台核心企业未做关联");
			}
			if(userCombineStatusList.size()>1) {
				throw new Exception("平台核心企业id转换商户端核心企业id时有误，原因：平台核心企业关联数据有多条");
			}
			return userCombineStatusList.get(0).getMerchantUserId();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	/*
	 * 更改商户端融资单状态位
	 * @param finance
	 * @return
	 */
	public  int updIntoPlatFormTable(Finance finance, int state) {
		FinancingApplicationExample example = new FinancingApplicationExample();
		example.createCriteria().andFinancingIdEqualTo(finance.getFinanceId());
		
		List<FinancingApplication> financingApplicationList = financingApplicationMapper.selectByExample(example);
		
		if(financingApplicationList.size()>1) {
			return 0;
		}
		
		if(financingApplicationList==null || financingApplicationList.size()<=0 ){
			AccountsFinancingApplicationExample accountsFinancingApplicationExample = new AccountsFinancingApplicationExample();
			accountsFinancingApplicationExample.createCriteria().andFinancingIdEqualTo(finance.getFinanceId());
			List<AccountsFinancingApplication> accountsFinancingApplicationList  = accountsFinancingApplicationMapper.selectByExample(accountsFinancingApplicationExample);
			
			if(accountsFinancingApplicationList==null || accountsFinancingApplicationList.size()!=1) {
				return 0;
			}
			
			AccountsFinancingApplication accountsFinancingApplication = accountsFinancingApplicationList.get(0);
			String systime = TimeUtil.getTimeMillisecondStamp();  //获取服务器时间
			
			accountsFinancingApplication.setModifyTime(systime);
			accountsFinancingApplication.setBillStatus(state);
			return accountsFinancingApplicationMapper.updateByPrimaryKey(accountsFinancingApplication);
		}else {
			FinancingApplication financingApplication = financingApplicationList.get(0);
			
			String systime = TimeUtil.getTimeMillisecondStamp();  //获取服务器时间
			
			financingApplication.setModifyTime(systime);
			financingApplication.setBillStatus(state);
			return financingApplicationMapper.updateByPrimaryKey(financingApplication);
		}
		
	}

}
