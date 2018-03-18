package com.yonyou.scf.gateway.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.yonyou.scf.common.schema1.domain.AgencyAdmin;
import com.yonyou.scf.common.schema1.domain.AgencyAdminExample;
import com.yonyou.scf.common.schema1.domain.Authentication;
import com.yonyou.scf.common.schema1.domain.AuthenticationExample;
import com.yonyou.scf.common.schema1.domain.BindUsbk;
import com.yonyou.scf.common.schema1.domain.BindUsbkExample;
import com.yonyou.scf.common.schema1.domain.Capital;
import com.yonyou.scf.common.schema1.domain.CompanyAdmin;
import com.yonyou.scf.common.schema1.domain.Credit;
import com.yonyou.scf.common.schema1.domain.CreditExample;
import com.yonyou.scf.common.schema1.domain.PactCredit;
import com.yonyou.scf.common.schema1.domain.PactCreditExample;
import com.yonyou.scf.common.schema1.domain.Product;
import com.yonyou.scf.common.schema1.domain.UserBeforeLoan;
import com.yonyou.scf.common.schema1.domain.UserBeforeLoanExample;
import com.yonyou.scf.common.schema1.domain.UserBeforeLoanExample.Criteria;
import com.yonyou.scf.common.schema1.domain.UserPact;
import com.yonyou.scf.common.schema1.mapper.AgencyAdminMapper;
import com.yonyou.scf.common.schema1.mapper.AgencyMapper;
import com.yonyou.scf.common.schema1.mapper.AuthenticationMapper;
import com.yonyou.scf.common.schema1.mapper.BeforeLoanUtilMapper;
import com.yonyou.scf.common.schema1.mapper.BindUsbkMapper;
import com.yonyou.scf.common.schema1.mapper.CapitalMapper;
import com.yonyou.scf.common.schema1.mapper.CompanyAdminMapper;
import com.yonyou.scf.common.schema1.mapper.CompanyMapper;
import com.yonyou.scf.common.schema1.mapper.CreditMapper;
import com.yonyou.scf.common.schema1.mapper.FiGroupMapper;
import com.yonyou.scf.common.schema1.mapper.FitPersionalInformationMapper;
import com.yonyou.scf.common.schema1.mapper.PactCreditMapper;
import com.yonyou.scf.common.schema1.mapper.UserBeforeLoanMapper;
import com.yonyou.scf.common.schema1.mapper.UserPactMapper;
import com.yonyou.scf.common.schema1.vo.UserBeforeLoanVOE;
import com.yonyou.scf.common.tx.api.ResultBean;
import com.yonyou.scf.common.tx.api.TxRequest;
import com.yonyou.scf.common.tx.gateway.AuthenticationVOE;
import com.yonyou.scf.common.tx.gateway.AuthenticationVOE.PhoneSignNo;
import com.yonyou.scf.common.tx.gateway.Scf1115Request;
import com.yonyou.scf.common.tx.gateway.Scf1115Response_DataList;
import com.yonyou.scf.gateway.interf.INoticeMsgByAgency;
import com.yonyou.scf.gateway.util.SensitiveInfoUtils;
import com.yonyou.scf.gateway.util.UserLoanServiceUtil;
import com.yonyou.scf.gateway.validate.ValidActor;
import com.yonyou.scf.tools.constant.DefaultConstants;
import com.yonyou.scf.tools.lang.json.JsonUtil;
import com.yonyou.scf.tools.middleware.log.LogType;
import com.yonyou.scf.tools.system.CodeException;
import com.yonyou.scf.tools.util.GUID;
import com.yonyou.scf.tools.util.StringUtil;
import com.yonyou.scf.tools.util.TimeUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @author zhangjinliang
 * 2017年4月25日 下午4:30:30
 * 
 */
@Service
public class UserBeforeLoanService {
	private static Map<String,String> userBeforeLoanStatus = new HashMap<String,String>();
	private final static String AUTHENTICATION_COMPLETE_STATUS = "9000";
	private final static String AUTHENTICATION_COMPLETE_MSG = "身份验证完成，跳转下一个页面";
	private final static String FIT_NO_ALLOWED_USING_STATUS = "1020";
	private final static String FIT_NO_ALLOWED_USING_MSG = "融资方被禁用";
	private final static String INTERFACE_SCF1111 = "1111";
	public static final int USERBEFORELOAN_30 = 30;//绑定u盾成功
	public static final int USERBEFORELOAN_90 = 90;//签署成功  
	private final static int AUTHENTICATION_SUCCESS_STATUS = 20;//身份验证成功
	public final static int AUTHENTICATION_NEW_STATUS = 10;//身份验证状态位new
	private final static String PHONE_SIGN_NO = "1201";//验证码有误
	private final static String adminRoleId = "ROLE88888888";//超管角色id
	public static final int SOURCE_TYPE = 10;//终端来源 
	
