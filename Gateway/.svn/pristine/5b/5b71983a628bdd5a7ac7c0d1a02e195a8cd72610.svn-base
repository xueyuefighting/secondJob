package com.yonyou.scf.gateway.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.google.common.collect.Maps;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import com.yonyou.scf.common.schema1.domain.Agency;
import com.yonyou.scf.common.schema1.domain.AgencyAdmin;
import com.yonyou.scf.common.schema1.domain.AgencyAdminExample;
import com.yonyou.scf.common.schema1.domain.Authentication;
import com.yonyou.scf.common.schema1.domain.AuthenticationExample;
import com.yonyou.scf.common.schema1.domain.BindUsbkExample;
import com.yonyou.scf.common.schema1.domain.Capital;
import com.yonyou.scf.common.schema1.domain.Company;
import com.yonyou.scf.common.schema1.domain.CompanyAdmin;
import com.yonyou.scf.common.schema1.domain.CompanyAdminExample;
import com.yonyou.scf.common.schema1.domain.Credit;
import com.yonyou.scf.common.schema1.domain.CreditExample;
import com.yonyou.scf.common.schema1.domain.Product;
import com.yonyou.scf.common.schema1.domain.ProductExample;
import com.yonyou.scf.common.schema1.domain.SysParam;
import com.yonyou.scf.common.schema1.domain.SysParamExample;
import com.yonyou.scf.common.schema1.domain.UserCombineStatus;
import com.yonyou.scf.common.schema1.domain.UserCombineStatusExample;
import com.yonyou.scf.common.schema1.mapper.AgencyAdminMapper;
import com.yonyou.scf.common.schema1.mapper.AgencyMapper;
import com.yonyou.scf.common.schema1.mapper.AuthenticationMapper;
import com.yonyou.scf.common.schema1.mapper.BeforeLoanUtilMapper;
import com.yonyou.scf.common.schema1.mapper.BindUsbkMapper;
import com.yonyou.scf.common.schema1.mapper.CapitalMapper;
import com.yonyou.scf.common.schema1.mapper.CompanyAdminMapper;
import com.yonyou.scf.common.schema1.mapper.CompanyMapper;
import com.yonyou.scf.common.schema1.mapper.CreditMapper;
import com.yonyou.scf.common.schema1.mapper.ProductMapper;
import com.yonyou.scf.common.schema1.mapper.SysParamMapper;
import com.yonyou.scf.common.schema1.mapper.UserCombineStatusMapper;
import com.yonyou.scf.gateway.cfcaTools.FcsAppException;
import com.yonyou.scf.gateway.ftp.FTPClientPool;
import com.yonyou.scf.gateway.service.UserBeforeLoanService;
import com.yonyou.scf.tools.middleware.log.LogType;
import com.yonyou.scf.tools.system.CodeException;
import com.yonyou.scf.tools.util.GUID;
import com.yonyou.scf.tools.util.StringUtil;
import com.yonyou.scf.tools.util.TimeUtil;

import cfca.sadk.algorithm.common.PKIException;
import cfca.sadk.lib.crypto.JCrypto;
import cfca.sadk.lib.crypto.Session;
import cfca.sadk.util.Signature;
import cfca.sadk.x509.certificate.X509Cert;
import lombok.Cleanup;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @author zhangjinliang
 * 2017年5月9日 上午9:42:04
 * 
 */
@Service
public class UserLoanServiceUtil {
	
	/*
	 * u盾-证书-S
	 */
	private static Session session = null;

	static {
		try {
			JCrypto jcrypto = JCrypto.getInstance();
			jcrypto.initialize("JSOFT_LIB", null);
			session = jcrypto.openSession("JSOFT_LIB");
		} catch (Throwable e) {

		}
	}
	/*
	 * u盾-证书-E
	 */
	
	//绑定u盾时生成授权书存在服务端用户，上传ftp后直接删除，保存的路径如下
	public final static String localUkeyurl = UserLoanServiceUtil.class.getResource("/").getPath()+"templates/";
	
	public final static String ukeytranforToFTPUrl = "usbkcontent";
	
	
	private final static String adminRoleId = "ROLE88888888";
	//用户关联表状态位
	private final static int USER_COMBINE_STATUS_ENABLE = 10;
	private final static int USER_COMBINE_STATUS_UNENABLE = 90;
	//获取FTP信息，懒加载，获取一次放入内存
	public Map<String,String> FTPInfoMap = null;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private AuthenticationMapper authenticationMapper;
	@Autowired
	private CompanyMapper companyMapper;
	@Autowired
	private AgencyMapper agencyMapper;
	@Autowired
	private AgencyAdminMapper agencyAdminMapper;
	@Autowired
	private CompanyAdminMapper companyAdminMapper;
	@Autowired
	private CapitalMapper capitalMapper;
	@Autowired
	private UserCombineStatusMapper userCombineStatusMapper;
	@Autowired
	private CreditMapper creditMapper;
	@Autowired
	private ProductMapper productMapper;
	@Autowired
	private BeforeLoanUtilMapper beforeLoanUtilMapper;
	@Autowired
	private BindUsbkMapper bindUsbkMapper;
	@Autowired
	private SysParamMapper sysParamMapper;
	@Autowired
	private FTPClientPool fTPClientPool;
	
	
	/*
	 * 删除本地pdf临时文件
	 * @param idName
	 * @param suffix 文件后缀  例如 test01.txt   suffix=txt
	 * @return
	 * @throws NoSuchElementException
	 * @throws IllegalStateException
	 * @throws Exception
	 */
	public boolean removeSpecilyftp(String idName,String suffix) throws NoSuchElementException, IllegalStateException, Exception{
		//文件名后缀不能为空
		if(StringUtils.isEmpty(suffix)){
			throw new CodeException("3001", "文件名后缀不能为空");
		}
		// 删除server临时文件
		File temp = new File(localUkeyurl+idName+"."+suffix);
		boolean SOrE = temp.delete();
		if(!SOrE){
			logger.error( "删除临时文件失败");
			throw new CodeException("3004", "删除临时文件失败");
		}
		
		return SOrE;
	}
	
	
	
