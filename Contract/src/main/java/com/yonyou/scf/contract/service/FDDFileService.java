package com.yonyou.scf.contract.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.scf.common.constant.ContractConstant;
import com.yonyou.scf.common.constant.CreditConst;
import com.yonyou.scf.common.constant.DefaultConst;
import com.yonyou.scf.common.constant.FddConst;
import com.yonyou.scf.common.constant.URLConst;
import com.yonyou.scf.common.constant.UserConst;
import com.yonyou.scf.common.entity.CompanyUserRelationship;
import com.yonyou.scf.common.entity.CompanyUserRelationshipExample;
import com.yonyou.scf.common.entity.ContractAttribute;
import com.yonyou.scf.common.entity.ContractAttributeExample;
import com.yonyou.scf.common.entity.ContractCredit;
import com.yonyou.scf.common.entity.ContractCreditExample;
import com.yonyou.scf.common.entity.ContractSigner;
import com.yonyou.scf.common.entity.ContractSignerExample;
import com.yonyou.scf.common.entity.ContractTemplate;
import com.yonyou.scf.common.entity.File;
import com.yonyou.scf.common.entity.UserInfo;
import com.yonyou.scf.common.entity.UserInfoExample;
import com.yonyou.scf.common.gateway.entity.FileRedisEntity;
import com.yonyou.scf.common.gateway.entity.TokenBean;
import com.yonyou.scf.common.input.CreditVO_6602021_I;
import com.yonyou.scf.common.input.Finance1005Request;
import com.yonyou.scf.common.input.Finance1025Request;
import com.yonyou.scf.common.input.Finance1026Request;
import com.yonyou.scf.common.input.WorkflowVO_6621005_I;
import com.yonyou.scf.common.input.fadada.Fdd1061Request;
import com.yonyou.scf.common.input.fadada.Fdd3021Request;
import com.yonyou.scf.common.mapper.auto.CompanyUserRelationshipMapper;
import com.yonyou.scf.common.mapper.auto.ContractAttributeMapper;
import com.yonyou.scf.common.mapper.auto.ContractCreditMapper;
import com.yonyou.scf.common.mapper.auto.ContractNoMapper;
import com.yonyou.scf.common.mapper.auto.ContractSignerMapper;
import com.yonyou.scf.common.mapper.auto.ContractTemplateMapper;
import com.yonyou.scf.common.mapper.auto.FileMapper;
import com.yonyou.scf.common.mapper.auto.UserInfoMapper;
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.common.output.fadada.Fdd1061Response;
import com.yonyou.scf.common.output.fadada.Fdd3021Response;
import com.yonyou.scf.common.util.CreateID;
import com.yonyou.scf.common.util.FDDUtil;
import com.yonyou.scf.common.util.StringUtil;
import com.yonyou.scf.common.util.Timer;
import com.yonyou.scf.common.util.TokenUtil;
import com.yonyou.scf.common.util.net.HttpClientUtil;
import com.yonyou.scf.contract.constant.Constant;
import com.yonyou.scf.contract.constant.IpFactory;
import com.yonyou.scf.contract.ftp.FTPfixPool;
import com.yonyou.scf.contract.mapper.ContractUtilMapper;
import com.yonyou.scf.contract.util.CommonUtil;
import com.yonyou.scf.contract.util.ConstractTools;
import com.yonyou.scf.contract.util.TPNContractToolService;
import com.yonyou.scf.contract.utilEntity.SerialNumValue;
import com.yonyou.scf.contract.utilEntity.SignFTPFileEntity;

import lombok.Cleanup;

@Service
public class FDDFileService{

	private Logger logger = LoggerFactory.getLogger(FDDFileService.class);
	
	@Value("${user.primary.ftp.account}")
	private String ftpAccount;
	@Autowired
	private RedisTemplate<Object,Object> redisTemplate;
	@Autowired
	private FTPfixPool fTPfixPool;
	
	@Autowired
	private FileMapper fileMapper;
	
	@Autowired
	private ContractSignerMapper contractSignerMapper;
	@Autowired
	private ContractCreditMapper contractCreditMapper;
	@Autowired
	private ContractTemplateMapper contractTemplateMapper;
	@Autowired
	private ContractAttributeMapper contractAttributeMapper;
	@Autowired
	private ContractNoMapper contractNoMapper;
	@Autowired
	private ContractUtilMapper contractUtilMapper;
	@Autowired
	private CompanyUserRelationshipMapper companyUserRelationshipMapper;
	@Autowired
	private UserInfoMapper userInfoMapper;
	@Autowired
	private TPNContractToolService tPNContractToolService;
	
private void downNewPDF(String serialNum,String redisKey, HttpServletResponse response) throws Exception {
		
		@Cleanup OutputStream os = response.getOutputStream();
		
		ContractSignerExample contractSignerExample = new ContractSignerExample();
		contractSignerExample.createCriteria().andSerialNumEqualTo(serialNum);
		
		List<ContractSigner> contractSignerList = contractSignerMapper.selectByExample(contractSignerExample);
		
		if(contractSignerList==null || contractSignerList.size()==0 || contractSignerList.size()>1) {
			return;
		}
		ContractSigner contractSigner = contractSignerList.get(0);
		
		String id = contractSigner.getFileId();
		
		com.yonyou.scf.common.entity.File file = fileMapper.selectByPrimaryKey(Long.valueOf(id));
		
		FileRedisEntity fre = ConstractTools.obtainsFileWithRedis(redisKey,ConstractTools.FILE_IDKEYS_STUFF, redisTemplate);
		
		response.setHeader("Content-Disposition", "attachment;fileName="+file.getName()+"."+file.getNameSubfix());
		if(fre!=null) {
			os.write(fre.getFile(), 0, fre.getFile().length);
			os.flush();
			return;
		}else {
			throw new Exception("redis中不存在文件，请重新打开页面");
		}
		
//		//取pdf文件
//		FTPClient fTPClient = fTPfixPool.borrowFTP();
//		InputStream is = ConstractTools.getFileFromFTP(fTPClient,file);
//		fTPfixPool.returnFTP(fTPClient);
//		
//		if(is==null) {
//			throw new Exception("文件不存在");
//		}
//		
//		//TODO 取要填值的key-value
//		Map<String,String> map = new HashMap<>();
//		
//		byte[] bytes = ConstractTools.stuffPDF(map, is);
//		
//		//刷新填值后的文件，方便上传到ftp和下载
//		fre = new FileRedisEntity();
//		fre.setFile(bytes);
//		fre.setFileId(ConstractTools.FILE_IDKEYS_STUFF+redisKey);
//		fre.setKeyPrefix("");
//		fre.setName(file.getName());
//		fre.setSubfix(file.getNameSubfix());
//		ConstractTools.flushFileRedis(fre, redisTemplate);
//		
//		os.write(bytes, 0, bytes.length);
//		os.flush();
	}
	/*
	 * 法大大-下载贷前合同
	 * @param serialNum
	 * @param response
	 */
	public void downNewPDFCredit(String id,String token, HttpServletResponse response) throws Exception {
		
		OutputStream os = response.getOutputStream();
		
		logger.info("贷前合同文件下载，参数id："+id);
		

		byte[] bytes = finalGetFileByte(id, token, false);
		
		ContractSigner contractSigner = contractSignerMapper.selectByPrimaryKey(Long.parseLong(id));
		
		
		com.yonyou.scf.common.entity.File file = fileMapper.selectByPrimaryKey(Long.parseLong(contractSigner.getFileId()));
		
		String finalName = new String((file.getName()+"."+file.getNameSubfix()).getBytes("UTF-8"), "ISO8859-1");
		System.out.println("下载文件名："+(file.getName()+"."+file.getNameSubfix()));
		response.setHeader("OriginalFilename", finalName);
		response.setHeader("Content-Disposition", "attachment;fileName="+finalName);
		os.write(bytes, 0, bytes.length);
		os.flush();
		os.close();
		logger.info("找到文件，正确返回");
		return;
		
	}
	/*
	 *  法大大-下载融资申请合同--签署过的
	 * @param serialNum
	 * @param response
	 */
	public void downNewPDFFinanceAS(JSONObject obj, HttpServletResponse response) throws Exception {
		logger.info("下载签署过的融资申请合同---法大大--开始");
		FTPClient ftpClient = fTPfixPool.borrowFTP();
		
		try {
			OutputStream os = response.getOutputStream();
			if(StringUtils.isEmpty(obj) || !obj.containsKey("serialNum")) {
				logger.info("参数不全");
				throw new Exception("参数不全");
			}
			
			String serialNum = String.valueOf(obj.get("serialNum"));
			logger.info("签署合同流水号serialNum："+serialNum);
			ContractSignerExample contractSignerExample = new ContractSignerExample();
			contractSignerExample.createCriteria().andSerialNumEqualTo(serialNum);
			
			List<ContractSigner> contractSignerList = contractSignerMapper.selectByExample(contractSignerExample);
			
			if(contractSignerList==null || contractSignerList.size()==0 || contractSignerList.size()>1) {
				logger.info("签署合同数据不正确");
				return;
			}
			ContractSigner contractSigner = contractSignerList.get(0);
			
			String redisKey =  getFinanceRedisKey(contractSigner);
			
			InputStream isFromFTP = ConstractTools.getFileFromFTP(ftpClient, redisKey,"pdf",ConstractTools.CONSTRACTPATH_IN_FTP);
			FileCopyUtils.copy(isFromFTP, os);
			logger.info("获取ftp文件结束");
			
			os.flush();
			os.close();
			return ;
		} finally {
			fTPfixPool.returnFTP(ftpClient);
		}
	}
	/*
	 *  法大大-下载融资申请合同--确认页面
	 * @param serialNum
	 * @param response
	 */
	public void downNewPDFFinance(JSONObject obj, HttpServletResponse response) throws Exception {
		
		if(StringUtils.isEmpty(obj) || !obj.containsKey("serialNum")) {
			throw new Exception("参数不全");
		}
		
		String serialNum = String.valueOf(obj.get("serialNum"));
		
		ContractSignerExample contractSignerExample = new ContractSignerExample();
		contractSignerExample.createCriteria().andSerialNumEqualTo(serialNum);
		
		List<ContractSigner> contractSignerList = contractSignerMapper.selectByExample(contractSignerExample);
		
		if(contractSignerList==null || contractSignerList.size()==0 || contractSignerList.size()>1) {
			return;
		}
		ContractSigner contractSigner = contractSignerList.get(0);
		downNewPDF(serialNum, getFinanceRedisKey(contractSigner),response);
		
	}
	
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public ResultBean creditConSign(JSONObject obj) throws Exception {
		logger.info("creditConSign方法 请求参数为："+obj);
		if(StringUtils.isEmpty(obj) || !obj.containsKey("token") || !obj.containsKey("id")) {
			return new ResultBean(Constant.CODE_1000, Constant.MSG_PARAM_NOTENOUGH_1000);
		}
		
		String token = CommonUtil.getFromJSONObject(obj, "token").toString();
		String id = CommonUtil.getFromJSONObject(obj, "id").toString();
		logger.info("获取token和id 分别为："+token+"....."+"id");
		ContractSigner contractSigner = contractSignerMapper.selectByPrimaryKey(Long.parseLong(id));
		logger.info("取签署数据结果为：contractSigner："+contractSigner+"。IsSigned："+contractSigner.getIsSigned());
		if(Constant.SIGN_YES_1 == contractSigner.getIsSigned()) {
			logger.info(Constant.MSG_1500);
			return new ResultBean(Constant.CODE_1500,Constant.MSG_1500);
		}
		
		logger.info("不浏览直接签署会产生问题，这里强插一段代码，签署的时候调用浏览逻辑的代码，日后优化，开始");
		byte[] viewResult = finalGetFileByte(StringUtil.toString(contractSigner.getId()), token, true);
		logger.info("不浏览直接签署会产生问题，这里强插一段代码，签署的时候调用浏览逻辑的代码，日后优化，结束，结果文件长度："+viewResult.length);
		
		String redisKey = getCreditRedisKeys(contractSigner);
		
		Fdd1061Request request1061 = new Fdd1061Request();
		request1061.setCallback_url(IpFactory.CALLBACK_FINANCE_URL);//回调接口
		
		TokenBean tokenBean = TokenUtil.getBean(token, redisTemplate);
		contractSigner.setSignUserId(Long.parseLong(tokenBean.getUserId()));
		int resultInt = contractSignerMapper.updateByPrimaryKeySelective(contractSigner);
		logger.info("流水号入库结果："+resultInt);
		
		ResultBean rb  = FDDSignCon(redisKey, "", contractSigner.getSerialNum(), token, request1061); 
		
		if(rb==null) {
			return new ResultBean(Constant.CODE_1000, Constant.MSG_1000);
		}
		
		return rb;
	}
	