	static{
		userBeforeLoanStatus.put(FIT_NO_ALLOWED_USING_STATUS, FIT_NO_ALLOWED_USING_MSG);
	}
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private FitPersionalInformationMapper fitPerInfoMapper;
	@Autowired
	private FiGroupMapper fiGroupMapper;
	@Autowired
	private JdbcTemplate primaryJdbcTemplate;
	@Autowired
	private JdbcTemplate secondaryJdbcTemplate;
	@Autowired
	private AgencyMapper agencyMapper;
	@Autowired
	private CompanyMapper companyMapper;
	@Autowired
	private CapitalMapper capitalMapper;
	@Autowired
	private AuthenticationMapper authenticationMapper;
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Autowired
	private AgencyAdminMapper agencyAdminMapper;
	@Autowired
	private UserLoanServiceUtil userLoanServiceUtil;
	@Autowired
	private UserPactMapper userPactMapper;
	@Autowired
	private PactCreditMapper pactCreditMapper;
	@Autowired
	private CreditMapper creditMapper;
	@Autowired
	private BindUsbkMapper bindUsbkMapper;
	@Autowired
	private CompanyAdminMapper companyAdminMapper;
	@Autowired
	private BeforeLoanUtilMapper beforeLoanUtilMapper;
	@Autowired
	private UserBeforeLoanMapper userBeforeLoanMapper;
	@Autowired
	private INoticeMsgByAgency iNoticeMsgByAgency;


	/**
	 * 返回融资方的超级管理员
	 * @param merchantUserId
	 * @return
	 */
	public List<AgencyAdmin> getAgencyUserInfoId(String merchantUserId) {
		AgencyAdminExample example = new AgencyAdminExample();
		com.yonyou.scf.common.schema1.domain.AgencyAdminExample.Criteria criteria = example.createCriteria();
		criteria.andAdminAgencyIdEqualTo(merchantUserId);
		criteria.andAdminRoleIdEqualTo(adminRoleId);
		List<AgencyAdmin> list = agencyAdminMapper.selectByExample(example);
		return list;
	}