	/*
	 * //检查关联表中是否存在当前有效用户  如果存在则返回真实的机构id
	 * @return
	 */
	public String judgeActiveStatus(String merchantUserId, int UserRole){
		logger.info( "enter into judgeActiveStatus");
		UserCombineStatusExample example = new  UserCombineStatusExample();
		com.yonyou.scf.common.schema1.domain.UserCombineStatusExample.Criteria criteria = example.createCriteria();
		criteria.andUserRoleEqualTo(UserRole);
		criteria.andMerchantUserIdEqualTo(merchantUserId);
		criteria.andUserEnableStatusEqualTo(USER_COMBINE_STATUS_ENABLE);
		List<UserCombineStatus> userCombineStatusList = userCombineStatusMapper.selectByExample(example);
		if(userCombineStatusList==null || userCombineStatusList.size()==0 || userCombineStatusList.size()>1){
			return "";
		}
		
		String organizationUserId = userCombineStatusList.get(0).getDmtUserId();
		
		return organizationUserId;
	}

	/*
	 * 获取身份验证状态
	 * @return 0 不存在 10-new 20-验证成功
	 */
	@Transactional(value="primaryTransactionManager",propagation=Propagation.MANDATORY,rollbackFor=Exception.class)
	public int validateUserStatus(String merchantUserId, int userRole, String platformId, String interfaceNo) throws Exception {
		logger.info( "enter into validateUserStatus");
		AuthenticationExample example = new AuthenticationExample();
		com.yonyou.scf.common.schema1.domain.AuthenticationExample.Criteria criteria = example.createCriteria();
		criteria.andMerchantUserIdEqualTo(merchantUserId);
		criteria.andUserRoleEqualTo(userRole);
		criteria.andPlatformIdEqualTo(platformId);
		List<Authentication> list = authenticationMapper.selectByExample(example);
		
		if(list==null || list.size()==0){
			//不存在则插入
			String uuid = GUID.genTxNo(32);
			String currentTime = TimeUtil.getTimeMillisecondStamp();
			Authentication authentication = null;
			authentication = new Authentication();
			authentication.setCreateTime(currentTime);
			authentication.setInterfaceNo(interfaceNo);
			authentication.setPlatformId(platformId);
			authentication.setMerchantUserId(merchantUserId);
			authentication.setUserRole(userRole);
			authentication.setSystemid(uuid);
			authentication.setModifyTime(currentTime);
			authentication.setStatus(UserBeforeLoanService.AUTHENTICATION_NEW_STATUS);
			
			int backStatus = authenticationMapper.insert(authentication);
			
			if(backStatus>0){
				return 0;
			}else{
				logger.error( "新增验证信息数据失败");
				throw new CodeException("插入失败");
			}
		}else if(list.size()>1){
			logger.warn( "Authentication 同一条数据出现大于一次");
			throw new Exception("出现重复数据");
		}else{
			return list.get(0).getStatus();
		}
	}
	
	/*
	 * 返回身份验证 需要填写项的值
	 * @return
	 * @throws Exception
	 */
	public JSONObject obtainAuthentications(int userRole, String merchantUserId) throws Exception {
		//(1)判断企业用户或个人
		int judgeCompanyOrPersionalBool = userRole;
		
		//(2)回显用户信息存入变量
		JSONObject userObj = new JSONObject();
		
		switch(judgeCompanyOrPersionalBool){
			case 10://(1.1)核心企业
				obtainCompanyContent(userObj, merchantUserId);
				break;
			case 20://(1.2)融资方
				obtainPersionalContent(userObj, merchantUserId);
				break;
			default:
					logger.warn( "Authentication 不存在的角色");
					throw new Exception("判断企业或者个人出错");
		}
		return userObj;
	}

	/*
	 * 融资方类型为个人时候的信息
	 * @param userObj
	 */
	private void obtainPersionalContent(JSONObject userObj, String merchantUserId) throws Exception {
		logger.info( "enter into obtainPersionalContent");
		
		Agency agency = agencyMapper.selectByPrimaryKey(merchantUserId);
		String agencyType = agency.getAgencyType();//01自然人 02企业
		
		AgencyAdmin agencyAdmin = obtainSuperAgencyAdminInfo(merchantUserId);
		
		String adminPhone = agencyAdmin.getAdminPhone();//电话
		
		userObj.put("AdminPhone", adminPhone);
		//userObj.put("AgencyAdminId", agencyAdminId);  目前不需要返回给客户端
		userObj.put("AgencyType", agencyType);
		
		if("01".equals(agencyType)){
			String agencyLegalcertno = agency.getAgencyLegalcertno();//证件号，目前只支持身份证
			userObj.put("AgencyLegalcertno", agencyLegalcertno);
			String agencyName = agencyAdmin.getAdminRealname();//企业名称或者融资人名字
			userObj.put("AgencyName", agencyName);
		}else if("02".equals(agencyType)){
			String agencyCode = agency.getAgencyCode();//社会统一代码
			String agencyName = agency.getAgencyName();//企业名称或者融资人名字
			userObj.put("AgencyName", agencyName);
			userObj.put("AgencyCode", agencyCode);
		}else{
			logger.warn( "融资方类型为个人时候的信息 查询出错");
			throw new Exception("融资方类型为个人时候的信息 查询出错");
		}
	}