	private String getCreditRedisKeys(ContractSigner contractSigner) {
		if(StringUtils.isEmpty(contractSigner)) {
			return "";
		}
		
		return contractSigner.getSignContractId();
	}
	
//	private String getSecondCreditRedisKeys(ContractSigner contractSigner) {
//		if(StringUtils.isEmpty(contractSigner)) {
//			return "";
//		}
//		String redisKey = contractSigner.getCreditId()+contractSigner.getFileId()+contractSigner.getPlaceholderNo();
//		return redisKey;
//	}
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public ResultBean financeConSign(JSONObject obj) throws Exception {
		
		if(StringUtils.isEmpty(obj) || !obj.containsKey("token") || !obj.containsKey("financeId") || !obj.containsKey("fileId")) {
			return new ResultBean(Constant.CODE_1000, Constant.MSG_PARAM_NOTENOUGH_1000);
		}
		
		String token = CommonUtil.getFromJSONObject(obj, "token").toString();
		String financeId = CommonUtil.getFromJSONObject(obj, "financeId").toString();
		String fileId = CommonUtil.getFromJSONObject(obj, "fileId").toString();
		
		//取token
		TokenBean tokenBean = TokenUtil.getBean(token, redisTemplate);
		
		com.yonyou.scf.common.entity.File file = fileMapper.selectByPrimaryKey(Long.parseLong(fileId));
		
		ContractSigner contractSigner = getUniqueConIsSign(financeId, tokenBean, file);
		
		if(contractSigner!=null) {
			logger.info(Constant.MSG_1500);
			return new ResultBean(Constant.CODE_1500,Constant.MSG_1500);
		}

		
		contractSigner = getUniqueConSign(financeId, tokenBean, file);
		
		String redisKey = getFinanceRedisKey(contractSigner);
		
		String secondRedisKeys = getFinanceSencRedisKey(contractSigner);
		
		Fdd1061Request request1061 = new Fdd1061Request();
		request1061.setCallback_url(IpFactory.CALLBACK_FINANCE_URL);//回调接口
		
		String serialNum = contractSigner.getSerialNum();
		logger.info("生成随机流水号："+serialNum);
		contractSigner.setSerialNum(serialNum);
		contractSigner.setSignUserId(Long.parseLong(tokenBean.getUserId()));
		
		int resultInt = contractSignerMapper.updateByPrimaryKeySelective(contractSigner);
		logger.info("流水号入库结果："+resultInt);
		ResultBean rb  = FDDSignCon(redisKey,secondRedisKeys, serialNum, token, request1061); 
		
		if(rb==null) {
			return new ResultBean(Constant.CODE_1000, Constant.MSG_1000);
		}
		
		return rb;
	}
	
	private String getFinanceRedisKey(ContractSigner contractSigner) {
		if(StringUtils.isEmpty(contractSigner)) {
			return "";
		}
		return contractSigner.getApplicationId()+contractSigner.getFileId();
	}
	
