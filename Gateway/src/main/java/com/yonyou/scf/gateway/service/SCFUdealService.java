package com.yonyou.scf.gateway.service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.yonyou.scf.common.helper.SMSHelper;
import com.yonyou.scf.common.schema1.domain.Agency;
import com.yonyou.scf.common.schema1.domain.AgencyAdmin;
import com.yonyou.scf.common.schema1.domain.Company;
import com.yonyou.scf.common.schema1.domain.CompanyAdmin;
import com.yonyou.scf.common.schema1.domain.FiGroup;
import com.yonyou.scf.common.schema1.domain.FiGroupExample;
import com.yonyou.scf.common.schema1.domain.FitPersionalInformation;
import com.yonyou.scf.common.schema1.domain.PlatformInfo;
import com.yonyou.scf.common.schema1.domain.PlatformInfoExample;
import com.yonyou.scf.common.schema1.domain.SysLogin;
import com.yonyou.scf.common.schema1.domain.SysLoginExample;
import com.yonyou.scf.common.schema1.domain.UserBeforeLoan;
import com.yonyou.scf.common.schema1.mapper.AgencyAdminMapper;
import com.yonyou.scf.common.schema1.mapper.AgencyMapper;
import com.yonyou.scf.common.schema1.mapper.AuthenticationMapper;
import com.yonyou.scf.common.schema1.mapper.CompanyMapper;
import com.yonyou.scf.common.schema1.mapper.FiGroupMapper;
import com.yonyou.scf.common.schema1.mapper.FitPersionalInformationMapper;
import com.yonyou.scf.common.schema1.mapper.PlatformInfoMapper;
import com.yonyou.scf.common.schema1.mapper.SysLoginMapper;
import com.yonyou.scf.common.tx.api.TxRequest;
import com.yonyou.scf.common.tx.gateway.Scf1103Request;
import com.yonyou.scf.common.tx.gateway.Scf1103Request_DataList;
import com.yonyou.scf.gateway.constant.SCFStatusConstant;
import com.yonyou.scf.gateway.util.IDHandler;
import com.yonyou.scf.gateway.util.SendMessageServiceImpl;
import com.yonyou.scf.gateway.util.UserLoanServiceUtil;
import com.yonyou.scf.gateway.validate.ValidActor;
import com.yonyou.scf.tools.constant.DefaultConstants;
import com.yonyou.scf.tools.lang.json.JsonUtil;
import com.yonyou.scf.tools.middleware.log.LogType;
import com.yonyou.scf.tools.security.XSSConstantTool;
import com.yonyou.scf.tools.system.CodeException;
import com.yonyou.scf.tools.util.GUID;
import com.yonyou.scf.tools.util.StringUtil;
import com.yonyou.scf.tools.util.TimeUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class SCFUdealService {
	
	private final static String SIGNFILEURL = "D:/workspaces/restful/beginTest-zhangjlm/src/main/resources/static/ukey_a.txt";
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private FiGroupMapper fiGroupMapper;
	@Autowired
	private AgencyAdminMapper agencyAdminMapper;
	@Autowired
	private AgencyMapper agencyMapper;
	@Autowired
	private CompanyMapper companyMapper;
	@Autowired
	private FitPersionalInformationMapper fitPersionalInformationMapper;
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Autowired
	private AuthenticationMapper authenticationMapper;
	@Autowired
	private PlatformInfoMapper platformInfoMapper;
	@Autowired
	private UserLoanServiceUtil userLoanServiceUtil;
	@Autowired
	private SysLoginMapper sysLoginMapper;
	@Autowired
	private SendMessageServiceImpl sendMessageServiceImpl;
	
	
	/**
	 * 批量插入开通融资方数据
	 * @param ja
	 * @return
	 * @throws Exception 
	 * @throws NullObjectForUseException 
	 * @throws ValidFormHaveErrorsExcption 
	 * @throws TransactionRollbackException 
	 */
	@Transactional(value="primaryTransactionManager",propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public int insertFITs(TxRequest tx) throws Exception{
		
		int terminal = 0;
		
		if(StringUtils.isEmpty(tx.getSourceType())){
			throw new Exception("终端来源未知");
		}
		
		try {
			terminal = Integer.parseInt(tx.getSourceType());
		} catch (Exception e) {
			throw new Exception("终端来源未知");
		}
		
		String platformId = tx.getPlatformId();
		
		String jsonMsg = tx.getJsonMessage();
		
		Scf1103Request scf1103Request = JsonUtil.toBean(jsonMsg, Scf1103Request.class);
		
		String centerCompanyId = scf1103Request.getCenterCompanyId();
		
		List<Scf1103Request_DataList> fitPersionalInformationList = scf1103Request.getDataList();
		
		//第一次去重，批次号去重,规则：请求中的批次号与数据库已存在的重复直接抛出异常，由controller统一捕捉
		validateBatchNo(scf1103Request);
		
		//循环域不能大于1000
		if(scf1103Request.getDataList()==null){
			return 0;
		}else if(scf1103Request.getDataListCnt()>1000 || scf1103Request.getDataList().size()>1000){
			throw new Exception("循环域条数不能大于1000");
		}
		
		//第二次去重：验证自己是否重复  因为同一批次  同一个平台id和核心企业id  所以只需判断融资方id是否重复  去重
		validateThemself(scf1103Request);
		
		//第三次去重
		validateWithDB(scf1103Request,platformId,centerCompanyId);
		
		if(scf1103Request.getDataList()==null || scf1103Request.getDataList().size()<=0 || scf1103Request.getDataListCnt()==0){
			return 0;
		}
		
		//第四，入库校验 假设没有关联性校验
		for (Scf1103Request_DataList fitPersionalInformation : scf1103Request.getDataList()) {
			new ValidActor<Scf1103Request_DataList>(fitPersionalInformation).validate();
		}
		//入库校验
		new ValidActor<Scf1103Request>(scf1103Request).validate();
		
		return batchInsertFiGroupAndPersion(scf1103Request, platformId, tx.getInterfaceNo(), terminal);
		
	}

	/*
	 * 验证批次号是否重复
	 * @param scf1103Request
	 * @throws Exception
	 */
	public void validateBatchNo(Scf1103Request scf1103Request) throws Exception{
		
		String batchNo = scf1103Request.getBatchNo();
		
		if(StringUtil.isEmpty(batchNo)){
			throw new Exception("批次号为空");
		}
		
		//直接用批次号去查。
		FiGroupExample example = new FiGroupExample();
		example.createCriteria().andBatchNoEqualTo(batchNo);
		
		List<FiGroup> fiGroupList = fiGroupMapper.selectByExample(example);
		
//		boolean bool = fiGroupList.parallelStream()
//								  .map(fiGroup->fiGroup.getBatchNo())
//								  .anyMatch(s->s.equals(scf1103Request.getBatchNo()));//匹配是否存在
		
		if(fiGroupList!=null && fiGroupList.size()>0){
			throw new Exception("批次号重复");
		}
	}

	/*
	 * 根据数据库去重
	 * @param fitPersionalInformationList
	 * @param platformId
	 * @param centerCompanyId
	 */
	private void validateWithDB(
			Scf1103Request scf1103Request,
			String platformId, String centerCompanyId) throws Exception {
		try {
			List<Scf1103Request_DataList> fitPersionalInformationList = scf1103Request.getDataList();
			//CopyOnWriteArrayList<Scf1103Request_DataList> scf1103Request_DataList = new CopyOnWriteArrayList<>();
			
			if(fitPersionalInformationList==null) return;
			
//			List<Scf1103Request_DataList> scf1103Request_DataList = fitPersionalInformationList.parallelStream().collect(Collectors.toList());
			
			List<Map<String, String>> listMap = fiGroupMapper.queryfitGroupPersion();
			
			
			ArrayList<String> arrayList = listMap
												.parallelStream()//开启并行流
												.map(map->map.get("groupids"))//重新构造集合
												.collect(Collectors.toCollection(ArrayList::new));//放入指定集合
			
			List<Scf1103Request_DataList> scf1103Request_DataList = 
										fitPersionalInformationList
										.parallelStream()
										.filter(scfd->!arrayList.contains(platformId+","+centerCompanyId+","+scfd.getFsId()))//过滤动作
										.collect(Collectors.toList());//默认是ArrayList  但是平时操作最好指定集合实现类
			
//			Iterator<Scf1103Request_DataList> iterator = scf1103Request_DataList.iterator();
//			
//			label1:while(iterator.hasNext()){
//			
//				Scf1103Request_DataList scf1103RequestDataList = iterator.next();
//				
//				for (Map<String, String> map : listMap) {
//					String groupIds = (String)map.get("groupids");
//					if(groupIds.equals(platformId+","+centerCompanyId+","+scf1103RequestDataList.getFsId())){
//						iterator.remove();
//						continue label1;
//					}
//				}
//			}
			scf1103Request.setDataList(scf1103Request_DataList);
			scf1103Request.setDataListCnt(scf1103Request_DataList.size());
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

	/*
	 * 开通融资服务去重 只根据融资方id
	 * @param fitPersionalInformationList
	 */
	private void validateThemself(
			Scf1103Request scf1103Request) throws Exception {
		
		Map<String,Scf1103Request_DataList> map = new HashMap<String,Scf1103Request_DataList>();
		for (Scf1103Request_DataList scf1103Request_DataList : scf1103Request.getDataList()) {
			map.put(scf1103Request_DataList.getFsId(), scf1103Request_DataList);
		}
		
		Iterator<Entry<String, Scf1103Request_DataList>> it = map.entrySet().iterator();
		
		ArrayList<Scf1103Request_DataList> fitPersionalInformationList = new ArrayList<Scf1103Request_DataList>();
		
		while(it.hasNext()){
			Entry<String, Scf1103Request_DataList> entry = it.next();
			fitPersionalInformationList.add(entry.getValue());
		}
		
		scf1103Request.setDataList(fitPersionalInformationList);
		scf1103Request.setDataListCnt(fitPersionalInformationList.size());
		
	}

	@Transactional(value="primaryTransactionManager",propagation=Propagation.MANDATORY,rollbackFor=Exception.class)
	private int batchInsertFiGroupAndPersion(
			Scf1103Request scf1103Request, String platformId, String interfaceNo, int terminal
			) throws CodeException {//TxRequest tx
		
		try {
			
			if(scf1103Request.getDataList()==null || scf1103Request.getDataList().size()==0){
				return 0;
			}
			
			String groupId = IDHandler.getUUID();
			String parentTime = IDHandler.getSeventeenTime();
			
			FiGroup ja = new FiGroup();
			
			ja.setSystemid(groupId);
			ja.setCreateTime(IDHandler.getSeventeenTime());
			ja.setModifyTime(IDHandler.getSeventeenTime());
			ja.setBatchNo(scf1103Request.getBatchNo());
			ja.setCenterCompanyGroupNum(scf1103Request.getCenterCompanyGroupNo());
			ja.setCenterCompanyId(scf1103Request.getCenterCompanyId());
			ja.setCreateTime(parentTime);
			ja.setInterfaceNo(interfaceNo);
			ja.setDataListCnt(scf1103Request.getDataListCnt());
			ja.setTerminalSource(terminal);
			ja.setModifyTime(parentTime);
			ja.setCenterCompanyName(scf1103Request.getCenterCompanyName());
			ja.setPlatformId(platformId);
			
			fiGroupMapper.insert(ja);
			
			//循环插入组织结构个人信息表
			List<Scf1103Request_DataList> fitPersionalInformationList = scf1103Request.getDataList();
			FitPersionalInformation fitPersionalInformation = null;
			List<FitPersionalInformation> list = new ArrayList<FitPersionalInformation>();
			for (Scf1103Request_DataList fitPersionalInformation_scf : fitPersionalInformationList) {
				
				fitPersionalInformation = new FitPersionalInformation();
				
				String fpiId = IDHandler.getUUID();
				fitPersionalInformation.setFiGroupId(groupId);
				fitPersionalInformation.setSystemid(fpiId);
				String childrenTime = IDHandler.getSeventeenTime();
				fitPersionalInformation.setCreateTime(childrenTime);
				fitPersionalInformation.setModifyTime(childrenTime);
				fitPersionalInformation.setFsConcater(fitPersionalInformation_scf.getFsConcater());
				fitPersionalInformation.setFsGroupNo(fitPersionalInformation_scf.getFsGroupNo());
				fitPersionalInformation.setFsId(fitPersionalInformation_scf.getFsId());
				fitPersionalInformation.setFsMail(fitPersionalInformation_scf.getFsMail());
				fitPersionalInformation.setFsName(fitPersionalInformation_scf.getFsName());
				fitPersionalInformation.setFsTel(fitPersionalInformation_scf.getFsPhone());
				fitPersionalInformation.setFsType(fitPersionalInformation_scf.getFsType());
				fitPersionalInformation.setTerminalSource(terminal);
				fitPersionalInformation.setStatus(SCFStatusConstant.FIT_STATUS_20_VALIDATING);
				list.add(fitPersionalInformation);
			}
			
			int batchInt = fitPersionalInformationMapper.insertBatchData(list);
			logger.info( "当前批量插入，成功操作的条数为："+batchInt);
			return batchInt;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error( "批量操作出现错误，事务控制回滚");
			throw new CodeException("批量操作出现错误，事务控制回滚");
		}
	}
	

	public JSONObject sendPhoneMessage(String phoneNo) throws CodeException {
		
		//安全随机数
		StringBuffer random = new StringBuffer();
		for (int i = 0; i < 6; i++) {
			random.append(String.valueOf(ThreadLocalRandom.current().nextInt(0, 9)));
		}
		
		JSONObject resultObj = new JSONObject();
			logger.info("3001准备发送短信,时间："+System.currentTimeMillis()+"，报文：phoneNo:"+phoneNo+"msg:【用友产融】发送短信验证！【"+random.toString()+"】");
			boolean bool = SMSHelper.doSend("", phoneNo, "【用友产融】发送短信验证！【"+random.toString()+"】", "");
			logger.info("3001发送短信结束,时间："+System.currentTimeMillis()+"，报文：phoneNo:"+phoneNo+"msg:【用友产融】发送短信验证！【"+random.toString()+"】,是否成功："+bool);
		
		String randomID = GUID.getTxNo16();
		
		stringRedisTemplate.opsForValue().set(randomID, random.toString());
		stringRedisTemplate.expire(randomID, 120, TimeUnit.SECONDS);
		
		
		if(!bool) {
			resultObj.put("Status", DefaultConstants.ERR_0001_CODE);
			resultObj.put("msg", "发送失败，请检查手机号并重新发送！");
			return resultObj;
		}
		resultObj.put("Status", DefaultConstants.SUCCESS_RESPONSE_CODE);
		resultObj.put("msg", "发送成功!");
		resultObj.put("code", random.toString());
		resultObj.put("tx_phone_code", randomID);
		return resultObj;
		
		
		
//		String result = sendMessageServiceImpl.send(
//				"【用友产融】发送短信验证！【"+random.toString()+"】", phoneNo);
		
		
		
//		JSONObject obj = null;
//		try {
//			obj = JSONObject.fromObject(result);
//		} catch (CodeException e) {
//			logger.error( "发送手机短息出错");
//			resultObj.put("Status", DefaultConstants.ERR_0001_CODE);
//			resultObj.put("msg", "发送失败，请检查手机号并重新发送！");
//			return resultObj;
//		}
		
		//发送有误
//		if(obj==null || !obj.containsKey("Rets")){
//			resultObj.put("Status", DefaultConstants.ERR_0001_CODE);
//			resultObj.put("msg", "发送失败，请检查手机号并重新发送！");
//			return resultObj;
//		}
		
		//返回报文格式   {"Rets":[{"Rspcode":"0","Msg_Id":"20170424216184030102","Dest_terminal_Id":"18611******"}]}
//		String status = JSONObject.fromObject(
//				JSONArray.fromObject(obj.get("Rets")).get(0)).get("Rspcode")
//				.toString();
//		if(!"0".equals(status)){
//			resultObj.put("Status", DefaultConstants.ERR_0001_CODE);
//			resultObj.put("msg", "发送失败，请检查手机号并重新发送！");
//			return resultObj;
//		}
	}

	/**
	 * 更改账号和密码
	 * @param agencyAdmin
	 * @return
	 */
	@Transactional
	public JSONObject modifyUserInfo(AgencyAdmin agencyAdmin) {
		JSONObject obj = new JSONObject();
		
		 if(agencyAdmin==null){
			 obj.put("Status", DefaultConstants.ERR_0001_CODE);
			 obj.put("msg", "更改信息失败，请刷新页面！");
			 return obj;
		 }
		
		 //账号密码不能为空
		 if(StringUtil.isEmpty(agencyAdmin.getAdminPassword()) || StringUtil.isEmpty(agencyAdmin.getAdminUsername())){
			 obj.put("Status", DefaultConstants.SUCCESS_RESPONSE_CODE);
			 obj.put("msg", "账号密码不能为空");
			 return obj;
		 }
		//密码加密 
		agencyAdmin.setAdminPassword(DigestUtils.md5Hex(agencyAdmin.getAdminPassword()));
		
//		authenticationMapper.updateByPrimaryKeySelective(record)
		
		int resultInt = agencyAdminMapper.updateByPrimaryKeySelective(agencyAdmin);
		
		if(resultInt>0){
			 obj.put("Status", DefaultConstants.SUCCESS_RESPONSE_CODE);
			 obj.put("msg", "更改账号密码成功");
			 return obj;
		}else{
			obj.put("Status", DefaultConstants.ERR_0001_CODE);
			obj.put("msg", "更改信息失败，请刷新页面！");
			return obj;
		}
	}
	
	/**
	 * 签名准备
	 * @param userBefroeLoan
	 * @return
	 * @throws CodeException 
	 * @throws IllegalParameterException 
	 */
	public JSONObject obtainsSignatrue(UserBeforeLoan userBeforeLoan) throws CodeException{
		
		//返回请求报文
		JSONObject ob = new JSONObject();
		
		//获取请求参数
		String merchantUserId = userBeforeLoan.getMerchantUserId();
		Integer userRole = userBeforeLoan.getUserRole();
		
		String userName = "";
		
		switch(userRole){
			case 10://核心企业
				//核心企业基本信息
				Company company = companyMapper.selectByPrimaryKey(merchantUserId);
				
//				obj.put("CompanyName", company.getCompanyName());
//				obj.put("CompanyCode", company.getCompanyCode());
//				obj.put("CompanyPerphone", company.getCompanyPerphone());
				break;
			case 20://融资方
				
				//融资方基本信息
					Agency agency = agencyMapper.selectByPrimaryKey(merchantUserId);
				//判断融资方可用性
	//				if(agency!=null && "1".equals(agency.getAgencyStatus())){
	//					return new ResultBean(FIT_NO_ALLOWED_USING_STATUS,userBeforeLoanStatus.get(FIT_NO_ALLOWED_USING_STATUS));
	//				}
					
					if(agency==null){
						logger.error( "获取融资方对象为null");
						throw new NullPointerException("获取融资方对象为null");
					}
					
					userName = agency.getAgencyName();
					
				break;
			default:
				logger.warn( "传入的用户角色不匹配");
				throw new CodeException("0006","商户端角色类型不匹配");
		}
		
		
		String curretntTime = TimeUtil.getTimeMillisecondStamp();
		//安全随机数
		StringBuffer random = new StringBuffer();
		for (int i = 0; i < 6; i++) {
			random.append(String.valueOf(ThreadLocalRandom.current().nextInt(0, 9)));
		}
		
		String text0 = curretntTime+random;
		
		String text1 = userName;
		
		String text2 = userBeforeLoan.getSnNo();
		
		String fileMD5 = "";
		try {
			 fileMD5 = DigestUtils.md5Hex(SCFUdealService.class.getResourceAsStream(SIGNFILEURL));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ob.put("signatrue", text0+"|"+text1+"|"+text2+"|"+fileMD5);
		
		
		return ob;
	}

	public String rePlatformNameById(String platformId) throws Exception {
		System.out.println("platformId:"+platformId);
		if(StringUtils.isEmpty(platformId)){
			throw new Exception("平台编码有误");
		}
		PlatformInfoExample example = new PlatformInfoExample();
		example.createCriteria()
		.andPlatformIdEqualTo(platformId);
		
		List<PlatformInfo> platformInfoList =  platformInfoMapper.selectByExample(example);
		System.out.println("platformInfoList:"+platformInfoList.toString());
		if(platformInfoList==null || platformInfoList.size()==0){
			throw new Exception("平台编码有误");
		}
		
		PlatformInfo PlatformInfo  = platformInfoList.get(0);
		System.out.println("PlatformInfo:"+PlatformInfo);
		if(StringUtils.isEmpty(PlatformInfo)){
			throw new Exception("平台编码有误");
		}
		
		return PlatformInfo.getPlatformName();
	}
	
	public void insertLoginInfo(HttpServletRequest request) throws Exception{
		
		String merchantUserId = request.getParameter("MerchantUserId");
		String userRole = request.getParameter("UserRole");
		int ur = 0;
		try {
			ur = Integer.parseInt(userRole);
		} catch (NumberFormatException e) {
			throw new Exception("参数有误");
		}
		
		String organizationUserId = userLoanServiceUtil.judgeActiveStatus(merchantUserId, ur);
		
		SysLogin login = null;
		
		SysLoginExample example = new SysLoginExample();
		example.createCriteria()
		.andLoginAdminIdEqualTo(organizationUserId);
		
		//获取上次登录时间
		List<SysLogin> list = sysLoginMapper.selectByExample(example);
		if(list!=null && list.size()>1){
			throw new Exception("获取登录信息有误");
		}
		
		String nowTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS"));
		XSSConstantTool tool = new XSSConstantTool(request);
		
		int resultInt = 0;
		
		if(list==null || list.size()==0){
			login = new SysLogin();
			
			login.setLoginId("LOGIN" + "-" + UUID.randomUUID().toString());
			login.setLoginAdminId(organizationUserId);
			login.setLoginIp(tool.getUserRealIp());//设置本次登陆IP
			login.setLoginLastTime("");//设置上次登录时间
			login.setLoginTime(nowTime);//设置本次登陆时间
			resultInt = sysLoginMapper.insert(login);//新增登陆信息
		}else{
			login = list.get(0);
			login.setLoginIp(tool.getUserRealIp());//设置本次登陆IP
			login.setLoginLastTime(login.getLoginTime());//设置上次登录时间
			login.setLoginTime(nowTime);//设置本次登陆时间
			resultInt = sysLoginMapper.updateByPrimaryKeySelective(login);//更新数据库
		}
		
		if(resultInt!=1){//插入失败
			
		}
		
	}
	
	/*
	 * 获取登录人信息
	 * @param userRole
	 * @param merchantUserId
	 * @return
	 * @throws Exception
	 */
	public JSONObject loginInfo(HttpServletRequest request) throws Exception {
		String merchantUserId = request.getParameter("MerchantUserId");
		String userRole = request.getParameter("UserRole");
		int ur = 0;
		try {
			ur = Integer.parseInt(userRole);
		} catch (NumberFormatException e) {
			throw new Exception("参数有误");
		}
		
		//(1)检查关联表中是否存在当前有效用户
		
		String organizationUserId = userLoanServiceUtil.judgeActiveStatus(merchantUserId, ur);
		
		switch(ur){
			case 10:
				{
					CompanyAdmin companyadmin = userLoanServiceUtil.obtainSuperCompanyAdminInfo(organizationUserId);
					break;
				}
			case 20:{
					AgencyAdmin agencyAdmin = userLoanServiceUtil.obtainSuperAgencyAdminInfo(organizationUserId);
					break;
				}
			default:{
				throw new Exception("获取登录信息有误");
			}
		}
		
		SysLoginExample example = new SysLoginExample();
		example.createCriteria()
		.andLoginAdminIdEqualTo(organizationUserId);
		String lastTime = "第一次登录";
		//获取上次登录时间
		List<SysLogin> list = sysLoginMapper.selectByExample(example);
		if(list!=null && list.size()>1){
			throw new Exception("获取登录信息有误");
		}else if(list==null || list.size()==0){
			
		}else{
			String timeStr = list.get(0).getLoginTime();
			
			DateTimeFormatter formatter =  
					  new DateTimeFormatterBuilder()
			  .appendPattern("yyyyMMddHHmmss")
			  .appendValue(ChronoField.MILLI_OF_SECOND, 3)
			  .toFormatter();
			LocalDateTime local = LocalDateTime.parse(timeStr, formatter);
			lastTime = local.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		}
		
		
		JSONObject obj = new JSONObject();
		obj.put("lastTime", lastTime);
		
		//记录当前登录
		insertLoginInfo(request);
		
		return obj;
	}
}