	/*
	 * 融资方超级管理员信息
	 * @param merchantUserId
	 * @return
	 * @throws Exception
	 */
	public AgencyAdmin obtainSuperAgencyAdminInfo(String merchantUserId)
			throws Exception {
		logger.info( "enter into obtainSuperAgencyAdminInfo");
		//超级管理员信息
		AgencyAdminExample example = new AgencyAdminExample();
		com.yonyou.scf.common.schema1.domain.AgencyAdminExample.Criteria criteria=  example.createCriteria();
		criteria.andAdminAgencyIdEqualTo(merchantUserId)
		.andAdminRoleIdEqualTo(adminRoleId);
		List<AgencyAdmin> list = agencyAdminMapper.selectByExample(example);
		if(list==null || list.size()==0 || list.size()>1){
			logger.warn( "融资方类型为个人时候超级管理员的信息查询出错");
			throw new Exception("融资方类型为个人时候超级管理员的信息查询出错");
		}
		
		AgencyAdmin agencyAdmin = list.get(0);
		return agencyAdmin;
	}

	/*
	 * 企业的信息
	 * @param userObj
	 */
	private void obtainCompanyContent(JSONObject userObj, String merchantUserId) throws Exception {
		logger.info( "enter into obtainCompanyContent");
		//核心企业基本信息
		Company company = companyMapper.selectByPrimaryKey(merchantUserId);
		
		CompanyAdmin companyAdmin = obtainSuperCompanyAdminInfo(merchantUserId);
		
		String companyPhone = companyAdmin.getAdminPhone();
		String companyAdminId = companyAdmin.getAdminId();
		
		userObj.put("CompanyName", company.getCompanyName());//公司名称
		userObj.put("CompanyCode", company.getCompanyCode());//统一社会信用代码
		userObj.put("companyPhone", companyPhone);//联系电话
		userObj.put("companyAdminId", companyAdminId);//超级管理员信息id
		
	}

	/*
	 * 核心企业超级管理员信息
	 * @param merchantUserId
	 * @return
	 * @throws Exception
	 */
	public CompanyAdmin obtainSuperCompanyAdminInfo(String merchantUserId)
			throws Exception {
		logger.info( "enter into obtainSuperCompanyAdminInfo");
		//超级管理员信息
		CompanyAdminExample example = new CompanyAdminExample();
		com.yonyou.scf.common.schema1.domain.CompanyAdminExample.Criteria criteria=  example.createCriteria();
		criteria.andAdminCompanyEqualTo(merchantUserId)
		.andAdminRoleIdEqualTo(adminRoleId);
		List<CompanyAdmin> list = companyAdminMapper.selectByExample(example);
		if(list==null  || list.size()==0 || list.size()>1){
			logger.warn( "核心企业信息查询出错");
			throw new Exception("核心企业信息查询出错");
		}
		
		CompanyAdmin companyAdmin = list.get(0);
		return companyAdmin;
	}

	/*
	 * 判断银行的类型
	 * @return online 线上；underLine 线下
	 */
	public String judgeTypeOfBank(String capitalId) throws Exception {
		logger.info( "enter into judgeTypeOfBank");
		Capital capital = capitalMapper.selectByPrimaryKey(capitalId);
		
		if(capital==null){
			logger.warn( "获取资方信息有误");
			throw new Exception("获取资方信息有误");
		}
		
		String capitalBankid = capital.getCapitalBankid();
		
		if("0".equals(capitalBankid)){
			return "underLine";
		}
		
		return "onLine";
	}


	/*
	 * 返回所有已受信的资方key(资方id)存入 List
	 * @param userRole
	 * @param merchantUserId   oms真实融资方主键id
	 * @param line
	 * @return
	 * @throws Exception
	 */
	public List<String> obtainCapitalInfoWithoutSignatrueList(int userRole, String organizationUserId,boolean line) throws Exception {
		List<String> list = new ArrayList<String>();
		switch(userRole){
		case 10://(1.1)核心企业
			if(line){
				obtainCapitalInfoByCompany(list, organizationUserId);
			}else{
				obtainCapitalInfoByAgencyUnderLine(list, organizationUserId);
			}
			break;
		case 20://(1.2)融资方
			if(line){
				obtainCapitalInfoByAgency(list, organizationUserId);
			}else{
				obtainCapitalInfoByCompanyUnderLine(list, organizationUserId);
			}
			break;
		default:
				logger.warn( "Authentication 不存在的角色");
				throw new Exception("判断企业或者个人出错");
	}
		return list;
	}

	/*
	 * 根据融资方 查询线上资方
	 * @param list
	 * @param merchantUserId
	 */
	private void obtainCapitalInfoByAgency(List<String> list,
			String merchantUserId) throws Exception {
		
		//获取所有产品
		List<Product> productList = getProductListByAgencyMerchantUserId(merchantUserId);
		
		if(productList==null || productList.size()<=0){
			return;
		}
		
		//筛选出线上银行
		List<Product> onLineCapiList = productList.parallelStream()
									.filter(x->{
										try {
											return "onLine".equals(judgeTypeOfBank(x.getProductCapitalId()));
										} catch (Exception e) {
											e.printStackTrace();
											return false;
										}
									}).collect(Collectors.toCollection(ArrayList::new));
		//取银行id  赋值到list中(取代下面注释部分)
		onLineCapiList.stream().filter(x->!list.contains(x.getProductCapitalId())).forEach(x->list.add(x.getProductCapitalId()));
		
	}
	/*
	 * 根据融资方 查询线下资方
	 * @param list
	 * @param merchantUserId
	 */
	private void obtainCapitalInfoByAgencyUnderLine(List<String> list,
			String merchantUserId) throws Exception {
		
		//获取所有产品
		List<Product> productList = getProductListByAgencyMerchantUserId(merchantUserId);
		
		if(productList==null || productList.size()<=0){
			return;
		}
		
		//筛选出线上银行
		List<Product> underLineProductList = productList.parallelStream()
				.filter(x->{
					try {
						return "underLine".equals(judgeTypeOfBank(x.getProductCapitalId()));
					} catch (Exception e) {
						e.printStackTrace();
						return false;
					}
				}).collect(Collectors.toCollection(ArrayList::new));
		//取银行id  赋值到list中(取代下面注释部分)
		underLineProductList.stream().filter(x->!list.contains(x.getProductCapitalId())).forEach(x->list.add(x.getProductCapitalId()));
		
	}