	private String getFinanceSencRedisKey(ContractSigner contractSigner) {
		if(StringUtils.isEmpty(contractSigner)) {
			return "";
		}
		return contractSigner.getApplicationId()+contractSigner.getFileId();
	}
	/**
	 * @param redisKey
	 * @param secondRedisKeys  当此值为空的时候，是TPN 构造签署操作  控制填写pdf的值
	 * @param serialNum
	 * @param token
	 * @param request1061
	 * @return
	 * @throws Exception
	 */
	@Transactional(propagation=Propagation.MANDATORY,rollbackFor=Exception.class)
	private ResultBean FDDSignCon(String redisKey, String secondRedisKeys, 
							String serialNum, String token, Fdd1061Request request1061) throws Exception {

		/*
		 * 构造参数--s
		 */
		TokenBean tokenBean = TokenUtil.getBean(token, redisTemplate);
		
		ContractSignerExample contractSignerExample = new ContractSignerExample();
		contractSignerExample.createCriteria().andSerialNumEqualTo(serialNum);
		
		List<ContractSigner> contractSignerList = contractSignerMapper.selectByExample(contractSignerExample);
		
		if(contractSignerList==null || contractSignerList.size()==0 || contractSignerList.size()>1) {
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
		ContractSigner contractSigner = contractSignerList.get(0);
		
		String id = contractSigner.getFileId();
		
		com.yonyou.scf.common.entity.File file = fileMapper.selectByPrimaryKey(Long.valueOf(id));
		
		if(file==null) {
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
		
		FileRedisEntity fre = null;
		
		SignFTPFileEntity sfe = new SignFTPFileEntity();
		sfe = new SignFTPFileEntity();
		sfe.setFileId(redisKey);
		sfe.setKeyPrefix("");
		sfe.setName(file.getName());
		sfe.setSubfix(file.getNameSubfix());
		/*
		 * 构造参数--e
		 */
		
		//取pdf文件
		FTPClient fTPClient = fTPfixPool.borrowFTP();
		try {
			String newName = new String((redisKey+".pdf").getBytes("UTF-8"), "ISO8859-1");
			
			fTPClient.changeWorkingDirectory(ConstractTools.CONSTRACTPATH_IN_FTP);
			
			FTPFile[] files = fTPClient.listFiles(newName);
//			logger.info("File Name:"+str);
			if (null != files) {
				logger.info("FTP Files has "+files.length+" items.");	
			} else {
				logger.info("FTP Files Is Empty!");
			}
			
			logger.info("ftpClient.list():"+fTPClient.list());
//			logger.info("ftpClient.list(str):"+fTPClient.list(str));
			logger.info("ftpClient.listNames():"+fTPClient.listNames());
//			logger.info("ftpClient.listNames(str):"+fTPClient.listNames(str));
			
//			FTPFile[] listFilesName = fTPClient.listFiles(str);
//			if (null != listFilesName) {
//				logger.info("ftpClient.listFiles(str) has "+listFilesName.length+" items.");	
//			} else {
//				logger.info("ftpClient.listFiles(str) Is Empty!");
//			}
			
			ContractCredit contractCredit = getUniqueConCredit(StringUtil.toString(contractSigner.getCreditId()), tokenBean, file);
			//取合同关键字
			String mainWord = mainWord(contractCredit.getTctId(), tokenBean);
			
			//1.如果ftp已经存在待签署文件则直接构造请求bean
			if(files.length>0){
				String resultUrl = postSignFDD(mainWord, serialNum, redisKey, sfe, tokenBean, request1061);
				
				return new ResultBean(Constant.CODE_2000,Constant.MSG_2000,resultUrl);
			}
			
			//2.ftp中不存在，去redis中取填好值的文件放入ftp
			
			fre = ConstractTools.obtainsFileWithRedis(redisKey,ConstractTools.FILE_IDKEYS_STUFF, redisTemplate);
			
			
			if(fre!=null) {
				boolean bool = fTPClient.storeFile(newName, new ByteArrayInputStream(fre.getFile()));
				
				if(!bool){
					return null;
				}
				
				String resultUrl = postSignFDD(mainWord, serialNum, redisKey, sfe, tokenBean, request1061);
				
				return new ResultBean(Constant.CODE_2000,Constant.MSG_2000,resultUrl);
			}
			
			//3.如果redis中没有，直接拿源文件填空然后 存ftp签署
			return signWithParentFile(redisKey,secondRedisKeys, serialNum, token, request1061, contractSigner, file, sfe, fTPClient);
		} finally {
			fTPfixPool.returnFTP(fTPClient);
		}
	}
	
	@Transactional(propagation=Propagation.MANDATORY,rollbackFor=Exception.class)
	private ResultBean signWithParentFile(String redisKey,String secondRedisKeys, String serialNum, String token, Fdd1061Request request1061,
			ContractSigner contractSigner, com.yonyou.scf.common.entity.File file, SignFTPFileEntity sfe, FTPClient fTPClient)
			throws Exception {
		logger.info("没有浏览过合同直接签署--开始");
		TokenBean tokenBean = TokenUtil.getBean(token, redisTemplate);
		
		ContractCredit contractCredit = getUniqueConCredit(StringUtil.toString(contractSigner.getCreditId()), tokenBean, file);
		
		ContractTemplate contractTemplate = contractTemplateMapper.selectByPrimaryKey(contractSigner.getTctId());
		
		if(contractTemplate==null) {
			logger.warn("数据查询有误。contractTemplate："+contractTemplate);
			throw new Exception("数据查询有误。contractTemplate："+contractTemplate);
		}
		
		FileRedisEntity fre;
		InputStream is = ConstractTools.getFileFromFTP(fTPClient,file);
		logger.info("获取模版源文件，结果为："+is);
		if(is==null) {
			throw new Exception("文件不存在");
		}
		Map<String, String> map = getStuffMap(token, contractSigner, contractTemplate, secondRedisKeys);
		logger.info("区别是授信还是融资申请的字段secondRedisKeys值为："+secondRedisKeys);
		//授信
		if(StringUtils.isEmpty(secondRedisKeys)) {
			stauffAllValuesForCon(tokenBean, contractCredit, contractTemplate, map, String.valueOf(contractSigner.getCreditId()));
		}else {//融资申请
			stauffAllValuesForCon(tokenBean, contractCredit, contractTemplate, map, String.valueOf(contractSigner.getApplicationId()));
		}
		
		byte[] bytes = ConstractTools.stuffPDF(map, is);
		
		//刷新填值后的文件，方便上传到ftp和下载
		fre = new FileRedisEntity();
		fre.setFile(bytes);
		fre.setFileId(ConstractTools.FILE_IDKEYS_STUFF+redisKey);
		fre.setKeyPrefix("");
		fre.setName(file.getName());
		fre.setSubfix(file.getNameSubfix());
		ConstractTools.flushFileRedis(fre, redisTemplate);
		

		String newName = new String((redisKey+".pdf").getBytes("UTF-8"), "ISO8859-1");
		
			boolean bool = fTPClient.storeFile(newName, new ByteArrayInputStream(fre.getFile()));
			
			if(!bool){
				return null;
			}
		
			//取合同关键字
		String mainWord = mainWord(contractCredit.getTctId(),tokenBean);
		String resultUrl = postSignFDD(mainWord, serialNum,redisKey, sfe, tokenBean, request1061);
		
		//融资申请
		if(!StringUtils.isEmpty(secondRedisKeys)) {
			//操作当前签署记录
			logger.info("插入当前签署记录开始");
			insertContractSign(contractCredit, contractTemplate,contractSigner.getApplicationId().toString(),redisKey,contractSigner.getCreditId().toString(), file, serialNum,tokenBean);
			logger.info("插入当前签署记录结束");
		}
		logger.info("没有浏览过合同直接签署--正确结束");
		return new ResultBean(Constant.CODE_2000,Constant.MSG_2000,resultUrl);
	}
	/*
	 * 如果是借据合同，需要整理贷前合同编号，比如担保合同 需要将多个编号以逗号分割
	 * @param tokenBean
	 * @param contractCredit
	 * @param contractTemplate
	 * @param map
	 * @param applicationId
	 * @throws Exception
	 */
	private void stauffAllValuesForCon(TokenBean tokenBean, ContractCredit contractCredit,
			ContractTemplate contractTemplate, Map<String, String> map, String applicationId) throws Exception {
		
		//如果是借据合同，需要整理贷前合同编号，比如担保合同 需要将多个编号以逗号分割
		if(ContractConstant.CONTRACT_TPN_JJ_TYPE.equals(contractTemplate.getContractType())
				|| ContractConstant.CONTRACT_TPN_JK_TYPE.equals(contractTemplate.getContractType())) {
			//取所有贷前合同编号
			Map<String,String> creConsNo = getCreditConsFromDB(contractCredit);
			
			map.putAll(creConsNo);
		}
		
		ConstractTools.createConMap(applicationId,map, tokenBean, contractTemplate, redisTemplate, contractAttributeMapper,contractNoMapper,tPNContractToolService);
	}
	private Map<String, String> getStuffMap(String token, ContractSigner contractSigner,
			ContractTemplate contractTemplate, String secondRedisKeys) throws Exception {
		
		TokenBean tokenBean = TokenUtil.getBean(token, redisTemplate);
		
		Map<String,String> map = null;
		//贷前准备获取填写表单值
		if(StringUtil.isEmpty(secondRedisKeys)) {
			map = ConstractTools.getStuffMapWithClass(contractSigner, tokenBean, contractTemplate, contractSignerMapper);//请求其他模块，获取合同域值
			if(!StringUtils.isEmpty(contractSigner.getSignContractNo())) {
				String contractTypeName = ContractConstant.exchangeType(contractTemplate);
				map.put(contractTypeName, contractSigner.getSignContractNo());
			}
		}else {//融资申请
			Finance1026Request finance1026Request = new Finance1026Request();
			finance1026Request.setContractType(contractTemplate.getContractType());
			finance1026Request.setFinanceId(contractSigner.getApplicationId());
			finance1026Request.setToken(token);
			
			logger.info("请求合同填写值的参数："+finance1026Request.toString());
			String result = HttpClientUtil.post(URLConst.URL_FINANCING+"/1026", finance1026Request);
			logger.info("接到的返回值："+result);
			ResultBean rb = JSON.parseObject(result, ResultBean.class);
			logger.info("接到的返回值："+rb.toString());
			if(!DefaultConst.SUCCESS_RESPONSE_CODE.equals(rb.getCode()) ) {
				throw new IOException("请求失败");
			}
			map = JSON.parseObject(rb.getDataList().get(0), HashMap.class);
		}
		
		return map;
	}
	
	
	private String legalName(TokenBean tokenBean) throws Exception {
		
		Long orgId = Long.parseLong(tokenBean.getOrganizeId());
		String userType = tokenBean.getUserType();
		
		if(UserConst.user_style_company.equals(userType)) {
			// 检索法人信息
			CompanyUserRelationshipExample curse = new CompanyUserRelationshipExample();
			curse.createCriteria().andCompanyIdEqualTo(orgId).andUserTypeEqualTo(UserConst.user_info_user_style_representative)
			.andEnableStatusEqualTo(UserConst.company_user_relationship_enable_status_yes);
			
			List<CompanyUserRelationship> representativeList = companyUserRelationshipMapper
					.selectByExample(curse);
			
			Long tempId = -1L;
			if (representativeList.size() == 1) {
				tempId = representativeList.get(0).getUserId();
			}else {
				throw new Exception("法人信息有误");
			}
			
			// 法定代表人(法人，启用)
			UserInfoExample uie = new UserInfoExample();
			uie.createCriteria().andUserIdEqualTo(tempId).andEnableStatusEqualTo(UserConst.user_info_enable_status_yes)
			.andUserStyleEqualTo(UserConst.user_info_user_style_representative);
			List<UserInfo> ui1 = userInfoMapper.selectByExample(uie);
			
			if(ui1!=null && ui1.size()==1) {
				return ui1.get(0).getUserName();
			}else {
				throw new Exception("法人信息有误");
			}
		}else if(UserConst.user_style_person.equals(userType)) {
			UserInfo userInfo = userInfoMapper.selectByPrimaryKey(orgId);
			
			if(userInfo!=null) {
				return userInfo.getUserName();
			}
			throw new Exception("法人信息有误");
		}else {
			throw new Exception("法人信息有误");
		}
		   
	}
	
	/*
	 * 法大大签署合同  返回页面url
	 * @param serialNum
	 * @param fre
	 * @param tokenBean
	 * @return
	 * @throws IOException
	 */
	@Transactional(propagation=Propagation.MANDATORY,rollbackFor=Exception.class)
	private String postSignFDD(String mainWord, String serialNum, String redisKey, SignFTPFileEntity fre,
				TokenBean tokenBean,Fdd1061Request request1061) throws Exception {
		
		logger.info("进入调用法大大签署准备方法postSignFDD()");
		//当前登录所属方 类型
		int userType = UserConst.user_style_company.equals(tokenBean.getUserType())?1:0;
		
		//用法大大签署
		
		request1061.setClient_role(FDDUtil.transferStatus(tokenBean.getOrganizeRoleNo()));
		request1061.setContract_id(redisKey);
		request1061.setCustomer_id(tokenBean.getOrganizeId());
		request1061.setCustomer_type(String.valueOf(userType));
		request1061.setDoc_title(fre.getName());
		request1061.setEmail(tokenBean.getConcaterMail());
		request1061.setFile_pathname(ConstractTools.FTP_CON_ABSOLUTE_PATH_PREFIX+"/"+ftpAccount+"/"+ConstractTools.FTP_CON_ABSOLUTE_PATH_SUBFIX+"/"+redisKey+"."+fre.getSubfix());
		request1061.setIs_automated(String.valueOf(FddConst.Fdd_file_sign_Is_automated_Handmade));
		request1061.setMobile(tokenBean.getConcaterPhone());
		request1061.setReturn_url(Constant.FDD_RETURN_URL);
		request1061.setSign_keyword(mainWord);
		request1061.setTransaction_id(serialNum);
		
		logger.info("组装后的请求参数："+request1061.toString());
		//String result = HttpClientUtil.post(IpFactory.FAA_SIGN, request1061);
		String result = HttpClientUtil.post(URLConst.URL_FADADA+"/extsign", request1061);
		logger.info("接到的返回值："+result);
		ResultBean rb = JSON.parseObject(result, ResultBean.class);
		logger.info("接到的返回值："+rb.toString());
		if(!DefaultConst.SUCCESS_RESPONSE_CODE.equals(rb.getCode()) ) {
			throw new IOException(rb.getMessage());
		}
		
		//签署通信成功后 将签署流水号和token 一起存入redis，简洁后续代码
		SerialNumValue snv = new SerialNumValue();
		String currentTime = Timer.getDateTimeNow(Timer.Role2);
		snv.setToken(tokenBean);
		snv.setTime(currentTime);
		redisTemplate.opsForValue().set(serialNum, JSON.toJSONString(snv));
//		redisTemplate.expire(serialNum, UserFaceConstant.TIMEOUT, UserFaceConstant.TIMEOUT_UNIT);
		
		String splitResult = rb.getDataList().get(0);
		
		Fdd1061Response fdd1061Response = JSON.parseObject(splitResult, Fdd1061Response.class);
		logger.info("返回的url:"+fdd1061Response.getUrl());
		logger.info("调用法大大签署准备方法postSignFDD()正常结束");
		return fdd1061Response.getUrl();
	}
	
	@Transactional(propagation=Propagation.MANDATORY,rollbackFor=Exception.class)
	private void insertContractSign(ContractCredit  contractCredit,ContractTemplate contractTemplate, String applicationId,
					String redisKey, String creditId, com.yonyou.scf.common.entity.File file, String serialNum,
			TokenBean tokenBean) throws Exception{
		
		String currentTime = Timer.getDateTimeNow(Timer.Role2);
		
		String contractNoKey = ConstractTools.CON_NO_IDKEYS+applicationId;
		
		String contractNoString = String.valueOf(redisTemplate.opsForHash().get(contractNoKey, ContractConstant.exchangeType(contractTemplate)));//getContractNoFromRedis(contractNoKey, contractTpye);//取合同编号
		
		ContractSignerExample contractSignerExample = new ContractSignerExample();
		contractSignerExample.createCriteria().andApplicationIdEqualTo(Long.parseLong(applicationId)).andFileIdEqualTo(String.valueOf(file.getId()))
		.andSignerNoEqualTo(tokenBean.getOrganizeRoleNo());
		
		List<ContractSigner> contractSignerList = contractSignerMapper.selectByExample(contractSignerExample);
		
		if(contractSignerList==null || contractSignerList.size()<1) {
			ContractSigner contractSigner = new ContractSigner();
			contractSigner.setApplicationId(Long.parseLong(applicationId));
			contractSigner.setCreditId(Long.parseLong(creditId));
			contractSigner.setFileId(String.valueOf(file.getId()));
			contractSigner.setGmtCreate(currentTime);
			contractSigner.setGmtModified(currentTime);
			contractSigner.setId(CreateID.createId());
			contractSigner.setOrderNo(contractCredit.getOrderNo());
			contractSigner.setPlaceholderNo(Constant.SIGN_TIME_20);
			contractSigner.setSerialNum(serialNum);
			contractSigner.setSignContractId(redisKey);
			contractSigner.setSignContractNo(contractNoString);
			contractSigner.setSignerId(Long.parseLong(tokenBean.getOrganizeId()));
			contractSigner.setSignerNo(tokenBean.getOrganizeRoleNo());
			contractSigner.setTctId(contractCredit.getTctId());
			contractSigner.setIsSigned(Constant.SIGN_NOT_0);
			contractSigner.setSignUserId(Long.parseLong(tokenBean.getUserId()));
			contractSigner.setCreUserId(Long.parseLong(tokenBean.getUserId()));
			contractSigner.setModUserId(Long.parseLong(tokenBean.getUserId()));
			
			int resultInt = contractSignerMapper.insert(contractSigner);
			logger.info("确认页面插入签署记录操作记录条数："+resultInt);
		}else {
			ContractSigner contractSigner = contractSignerList.get(0);
			contractSigner.setSignUserId(Long.parseLong(tokenBean.getUserId()));
			contractSigner.setCreUserId(Long.parseLong(tokenBean.getUserId()));
			contractSigner.setOrderNo(contractCredit.getOrderNo());
			contractSigner.setSerialNum(serialNum);
			contractSigner.setSignContractId(redisKey);
			contractSigner.setGmtModified(currentTime);
			contractSigner.setModUserId(Long.parseLong(tokenBean.getUserId()));
			int resultInt = contractSignerMapper.updateByPrimaryKey(contractSigner);
			logger.info("确认页面更新签署记录操作记录条数："+resultInt);
		}
		
		
	}
	
	/*
	 * 签署后回调接口
	 * 1.取文件
	 * 2.更新签署表
	 * 3.更新redis
	 * @param serialNum
	 * @return
	 */
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public ResultBean FDDCallBackFinance(String serialNum, String signTime) throws Exception {
		
		if(StringUtils.isEmpty(serialNum)) 
			throw new Exception("签署流水号不存在");
		
		
		ContractSignerExample contractSignerExample = new ContractSignerExample();
		contractSignerExample.createCriteria().andSerialNumEqualTo(serialNum);
		
		List<ContractSigner> contractSignerList = contractSignerMapper.selectByExample(contractSignerExample);
		
		if(contractSignerList==null || contractSignerList.size()==0) {
			return new ResultBean(Constant.CODE_1000, "融资申请单数据暂没入库。回调接口正常");
		}
		ContractSigner contractSigner = contractSignerList.get(0);
		
		com.yonyou.scf.common.entity.File file = fileMapper.selectByPrimaryKey(Long.parseLong(contractSigner.getFileId()));
		
		if(file==null) {
			return new ResultBean(Constant.CODE_1000, "file表查询失败，没有数据。回调接口正常");
		}
		
		String redisKey = getSignRedisKey(contractSigner);
		
		//更新签署表字段值
		saveSignInfo(contractSigner, signTime);
		
		//更新redis中
		
		FTPClient ftpClient =  null;
		try {
			ftpClient =  fTPfixPool.borrowFTP();
			logger.info("签署成功，fdd会将签署后的文件覆盖在ftp上的原文件，所以直接去ftp中取文件，更新至redis。");
			logger.info("更新redis开始");
			logger.info("开始去ftp中取文件");
			@Cleanup InputStream is  = ConstractTools.getFileFromFTP(ftpClient, redisKey,"pdf",ConstractTools.CONSTRACTPATH_IN_FTP);//从ftp中取文件
			logger.info("从ftp取文件的结果 is:"+is);
			@Cleanup ByteArrayOutputStream baos = new ByteArrayOutputStream();
			int fileSize = FileCopyUtils.copy(is, baos);//内部已经装饰成buffer  带内存缓冲的流， 初始大小为1024*4
			logger.info("文件的大小为:"+fileSize);
			
			byte[] bytes = baos.toByteArray();
			
			logger.info("开始将文件刷新至redis");
			FileRedisEntity fre = new FileRedisEntity();
			fre.setFile(bytes);
			fre.setFileId(ConstractTools.FILE_IDKEYS_STUFF+redisKey);
			fre.setKeyPrefix("");
			fre.setName(file.getName());
			fre.setSubfix(file.getNameSubfix());
			ConstractTools.flushFileRedis(fre, redisTemplate);
			logger.info("将文件刷新至redis结束");
			
			logger.info("将签署后的文件生成图片并放入redis开始");
			ConstractTools.pdfToOutputStream(new ByteArrayInputStream(bytes, 0, bytes.length), null, redisTemplate, redisKey, ConstractTools.IMG_IDKEYS_STUFF);
			logger.info("将签署后的文件生成图片并放入redis结束");
			
		} finally {
			if(ftpClient!=null) {
				fTPfixPool.returnFTP(ftpClient);
			}
		}
		
		return new ResultBean(Constant.CODE_2000, Constant.MSG_2000);
	}
	
	private String getSignRedisKey(ContractSigner contractSigner) {
		
		if(Constant.SIGN_TIME_20.equals(contractSigner.getPlaceholderNo())) {
			return contractSigner.getApplicationId()+contractSigner.getFileId();
		}
		
		return contractSigner.getSignContractId();
	}
	@Transactional(propagation=Propagation.MANDATORY,rollbackFor=Exception.class)
	private void saveSignInfo(ContractSigner contractSigner, String signTime)//TokenBean tokenBean, , String redisKey
			throws UnsupportedEncodingException, Exception, IOException {
		
		//入库
		contractSigner.setSignTime(signTime);
		contractSigner.setIsSigned(Constant.SIGN_YES_1);//已签署
		contractSigner.setGmtModified(signTime);
		
		int resultInt = contractSignerMapper.updateByPrimaryKey(contractSigner);
		
		if(resultInt<1) {
			throw new Exception("保存签署记录失败");
		}
		logger.info("更新主键ID为："+contractSigner.getId()+"成功");
//		contractSigner.setSignUserId(Long.parseLong(tokenBean.getUserId()));//签署人
//		contractSigner.setModUserId(Long.parseLong(tokenBean.getUserId()));
//		String str = new String((redisKey+".pdf").getBytes("UTF-8"),"ISO8859-1");
//		
//		FTPClient fTPClient = fTPfixPool.borrowFTP();
//		
//		fTPClient.changeWorkingDirectory(ConstractTools.CONSTRACTPATH_IN_FTP);
//		FTPFile[] files = fTPClient.listFiles();
//		long fileCount = Stream.of(files).filter(x->x.getName().equals(str)).count();
//		
//		if(fileCount<1) {
//			throw new IOException("ftp系统中找不到指定文件");
//		}
//		
//		InputStream is = fTPClient.retrieveFileStream(str);
//		
//		ByteArrayOutputStream bos = new ByteArrayOutputStream();
//		
//		FileCopyUtils.copy(is, bos);
//		
//		//获取签署前的文件信息
//		FileRedisEntity fre = ConstractTools.obtainsFileWithRedis(redisKey,ConstractTools.FILE_IDKEYS_STUFF, redisTemplate);
//		//覆盖数据
//		fre.setFile(bos.toByteArray());
//		ConstractTools.flushFileRedis(fre, redisTemplate);
	}
	
	/*
	 * 法大大 授信-贷前合同-浏览
	 * @param serialNum
	 * @param response
	 * @throws Exception
	 */
	public void viewNewPDFCredit(String id,String token, HttpServletResponse response) throws Exception {
		

		OutputStream os = response.getOutputStream();
		
		logger.info("贷前合同文件查看，id："+id);
		
		
		byte[] bytes = finalGetFileByte(id, token, true);
		
		logger.info("找到文件，正确返回");
		os.write(bytes, 0, bytes.length);
		os.flush();
		os.close();
		return;
		
	}
	
	/*
	 * 用于获取文件资源  里面已经包装了很多方法
	 * @param id ContractSigner表的主键id
	 * @param token
	 * @param getImg 是否需要取文件的图片byte  浏览的时候才会需要：true
	 * @return
	 * @throws Exception
	 */
	public byte[] finalGetFileByte(String id,String token, boolean getImg) throws Exception{
		
		logger.info("通用方法，目前只适用于太平鸟，请求参数为id:"+id+".token:"+token+".getImg:"+getImg);
		ContractSigner contractSigner = contractSignerMapper.selectByPrimaryKey(Long.parseLong(id));
		
		logger.info("获取到ContractSigner的值为："+contractSigner);
		String redisKey = getSignRedisKey(contractSigner);//GETIgetFinanceRedisKey(contractSigner);
		logger.info("组成rediskey的值为："+redisKey);
		FTPClient ftpClient = fTPfixPool.borrowFTP();
		try {
			byte[] bytes = ConstractTools.getFullFormValue(redisKey, redisTemplate, ftpClient, getImg);
			logger.info("获取已经填好值的文件结果为bytes是否为null："+StringUtils.isEmpty(bytes));
			
			if(bytes!=null) {
				logger.info("成功返回文件byte");
				return bytes;
			}
			
			ContractTemplate contractTemplate = contractTemplateMapper.selectByPrimaryKey(contractSigner.getTctId());
			
			com.yonyou.scf.common.entity.File file = fileMapper.selectByPrimaryKey(Long.parseLong(contractSigner.getFileId()));
			
			bytes = returnStuffOrNotCon(redisKey, contractSigner, contractTemplate, file, token, "");
			
			logger.info("获取刚填好值的文件结果为：bytes："+bytes.length);
			if(bytes!=null) {
				logger.info("成功返回文件byte");
				return bytes;
			}else {
				logger.warn("找不到文件");
				throw new Exception("找不到文件");
			}
		}finally {
				fTPfixPool.returnFTP(ftpClient);
			}
	}
	
	public byte[] returnStuffOrNotCon(String redisKey, ContractSigner contractSigner,
				ContractTemplate contractTemplate, com.yonyou.scf.common.entity.File file,
				String token, String secondRedisKeys) throws Exception {
		
		FTPClient ftPClient = fTPfixPool.borrowFTP();
		FTPClient ftpClient = fTPfixPool.borrowFTP();
		FTPClient fTPClient = fTPfixPool.borrowFTP();
		
		TokenBean tokenBean = TokenUtil.getBean(token, redisTemplate);
		
		String creditId = StringUtil.toString(contractSigner.getCreditId());
		
		ContractCredit contractCredit = getUniqueConCredit(StringUtil.toString(contractSigner.getCreditId()), tokenBean, file);
		
		try {
			
			logger.info("去ftp直接命中填写好的文件失败...进入下一判断");
			
			//3.如果不存在  直接取"原模"版直接生成
			@Cleanup InputStream is = ConstractTools.getFile(ftPClient, file.getFileId(), "pdf", redisTemplate);
			
			Map<String, String> map = getStuffMap(token, contractSigner, contractTemplate, secondRedisKeys);
			
			stauffAllValuesForCon(tokenBean, contractCredit, contractTemplate, map, creditId);
			
			byte[] bytes = ConstractTools.stuffPDF(map, is);
			
			//刷新填值后的文件，方便上传到ftp和下载
			FileRedisEntity fre = new FileRedisEntity();
			fre.setFile(bytes);
			fre.setFileId(ConstractTools.FILE_IDKEYS_STUFF+redisKey);
			fre.setKeyPrefix("");
			fre.setName(file.getName());
			fre.setSubfix(file.getNameSubfix());
			ConstractTools.flushFileRedis(fre, redisTemplate);
			
			//生成图片 并刷新
			byte[] bts = ConstractTools.pdfToOutputStream(new ByteArrayInputStream(bytes, 0, bytes.length), null, redisTemplate, redisKey, ConstractTools.IMG_IDKEYS_STUFF);
			
			if(bts==null) {
				throw new Exception("合成失败");
			}
			logger.info("去ftp中原模版文件，填写表单域，生成图片成功。");
			logger.info("合成文件大小:"+bts.length);
			return bts;
			
		} finally {
			if(ftPClient!=null) {
				fTPfixPool.returnFTP(ftPClient);
			}
			if(ftpClient!=null) {
				fTPfixPool.returnFTP(ftpClient);
			}
			if(fTPClient!=null) {
				fTPfixPool.returnFTP(fTPClient);
			}
			
		}
	} 
	
	/*
	 * 法大大 融资申请合同-浏览
	 * @param serialNum
	 * @param response
	 * @throws Exception
	 */
	public ResultBean viewNewPDFFinance(String serialNum) throws Exception {
		
		logger.info("浏览签署后的融资申请文件--viewNewPDFFinance()方法开始");
		logger.info("合同签署流水号，serialNum："+serialNum);
		Fdd3021Request request3021 = new Fdd3021Request();
		request3021.setContract_id(serialNum);
		
		logger.info("请求bean："+request3021.toString());
		String result = HttpClientUtil.post(URLConst.URL_FADADA+"/viewContract", request3021);
		logger.info("接到的返回值："+result);
		ResultBean rb = JSON.parseObject(result, ResultBean.class);
		logger.info("接到的返回值："+rb.toString());
		
		if(!DefaultConst.SUCCESS_RESPONSE_CODE.equals(rb.getCode()) ) {
			throw new IOException("请求失败");
		}
		
		String splitResult = rb.getDataList().get(0);
		
		Fdd3021Response fdd3021Response = JSON.parseObject(splitResult, Fdd3021Response.class);
		
		String url = fdd3021Response.getView_url();
		logger.info("返回的url:"+url);
		
		
		logger.info("成功返回浏览法大大地址--viewNewPDFFinance()方法结束");
		return new ResultBean(Constant.CODE_2000,Constant.MSG_2000,url);
	}

	/*
	 * 由于法大大要求有实体文件签署 所以衍生出以下方案
	 * 1.通过签署流水号查询‘合同文件id’（file_id） 签署流水号是contract_signer表唯一
	 * 2.获取到的合同文件id，也许会在授信合同配置时，配置给了多方。以此获取完合同文件id后，去redis中去取填值后的图片，
	 * 如果可以取到，直接进入下一步，如果没有取到，则取文件模版进行填值，
	 * 将填值后的文件返回，并且以 'xxxx'+合同文件id为key放入（不能用之前缓存文件的方式key）
	 * redis进行图片缓存，保证下次相同的文件id不用再次生成而浪费系统资源和时间。
	 * 3.
	 * @param serialNum
	 * @param response
	 */
//	private void viewNewPDF(String serialNum,String redisKey) throws Exception {
//		if(StringUtils.isEmpty(serialNum)) {
//			return ;//JSON.toJSONString(new ResponseBean(Constant.CODE_1000,Constant.MSG_1000));
//		}
//		
////		@Cleanup OutputStream os = response.getOutputStream();
////		
////		com.yonyou.scf.common.entity.File file = getFilebySerialNum(serialNum);
////		
////		if(file==null) {
////			return;
////		}
//		
//		
//		FileRedisEntity fre = ConstractTools.obtainsFileWithRedis(redisKey,ConstractTools.IMG_IDKEYS_STUFF, redisTemplate);
//		
//		if(fre!=null) {
//			os.write(fre.getFile(), 0, fre.getFile().length);
//			return;
//		}
//		
//		//图片没有命中  命中填值后的文件
//		fre = ConstractTools.obtainsFileWithRedis(redisKey,ConstractTools.FILE_IDKEYS_STUFF, redisTemplate);
//		
//		if(fre!=null) {
//			ByteArrayInputStream bis = new ByteArrayInputStream(fre.getFile());
//			//生成图片   
//			byte[] imgByte = ConstractTools.pdfToOutputStream(bis, null, redisTemplate, ConstractTools.IMG_IDKEYS_STUFF+redisKey, "");//ConstractTools.IMG_IDKEYS_STUFF
//			os.write(imgByte, 0, imgByte.length);
//			return;
//		}
//		
//		//取pdf文件
//		FTPClient fTPClient = fTPfixPool.borrowFTP();
//		try {
//			InputStream is = ConstractTools.getFileFromFTP(fTPClient,file);
//			
//			if(is==null) {
//				throw new Exception("文件不存在");
//			}
//			
//			Map<String,String> map = new HashMap<>();
//			
//			byte[] bytes = ConstractTools.stuffPDF(map, is);
//			
//			//刷新填值后的文件，方便上传到ftp和下载
//			fre = new FileRedisEntity();
//			fre.setFile(bytes);
//			fre.setFileId(ConstractTools.FILE_IDKEYS_STUFF+redisKey);
//			fre.setKeyPrefix("");
//			fre.setName(file.getName());
//			fre.setSubfix(file.getNameSubfix());
//			ConstractTools.flushFileRedis(fre, redisTemplate);
//			
//			ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
//			//生成图片   
//			byte[] imgByte = ConstractTools.pdfToOutputStream(bis, null, redisTemplate, ConstractTools.IMG_IDKEYS_STUFF+redisKey, "");//ConstractTools.IMG_IDKEYS_STUFF
//			
//			if(imgByte==null) {
//				throw new Exception("合成失败");
//			}
//			
//			os.write(imgByte, 0, imgByte.length);
//		} finally {
//			fTPfixPool.returnFTP(fTPClient);
//		}
//		
//	}
	private com.yonyou.scf.common.entity.File getFilebySerialNum(String serialNum) throws Exception {
		ContractSignerExample contractSignerExample = new ContractSignerExample();
		contractSignerExample.createCriteria().andSerialNumEqualTo(serialNum);
		
		List<ContractSigner> contractSignerList = contractSignerMapper.selectByExample(contractSignerExample);
		
		if(contractSignerList==null || contractSignerList.size()==0 || contractSignerList.size()>1) {
			return null;
		}
		ContractSigner contractSigner = contractSignerList.get(0);
		
		String id = contractSigner.getFileId();
		
		com.yonyou.scf.common.entity.File file = fileMapper.selectByPrimaryKey(Long.valueOf(id));
		return file;
	}
	
	/*
	 * 确认页面签署
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	@Transactional(rollbackFor=Exception.class)
	public ResultBean financeConSignConfirm(JSONObject obj) throws Exception {
		
		/*
		 *获取及验证相关数据---ssstart
		 */
		logger.info("进入融资申请确认页面financeConSignConfirm()，签署融资申请合同方法.....enter successfully");
		if(StringUtils.isEmpty(obj) || !obj.containsKey("bean") || !obj.containsKey("fileId") ||  !obj.containsKey("token")) {
			logger.warn("参数不全，打回");
			return new ResultBean(Constant.CODE_1000, Constant.MSG_PARAM_NOTENOUGH_1000);
		}
		
		String bean = CommonUtil.getFromJSONObject(obj, "bean").toString();
		String fileId = CommonUtil.getFromJSONObject(obj, "fileId").toString();
		String token = CommonUtil.getFromJSONObject(obj, "token").toString();
		
		TokenBean tokenBean = TokenUtil.getBean(token, redisTemplate);
		
		Map<String,String> map = JSON.parseObject(bean, HashMap.class);
		String applicationId = String.valueOf(map.get("financeId"));
		String creditId = String.valueOf(map.get("creditId"));
		logger.info("从bean中获取融资申请id， key：financeId。value："+applicationId);
		
		
		String serialNum = CommonUtil.createFileId();
		logger.info("生成签署数据表唯一流水号serialNum："+serialNum);
		
		com.yonyou.scf.common.entity.File file = fileMapper.selectByPrimaryKey(Long.parseLong(fileId));
		logger.info("根据file表的主键id取file表中查询的结果fileName:"+file.getName());
		
		FTPClient ftPClient = fTPfixPool.borrowFTP();
		FTPClient ftpClient = fTPfixPool.borrowFTP();
		FTPClient fTPClient = fTPfixPool.borrowFTP();
		
		ContractSigner contractSigner = getUniqueConIsSign(applicationId, tokenBean, file);
		
		if(contractSigner!=null) {
			logger.info(Constant.MSG_1500);
			return new ResultBean(Constant.CODE_1500,Constant.MSG_1500);
		}
		
		ContractCreditExample contractCreditExample = new ContractCreditExample();
		contractCreditExample.createCriteria().andCreditIdEqualTo(Long.parseLong(creditId)).andFileIdEqualTo(fileId)
		.andSignerNoEqualTo(tokenBean.getOrganizeRoleNo()).andSignerIdEqualTo(Long.parseLong(tokenBean.getOrganizeId())).andPlaceholderNoEqualTo(Constant.SIGN_TIME_20);
		
		List<ContractCredit> contractCreditList =  contractCreditMapper.selectByExample(contractCreditExample);
		
		if(contractCreditList==null || contractCreditList.size()==0) {
			throw new Exception("授信id不正确");
		}
		
		ContractCredit contractCredit = contractCreditList.get(0);
		
		/*
		 *获取及验证相关数据---eeeend
		 */
		
		String redisKey = applicationId+fileId;
		logger.info("组合的redisKey："+redisKey);
		String secondRedisKey = applicationId+fileId;
		String newName = new String((redisKey+".pdf").getBytes("UTF-8"), "ISO8859-1");
		
		try {
			
			FileRedisEntity fre = null;
			//直接去FTP中查看是否已经存在待签署的文件
			InputStream isFromFTP = null;
			
			try {
				isFromFTP = ConstractTools.getFileFromFTP(ftpClient, redisKey,"pdf",ConstractTools.CONSTRACTPATH_IN_FTP);//.obtainsFileWithRedis(redisKey,ConstractTools.FILE_IDKEYS_STUFF, redisTemplate);
			} catch (Exception e) {
			}
			
			if(isFromFTP!=null) {
				return alreadyExistFIleInFTP(applicationId,creditId,tokenBean,serialNum,redisKey,  file, isFromFTP);
			}
			
			fre = ConstractTools.obtainsFileWithRedis(redisKey,ConstractTools.FILE_IDKEYS_STUFF, redisTemplate);
			
			if(fre!=null) {
				
				boolean bool = ConstractTools.sendToFTPWithoutRedis(fTPClient,redisKey,"pdf", fre.getFile());
				
				if(bool) {
					return alreadyExistFIleInFTP(applicationId,creditId,tokenBean, serialNum,redisKey, file, new ByteArrayInputStream(fre.getFile()));
				}
				throw new Exception("文件上传失败");
			}
			
			
			//否则走下面
			//如果不存在  直接取"原模"版直接生成
			InputStream is = ConstractTools.getFile(ftPClient, file.getFileId(), ".pdf", redisTemplate);
			
			ContractTemplate contractTemplate = contractTemplateMapper.selectByPrimaryKey(contractCredit.getTctId());
			
			//如果是借据合同，需要整理贷前合同编号，比如担保合同 需要将多个编号以逗号分割
			if(ContractConstant.CONTRACT_TPN_JJ_TYPE.equals(contractTemplate.getContractType())) {
				//取所有贷前合同编号
				Map<String,String> creConsNo = getCreditConsFromDB(contractCredit);
				
				map.putAll(creConsNo);
			}
			stauffAllValuesForCon(tokenBean, contractCredit, contractTemplate, map, applicationId);
			
			byte[] bytes = ConstractTools.stuffPDF(map, is);
			
			//刷新填值后的文件，方便上传到ftp和下载
			fre = new FileRedisEntity();
			fre.setFile(bytes);
			fre.setFileId(ConstractTools.FILE_IDKEYS_STUFF+secondRedisKey);
			fre.setKeyPrefix("");
			fre.setName(file.getName());
			fre.setSubfix(file.getNameSubfix());
			ConstractTools.flushFileRedis(fre, redisTemplate);
			
			//由于法大大是直接取ftp地址，所以要上传至ftp中
			
			fTPClient.changeWorkingDirectory(ConstractTools.CONSTRACTPATH_IN_FTP);
			//如果redis中存在  直接落地调用法大大签署
			if(bytes!=null) {
				FTPFile[] files = fTPClient.listFiles(newName);
				
				if(files.length>0) {
					throw new IOException("ftp系统中已经存在指定文件名");
				}
				
				boolean bool = fTPClient.storeFile(newName, new ByteArrayInputStream(bytes));
				
				if(!bool){
					return null;
				}
				return alreadyExistFIleInFTP(applicationId,creditId,tokenBean, serialNum,redisKey, file, new ByteArrayInputStream(bytes));
			}else {
				logger.info("执行financeConSignConfirm()方法出现错误:文件数据不存在。结束");
				return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
			}
			
		} finally {
			if(ftPClient!=null) {
				fTPfixPool.returnFTP(ftPClient);
			}
			if(ftpClient!=null) {
				fTPfixPool.returnFTP(ftpClient);
			}
			if(fTPClient!=null) {
				fTPfixPool.returnFTP(fTPClient);
			}
		}
	}
	
	public void downAfterCon(String token, String financeId, String fileId, HttpServletResponse response) throws Exception {
			OutputStream os = response.getOutputStream();
		
		logger.info("融资发起人签署后合同文件下载");
		logger.info("请求参数分别为：token："+token+".financeId："+financeId+".fileId:"+fileId);
//		TokenBean  tokenBean  = TokenUtil.getBean(token, redisTemplate);
		
		com.yonyou.scf.common.entity.File file = fileMapper.selectByPrimaryKey(Long.parseLong(fileId));
		
		String redisKey = financeId+fileId;//GETIgetFinanceRedisKey(contractSigner);
		
		FTPClient ftpClient = fTPfixPool.borrowFTP();
		try {
			byte[] bytes = ConstractTools.getFullFormValue(redisKey, redisTemplate, ftpClient, false);
			
			if(bytes!=null) {
				logger.info("找到文件，正确返回");
				String finalName = new String((file.getName()+"."+file.getNameSubfix()).getBytes("UTF-8"), "ISO8859-1");
				System.out.println("下载文件名："+(file.getName()+"."+file.getNameSubfix()));
				response.setHeader("OriginalFilename", finalName);
				response.setHeader("Content-Disposition", "attachment;fileName="+finalName);
				os.write(bytes, 0, bytes.length);
				os.flush();
				os.close();
				return;
			}else {
				logger.warn("找到不到文件，方法结束");
				throw new Exception("找不到文件");
			}
		} finally {
			fTPfixPool.returnFTP(ftpClient);
		}
		
	}
	public void viewAfterCon(String token, String financeId, String fileId, HttpServletResponse response) throws Exception {
		
		OutputStream os = response.getOutputStream();
		
		logger.info("签署后合同文件查看");
		logger.info("请求参数分别为：token："+token+".financeId："+financeId+".fileId:"+fileId);
		TokenBean  tokenBean  = TokenUtil.getBean(token, redisTemplate);
		
		com.yonyou.scf.common.entity.File file = fileMapper.selectByPrimaryKey(Long.parseLong(fileId));
		
		String redisKey = financeId+file.getId();//getFinanceRedisKey(contractSigner);
		
		FTPClient ftpClient = fTPfixPool.borrowFTP();
		try {
			byte[] bytes = ConstractTools.getFullFormValue(redisKey, redisTemplate, ftpClient, true);
			
			if(bytes!=null) {
				logger.info("找到文件，正确返回");
				os.write(bytes, 0, bytes.length);
				os.flush();
				os.close();
				return;
			}else {
				logger.warn("找到不到文件，方法结束");
				throw new Exception("找不到文件");
			}
		} finally {
			fTPfixPool.returnFTP(ftpClient);
		}
		
	}
	public void viewFormFinance(String value, HttpServletResponse response) throws Exception {
		OutputStream os = response.getOutputStream();
		byte[] bys = this.getFDDConStream(value, true);
		
		if(bys!=null) {
			os.write(bys, 0, bys.length);
			os.flush();
			os.close();
			return;
		}else {
			throw new Exception("找不到文件");
		}
	}
	public void downFormFinance(String value, HttpServletResponse response) throws Exception {
		OutputStream os = response.getOutputStream();
		byte[] bys = this.getFDDConStream(value, false);
		
		String redisValue = String.valueOf(redisTemplate.opsForValue().get(value));
		
		if(StringUtils.isEmpty(redisValue)) {
			throw new Exception("请求参数有误value："+value);
		}
		
		Finance1025Request request1025  = JSON.parseObject(redisValue, Finance1025Request.class);
		Long fileId = request1025.getFileId();
		
		com.yonyou.scf.common.entity.File file = fileMapper.selectByPrimaryKey(fileId);
		
		String finalName = new String((file.getName()+"."+file.getNameSubfix()).getBytes("UTF-8"), "ISO8859-1");
		System.out.println("下载文件名："+(file.getName()+"."+file.getNameSubfix()));
		response.setHeader("OriginalFilename", finalName);
		response.setHeader("Content-Disposition", "attachment;fileName="+finalName);
		os.write(bys, 0, bys.length);
		os.flush();
		os.close();
		return;
	}
	
	public byte[] getFDDConStream(String value, boolean isGetImg) throws Exception {
		
		String redisValue = String.valueOf(redisTemplate.opsForValue().get(value));
		
		if(StringUtils.isEmpty(redisValue)) {
			throw new Exception("请求参数有误value："+value);
		}
		
		Finance1025Request request1025  = JSON.parseObject(redisValue, Finance1025Request.class);
		
		String token = request1025.getToken();
		TokenBean  tokenBean = TokenUtil.getBean(token, redisTemplate);
		
		Long financeId = request1025.getFinanceId();
		Long fileId = request1025.getFileId();
		String signerNo = tokenBean.getOrganizeRoleNo();
		
		//1.先查contractSign 表是否有数据，如果有数据 就代表已经签署，直接去redis中取 或者去ftp
		logger.info("开始查询是否已经有签署记录");
		ContractSignerExample contractSignerExample = new ContractSignerExample();
		contractSignerExample.createCriteria().andApplicationIdEqualTo(financeId).andFileIdEqualTo(String.valueOf(fileId)).andSignerNoEqualTo(signerNo);
		
		List<ContractSigner> contractSignerList = contractSignerMapper.selectByExample(contractSignerExample);
		logger.info("查询结果："+contractSignerList);
		byte[] bts = null;
		if(contractSignerList!=null && contractSignerList.size()>0) {
			ContractSigner contractSigner = contractSignerList.get(0);
			String redisKey = getFinanceRedisKey(contractSigner);
			
			FTPClient fTPClient = fTPfixPool.borrowFTP();
			try {
				 bts = ConstractTools.getFullFormValue(redisKey, redisTemplate, fTPClient, isGetImg);
			} finally {
				fTPfixPool.returnFTP(fTPClient);
			}
			
		}
		
		//如果没有填好值的文件 继续往下，有则立即返回
		if(bts!=null) {
			return bts;
		}
		
		//2.如果表中没有数据  则代表没有签署，直接取填好表单值的 或者模版+填空
		
		String result =  HttpClientUtil.post(URLConst.URL_FINANCING+"/1027", request1025);
		
		ResultBean resultBean = JSON.parseObject(result, ResultBean.class);
		
		if(StringUtils.isEmpty(resultBean) || !Constant.CODE_2000.equals(resultBean.getCode())) {
			throw new Exception("请求finance项目出错");
		}
		
		JSONObject obj  = new JSONObject();
		obj.put("token", request1025.getToken());
		obj.put("fileId", request1025.getFileId());
		obj.put("bean", resultBean.getDataList().get(0));
		return this.financeConViewConfirm(obj, isGetImg);
	}
	
	/*
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public byte[] financeConViewConfirm(JSONObject obj, boolean isGetImg) throws Exception {
		
		/*
		 *获取及验证相关数据---ssstart
		 */
		
		logger.info("进入融资申请确认页面financeConSignConfirm()，签署融资申请合同方法.....enter successfully");
		if(StringUtils.isEmpty(obj) || !obj.containsKey("bean") || !obj.containsKey("fileId") || !obj.containsKey("token")) {
			logger.warn("参数不全，打回");
			//return new ResultBean(Constant.CODE_1000, Constant.MSG_PARAM_NOTENOUGH_1000);
		}
		
		String bean = CommonUtil.getFromJSONObject(obj, "bean").toString();
		String fileId = CommonUtil.getFromJSONObject(obj, "fileId").toString();
		String token = CommonUtil.getFromJSONObject(obj, "token").toString();
		
		TokenBean tokenBean = TokenUtil.getBean(token, redisTemplate);
		
//		JJContractBean jJContractBean = JSON.parseObject(bean, JJContractBean.class);
		
		Map<String,String> map = JSON.parseObject(bean, HashMap.class);
		
		String applicationId = String.valueOf(map.get("financeId"));
		logger.info("从bean中获取融资申请id， key：financeId。value："+applicationId);
		
		String serialNum = CommonUtil.createFileId();
		String redisKey = applicationId+fileId;//+tokenBean.getOrganizeRoleNo();
		logger.info("组合的redisKey："+redisKey);
		logger.info("生成签署数据表唯一流水号serialNum："+serialNum);
		
		com.yonyou.scf.common.entity.File file = fileMapper.selectByPrimaryKey(Long.parseLong(fileId));
		logger.info("根据file表的主键id取file表中查询的结果fileName:"+file.getName());
		
		FTPClient ftPClient = fTPfixPool.borrowFTP();
		FTPClient ftpClient = fTPfixPool.borrowFTP();
		FTPClient fTPClient = fTPfixPool.borrowFTP();
		/*
		 *获取及验证相关数据---eeeend
		 */
		
		try {
			
			String creditId = StringUtil.toString(map.get("creditId"));
			logger.info("从bean中解析出来的授信id为："+creditId);
			
			ContractCreditExample contractCreditExample = new ContractCreditExample();
			contractCreditExample.createCriteria().andCreditIdEqualTo(Long.parseLong(creditId)).andFileIdEqualTo(fileId)
			.andSignerNoEqualTo(tokenBean.getOrganizeRoleNo()).andSignerIdEqualTo(Long.parseLong(tokenBean.getOrganizeId())).andPlaceholderNoEqualTo(Constant.SIGN_TIME_20);
			
			List<ContractCredit> contractCreditList =  contractCreditMapper.selectByExample(contractCreditExample);
			
			if(contractCreditList==null || contractCreditList.size()==0) {
				throw new Exception("授信id不正确");
			}
			
			ContractCredit contractCredit = contractCreditList.get(0);
			
			ContractTemplate contractTemplate = contractTemplateMapper.selectByPrimaryKey(contractCredit.getTctId());
			
			byte[] bts = ConstractTools.getFullFormValue(redisKey, redisTemplate, fTPClient, isGetImg);
			
			if(bts!=null) {
				return bts;
			}
			
			logger.info("去ftp直接命中填写好的文件失败...进入下一判断");
			
			//3.如果不存在  直接取"原模"版直接生成
			@Cleanup InputStream is = ConstractTools.getFile(ftPClient, file.getFileId(), "pdf", redisTemplate);
			
			stauffAllValuesForCon(tokenBean, contractCredit, contractTemplate, map, applicationId);
			
			byte[] bytes = ConstractTools.stuffPDF(map, is);
			
			//刷新填值后的文件，方便上传到ftp和下载
			FileRedisEntity fre = new FileRedisEntity();
			fre.setFile(bytes);
			fre.setFileId(ConstractTools.FILE_IDKEYS_STUFF+redisKey);
			fre.setKeyPrefix("");
			fre.setName(file.getName());
			fre.setSubfix(file.getNameSubfix());
			ConstractTools.flushFileRedis(fre, redisTemplate);
			
			//生成图片 并刷新
			bts = ConstractTools.pdfToOutputStream(new ByteArrayInputStream(bytes, 0, bytes.length), null, redisTemplate, redisKey, ConstractTools.IMG_IDKEYS_STUFF);
			
			if(bts==null) {
				throw new Exception("合成失败");
			}
			logger.info("去ftp中原模版文件，填写表单域，生成图片成功。");
			logger.info("合成文件大小:"+bts.length);
			return bts;
			
		} finally {
			if(ftPClient!=null) {
				fTPfixPool.returnFTP(ftPClient);
			}
			if(ftpClient!=null) {
				fTPfixPool.returnFTP(ftpClient);
			}
			if(fTPClient!=null) {
				fTPfixPool.returnFTP(fTPClient);
			}
			
		}
	}
	/*
	 * 根据授信id 取所有贷前合同编号，因为贷前合同编号已经存在数据库中，所以直接取库中取，如果去redis中  还需要处理 多个担保合同的key
	 * @param contractCredit
	 */
	private Map<String,String> getCreditConsFromDB(ContractCredit contractCredit){
		ContractSignerExample contractSignerExample = new ContractSignerExample();
		contractSignerExample.createCriteria().andCreditIdEqualTo(contractCredit.getCreditId()).andPlaceholderNoEqualTo(Constant.SIGN_TIME_10);
		List<ContractSigner> contractSignerList = contractSignerMapper.selectByExample(contractSignerExample);
		 List<Map<String, String>> list = contractSignerList.stream().map(x->{
			Map<String,String> map = new HashMap<>();
			map.put("tctId", StringUtil.toString(x.getTctId()));
			map.put("signContractNo", x.getSignContractNo());
			return map;
		}).distinct().collect(Collectors.toList());
		
		 Map<String,String> resultMap = new HashMap<>();
		 
		 list.stream().forEach(x->{
			Long tctId =  Long.parseLong(x.get("tctId"));
			ContractTemplate contractTemplate = contractTemplateMapper.selectByPrimaryKey(tctId);
			String key = "";
			try {
				key = ContractConstant.exchangeType(contractTemplate);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(resultMap.containsKey(key)) {
				resultMap.put(key, resultMap.get(key)+","+x.get("signContractNo"));
			}else {
				resultMap.put(key, x.get("signContractNo"));
			}
		 });
		 System.out.println("最后的map为：："+resultMap);
		 return resultMap;
	}
	@Transactional(propagation=Propagation.MANDATORY,rollbackFor=Exception.class)
	private ResultBean alreadyExistFIleInFTP(String applicationId, String creditId,TokenBean tokenBean, String serialNum, String redisKey,
			com.yonyou.scf.common.entity.File file, InputStream isFromFTP) throws Exception {
		//查询合同类型
		ContractCredit contractCredit = getUniqueConCredit(creditId, tokenBean, file);
		
		logger.info("查询合同模版表，主键值:"+contractCredit.getTctId());
		ContractTemplate contractTemplate = contractTemplateMapper.selectByPrimaryKey(contractCredit.getTctId());
		logger.info("查询合同模版表，结束，值为："+contractTemplate);
		
		SignFTPFileEntity fre = new SignFTPFileEntity();
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		FileCopyUtils.copy(isFromFTP, bos);
		fre.setFile(bos.toByteArray());
		fre.setFileId(file.getFileId());
		fre.setName(file.getName());
		fre.setSubfix(file.getNameSubfix());
		Fdd1061Request request1061 = new Fdd1061Request();
		request1061.setCallback_url(IpFactory.CALLBACK_FINANCE_URL);//回调接口
		
		String mainWord = mainWord(contractCredit.getTctId(), tokenBean);
		String resultUrl = postSignFDD(mainWord,serialNum, redisKey, fre, tokenBean, request1061);
		

		//操作当前签署记录
		logger.info("插入当前签署记录开始");
		insertContractSign(contractCredit, contractTemplate, applicationId,redisKey, creditId, file, serialNum,tokenBean);
		logger.info("插入当前签署记录结束");
		
		JSONObject resultObj = new JSONObject();
		resultObj.put("url", resultUrl);
		resultObj.put("sn", serialNum);
		
		redisTemplate.opsForValue().set(ConstractTools.SN_PREFIX+serialNum, "0");
		logger.info("正常结束financeConSignConfirm()方法");
		return new ResultBean(Constant.CODE_2000,Constant.MSG_2000,resultObj);
	}
	/*
	 * 查询唯一的 ContractCredit
	 * @param creditId
	 * @param tokenBean
	 * @param file
	 * @return
	 * @throws Exception
	 */
	private ContractCredit getUniqueConCredit(String creditId, TokenBean tokenBean,
			com.yonyou.scf.common.entity.File file) throws Exception {
		logger.info("查询合同授信表开始....");
		ContractCreditExample contractCreditExample = new ContractCreditExample();
		contractCreditExample.createCriteria().andCreditIdEqualTo(Long.parseLong(creditId))//.andPlaceholderNoEqualTo(Constant.SIGN_TIME_10)
		.andSignerNoEqualTo(tokenBean.getOrganizeRoleNo()).andFileIdEqualTo(file.getId().toString()).andSignerIdEqualTo(Long.parseLong(tokenBean.getOrganizeId()));
		
		List<ContractCredit> contractCreditList = contractCreditMapper.selectByExample(contractCreditExample);
		
		if(StringUtils.isEmpty(contractCreditList) || contractCreditList.size()<1) {
			logger.info("查询合同授信表结束....没有指定的数据");
			throw new Exception("不存在对应数据");
		}
		logger.info("查询合同授信表结束....存在指定的数据");
		ContractCredit  contractCredit  = contractCreditList.get(0);
		return contractCredit;
	}
	private ContractSigner getUniqueConCreditIsSign(String creditId, TokenBean tokenBean,
			com.yonyou.scf.common.entity.File file) throws Exception {
		logger.info("查询合同签署表开始....");
		ContractSignerExample contractSignerExample = new ContractSignerExample();
		contractSignerExample.createCriteria().andCreditIdEqualTo(Long.parseLong(creditId)).andPlaceholderNoEqualTo(Constant.SIGN_TIME_10)
		.andSignerNoEqualTo(tokenBean.getOrganizeRoleNo()).andFileIdEqualTo(file.getId().toString()).andIsSignedEqualTo(Constant.SIGN_YES_1);
		
		List<ContractSigner> contractSignerList = contractSignerMapper.selectByExample(contractSignerExample);
		
		if(StringUtils.isEmpty(contractSignerList) || contractSignerList.size()<1) {
			return null;
		}
		logger.info("查询合同授信表结束....存在指定的数据");
		ContractSigner  contractSigner  = contractSignerList.get(0);
		return contractSigner;
	}
	private ContractSigner getUniqueConSign(String financeId, TokenBean tokenBean,
			com.yonyou.scf.common.entity.File file) throws Exception {
		logger.info("查询合同签署表开始....");
		ContractSignerExample contractSignerExample = new ContractSignerExample();
		contractSignerExample.createCriteria().andApplicationIdEqualTo(Long.parseLong(financeId)).andPlaceholderNoEqualTo(Constant.SIGN_TIME_20)
		.andSignerIdEqualTo(Long.parseLong(tokenBean.getOrganizeId()))
		.andSignerNoEqualTo(tokenBean.getOrganizeRoleNo()).andFileIdEqualTo(file.getId().toString());
		
		List<ContractSigner> contractSignerList = contractSignerMapper.selectByExample(contractSignerExample);
		
		if(StringUtils.isEmpty(contractSignerList) || contractSignerList.size()<1) {
			return null;
		}
		logger.info("查询合同签署表结束....存在指定的数据");
		ContractSigner  contractSigner  = contractSignerList.get(0);
		return contractSigner;
	}
	private ContractSigner getUniqueConIsSign(String financeId, TokenBean tokenBean,
			com.yonyou.scf.common.entity.File file) throws Exception {
		logger.info("查询合同签署表开始....");
		ContractSignerExample contractSignerExample = new ContractSignerExample();
		contractSignerExample.createCriteria().andApplicationIdEqualTo(Long.parseLong(financeId)).andPlaceholderNoEqualTo(Constant.SIGN_TIME_20)
		.andSignerIdEqualTo(Long.parseLong(tokenBean.getOrganizeId()))
		.andSignerNoEqualTo(tokenBean.getOrganizeRoleNo()).andFileIdEqualTo(file.getId().toString()).andIsSignedEqualTo(Constant.SIGN_YES_1);
		
		List<ContractSigner> contractSignerList = contractSignerMapper.selectByExample(contractSignerExample);
		
		if(StringUtils.isEmpty(contractSignerList) || contractSignerList.size()<1) {
			return null;
		}
		logger.info("查询合同授信表结束....存在指定的数据");
		ContractSigner  contractSigner  = contractSignerList.get(0);
		return contractSigner;
	}
	
	/*
	 * 根据合同模版表主键id 取合同类型关键字
	 * @param creditId
	 * @return
	 * @throws Exception
	 */
	private String mainWord(Long id, TokenBean tokenBean) throws Exception {
		
		logger.info("查询合同模版表，主键值:"+id);
		ContractTemplate contractTemplate = contractTemplateMapper.selectByPrimaryKey(id);
		logger.info("查询合同模版表，结束，值为："+contractTemplate);
		
		if(CommonUtil.searchStr(ContractConstant.REGISTER_COMMON_STR, contractTemplate.getContractType())<0) {
			String keyWord = legalName(tokenBean);
			return keyWord;
		}else if(CommonUtil.searchStr(ContractConstant.REGISTER_COMMON_STR, contractTemplate.getContractType())>-1) {
			
			logger.info("根据模版类型取，合同类型关键字");
			ContractAttributeExample contractAttributeExample = new ContractAttributeExample();
			contractAttributeExample.createCriteria().andContractTypeEqualTo(contractTemplate.getContractType())
									.andSignerNoEqualTo(Integer.parseInt(tokenBean.getOrganizeRoleNo()));
			
			List<ContractAttribute> contractAttributeList = contractAttributeMapper.selectByExample(contractAttributeExample);
			
			if(contractAttributeList==null || contractAttributeList.size()<1) {
				logger.info("查询合同类型关键字有误，没有查到指定数据");
				throw new Exception("查询合同类型关键字有误，没有查到指定数据");
			}
			ContractAttribute contractAttribute = contractAttributeList.get(0);
			
			return obtiansMainWorld(contractAttribute.getMainContractType(), tokenBean);
		}else {
			throw new Exception("合同类型有误");
		}
	}
	
	/*
	 * 根据库中关键字  分别处理
	 * 当为值为‘CURRENT_LEGAL_NAME’ 时  取当前登陆人的法人或名字  参照 ContractConstant.CURRENT_LEGAL_NAME
	 * @param mainContractType
	 * @return
	 */
	private String obtiansMainWorld(String mainContractType, TokenBean tokenBean) throws Exception {
		if(ContractConstant.CURRENT_LEGAL_NAME.equals(mainContractType)) {
			return legalName(tokenBean);
		}
		return mainContractType;
	}
	public ResultBean savePDFFinanceConfirm(JSONObject obj) throws Exception{
		/*
		 *获取及验证相关数据---ssstart
		 */
		logger.info("进入融资申请确认页面 保存方法调用savePDFFinanceConfirm().....enter successfully");
		if(StringUtils.isEmpty(obj) || !obj.containsKey("creditId") || !obj.containsKey("applicationId") ||  !obj.containsKey("token")) {
			logger.warn("参数不全，打回");
			return new ResultBean(Constant.CODE_1000, Constant.MSG_PARAM_NOTENOUGH_1000);
		}
		
		if(!obj.containsKey("fileIdMap") || StringUtils.isEmpty(obj.get("fileIdMap"))) {
			logger.warn("没有需要签署的合同，直接返回");
			return new ResultBean(Constant.CODE_2000, "没有需要签署的合同，直接返回");
		}
		
		String creditId = CommonUtil.getFromJSONObject(obj, "creditId").toString();
		String applicationId = CommonUtil.getFromJSONObject(obj, "applicationId").toString();
		String token = CommonUtil.getFromJSONObject(obj, "token").toString();
		String fileMap = CommonUtil.getFromJSONObject(obj, "fileIdMap").toString();
		
		logger.info("接到的四个参数分别为creditId："+creditId+"。applicationId："+applicationId+"。token："+token+"。fileMap："+fileMap);
		
		TokenBean tokenBean = TokenUtil.getBean(token, redisTemplate);
		
		Map<String,String> map = JSON.parseObject(fileMap, HashMap.class);
		
		//组装是类，准备插入
		List<ContractSigner> financeList = packCSigner(creditId, applicationId, tokenBean, map);
		
		if(financeList==null || financeList.size()<1) {
			logger.info("融资申请确认页面，点击保存后，存储的数据长度为0，没有任何数据可保存，直接返回成功");
			return new ResultBean(Constant.CODE_2000,Constant.MSG_2000);
		}
		logger.info("批量保存前的值："+financeList);
		int resultInt = contractUtilMapper.insertBatchDataFinance(financeList);
		logger.info("融资申请确认页面，点击保存后，存储的数据长度为:"+resultInt);
		return new ResultBean(Constant.CODE_2000,Constant.MSG_2000);
	}
	/*
	 * 融资申请确认页面保存签署信息调用
	 * @param creditId
	 * @param applicationId
	 * @param tokenBean
	 * @param map
	 * @return
	 * @throws Exception
	 */
	private List<ContractSigner> packCSigner(String creditId, String applicationId, TokenBean tokenBean,
			Map<String, String> map) throws Exception {
		String currentTime = Timer.getDateTimeNow(Timer.Role2);
		String signNo = Constant.SIGN_TIME_20;
		
		Iterator<Entry<String, String>> iter = map.entrySet().iterator();
		
		//存储合同模版编号的map
	    String redisKey = ConstractTools.CON_NO_IDKEYS+applicationId;
	    //取当前融资申请id 所存储的所有合同编号
	    Map<Object, Object> noMap = redisTemplate.opsForHash().entries(redisKey);
		
		String fileId = iter.next().getKey();
		
		ContractCreditExample contractCreditExample = new ContractCreditExample();
		contractCreditExample.createCriteria().andCreditIdEqualTo(Long.parseLong(creditId))
		.andPlaceholderNoEqualTo(signNo).andSignerNoNotEqualTo(tokenBean.getOrganizeRoleNo());//.andSignerNoEqualTo(tokenBean.getOrganizeRoleNo());      .andFileIdEqualTo(fileId)
		
		//查询授信时相关的所有数据
		List<ContractCredit> contractCreditList = contractCreditMapper.selectByExample(contractCreditExample);
		logger.info("查询合同授信表中的相关数据长度为："+contractCreditList.size());
		
		List<ContractSigner> financeList = new ArrayList<>();
		
		contractCreditList.stream().forEach(x->{
			ContractSigner contractSigner = new ContractSigner();
			
			contractSigner.setApplicationId(Long.parseLong(applicationId));
			contractSigner.setCreditId(Long.parseLong(creditId));
			contractSigner.setCreUserId(Long.parseLong(tokenBean.getUserId()));
			contractSigner.setGmtCreate(currentTime);
			contractSigner.setGmtModified(currentTime);
			contractSigner.setIsSigned(Constant.SIGN_NOT_0);
			contractSigner.setSerialNum(CommonUtil.createFileId());
			contractSigner.setModUserId(Long.parseLong(tokenBean.getUserId()));
			contractSigner.setPlaceholderNo(x.getPlaceholderNo());
			contractSigner.setSignContractId(String.valueOf(x.getTctId()));
			contractSigner.setSignerId(x.getSignerId());
			contractSigner.setSignerNo(x.getSignerNo());
			contractSigner.setOrderNo(x.getOrderNo());
			contractSigner.setId(CreateID.createId());
			contractSigner.setFileId(x.getFileId());
			contractSigner.setTctId(x.getTctId());
			//取合同类型 TODO
			ContractTemplate contractTemplate = contractTemplateMapper.selectByPrimaryKey(x.getTctId());
			
			try {
				contractSigner.setSignContractNo(noMap.get(ContractConstant.exchangeType(contractTemplate)).toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
				
			financeList.add(contractSigner);
		});
		
		logger.info("融资申请，其他签署方的签署个数："+financeList.size());
//		financeList.addAll(otherSignList);
		
		return financeList;
	}
	public ResultBean submitFinance(JSONObject obj) throws Exception {
		
		logger.info("进入提交融资申请方法");
		
		String token  = CommonUtil.getFromJSONObject(obj, "token").toString();
		String financeId  = CommonUtil.getFromJSONObject(obj, "financeId").toString();
		String nodeId  = CommonUtil.getFromJSONObject(obj, "nodeId").toString();
		String wkId  = CommonUtil.getFromJSONObject(obj, "wkId").toString();
		TokenBean tokenBean = TokenUtil.getBean(token, redisTemplate);
		logger.info("参数token："+token+".financeId:"+financeId+".nodeId:"+nodeId+".wkId");
		
		ContractSignerExample contractSignerExample = new ContractSignerExample();
		contractSignerExample.createCriteria().andApplicationIdEqualTo(Long.parseLong(financeId))
		.andSignerNoEqualTo(tokenBean.getOrganizeRoleNo()).andPlaceholderNoEqualTo(Constant.SIGN_TIME_20)
		.andIsSignedEqualTo(Constant.SIGN_NOT_0).andSignerIdEqualTo(Long.parseLong(tokenBean.getOrganizeId()));
		
		logger.info("查询当前签署方是否有签署的数据");
		List<ContractSigner> contractSignerList = contractSignerMapper.selectByExample(contractSignerExample);
		logger.info("查询结果：size:"+contractSignerList.size());
		
		if(contractSignerList!=null && contractSignerList.size()>0) {
			return new ResultBean(Constant.CODE_1000,"合同未完全签署");
		}
		
		WorkflowVO_6621005_I wfVo = new WorkflowVO_6621005_I();
		wfVo.setFinanceId(Long.parseLong(financeId));
		wfVo.setInfo("同意");
		wfVo.setNodeId(Long.parseLong(nodeId));
		wfVo.setStatus("1");
		wfVo.setUserId(Long.parseLong(tokenBean.getUserId()));
		wfVo.setWkId(Long.parseLong(wkId));
		
		logger.info("开始请求工作流，做提交动作");
		String response = HttpClientUtil.post(URLConst.URL_WORKFLOW+ "/6621008", wfVo);
		logger.info("请求结束，结果为：response"+response);
		
		if("2".equals(response)) {
			
			Finance1005Request finance1005Request = new Finance1005Request();
			finance1005Request.setApplyIdea("同意");
			finance1005Request.setFinanceId(Long.parseLong(financeId));
			finance1005Request.setFlowId(Long.parseLong(wkId));
			finance1005Request.setStepId(Long.parseLong(nodeId));
			finance1005Request.setToken(token);
			finance1005Request.setUpdateUser(Long.parseLong(tokenBean.getUserId()));
			String resultValue = HttpClientUtil.post(URLConst.URL_FINANCING+"/1021", finance1005Request);
			ResultBean resultBean = JSON.parseObject(resultValue, ResultBean.class);
			
			if(DefaultConst.SUCCESS_RESPONSE_CODE.equals(resultBean.getCode())) {
				logger.info("工作流成功结束，调用融资申请1021成功");
				return  new ResultBean(Constant.CODE_2000,"工作流成功结束，调用融资申请1021成功");
			}else {
				logger.error("工作流成功结束，但是调用融资申请1021失败，等待回滚...");
				return  new ResultBean(Constant.CODE_1000,"工作流成功结束，但是调用融资申请1021失败，等待回滚...");
			}
		}else if("1".equals(response)) {
			return new ResultBean(Constant.CODE_2000,Constant.MSG_2000);
		}else {
			return new ResultBean(Constant.CODE_1000,"提交失败，请稍后再试");
		}
	}
	public ResultBean submitCredit(JSONObject obj) throws Exception {
		
		logger.info("进入提交融资申请方法");
		
		String token  = CommonUtil.getFromJSONObject(obj, "token").toString();
		String creditId  = CommonUtil.getFromJSONObject(obj, "creditId").toString();
		String nodeId  = CommonUtil.getFromJSONObject(obj, "nodeId").toString();
		String wkId  = CommonUtil.getFromJSONObject(obj, "wkId").toString();
		TokenBean tokenBean = TokenUtil.getBean(token, redisTemplate);
		logger.info("参数token："+token+".financeId:"+creditId+".nodeId:"+nodeId+".wkId");
		
		ContractSignerExample contractSignerExample = new ContractSignerExample();
		contractSignerExample.createCriteria().andCreditIdEqualTo(Long.parseLong(creditId)).andPlaceholderNoEqualTo(Constant.SIGN_TIME_10)
		.andSignerNoEqualTo(tokenBean.getOrganizeRoleNo()).andSignerIdEqualTo(Long.parseLong(tokenBean.getOrganizeId())).andIsSignedEqualTo(Constant.SIGN_NOT_0);
		
		logger.info("查询当前签署方是否有签署的数据");
		List<ContractSigner> contractSignerList = contractSignerMapper.selectByExample(contractSignerExample);
		logger.info("查询结果：size:"+contractSignerList.size());
		
		if(contractSignerList!=null && contractSignerList.size()>0) {
			return new ResultBean(Constant.CODE_1000,"合同未完全签署");
		}
		
		WorkflowVO_6621005_I wfVo = new WorkflowVO_6621005_I();
		wfVo.setFinanceId(Long.parseLong(creditId));
		wfVo.setInfo("同意");
		wfVo.setNodeId(Long.parseLong(nodeId));
		wfVo.setStatus("1");
		wfVo.setUserId(Long.parseLong(tokenBean.getUserId()));
		wfVo.setWkId(Long.parseLong(wkId));
		
		logger.info("开始请求工作流，做提交动作");
		String response = HttpClientUtil.post(URLConst.URL_WORKFLOW+ "/6621008", wfVo);
		logger.info("请求结束，结果为：response"+response);
		
		if("2".equals(response)) {
			
			CreditVO_6602021_I creditVO_6602021_I = new CreditVO_6602021_I();
			creditVO_6602021_I.setCreditId(Long.parseLong(creditId));
			creditVO_6602021_I.setStatus(CreditConst.status_40);
			creditVO_6602021_I.setUpdateUser(Long.parseLong(tokenBean.getUserId()));
			logger.info("开始请求授信更改授信状态，做提交动作,请求参数为："+creditVO_6602021_I);
			String resultValue = HttpClientUtil.post(URLConst.URL_CREDIT+"/6602021", creditVO_6602021_I);
			logger.info("请求授信更改授信状态结束，做提交动作，结果为："+resultValue);
			ResultBean resultBean = JSON.parseObject(resultValue, ResultBean.class);
			
			if(DefaultConst.SUCCESS_RESPONSE_CODE.equals(resultBean.getCode())) {
				logger.info("工作流成功结束");
				return  new ResultBean(Constant.CODE_2000,"工作流成功结束");
			}else {
				logger.error("工作流成功结束，但是调用融资申请1021失败，等待回滚...");
				return  new ResultBean(Constant.CODE_1000,"工作流成功结束，但是调用融资申请1021失败，等待回滚...");
			}
		}else if("1".equals(response)) {
			return new ResultBean(Constant.CODE_2000,Constant.MSG_2000);
		}else {
			return new ResultBean(Constant.CODE_1000,"提交失败，请稍后再试");
		}
	}
	
}