	/*
	* 登录用户数据验证
	 * @return
	 * @throws Exception
	 */
	public ResultBean userVerifyInfo(UserBeforeLoanVOE userBeforeLoanVOE) throws Exception{
		ResultBean resultBean = new ResultBean();
		//进行实体类校验-
		
		String merchantUserId = userBeforeLoanVOE.getMerchantUserId();
		int userRole = userBeforeLoanVOE.getUserRole();
		
		//(1)检查关联表中是否存在当前有效用户
		String organizationUserId = userLoanServiceUtil.judgeActiveStatus(merchantUserId, userRole);
		
		if(!StringUtil.isNotEmpty(organizationUserId)){//不存在  无效用户
			throw new CodeException("不存在  无效用户");
		}
		return resultBean;
	}
	/*
	 * 贷前准备统一接口
	 * (1)检查关联表中是否存在当前有效用户
	 * (2)判断身份验证状态
	 * @return
	 * @throws Exception
	 */
	@Transactional(value="primaryTransactionManager",propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public ResultBean readyForApplication(UserBeforeLoanVOE userBeforeLoanVOE) throws Exception{
		ResultBean resultBean = new ResultBean();
		//进行实体类校验-
		
		String merchantUserId = userBeforeLoanVOE.getMerchantUserId();
		int userRole = userBeforeLoanVOE.getUserRole();
		/**
		 * TODO
		 * (1)当链条TxRequest的时候 要加入多次验证  接口号和平台id
		 * (2)当验证有些数据时，是否加入平台id的查询条件，比如身份信息验证
		 * */
		String platformId = userBeforeLoanVOE.getPlatformId();
		String capitalId = userBeforeLoanVOE.getFundId();
		
		//(1)检查关联表中是否存在当前有效用户
		String organizationUserId = userLoanServiceUtil.judgeActiveStatus(merchantUserId, userRole);
		
		if(StringUtil.isNotEmpty(organizationUserId)){//(1.1)存在
			
			//获取身份验证状态
			int validateUserStatus = userLoanServiceUtil.validateUserStatus(merchantUserId, userRole, platformId,userBeforeLoanVOE.getInterfaceNo());
			//(2)判断身份验证状态
			switch(validateUserStatus){
			case 0:
			case 10:
				//(2.1)返回身份验证 需要填写项的值
				JSONObject jsonObject = userLoanServiceUtil.obtainAuthentications(userRole, organizationUserId);
				
				//敏感信息脱敏
				sensitiveInfo(jsonObject);
				
				List<String> dataList = Arrays.asList(new String[]{jsonObject.toString()});
				
				resultBean.setDataList(dataList);
				resultBean.setDataListCnt(dataList.size());
				break;
			case 20://(2.2) 20-身份验证成功
				
				AuthenticationExample example = new AuthenticationExample();
				example.createCriteria()
				.andPlatformIdEqualTo(userBeforeLoanVOE.getPlatformId())
				.andMerchantUserIdEqualTo(userBeforeLoanVOE.getMerchantUserId())
				.andUserRoleEqualTo(userBeforeLoanVOE.getUserRole());
				
				List<Authentication> authenticationList = authenticationMapper.selectByExample(example);
				
				if(authenticationList==null || authenticationList.size()==0 || authenticationList.size()>1){
					throw new Exception("当前账户信息有误，请刷新页面并正确操作!");
				}
				
				//if("direct".equals(userBeforeLoanVOE.getDirectStatus())){//authenticationList.get(0).getStatus()==20 代表已做过身份验证操作，并成功。
				List<String> capitalInfoList = null;
				if(StringUtil.isEmpty(capitalId) || "undefined".equals(capitalId)){
					capitalInfoList = userLoanServiceUtil.obtainCapitalInfoWithoutSignatrueList(userRole, organizationUserId,true);
				}else{
					capitalInfoList = Arrays.asList(new String[]{capitalId});
				}
				resultBean.setDataList(capitalInfoList);
				resultBean.setDataListCnt(capitalInfoList.size());
				
				resultBean.setMessage(AUTHENTICATION_COMPLETE_MSG);
				resultBean.setCode(AUTHENTICATION_COMPLETE_STATUS);
				return resultBean;
				//}else{
//						resultBean.setMessage(AUTHENTICATION_COMPLETE_MSG);
//						resultBean.setCode(AUTHENTICATION_COMPLETE_STATUS);
//						return resultBean;
				//}
			default:
				throw new Exception("判断身份状态内部有错误。");
			}
		}else{//(1.2)不存在  无效用户
			throw new CodeException("不存在  无效用户");
		}
		return resultBean;
	}
	
	/*
	 * 数据脱敏
	 * @param jsonObject
	 */
	private void sensitiveInfo(JSONObject jsonObject) {
		
		//核心企业电话
		if(jsonObject.containsKey("companyPhone")){
			jsonObject.put("companyPhoneSen", SensitiveInfoUtils.mobilePhone(jsonObject.getString("companyPhone")));
		}
		//核心企业电话
		if(jsonObject.containsKey("AdminPhone")){
			jsonObject.put("AdminPhoneSen", SensitiveInfoUtils.mobilePhone(jsonObject.getString("AdminPhone")));
		}
	}

	/*
	 * 贷前准备第二步，展示tab资方绑定u盾信息或者授信合同
	 * (1)检查关联表中是否存在当前有效用户
	 * (2)银行类型判断
	 * (3)线上银行，返回绑定u盾信息或者签署合同
	 * @return
	 */
	public ResultBean capitalDetails(JSONObject obj) throws Exception{
		
		ResultBean rb = new ResultBean();
		
		String merchantUserId = UserLoanServiceUtil.getParam(obj,"MerchantUserId");//商户端id
		
		int userRole = 0;
		try {
			userRole = Integer.parseInt(UserLoanServiceUtil.getParam(obj, "UserRole"));
		} catch (NumberFormatException e) {
			throw new Exception("参数有误");
		}
		String capitalId = UserLoanServiceUtil.getParam(obj, "CapitalId");
		
		//(1)检查关联表中是否存在当前有效用户
		String organizationUserId = "";
		try {
			organizationUserId = userLoanServiceUtil.judgeActiveStatus(merchantUserId, userRole);
		} catch (Exception e) {
			rb.setCode("0002");
			rb.setMessage("没有传入指定参数");
			return rb;
		}
		
		if(StringUtil.isEmpty(organizationUserId)){
			throw new CodeException("不存在  无效用户");
		}
		
		//(2)银行类型判断
		String theTypeOfBank = userLoanServiceUtil.judgeTypeOfBank(capitalId);
		
		//(3)线上银行，返回绑定u盾信息或者签署合同
		if("onLine".equals(theTypeOfBank)){
			
			//查看贷前准备状态
			UserBeforeLoanExample example = new UserBeforeLoanExample();
			Criteria criteria = example.createCriteria();
			criteria.andFundIdEqualTo(capitalId);
			criteria.andMerchantUserIdEqualTo(merchantUserId);
			criteria.andUserRoleEqualTo(userRole);
			List<UserBeforeLoan> userBeforeLoanList = userBeforeLoanMapper.selectByExample(example);
			
			if(userBeforeLoanList!=null && userBeforeLoanList.size()>1){
				rb.setCode("0004");
				rb.setMessage("当前用户信息异常");
				return rb;
			}else if(userBeforeLoanList==null || userBeforeLoanList.size()==0){
				rb.setCode("1002");
				rb.setMessage("正确操作，向用户展示绑定u盾页面");
				return rb;
			}else{
				int userBeforeLoanStatus = userBeforeLoanList.get(0).getStatus();
				switch(userBeforeLoanStatus){
				//展示合同页面
					case 30:
					case 90://已经贷前准备成功，请去融资申请
						JSONArray jsonp = userLoanServiceUtil.returnPacts(userRole, capitalId, organizationUserId, 1);
						
						if(jsonp==null){//当前业务场景，资方授信后，不需要其他方签署合同，可以直接融资
							rb.setCode("1008");
							rb.setMessage("当前业务场景，资方授信后，不需要其他方签署合同，可以直接融资");
						}else{
							rb.setCode("1004");
							rb.setMessage("正确操作，展示合同页面");
							rb.setDataList(Arrays.asList(new String[]{jsonp.toString()}));
							rb.setDataListCnt(1);
						}
//						rb.setCode("1003");
//						rb.setMessage("正确操作，贷前准备已完成，请去融资申请");
						return rb;
					default:
						throw new Exception("判断企业或者个人出错");
				}
			}
			
		}else if("underLine".equals(theTypeOfBank)){//(4.2)线下银行
			/**直接返回下线银行状态，引码导用户去申请融资*/
			rb.setCode("0003");
			rb.setMessage("非签约银行，可以直接去申请融资");
			return rb;
		}else{
			throw new Exception("判断身份状态内部有错误。");
		}
	}
	
	/*
	 * 用户贷前准备状态查询接口
	 * @param ubl
	 * @return
	 */
	public ResultBean getBefroeLoanStatus(TxRequest tx) { 
		
//		logger.info("getBefroeLoanStatus","商户请求用户贷前准备状态查询接口");
		
		ResultBean resultBean = new ResultBean();
		
		String platformId = tx.getPlatformId();
		
		String jsonMsg = tx.getJsonMessage();
		
		Scf1115Request scf1115Request = JsonUtil.toBean(jsonMsg, Scf1115Request.class);
		
		try {
			new ValidActor<Scf1115Request>(scf1115Request).validate();
		} catch (CodeException e) {
			resultBean.setCode(DefaultConstants.ERR_0001_CODE);
			resultBean.setMessage(DefaultConstants.ERR_0001_MSG);
			return resultBean;
		}
		
		String fundId = scf1115Request.getFundId();
		String merchantUserId = scf1115Request.getMerchantUserId();
		int userRole = scf1115Request.getUserRole();
		
		Map<String,Object> mtr = new HashMap<String,Object>();
		mtr.put("paltformId", platformId);
		mtr.put("merchantUserID", merchantUserId);
		mtr.put("userRole", userRole);
		mtr.put("fundId", fundId);
		
		List<Scf1115Response_DataList> list = null;
		
		switch(userRole){
		case 10:
			
			list = beforeLoanUtilMapper.queryLoanBeforeStatusCompany(mtr);
			
			break;
		case 20:
			
			list = beforeLoanUtilMapper.queryLoanBeforeStatusAgency(mtr);
			
			
			break;
			default:
				resultBean.setCode(DefaultConstants.ERR_0001_CODE);
				resultBean.setMessage(DefaultConstants.ERR_0001_MSG);
				return resultBean;
		}
		
		resultBean.setCode(DefaultConstants.SUCCESS_RESPONSE_CODE);
		resultBean.setMessage(DefaultConstants.SUCCESS_RESPONSE_MESSAGE);
		resultBean.setDataListCnt(list.size());
		
		List<String> resultList = new ArrayList<String>();
		
		for (Scf1115Response_DataList scf1115Response_DataList : list) {
			resultList.add(JsonUtil.toJSONString(scf1115Response_DataList));
		}
		
		resultBean.setDataList(resultList);
		
		return resultBean;
	}
	
	/*
	 * 校验证书合法性
	 * @param obj
	 * @return
	 */
	public ResultBean checkQuality(JSONObject obj){
		String text0 = UserLoanServiceUtil.getParam(obj, "Text0");//明文
		String text2 = UserLoanServiceUtil.getParam(obj, "Text2");//密文 
		String snNo = UserLoanServiceUtil.getParam(obj, "SnNo");//cn号
		ResultBean rb = new ResultBean("2000","验证成功");
		
		try {
			//开始验证
			String timeStr = UserLoanServiceUtil.certVerify(text0, text2, snNo);
			//校验成功 上传文件
			if(!StringUtils.isEmpty(timeStr) && obj.containsKey("IdName") && !StringUtils.isEmpty(obj.getString("IdName"))){
				String sourceName = obj.getString("IdName");
					userLoanServiceUtil.obtainPDFFromLocal(sourceName,UserLoanServiceUtil.localUkeyurl,sourceName,
								UserLoanServiceUtil.ukeytranforToFTPUrl,"pdf");
			}
		} catch (Exception e) {
			
			//如果存在文件系统，那么直接物理删除（减少冗余）
			if(obj.containsKey("IdName") && !StringUtils.isEmpty(obj.getString("IdName"))){
				try {
					userLoanServiceUtil.removeSpecilyftp(obj.getString("IdName"),"pdf");
				} catch (Exception e1) {
					logger.warn( "删除本地临时pdf文件失败");
				}
			}else{
			}
			
			rb.setCode("0001");
			rb.setMessage(e.getMessage());
			System.out.println("证书验证出错");
			System.out.println(e.getMessage());
		} 
		
		return rb;
	}
	
	/**
	 * 身份验证点击‘下一步’
	 * @param authenticationVOE
	 * @return
	 * @throws Exception 
	 */
	@Transactional(value="primaryTransactionManager",propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public ResultBean updateAuthentication(AuthenticationVOE authenticationVOE) throws Exception {
		
		
		if(authenticationVOE==null){
			return new ResultBean(DefaultConstants.ERR_0001_CODE, DefaultConstants.ERR_0001_MSG);
		}
		
		int userRole = authenticationVOE.getUserRole();
		String merchantUserId = authenticationVOE.getMerchantUserId();
		
		//(1)检查关联表中是否存在当前有效用户
		String organizationUserId = userLoanServiceUtil.judgeActiveStatus(merchantUserId, userRole);
		
		if(StringUtil.isEmpty(organizationUserId)){
			throw new CodeException("无效用户");
		}
		
		//取手机验证码和key
//		PhoneSignNo phoneSignNo = authenticationVOE.getPhoneSignNo();
//		if(phoneSignNo==null){
//			return new ResultBean(PHONE_SIGN_NO, "手机验证码有误");
//		}
//		String signNoKey = phoneSignNo.getSignNoKey();
//		String signNo = phoneSignNo.getSignNo();
//		String signNo_bak = (String)stringRedisTemplate.opsForValue().get(signNoKey);
		
//		//验证失败
//		if(StringUtil.isEmpty(signNoKey)//参数key为空
//				|| StringUtil.isEmpty(signNo)//参数验证码为空
//				|| StringUtil.isEmpty(signNo_bak)//获取到的验证码为空
//				|| !signNo_bak.equals(signNo)){//验证码不匹配
//			return new ResultBean(PHONE_SIGN_NO, "手机验证码有误");
//		}
		
		AuthenticationExample example = new AuthenticationExample();
		com.yonyou.scf.common.schema1.domain.AuthenticationExample.Criteria criteria = example.createCriteria();
		criteria.andPlatformIdEqualTo(authenticationVOE.getPlatformId());
		criteria.andMerchantUserIdEqualTo(authenticationVOE.getMerchantUserId());
		criteria.andUserRoleEqualTo(authenticationVOE.getUserRole());
		criteria.andInterfaceNoEqualTo(authenticationVOE.getInterfaceNo());
		
		List<Authentication> list = authenticationMapper.selectByExample(example);
		
		//没有主键，所以只能依赖其他字段查询，这里判断是否存在，如果存在，查询出来的元素个数大于1 也是错
		if(list==null || list.size()<=0 || list.size()>1){
			return new ResultBean(DefaultConstants.ERR_0001_CODE, DefaultConstants.ERR_0001_MSG);
		}
		
		String currentTime = TimeUtil.getTimeMillisecondStamp();
		
		Authentication authentication_new = list.get(0);
		authentication_new.setModifyTime(currentTime);
		authentication_new.setStatus(AUTHENTICATION_SUCCESS_STATUS);
		
		int resultStatus = authenticationMapper.updateByPrimaryKey(authentication_new);
		
		//更改用户名密码
		if(userRole==20){
			modifyUserInfo(authenticationVOE.getAgencyAdmin(), organizationUserId);
		}else{
			modifyCompanyUserInfo(authenticationVOE.getCompanyAdmin(), organizationUserId);
		}
		//如果用户存在线下银行  则直接插入贷前准备表90 数据  可以直接去融资申请 并发送1118接口通知
		underLineCapitalHandler(userRole,organizationUserId, merchantUserId, authenticationVOE.getPlatformId());
		
		
		if(resultStatus<=0){
			return new ResultBean(DefaultConstants.ERR_0001_CODE, DefaultConstants.ERR_0001_MSG);
		}
		
		return  new ResultBean(DefaultConstants.SUCCESS_RESPONSE_CODE, DefaultConstants.SUCCESS_RESPONSE_MESSAGE);
	}
	
	/**
	 * 如果用户存在线下银行  则直接插入贷前准备表90 数据  可以直接去融资申请 并发送1118接口通知
	 * @throws Exception 
	 */
	@Transactional(value="primaryTransactionManager",propagation=Propagation.MANDATORY,rollbackFor=Exception.class)
	public void underLineCapitalHandler(int userRole,String organizationUserId, String merchantUserId, String platformId) throws Exception{
		
		//取所有产品
		List<Product> productList = userLoanServiceUtil.getProductListByAgencyMerchantUserId(organizationUserId);
		
		if(productList==null || productList.size()<=0){
			return;
		}
		
		//筛选出线上银行
		List<Product> underLineProductList = productList.parallelStream()
				.filter(x->{//过滤留下线下产品
					try {
						return "underLine".equals(userLoanServiceUtil.judgeTypeOfBank(x.getProductCapitalId()));
					} catch (Exception e) {
						e.printStackTrace();
						return false;
					}
				}).collect(Collectors.toCollection(ArrayList::new));
		
		for (Product product : underLineProductList) {
			addAndSendMsg(userRole, merchantUserId, platformId, product);
		}
		
		//事务控制困难，所以舍弃下面方法
//		underLineProductList.parallelStream().forEach(x->{
//			try {
//				addAndSendMsg(userRole, merchantUserId, platformId, x);
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw e;
//			}
//		});
		
	}
	
	@Transactional(value="primaryTransactionManager",propagation=Propagation.MANDATORY,rollbackFor=Exception.class)
	public void addAndSendMsg(int userRole, String merchantUserId, String platformId, Product pro) throws CodeException{
		
		String currentTime = TimeUtil.getTimeMillisecondStamp();
		try {
			String uId = GUID.genTxNo(32);
			UserBeforeLoan ubl = new UserBeforeLoan();
			ubl.setPlatformId(platformId);//
			ubl.setSystemid(uId);
			ubl.setCreateTime(currentTime);
			ubl.setFundId(pro.getProductCapitalId());
			ubl.setInterfaceNo(INTERFACE_SCF1111);
			ubl.setMerchantUserId(merchantUserId);
			ubl.setModifyTime(currentTime);
			ubl.setStatus(USERBEFORELOAN_90);
			ubl.setTerminalSource(SOURCE_TYPE);
			ubl.setUserRole(userRole);
			
			int resultInt = userBeforeLoanMapper.insertSelective(ubl);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		 
		 try {
				iNoticeMsgByAgency.noticeMsgByAgencyFor1108Or1118(merchantUserId, pro, platformId);
			} catch (CodeException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	/**
	 * 更改核心企业账号和密码
	 * @param CompanyAdmin
	 * @return
	 * @throws Exception 
	 */
	@Transactional(value="primaryTransactionManager",propagation=Propagation.MANDATORY,rollbackFor=Exception.class)
	private void modifyCompanyUserInfo(CompanyAdmin companyAdmin,
			String organizationUserId) throws Exception {
		if(companyAdmin==null){
			throw new Exception("更改信息失败");
		 }
		
		 //账号密码不能为空
		 if(StringUtil.isEmpty(companyAdmin.getAdminPassword()) || StringUtil.isEmpty(companyAdmin.getAdminUsername())){
			 throw new Exception("账号密码不能为空");
		 }
		 
		//获取目前真是的用户信息
		 CompanyAdmin realAdminUser = userLoanServiceUtil.obtainSuperCompanyAdminInfo(organizationUserId);
		 
		//密码加密 
		 realAdminUser.setAdminPassword(DigestUtils.md5Hex(companyAdmin.getAdminPassword()));
		 realAdminUser.setAdminUpdatetime(TimeUtil.getTimeMillisecondStamp());
		 realAdminUser.setAdminUsername(companyAdmin.getAdminUsername());
		
		
		int resultInt = companyAdminMapper.updateByPrimaryKeySelective(realAdminUser);
		
		if(resultInt>0){
			logger.info( "当前超管修改了账户名和密码成功");
		}else{
			throw new Exception("更改账号信息失败");
		}
	}

	/**
	 * 更改账号和密码
	 * @param agencyAdmin
	 * @return
	 * @throws Exception 
	 */
	@Transactional(value="primaryTransactionManager",propagation=Propagation.MANDATORY,rollbackFor=Exception.class)
	public void modifyUserInfo(AgencyAdmin agencyAdmin, String organizationUserId) throws Exception {
		
		 if(agencyAdmin==null){
			throw new Exception("更改信息失败");
		 }
		
		 //账号密码不能为空
		 if(StringUtil.isEmpty(agencyAdmin.getAdminPassword()) || StringUtil.isEmpty(agencyAdmin.getAdminUsername())){
			 throw new Exception("账号密码不能为空");
		 }
		 
		//获取目前真是的用户信息
		AgencyAdmin realAdminUser = userLoanServiceUtil.obtainSuperAgencyAdminInfo(organizationUserId);
		 
		//密码加密 
		 realAdminUser.setAdminPassword(DigestUtils.md5Hex(agencyAdmin.getAdminPassword()));
		 realAdminUser.setAdminUpdatetime(TimeUtil.getTimeMillisecondStamp());
		 realAdminUser.setAdminUsername(agencyAdmin.getAdminUsername());
		
		
		int resultInt = agencyAdminMapper.updateByPrimaryKeySelective(realAdminUser);
		
		if(resultInt>0){
			logger.info( "当前超管修改了账户名和密码成功");
		}else{
			throw new Exception("更改账号信息失败");
		}
	}
	
	/*
	 *签署合同 
	 */
	@Transactional(value="primaryTransactionManager",propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public JSONObject signPact(JSONObject obj) throws Exception{
		
		JSONObject resultObj = new JSONObject();
		
		
		
		String pactNum = UserLoanServiceUtil.getParam(obj, "PactNum");
		String merchantUserId = UserLoanServiceUtil.getParam(obj, "MerchantUserId");
		
		int userRole = 0;
		try {
			userRole = Integer.parseInt(UserLoanServiceUtil.getParam(obj, "UserRole"));
		} catch (NumberFormatException e) {
			resultObj.put("Status", "1005");
	    	resultObj.put("Msg", "操作数据参数");
	    	return resultObj;
		}
		String text0 = UserLoanServiceUtil.getParam(obj, "Text0");
		
		//验证明文是否符合格式
		if(text0.indexOf("|")<0){
			throw new CodeException("请绑定u盾后重试");
		}
		
		String snNo = UserLoanServiceUtil.getParam(obj, "SnNo");
		String text1 = UserLoanServiceUtil.getParam(obj, "Text1");
		String text2 = UserLoanServiceUtil.getParam(obj, "Text2");
		
		UserLoanServiceUtil.certVerify(text0,text2,snNo);
		
		//取真实机构id
		String organizationUserId = userLoanServiceUtil.judgeActiveStatus(merchantUserId, userRole);
		//无效用户
		if(StringUtil.isEmpty(organizationUserId)){
			throw new CodeException("不存在  无效用户");
		}
		
		//判断u盾信息是否与当前登录人绑定
		boolean flag = userLoanServiceUtil.judgeActiveUserBySN(snNo,organizationUserId);
		
		if(!flag){
			resultObj.put("Status", "1004");
	    	resultObj.put("Msg", "U盾绑定人非当前操作者");
	    	return resultObj;
		}

		int resultInt2 = 0;
		int resultInt = 0;
		
		String pactSignTime = TimeUtil.getTimeMillisecondStamp();
		
		resultInt = insertSignStatusData(pactNum, text0, text1, text2,
				organizationUserId, userRole, "01", pactSignTime); 
	    
	  //根据合同编号查询授信编号
	    PactCreditExample pactCreditExample = new PactCreditExample();
	    pactCreditExample.createCriteria().andPactNumEqualTo(pactNum);
	    PactCredit pactc=  pactCreditMapper.selectByExample(pactCreditExample).get(0);
	    
	    //获取授信ID
	    String  creditid =  pactc.getCreditId();
	  	Credit crd = new Credit();
	  	crd.setCreditCrestatus("01");//签署中
	  	CreditExample cExample = new CreditExample();
	  	cExample.createCriteria().andCreditIdEqualTo(creditid);
	    
	    try {
	    	resultInt2 = creditMapper.updateByExampleSelective(crd, cExample);
	    	if(resultInt<=0 || resultInt2<=0){
	    		logger.warn( "签署合同后台出现异常");
	    		throw new Exception("签署合同后台出现异常");
	    	}
		} catch (Exception e) {
			logger.error( "签署合同后台出现异常");
			e.printStackTrace();
			throw new Exception("签署合同后台出现异常");
		}
	    
    	resultObj.put("Status", "ok");
    	resultObj.put("Msg", "签署成功");
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		try {
			pactSignTime = new SimpleDateFormat("yyyy-MM-dd").format(sdf.parse(pactSignTime));
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	resultObj.put("Time", pactSignTime);
	    
	    return resultObj;
	}
	
	@Transactional(value="primaryTransactionManager",propagation=Propagation.MANDATORY,rollbackFor=Exception.class)
	private int insertSignStatusData(String pactNum, String text0,
			String text1, String text2, String organizationUserId, int userRole,
			String pactState, String pactSignTime)
			throws Exception {
		int resultInt;
		//插入签署历史记录表
	    UserPact userPact = new UserPact(); 
	    userPact.setId(UUID.randomUUID().toString());//插入主键
	    userPact.setPactNum(pactNum);//插入合同编号
	    userPact.setPactName(organizationUserId);//签署方ID
	    userPact.setPactDt(pactSignTime);//签署日期
	    switch(userRole){
	    case 10://核心企业
	    	userPact.setUserId(userLoanServiceUtil.obtainSuperCompanyAdminInfo(organizationUserId).getAdminId());//签署用户
	    	userPact.setUserType("01");//用户类型
	    	break;
	    case 20://融资方
	    	userPact.setUserId(userLoanServiceUtil.obtainSuperAgencyAdminInfo(organizationUserId).getAdminId());//签署用户
	    	userPact.setUserType("00");//用户类型
	    	break;
	    	default:
	    		throw new Exception("参数有误");
	    }
	    userPact.setPactState(pactState);//签署状态
	    userPact.setProclaimedtext(text0);//添加签署原文
	    userPact.setCiphertext(text1);//报文
	    userPact.setOriginaltext(text2);//密文
	    resultInt = userPactMapper.insertSelective(userPact);
		return resultInt;
	}
	
	/*
	 * 绑定u盾
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	@Transactional(value="primaryTransactionManager",propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public JSONObject addLccbUsbKey(JSONObject obj) throws Exception {
		  
		  JSONObject resultObj = new JSONObject();
		
		  //sn序列号
		  String snNo = UserLoanServiceUtil.getParam(obj, "SnNo");
		  String capitalId = UserLoanServiceUtil.getParam(obj, "CapitalId");
		  String merchantUserId = UserLoanServiceUtil.getParam(obj, "MerchantUserId");
		  String text0 = UserLoanServiceUtil.getParam(obj, "Text0");//明文
		  String text2 = UserLoanServiceUtil.getParam(obj, "Text2");//密文
		  int userRole = 0;
			try {
				userRole = Integer.parseInt(UserLoanServiceUtil.getParam(obj, "UserRole"));
			} catch (NumberFormatException e) {
				throw new CodeException("1005", "操作数据参数");
			}
			
			//证书是否合法，是否过期  如果没过期返回时间字符串 yyyyMMddHHmmss
			String ukeyOutOfDateTime = UserLoanServiceUtil.certVerify(text0,text2,snNo);
			
		  //取真实机构id
		  String organizationUserId = userLoanServiceUtil.judgeActiveStatus(merchantUserId, userRole);
		//无效用户
			if(StringUtil.isEmpty(organizationUserId)){
				throw new CodeException("不存在  无效用户");
			}
		  //检查u盾是否已经绑定
		  BindUsbkExample bindUsbkExample = new BindUsbkExample();
		  bindUsbkExample.createCriteria().andSnNumEqualTo(snNo);
		  int con  = bindUsbkMapper.selectByExample(bindUsbkExample).size();
		  //序列号已经绑定
		  if(con>0){
			  throw new CodeException("1006", "u盾已绑定");
		  }
		  
		  
		  //根据银行id查签约行
		  Capital capital = capitalMapper.selectByPrimaryKey(capitalId);
		  if(capital==null){
			  throw new CodeException("1005", "操作数据参数");
		  }
		  
		  String capitalBankId = capital.getCapitalBankid();
		  
		  String uuId = GUID.genTxNo(32);//作为oms中主键
		  String currentTime = TimeUtil.getTimeMillisecondStamp();
		  
		  //插入u盾信息-oms
		  int resultInt = insertUsbkData(uuId,snNo, organizationUserId,
				capitalBankId, userRole,currentTime);
		  int resultInt_2 = intsertUsbInfo_scf(uuId,currentTime, ukeyOutOfDateTime, obj);
		  //判断业务性失败
		  if(resultInt==0 || resultInt_2==0){
			  throw new CodeException("1007", "绑定失败，请检查浏览器安全性然后刷新页面");
		  }
		  
		  //插入签名信息
		  
		  resultObj.put("Status", "ok");
		  resultObj.put("Msg", "绑定成功");
		  return resultObj;
		 }
	/**
	 * @param uuId
	 * @param currentTime
	 * @param ukeyOutOfDateTime 证书过期时间
	 * @param obj
	 * @return
	 * @throws CodeException
	 */
	@Transactional(value="primaryTransactionManager",propagation=Propagation.MANDATORY,rollbackFor=Exception.class)
	private int intsertUsbInfo_scf(String uuId,  String currentTime, String ukeyOutOfDateTime, JSONObject obj) throws CodeException {
		
	 //sn序列号
	  String snNo = UserLoanServiceUtil.getParam(obj, "SnNo");
	  String capitalId = UserLoanServiceUtil.getParam(obj, "CapitalId");
	  String merchantUserId = UserLoanServiceUtil.getParam(obj, "MerchantUserId");
	  String text0 = UserLoanServiceUtil.getParam(obj, "Text0");//明文
	  String text2 = UserLoanServiceUtil.getParam(obj, "Text2");//密文
	  String platformId = UserLoanServiceUtil.getParam(obj, "PlatformId");
	  String interfaceNo = UserLoanServiceUtil.getParam(obj, "InterfaceNo");
	  int userRole = 0;
		try {
			userRole = Integer.parseInt(UserLoanServiceUtil.getParam(obj, "UserRole"));
		} catch (NumberFormatException e) {
			throw new CodeException("1005", "操作数据参数");
		}
		
		//判断是否绑定过
		UserBeforeLoanExample example = new UserBeforeLoanExample();
		Criteria criteria = example.createCriteria();
		criteria.andFundIdEqualTo(capitalId);
		criteria.andMerchantUserIdEqualTo(merchantUserId);
		criteria.andUserRoleEqualTo(userRole);
		List<UserBeforeLoan> userBeforeLoanList = userBeforeLoanMapper.selectByExample(example);
		if(userBeforeLoanList!=null && userBeforeLoanList.size()>0){
			throw new CodeException("0004", "u盾已绑定");
		}
		
		 String uId = GUID.genTxNo(32);
		 UserBeforeLoan ubl = new UserBeforeLoan();
		 ubl.setPlatformId(platformId);//
		 ubl.setSystemid(uId);
		 ubl.setBindUsbkeyId(uuId);
		 ubl.setCreateTime(currentTime);
		 ubl.setFundId(capitalId);
		 ubl.setInterfaceNo(interfaceNo);
		 ubl.setMerchantUserId(merchantUserId);
		 ubl.setModifyTime(currentTime);
		 ubl.setOriginalText(text2);
		 ubl.setProclaimedText(text0);
		 ubl.setSnNo(snNo);
		 ubl.setSnLoadTime(currentTime);
		 ubl.setSnValidTime(ukeyOutOfDateTime);
		 ubl.setStatus(USERBEFORELOAN_30);
		 ubl.setTerminalSource(SOURCE_TYPE);//带实现
		 ubl.setUserRole(userRole);
		return userBeforeLoanMapper.insertSelective(ubl);
	}

	@Transactional(value="primaryTransactionManager",propagation=Propagation.MANDATORY,rollbackFor=Exception.class)
	private int insertUsbkData(String uuid, String snNo, String organizationUserId,
			String capitalBankId, int userRole, String currentTime) throws Exception {
		  BindUsbk usbData = new BindUsbk();
		  usbData.setId(uuid);//uuid	
		  usbData.setChannelId(capitalBankId);//渠道ID	  
		  usbData.setBindStatus("01");//已经绑定
		  usbData.setSnNum(snNo);//插入sn序号
		  
		  switch(userRole){
		  case 10://核心企业
			  usbData.setUserType("01");//核心企业
			  try {
				  usbData.setCreateOperatorId(userLoanServiceUtil.obtainSuperCompanyAdminInfo(organizationUserId).getAdminId());
			  } catch (Exception e) {
				  e.printStackTrace();
			  }
			  break;
		  case 20://融资方
			  usbData.setUserType("00");//核心企业
			  try {
				  usbData.setCreateOperatorId(userLoanServiceUtil.obtainSuperAgencyAdminInfo(organizationUserId).getAdminId());
			  } catch (Exception e) {
				  e.printStackTrace();
			  }
			  break;
		  default:
				  throw new Exception("参数有误");
		  }
		  
		  usbData.setCreateDt(currentTime);//创建日期
		  usbData.setOperatorId(organizationUserId);
		  int resultInt = bindUsbkMapper.insertSelective(usbData);
		return resultInt;
	}
	
	/*
	 * 获取明文信息， 上传ftp文件系统文件
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public JSONObject signInfo(JSONObject obj) throws Exception {
		String merchantUserId = UserLoanServiceUtil.getParam(obj,"MerchantUserId");
		int userRole = userLoanServiceUtil.getIntParam(obj, "UserRole");
		String snNo = UserLoanServiceUtil.getParam(obj,"SnNo");;
		JSONObject map = userLoanServiceUtil.obtainSourceContentForPact(merchantUserId, userRole, snNo);
		return map;
	}
	/*
	 * 获取明文信息， 获取ftp文件系统文件
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public JSONObject signInfoByPact(JSONObject obj) throws Exception {
		String merchantUserId = UserLoanServiceUtil.getParam(obj,"MerchantUserId");
		int userRole = userLoanServiceUtil.getIntParam(obj, "UserRole");
		String snNo = UserLoanServiceUtil.getParam(obj,"SnNo");
		String pacttype = UserLoanServiceUtil.getParam(obj,"pacttype");
		String creditid = UserLoanServiceUtil.getParam(obj,"creditid");
		JSONObject map = userLoanServiceUtil.obtainSourceContentForPact(merchantUserId, userRole, snNo, creditid, pacttype);
		return map;
	}

	/*
	 * 下载u盾授权书
	 * @param obj
	 */
	public void downLoadQualification(String idName, String filePath,String showUserFileName, HttpServletResponse resp)
			throws NoSuchElementException, IllegalStateException, Exception {
		userLoanServiceUtil.downLoadQualification(idName, filePath,showUserFileName,"pdf" , resp);
	}
	
}