	/**
	 * 根据商户端融资方获取所有产品list表
	 * @param merchantUserId 融资方真实id
	 * @return
	 */
	public List<Product> getProductListByAgencyMerchantUserId(String merchantUserId) {
		//（2）根据（1）中查询出的id  去oms授信表中查询产品id
		CreditExample creditExample = new CreditExample();
		com.yonyou.scf.common.schema1.domain.CreditExample.Criteria creditCriteria =  creditExample.createCriteria();
		creditCriteria.andCreditAgencyIdEqualTo(merchantUserId);
		creditExample.setOrderByClause("CREDIT_STARTDATE ASC");
		List<Credit> creditList = creditMapper.selectByExample(creditExample);
		//（3）根据产品id 去产品表中查询资方id
		List<String> productIdList = new ArrayList<String>();
		for (Credit credit : creditList) {
			productIdList.add(credit.getCreditProductId());
		}
		
		if(productIdList==null || productIdList.size()<=0){
			return null;
		}
		
		ProductExample productExample = new ProductExample();
		com.yonyou.scf.common.schema1.domain.ProductExample.Criteria productCriteria =  productExample.createCriteria();
		productCriteria.andProductIdIn(productIdList);
		productExample.setDistinct(true);
		List<Product> productList= productMapper.selectByExample(productExample);
		return productList;
	}

	/*
	 * 根据核心企业查询资方
	 * @param list
	 * @param merchantUserId
	 */
	private void obtainCapitalInfoByCompany(List<String> list,
			String merchantUserId) throws Exception {
		
		//（2）根据（1）中查询出的id  去oms产品表中查询资方id
		List<Product> productList = getProductListByCompanyMerchantUserId(merchantUserId);
		
		if(productList==null || productList.size()<=0){
			return;
		}
		
		//筛选出线上银行
		List<Product> onLineCapiList = productList.parallelStream()
									.filter(x->{
										try {
											return "onLine".equals(judgeTypeOfBank(x.getProductCapitalId()));
										} catch (Exception e) {
											e.printStackTrace();
											return false;
										}
									}).collect(Collectors.toCollection(ArrayList::new));
		//取银行id  赋值到list中(取代下面注释部分)
		onLineCapiList.stream().filter(x->!list.contains(x.getProductCapitalId())).forEach(x->list.add(x.getProductCapitalId()));
		
	}
	private void obtainCapitalInfoByCompanyUnderLine(List<String> list,
			String merchantUserId) throws Exception {
		
		//（2）根据（1）中查询出的id  去oms产品表中查询资方id
		List<Product> productList = getProductListByCompanyMerchantUserId(merchantUserId);
		
		if(productList==null || productList.size()<=0){
			return;
		}
		
		//筛选出线上银行
		List<Product> onLineCapiList = productList.parallelStream()
				.filter(x->{
					try {
						return "underLine".equals(judgeTypeOfBank(x.getProductCapitalId()));
					} catch (Exception e) {
						e.printStackTrace();
						return false;
					}
				}).collect(Collectors.toCollection(ArrayList::new));
		//取银行id  赋值到list中(取代下面注释部分)
		onLineCapiList.stream().filter(x->!list.contains(x.getProductCapitalId())).forEach(x->list.add(x.getProductCapitalId()));
		
	}



	/**
	 * 根据商户端融资方获取所有产品list表
	 * @param merchantUserId
	 * @return
	 */
	private List<Product> getProductListByCompanyMerchantUserId(String merchantUserId) {
		ProductExample productExample = new ProductExample();
		com.yonyou.scf.common.schema1.domain.ProductExample.Criteria productCriteria =  productExample.createCriteria();
		productCriteria.andProductCompanyIdEqualTo(merchantUserId);
		productExample.setDistinct(true);
		List<Product> productList= productMapper.selectByExample(productExample);
		return productList;
	}
	
	/*
	 * 返回签署合同方法
	 * @param userRole 10-核心企业 20-融资方
	 * @param creditId 授信id
	 * @throws Exception 
	 */
	public JSONArray returnPacts(int userRole, String capitalId, String merchantUserId, int startInt) throws Exception{
		
		JSONArray resultArray = new JSONArray();
		
		//分页
		if(startInt==1){
			PageHelper.startPage(1, 2);
		}else{
			PageHelper.startPage(startInt, 5);
		}
		
		switch(userRole){
		
		case 10://(1.1)核心企业
			Map<String,Object> map_c = Maps.newHashMapWithExpectedSize(2);
			map_c.put("capitalId", capitalId);
			map_c.put("companyId", merchantUserId);
			resultArray = obtainCompanyPactContent(map_c);
			break;
		case 20://(1.2)融资方
			Map<String,Object> map = Maps.newHashMapWithExpectedSize(2);
			map.put("capitalId", capitalId);
			map.put("agencyId", merchantUserId);
			resultArray = obtainAgencyPactContent(map);
			break;
		default:
			logger.warn( "Authentication 不存在的角色");
			throw new Exception("判断企业或者个人出错");
		}
		return resultArray;
	}
	
