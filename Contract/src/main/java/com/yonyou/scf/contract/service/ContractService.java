package com.yonyou.scf.contract.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.apache.commons.net.ftp.FTPClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.yonyou.scf.common.constant.URLConst;
import com.yonyou.scf.common.constant.UserConst;
import com.yonyou.scf.common.entity.ContractTemplate;
import com.yonyou.scf.common.entity.ContractTemplateExample;
import com.yonyou.scf.common.entity.ContractTemplateExample.Criteria;
import com.yonyou.scf.common.entity.File;
import com.yonyou.scf.common.entity.FileExample;
import com.yonyou.scf.common.entity.SysParam;
import com.yonyou.scf.common.entity.SysParamExample;
import com.yonyou.scf.common.gateway.entity.TokenBean;
import com.yonyou.scf.common.input.SelectConsByCreditId;
import com.yonyou.scf.common.mapper.auto.ContractTemplateMapper;
import com.yonyou.scf.common.mapper.auto.FileMapper;
import com.yonyou.scf.common.mapper.auto.SysParamMapper;
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.common.util.CreateID;
import com.yonyou.scf.common.util.Timer;
import com.yonyou.scf.common.util.TokenUtil;
import com.yonyou.scf.common.util.net.HttpClientUtil;
import com.yonyou.scf.contract.constant.Constant;
import com.yonyou.scf.contract.ftp.FTPfixPool;
import com.yonyou.scf.contract.mapper.ContractUtilMapper;
import com.yonyou.scf.contract.util.CommonUtil;
import com.yonyou.scf.contract.util.ConstractTools;
import com.yonyou.scf.contract.utilEntity.ConstractInCreditEntity;
import com.yonyou.scf.common.gateway.entity.FileRedisEntity;
import com.yonyou.scf.contract.utilEntity.TemplateListEntity;

/**
 * 合同操作
 * @author zhangjlm
 *
 */
@Service
public class ContractService {
	
	private final Logger logger =  LoggerFactory.getLogger(ContractService.class);
	