	/*
	 * 获取融资方合同明细
	 * @param capitalId
	 * @param merchantUserId
	 * @return
	 */
	private JSONArray obtainAgencyPactContent(Map<String,Object> map) {
		
		List<Map<String, Object>> list = beforeLoanUtilMapper.obtainCapitalAfterCreditWithAgency(map);
		
		if(list==null || list.size()==0){//
			return null;
		}
		return JSONArray.fromObject(list);
	}

	/*
	 * 获取核心企业合同明细
	 * @param capitalId
	 * @param merchantUserId
	 * @return
	 */
	private JSONArray obtainCompanyPactContent(Map<String,Object> map) {
		List<Map<String, Object>> list = beforeLoanUtilMapper.obtainCapitalAfterCreditWithCompany(map);
		
		if(list==null || list.size()==0){//
			return null;
		}
		return JSONArray.fromObject(list);
	}
	
	/*
	 * 正常字体前后间距
	 * @return
	 */
	public static Paragraph normalIndentationParagraph(int leftIndentation,int rightIndentation, BaseFont baseFontChinese, 
			int leading, Chunk[] chunks){
		Font fontChinese =  new  Font(baseFontChinese , 14 , Font.NORMAL);
		Paragraph paragraph = new Paragraph();
		paragraph.setIndentationLeft(leftIndentation);
		paragraph.setIndentationRight(rightIndentation);
		paragraph.setLeading(leading);
		paragraph.setFont(fontChinese);
		for (Chunk chunk : chunks) {
			paragraph.add(chunk);
		}
		return paragraph;
	}
	
	public static String getValueFromMap(Map map, String key) throws CodeException{
		if(!map.containsKey(key)){
			throw new CodeException("3002", "map中没有所要取的key");
		}
		return (String) map.get(key);
	}
	
	/*
	 * 在本地创建一个指定内容的文件
	 * @param crrentUserName 当前操作人 同时也是u盾使用者
	 * @param IDNo 身份证号
	 * @param SnNo u盾序列号
	 * @param companyName 当前操作人单位名称
	 * @param groupId 组织结构id
	 * @param legalUserName 法人
	 * @return 文件名
	 * @throws com.yonyou.scf.tools.system.CodeException
	 */
	public static File createUkeyPDF(Map<String,Object> map) throws CodeException, IOException{
		
		String crrentUserName = getValueFromMap(map,"crrentUserName");
		String IDNo = getValueFromMap(map,"IDNo");
		String SnNo = getValueFromMap(map,"SnNo");
		String companyName = getValueFromMap(map,"companyName");
		String groupId = getValueFromMap(map,"groupId");
		String legalUserName = getValueFromMap(map,"legalUserName");
		
		//创建文本  
	   String fileId = GUID.genTxNo(32);
	   String pdfName = fileId+".pdf";
       Document document = new Document();  
       
       OutputStream os = null;
       
       try {  
    	   
         //写入文本到文件中  
    	   
    	 File file = new File(localUkeyurl+pdfName);
    	 
    	 if(!file.exists()){
    		 file.getParentFile().mkdirs();
    		 file.createNewFile();
    	 }
    	 os = new FileOutputStream(new File(localUkeyurl+pdfName));
    	   
         PdfWriter.getInstance(document, os);  
         //打开文本  
         document.open();  
         
         BaseFont baseFontChinese = null;
		try {
			baseFontChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
		} catch (IOException e) {
			e.printStackTrace();
		}
         Font fontChinese =  new  Font(baseFontChinese , 18 , Font.BOLD);
         //开始添加空白行 
         Paragraph paragraphspace = new Paragraph();
         paragraphspace.add("\n");
         for (int i = 0; i < 5; i++) {
       	  document.add(paragraphspace);
         }
         document.addTitle("使用授权书");
         //定义段落  
         Paragraph paragraph = new Paragraph();  
         paragraph.setFont(fontChinese);
         //标题  
         Chunk chunk = new Chunk("用友供应链金融服务平台数字证书使用授权书");  
         paragraph.add(chunk); 
         paragraph.setAlignment(Element.ALIGN_CENTER);
         document.add(paragraph);  
         //内容 
         Chunk chunk1 = new Chunk("兹 授 权 我 单 位 员 工 姓 名：");
         Chunk chunk1_1 = new Chunk(crrentUserName);
         chunk1_1.setUnderline(1, -1);
         Chunk chunk1_2 = new Chunk("， 身 份 证 号 码：");
         document.add(normalIndentationParagraph(80,50,baseFontChinese,60, new Chunk[]{chunk1,chunk1_1,chunk1_2}));
         Chunk chunk2 = new Chunk(IDNo); 
         chunk2.setUnderline(1, -1);
         Chunk chunk2_2 = new Chunk("，代表我单位在贵公司“用友供应链金融"
					+"服务平台”（以下简称“本平台”）办理供应链金融服务相关事宜。我"
					+"方确认授权使用 DN（Distinguished Name，证书持有人唯一标识符值为：");
         Chunk chunk2_3 = new Chunk(SnNo);
         chunk2_3.setUnderline(1, -1);
         Chunk chunk2_4 = new Chunk("的数字证书系我单位申请。");
         Chunk chunk3 = new Chunk("使用上述数字证书在本平台进行的一切操作行为，无论实际有谁操作，均视为经过"
       		  				+"我单位授权代表我单位意愿，其法律后果均由我单位承担。");
         Font fontCh =  new  Font(baseFontChinese , 13 , Font.BOLD);
         chunk3.setFont(fontCh);
         document.add(normalIndentationParagraph(50,50,baseFontChinese,35, new Chunk[]{chunk2,chunk2_2,
       		  chunk2_3,chunk2_4,chunk3}));
         
         //添加空白行
         Chunk chunk4 = new Chunk("我单位主体信息如下：");
         document.add(normalIndentationParagraph(80,50,baseFontChinese,60, new Chunk[]{chunk4}));
         Chunk chunk4_1 = new Chunk("主体名称："+companyName);
         document.add(normalIndentationParagraph(80,50,baseFontChinese,35, new Chunk[]{chunk4_1}));
         Chunk chunk4_2 = new Chunk("组织机构代码："+groupId);
         document.add(normalIndentationParagraph(80,50,baseFontChinese,35, new Chunk[]{chunk4_2}));
         Chunk chunk4_3 = new Chunk("法定代表人："+legalUserName);
         document.add(normalIndentationParagraph(80,50,baseFontChinese,35, new Chunk[]{chunk4_3}));
         Chunk chunk5 = new Chunk("特此声明。");
         document.add(normalIndentationParagraph(80,50,baseFontChinese,85, new Chunk[]{chunk5}));
         Chunk chunk6 = new Chunk("单位名称（单位公章）");
         document.add(normalIndentationParagraph(300,50,baseFontChinese,35, new Chunk[]{chunk6}));
         Chunk chunk7 = new Chunk("年     月      日");
         document.add(normalIndentationParagraph(370,50,baseFontChinese,35, new Chunk[]{chunk7}));
         //关闭文本  
         document.close();  
         return file;//fileId;
       } catch (Exception e) {
    	   e.printStackTrace();
    	   throw new CodeException("3003", "创建文件失败");
       } finally{
    	   if(os!=null){
    		   os.close();
    	   }
       }  		
	}
	
	/*
	 *获取签名原文 
	 * @param merchantUserId
	 * @param UserRole
	 * @param snNo
	 * @return 
	 * @throws Exception  参数有误
	 */
	public JSONObject obtainSourceContentForPact(String merchantUserId, int UserRole, String snNo) throws Exception{
		System.out.println("生产证书..............");
		String organizationUserId = judgeActiveStatus(merchantUserId, UserRole);
		
		JSONObject resultObj = new JSONObject();
		
		Map<String,String> resultMap = new HashMap<String,String>();//最后结果集
		Map<String,Object> inputMap = new HashMap<String,Object>();//上传文件所需参数
		
		if(StringUtil.isEmpty(organizationUserId)){
			throw new CodeException("无效用户");
		}
		//获取合同签署方的名称(名称)
		String name = "";
		name = returnPersionInfo(UserRole, organizationUserId, inputMap, name);
		
		//上传文件 获取md5 和 文件名
		inputMap.put("SnNo", snNo);
		
		File file = createUkeyPDF(inputMap);
		
		@Cleanup InputStream is = new FileInputStream(file);
		
		//获取文件MD5
		String md5 = DigestUtils.md5Hex(is);//getValueFromMap(resultMap,"fileMd5");
		//获取当前时间
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		String dt = df.format(new Date());
		//拼接原文串
		String str = dt+"|"+name+"|" +snNo+"|"+md5;
		resultObj.put("resource", str);
		String nameSuffix = file.getName();
		resultObj.put("idName",nameSuffix.substring(0, nameSuffix.lastIndexOf(".")));// getValueFromMap(resultMap,"idName")
		return resultObj;
	}
	
	/*
	 * 根据个人信息-合同用
	 * @param merchantUserId
	 * @param UserRole
	 * @param snNo
	 * @param creditid
	 * @param pacttype
	 * @return
	 * @throws Exception
	 */
	public JSONObject obtainSourceContentForPact(String merchantUserId, int UserRole, String snNo,String creditid,String pacttype) throws Exception{
		String organizationUserId = judgeActiveStatus(merchantUserId, UserRole);
		
		JSONObject resultObj = new JSONObject();
		
		Map<String,Object> inputMap = new HashMap<String,Object>();//上传文件所需参数
		
		if(StringUtil.isEmpty(organizationUserId)){
			throw new CodeException("无效用户");
		}
		//获取合同签署方的名称(名称)
		String name = "";
		name = returnPersionInfo(UserRole, organizationUserId, inputMap, name);
		
		//获取文件MD5
		String md5 = obtainMD5FromFtp(pacttype,creditid,"pdf");
		//获取当前时间
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		String dt = df.format(new Date());
		//拼接原文串
		String str = dt+"|"+name+"|" +snNo+"|"+md5;
		resultObj.put("resource", str);
		return resultObj;
	}