	@Autowired
	private ContractTemplateMapper contractTemplateMapper;
	@Autowired
	private RedisTemplate<Object,Object> redisTemplate;
	@Autowired
	private FTPfixPool fTPfixPool;
	@Autowired
	private FileMapper fileMapper;
	@Autowired
	private FileService fileService;
	@Autowired
	private ContractUtilMapper contractUtilMapper;
	@Autowired
	private SysParamMapper sysParamMapper;
	/*
	 * 新增附件，将附件id与合同模版绑定在一起  （模版之前有或者没有fileId）
	 * @param obj
	 * @return
	 */
	
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public ResultBean saveOrUpdateFileEntity(JSONObject obj) {
		logger.info("enter saveFile...");
		
		//参数校验---s
		if(StringUtils.isEmpty(obj) || !obj.containsKey("fileId") || !obj.containsKey("dataId")) {
			logger.warn(Constant.MSG_File_1000);
			return new ResultBean(Constant.CODE_File_1000,Constant.MSG_File_1000);
		}
		
		if(!obj.containsKey("key")) {
			logger.warn(Constant.MSG_TOKEN_1001);
			return new ResultBean(Constant.CODE_1000,Constant.MSG_TOKEN_1001);
		}
		
		String tokenKey = obj.getString("key");
		
		TokenBean tokenBean  = TokenUtil.getBean(tokenKey, redisTemplate);
		
		if(StringUtils.isEmpty(tokenBean)) {
			logger.warn(Constant.MSG_TOKEN_1000);
			return new ResultBean(Constant.CODE_1000,Constant.MSG_TOKEN_1000);
		}
		//参数校验---e
		
		//文件id
		String fileId = obj.getString("fileId");
		String dataId = obj.getString("dataId");
		try {
			
			//保存上传文件  返回file表的主键id
			String fileEntityId = fileService.saveOrUpdateFileEntity(tokenBean, fileId);
			//当前时间
			String currentTime = Timer.getDateTimeNow(Timer.Role2);
			
			ContractTemplate contractTemplate = contractTemplateMapper.selectByPrimaryKey(Long.parseLong(dataId));
			contractTemplate.setFileId(fileEntityId);
			contractTemplate.setModUserId(Long.parseLong(tokenBean.getUserId()));
			contractTemplate.setGmtModified(currentTime);
			
			int updateInt = contractTemplateMapper.updateByPrimaryKey(contractTemplate);
			
			if(updateInt>0) {
				logger.info("contractTemplate表入库成功...");
				return new ResultBean(Constant.CODE_2000,Constant.MSG_2000);
			}
			logger.warn("contractTemplate表入库失败...");
			throw new Exception("所有参数正确，但contractTemplate表入库失败");
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
	}
	
	/*
	 * 合同模版 新增和更新操作
	 * @param objString
	 * @return
	 * @throws JsonProcessingException
	 */
	@Transactional(rollbackFor=Exception.class,propagation=Propagation.REQUIRED)
	public ResultBean saveOrUpdateConTempl(JSONObject obj) throws Exception {
		logger.info("enter into saveOrUpdateConTempl...保存或者更新合同模版");
		try {
			
			if(StringUtils.isEmpty(obj)) {
				return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
			}
			
			String key = CommonUtil.getFromJSONObject(obj, "token").toString();
			
			TokenBean tokenBean = TokenUtil.getBean(key, redisTemplate);
			
			//用id来判断是新增还是更新 如果ID有值，但是数据库中查询不到，那么将忽略这个id值。改为新增操作
			long id = 0;
			
			if(obj.containsKey("id") && !StringUtils.isEmpty(obj.getString("id"))) {
				id = Long.parseLong(CommonUtil.getFromJSONObject(obj, "id").toString());
			}
			
			//当前登陆人
			long currentUserId = Long.parseLong(tokenBean.getUserId());
			//当前时间
			String currentTime = Timer.getDateTimeNow(Timer.Role2);
			
			ContractTemplate contractTemplate = contractTemplateMapper.selectByPrimaryKey(id);
			
			//接收写操作返回值
			int resultInt = 0;
			if(contractTemplate==null) {//新增
				contractTemplate = new ContractTemplate();
				
				logger.info("开始将请求体中的参数转换入contractTemplate");
				ConstractTools.reflectConstract(contractTemplate, obj);
				logger.info("将请求体中的参数转换入contractTemplate 转换结束");
				//验重 规则：资方+融资模式+合同模板名称+核心企业名称	
				boolean bool = ConstractTools.verifyRepeat(contractTemplate,contractTemplateMapper);
				
				if(!bool) {
					return new ResultBean(Constant.CODE_1000,Constant.MSG_EXIST_1000);
				}
				
				//附件是否存在 存在则上传
				if(obj.containsKey("fileId") && !StringUtils.isEmpty(obj.getString("fileId"))) {
					//保存合同模版
					obj.put("key", obj.getString("token"));
					System.out.println("附件存在，fileId:"+obj.getString("fileId"));
					//上传文件 返回file表主键id
					ResultBean fileResultBean = fileService.saveFile(obj);
					if(!Constant.CODE_2000.equals(fileResultBean.getCode())) {
						throw new Exception(fileResultBean.getMessage());
					}
					String fileId = String.valueOf(fileResultBean.getDataList().get(0));
					contractTemplate.setFileId(fileId);
				}else {
					System.out.println("附件不存在！fileId:"+obj.getString("fileId"));
				}
				
				contractTemplate.setId(CreateID.createId());
				contractTemplate.setCreUserId(currentUserId);
				contractTemplate.setGmtCreate(currentTime);
				contractTemplate.setModUserId(currentUserId);
				contractTemplate.setGmtModified(currentTime);
				resultInt = contractTemplateMapper.insert(contractTemplate);
			}else {//更新
				
				ConstractTools.reflectConstract(contractTemplate, obj);
				
//				String fileId = contractTemplate.getFileId();
//				
//				//保存合同模版
//				saveTemplateFile(fileId);
				
				contractTemplate.setGmtModified(currentTime);
				contractTemplate.setModUserId(currentUserId);
				//验重 规则：资方+融资模式+合同模板名称+核心企业名称	
				boolean bool = ConstractTools.verifyRepeat(contractTemplate,contractTemplateMapper);
				
				if(!bool) {
					return new ResultBean(Constant.CODE_1000,Constant.MSG_EXIST_1000);
				}
				resultInt = contractTemplateMapper.updateByPrimaryKey(contractTemplate);
			}
			
			if(resultInt>0) {
				logger.info("保存合同模版数据成功");
				return new ResultBean(Constant.CODE_2000,Constant.MSG_2000);
			}else {
				logger.warn("保存合同模版数据成功");
				return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.warn("合同模版操作有误，请检查更新");
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
	}
	
	/**
	 * 合同模版列表查询
	 * @param objString
	 * @return
	 * @throws JsonProcessingException
	 */
	public ResultBean selectContractList(JSONObject obj) throws JsonProcessingException {
		try {
			
			if(StringUtils.isEmpty(obj)) {
				return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
			}
			
			if(!obj.containsKey("token")) {
				logger.warn(Constant.MSG_TOKEN_1001);
				return new ResultBean(Constant.CODE_1000,Constant.MSG_TOKEN_1001);
			}
			
			String tokenKey = obj.getString("token");
			
			TokenBean tokenBean  = TokenUtil.getBean(tokenKey, redisTemplate);
			
			if(StringUtils.isEmpty(tokenBean)) {
				logger.warn(Constant.MSG_TOKEN_1000);
				return new ResultBean(Constant.CODE_1000,Constant.MSG_TOKEN_1000);
			}
			
			ContractTemplateExample example = new ContractTemplateExample();
			Criteria criteria = example.createCriteria();
			
			//查询条件：核心企业id
			if(obj.containsKey("companyId") && !StringUtils.isEmpty(obj.get("companyId"))) {
				criteria.andCompanyIdEqualTo(Long.parseLong(obj.get("companyId").toString().trim()));
			}
			//查询条件：合同类型序号
			if(obj.containsKey("contractType") && !StringUtils.isEmpty(obj.get("contractType"))) {
				criteria.andContractTypeEqualTo(obj.get("contractType").toString().trim());
			}
			//查询条件：融资模式序号
			if(obj.containsKey("fundNo") && !StringUtils.isEmpty(obj.get("fundNo"))) {
				criteria.andFundNoEqualTo(obj.get("fundNo").toString().trim());
			}
			//查询条件：资方id
			if(obj.containsKey("capitalId") && !StringUtils.isEmpty(obj.get("capitalId"))) {
				criteria.andCapitalIdEqualTo(Long.parseLong(obj.get("capitalId").toString().trim()));
			}
//			criteria.andFileIdIsNotNull();
			
			List<ContractTemplate> list = contractTemplateMapper.selectByExample(example);
			
			List<TemplateListEntity> responseEntities = convertToResponseEntity(list,tokenBean);
			
			 ResultBean bean = new ResultBean();
			 bean.setCode(Constant.CODE_2000);
			 bean.setMessage(Constant.MSG_2000);
			 bean.setDataListCnt(responseEntities.size());
			 bean.setDataList(Arrays.asList(JSON.toJSONString(responseEntities)));
			
			return bean;
		}catch(Exception e) {
			logger.warn("合同模版列表查询有误，请检查更新");
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
		
	}
	
	private List<TemplateListEntity> convertToResponseEntity(List<ContractTemplate> list, TokenBean tokenBean) {
		List<TemplateListEntity> li = new ArrayList<>();
		
		TemplateListEntity templateListEntity = null;
		
		FileExample example = new FileExample();
		
		for (ContractTemplate contractTemplate : list) {
			
			//这一步可以优化，先去redis里面去取，可以省掉循环链接数据库
			String fileId = contractTemplate.getFileId();
			
			
			templateListEntity = new TemplateListEntity();
			if(StringUtils.isEmpty(fileId)) {
				templateListEntity.setExistFile("0");
			}else {
				File file = fileMapper.selectByPrimaryKey(Long.parseLong(contractTemplate.getFileId()));
				templateListEntity.setExistFile("1");
				templateListEntity.setName(file.getName());
				templateListEntity.setSubfix(file.getNameSubfix());
				
				
				
				
				templateListEntity.setViewUrl(URLConst.URL_CONTRACT + "/constract/viewPDF?fileId="+contractTemplate.getFileId());
				templateListEntity.setDownUrl(URLConst.URL_CONTRACT + "/constract/downPDF?fileId="+contractTemplate.getFileId());
				templateListEntity.setFileId(contractTemplate.getFileId());
			}
			
			templateListEntity.setRoleNo(tokenBean.getOrganizeRoleNo());
			
			templateListEntity.setCapitalName(contractTemplate.getCapitalId().toString());
			templateListEntity.setCompanyName(contractTemplate.getCompanyId().toString());
			templateListEntity.setCreateTime(CommonUtil.formatLastTime(contractTemplate.getGmtCreate(), Constant.TIME_FORMAT) );
			templateListEntity.setContractName(contractTemplate.getContractName());
			templateListEntity.setFundName(contractTemplate.getFundNo());
			templateListEntity.setId(contractTemplate.getId().toString());
			
			li.add(templateListEntity);
		}
		
		return li;
	}

	/*
	 * 保存合同的模版
	 * @param fileId
	 * @throws Exception
	 * @throws IOException
	 */
	private void saveTemplateFile(String fileId) throws Exception, IOException {
		//是否存在fileId,如果有并且redis中存在 则直接上传到ftp
		if(!StringUtils.isEmpty(fileId)) {
			FileRedisEntity fileRedisEntity = ConstractTools.obtainsFileWithRedis(fileId, ConstractTools.FILEIDKEYS, redisTemplate);
			if(fileRedisEntity!=null) {
				FTPClient fTPClient = fTPfixPool.borrowFTP();
				try {
					ConstractTools.sendToFtpByEntity(fileRedisEntity, redisTemplate, fTPClient);
				} finally {
					fTPfixPool.returnFTP(fTPClient);
				}
				
			}
		}
	}

	public ResultBean selectConsByCreditId(JSONObject obj) throws Exception{
		
		String creditId = CommonUtil.getFromJSONObject(obj, "creditId").toString();
		
//		Map<String,Long> map = new HashMap<>();
//		map.put("creditId", Long.parseLong(creditId));
		List<SelectConsByCreditId> selectConsByCreditIdList =  contractUtilMapper.selectConsByCreditId(creditId);
		
		return new ResultBean(Constant.CODE_2000, Constant.MSG_2000, selectConsByCreditIdList);
	}

	public ResultBean contractTypeList(JSONObject obj) {
		if(StringUtils.isEmpty(obj)) {
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
		
		if(!obj.containsKey("token")) {
			logger.warn(Constant.MSG_TOKEN_1001);
			return new ResultBean(Constant.CODE_1000,Constant.MSG_TOKEN_1001);
		}
		
		String tokenKey = obj.getString("token");
		
		TokenBean tokenBean  = TokenUtil.getBean(tokenKey, redisTemplate);
		
		if(StringUtils.isEmpty(tokenBean)) {
			logger.warn(Constant.MSG_TOKEN_1000);
			return new ResultBean(Constant.CODE_1000,Constant.MSG_TOKEN_1000);
		}
		
		SysParamExample sysParamExample = new SysParamExample();
		sysParamExample.createCriteria().andColumnNameEqualTo("contract_no").andStatusEqualTo("1");
		sysParamExample.setOrderByClause(" order1 asc");
		
		List<SysParam> sysParamList = sysParamMapper.selectByExample(sysParamExample);
		
		List<JSONObject> resultObj = null;
		try {
			
			//由于合同类型参数都放在sys_param表中，但是sys_param表中没有资方字段，所以在order1字段值上加了前缀   资方id+序号（两位数的）
			String capitalId = (String) CommonUtil.getFromJSONObject(obj, "capitalId");
			
			resultObj = sysParamList.stream().filter(x->{
				int order1 = x.getOrder1();
				int or = order1/100;
				return or== Integer.parseInt(capitalId);
			}).map(x->{
				JSONObject jb = new JSONObject();
				jb.put("id", x.getKeyName());
				jb.put("name", x.getVal());
				return jb;
			}).collect(Collectors.toList());
			
			return new ResultBean(Constant.CODE_2000, Constant.MSG_2000, resultObj);
			
		} catch (Exception e) {
			//当为平台登陆的时候 capitalid可能为空  在CommonUtil.getFromJSONObject会抛出指定异常  但是 操作是正确的  所以做以下处理
			
			if(UserConst.user_role_type_6.equals(tokenBean.getOrganizeRoleNo())) {
				resultObj = sysParamList.stream().map(x->{
					JSONObject jb = new JSONObject();
					jb.put("id", x.getKeyName());
					jb.put("name", x.getVal());
					return jb;
				}).collect(Collectors.toList());
				return new ResultBean(Constant.CODE_2000, Constant.MSG_2000, resultObj);
			}else {
				throw e;
			}
		}
	}
	
	@SuppressWarnings(value= {"unchecked"})
	public ResultBean selectHX(JSONObject obj) throws Exception {
		if(StringUtils.isEmpty(obj)) {
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
		
		if(!obj.containsKey("token")) {
			logger.warn(Constant.MSG_TOKEN_1001);
			return new ResultBean(Constant.CODE_1000,Constant.MSG_TOKEN_1001);
		}
		
		String tokenKey = obj.getString("token");
		
		TokenBean tokenBean  = TokenUtil.getBean(tokenKey, redisTemplate);
		
		if(StringUtils.isEmpty(tokenBean)) {
			logger.warn(Constant.MSG_TOKEN_1000);
			return new ResultBean(Constant.CODE_1000,Constant.MSG_TOKEN_1000);
		}
		
		String capitalId = (String) CommonUtil.getFromJSONObject(obj, "capitalId");
		
		String resultString = HttpClientUtil.post(URLConst.URL_CUSTOMER + "/SCF921002/"+ capitalId + "/" + 2 + "/" + 1, "");
		
		Map<String,String> resultMap = JSON.parseObject(resultString, HashMap.class);
		
		Iterator<Entry<String, String>> it = resultMap.entrySet().iterator();
		
		List<Map<String,String>> list = new ArrayList<>();
		Map<String,String> map = null;
		while(it.hasNext()) {
			map = new HashMap<>();
			Entry<String, String> entyr = it.next();
			map.put("id", entyr.getKey());
			map.put("name", entyr.getValue());
			list.add(map);
		}
		
		return new ResultBean(Constant.CODE_2000,Constant.MSG_2000,list);
	}
	
}