	private String returnPersionInfo(int UserRole, String organizationUserId,
			Map<String, Object> inputMap, String name) throws CodeException,
			Exception {
		switch(UserRole){
			case 10:
				Company company = companyMapper.selectByPrimaryKey(organizationUserId);
				if(company==null){
					throw new CodeException("参数有误");
				}
//				CompanyAdmin companyAdmin = obtainSuperCompanyAdminInfo(organizationUserId);
				name = company.getCompanyPername();//联系人
				inputMap.put("crrentUserName", StringUtil.isEmpty(name)?"无":name);
				inputMap.put("IDNo", StringUtil.isEmpty(company.getCompanyLegalcertno())?"无":company.getCompanyLegalcertno());//目前是取实际控制人的
				inputMap.put("companyName", StringUtil.isEmpty(company.getCompanyName())?"无":company.getCompanyName());
				inputMap.put("groupId", StringUtil.isEmpty(company.getCompanyCode())?"无":company.getCompanyCode());
				inputMap.put("legalUserName", StringUtil.isEmpty(company.getCompanyLegalname())?"无":company.getCompanyLegalname());
			break;
			case 20:
				Agency agency = agencyMapper.selectByPrimaryKey(organizationUserId);
				if(agency==null){
					throw new CodeException("参数有误");
				}
//				AgencyAdmin agencyAdmin = obtainSuperAgencyAdminInfo(organizationUserId);
				name = agency.getAgencyPername();
				inputMap.put("crrentUserName", StringUtil.isEmpty(name)?"无":name);
				inputMap.put("IDNo", StringUtil.isEmpty(agency.getAgencyConcertno())?"无":agency.getAgencyConcertno());//目前是取实际控制人的
				inputMap.put("companyName", StringUtil.isEmpty(agency.getAgencyName())?"无":agency.getAgencyName());
				inputMap.put("groupId", StringUtil.isEmpty(agency.getAgencyCode())?"无":agency.getAgencyCode());
				inputMap.put("legalUserName", StringUtil.isEmpty(agency.getAgencyLegalname())?"无":agency.getAgencyLegalname());
			break;
			default:
				throw new CodeException("参数有误");
		}
		return name;
	}
	
	/*
	 * 获取下载的附件名称
	 * @return
	 */
	public Map<String,String> obtainFTPInfo(){
		Map<String,String> resultMap = new HashMap<String,String>();
		ReentrantLock lock = new ReentrantLock();
		
		if(FTPInfoMap==null){
			try {
				lock.lock();
				if(FTPInfoMap==null){
					//获取下载的附件名称
					SysParamExample param = new SysParamExample();
					param.createCriteria().andParamCodeEqualTo("FTP_PARAM");
					//查询FTP参数
					List<SysParam> resultList =sysParamMapper.selectByExample(param);
					for(SysParam sp :resultList){
						resultMap.put(sp.getParamKey(), sp.getParamValue());
					}
					FTPInfoMap = resultMap;
				}
			} catch (Exception e) {
				logger.error( "获取ukey授权书有误");
			}finally{
				lock.unlock();
			}
		}
		
		return FTPInfoMap;
	}
	
//	public static void main(String[] args) {
//		try {
//			new UserLoanServiceUtil().downLoadToServer("Pact20170508184202836","Credit20170508185131912");
//		} catch (CodeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	/*
	 * 返回ftp文件系统中，某个文件的md5
	 * @param idName
	 * @param filePath
	 * @param suffix 文件后缀  text01.txt suffix=txt
	 * @return
	 * @throws CodeException
	 */
	public String obtainMD5FromFtp(String idName, String filePath, String suffix)
			throws NoSuchElementException, IllegalStateException, Exception{
		//文件名后缀不能为空
		if(StringUtils.isEmpty(suffix)){
			throw new CodeException("3001", "文件名后缀不能为空");
		}
		// FTP对象
		FTPClient ftp = fTPClientPool.borrowObject();
		InputStream in = null;
		// 链接地址和端口
		try {
			
			// 选择要下载的目录
			ftp.changeWorkingDirectory(filePath);
			
			// 下载的文件列表
			FTPFile[] fs = ftp.listFiles();
			logger.info("获取目录文件列表"+fs.length);
			
			//判断是否存在相同名称
			boolean flag = Stream.of(fs).parallel().anyMatch(x->x.getName().equals(idName+"."+suffix));
			
			if(flag){//成功，开始取流
				 in = ftp.retrieveFileStream(idName+"."+suffix);
				 return DigestUtils.md5Hex(in);
			}else{
				logger.error("不存在文件或者文件重复");	
				throw new CodeException("3001", "不存在文件或者文件重复");
			}
		} catch (Exception e) {
			System.out.println(ftp.getReplyString());
			e.printStackTrace();
			logger.error("FTP获取出错");	
			throw new CodeException("3004", "FTP获取出错");
		}finally{
			try {
				if(in!=null){
					in.close();
				}
				fTPClientPool.returnObject(ftp);
			} catch (IOException e) {
				e.printStackTrace();
			}
			logger.info("FTP登出");			
		}
	}	
	/*
	 * 将ftp文件系统中的文件下载到本地
	 * @param targetIdName ftp文件系统中 文件的名字
	 * @param targetFilePath  指定路径
	 * @param showUserFileName 展示给用户的名字
	 * @param suffix 文件后缀  text01.txt suffix=txt
	 * @param resp 用于文件输出流
	 * @throws NoSuchElementException
	 * @throws IllegalStateException
	 * @throws Exception
	 */
	public void downLoadQualification(String targetIdName,
			String targetFilePath,
			String showUserFileName,
			String suffix,
			HttpServletResponse resp) throws NoSuchElementException, IllegalStateException, Exception{
		//文件名后缀不能为空
		if(StringUtils.isEmpty(suffix)){
			throw new CodeException("3001", "文件名后缀不能为空");
		}
		
		if(targetFilePath==null || StringUtils.isEmpty(targetFilePath)){
			targetFilePath = ukeytranforToFTPUrl;
		}
		
		// FTP对象
 		FTPClient ftp = fTPClientPool.borrowObject();
		@Cleanup ServletOutputStream sos = null;
		// 链接地址和端口
		try {
			// 选择要下载的目录
			ftp.changeWorkingDirectory(targetFilePath);
			
			// 下载的文件列表
			FTPFile[] fs = ftp.listFiles();
			logger.info("获取目录文件列表"+fs.length);
			
			//判断是否存在相同名称，存在则返回null
			int count = 0;
			for (FTPFile files : fs) {
				if(files.getName().equals(targetIdName+"."+suffix)){
					count++;
				}
			}
			if(count==1){//成功，开始取流
				String newName = new String(showUserFileName.getBytes("UTF-8"), "ISO8859-1");
				resp.setHeader("Content-Disposition", "attachment;fileName="+newName+"."+suffix);
				sos = resp.getOutputStream();
				ftp.retrieveFile(targetIdName+"."+suffix, sos);
				sos.flush();
			}else{
				logger.error("不存在文件或者文件重复");	
				throw new CodeException("3001", "不存在文件或者文件重复");
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("FTP获取出错");	
			throw new CodeException("3004", "FTP获取出错");
		}finally{
				if(ftp!=null){
					fTPClientPool.returnObject(ftp);
				}
			logger.info("FTP登出");			
		}
	}	
	
	/*
	 * 将本地文件上传ftp文件系统
	 * @param sourceIdName 本地文件名
	 * @param fileLocalPath 本地文件路径
	 * @param targetIdName 指定上传ftp后的文件名
	 * @param targetFilePath 上传路径
	 * @param suffix 文件后缀  text01.txt suffix=txt
	 * @throws NoSuchElementException
	 * @throws IllegalStateException
	 * @throws Exception
	 */
	public void obtainPDFFromLocal(String sourceIdName,
			String fileLocalPath, String targetIdName,String targetFilePath, String suffix)
					throws NoSuchElementException, IllegalStateException, Exception{ //InputStream
		//文件名后缀不能为空
		if(StringUtils.isEmpty(suffix)){
			throw new CodeException("3001", "文件名后缀不能为空");
		}
		// FTP对象
		FTPClient ftp = fTPClientPool.borrowObject();
		System.out.println("ftp链接资源："+ftp.toString());
		//ftp命令 ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out), true));
		@Cleanup InputStream fis = null;
		// 链接地址和端口
		try {
			
			ftp.changeWorkingDirectory(targetFilePath);
			
			// 下载的文件列表
			FTPFile[] fs = ftp.listFiles();
			
			//判断是否存在相同名称，存在则返回null
			for (FTPFile files : fs) {
				if(files.getName().equals(targetIdName+"."+suffix)){
					throw new CodeException("3001","文件系统存在相同文件");
				}
			}
			
			File temp = new File(fileLocalPath+sourceIdName+"."+suffix);
			fis = new FileInputStream(temp);
			ftp.storeFile(targetIdName+"."+suffix, fis);
			
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("FTP获取出错");	
			throw new CodeException("3004", "FTP获取出错");
		}finally{
			try {
				if(ftp!=null){
					fTPClientPool.returnObject(ftp);
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
				System.out.println("返还ftppool出错");
				throw new CodeException("3005", "FTP返回pool资源出错");
			}
		}
	}
	
	/*
	 * 获取map类型中的key5
	 * @param obj
	 * @param key
	 * @return
	 */
	public static String getParam(JSONObject obj, String key) {
		if(!obj.containsKey(key)){
			throw new NullPointerException("从JSONOject中取不存在的key");
		}
		return obj.getString(key);
	}
	
	public int getIntParam(JSONObject obj, String key) throws Exception {
		if(!obj.containsKey(key)){
			throw new NullPointerException("从JSONOject中取不存在的key");
		}
		
		String value = obj.getString(key);
		int val = 0;
		try {
			val = Integer.parseInt(value);
		} catch (NumberFormatException e) {
			throw new Exception("参数有误");
		}
		return val;
	}
	
	/**
	 * @throws CodeException 
	 * @throws UnsupportedEncodingException 
	 * @throws FcsAppException 
	 * certVerify
	 * 
	 * @Title: certVerify
	 * @Description: 验证用户证书和签名数据是否合法
	 * @param signsrc
	 *            签名原文
	 * @param signature
	 *            签名密文
	 * @param userSn
	 *            用户绑定SN 从session中获取
	 * @throws Exception
	 * @return void 返回类型
	 * @throws
	 */
	public static String certVerify(String signsrc, String signature, String userSn) throws FcsAppException, UnsupportedEncodingException, CodeException{

		Signature signUtil = new Signature();

		// 验证消息签名
		boolean verify = false;
		try {
			verify = signUtil.p7VerifyMessageAttach(signature.getBytes(), session);
		} catch (PKIException e) {
			throw new FcsAppException(e.getErrDesc());
		}
		if (!verify) {
			throw new FcsAppException("验证消息签名非法");
		}

		// 验证消息签名原文
		if (!Arrays.equals(signsrc.getBytes("UTF-8"), signUtil.getSourceData())) {
			throw new FcsAppException("消息签名原文不匹配");
		}

		// 证书信息
		X509Cert cert = signUtil.getSignerCert();

		// 验证证书是否失效
		// 证书失效日期
		Date notAfter = cert.getNotAfter();
		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String notAft_str = dataFormat.format(notAfter);
		// 当前系统日期
		String curTim_str = dataFormat.format(new Date());
		// 当前系统时间大于证书失效日期
		if (curTim_str.compareTo(notAft_str) > 0) {
			throw new CodeException("7001","您使用的证书已经失效，失效日期是: " + new SimpleDateFormat("yyyy-MM-dd HH:mm").format(notAfter));
		}
		return curTim_str;
		
	}
	
	/*
	 * 当前key是否属于 当前用户
	 * @param snNo
	 * @param userId 真实的用户机构id
	 * @return
	 */
	public boolean judgeActiveUserBySN(String snNo,String userId){
		BindUsbkExample  bindUsbkExample = new BindUsbkExample();
		
		bindUsbkExample.createCriteria().andSnNumEqualTo(snNo).andOperatorIdEqualTo(userId);		
		
		int con =  bindUsbkMapper.selectByExample(bindUsbkExample).size();
		
		if(con<1){
			return false;
		}
		
		return true;
		
	}
	
}
