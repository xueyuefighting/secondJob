package com.yonyou.scf.contract.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.yonyou.scf.common.constant.ContractConstant;
import com.yonyou.scf.common.constant.URLConst;
import com.yonyou.scf.common.constant.UserConst;
import com.yonyou.scf.common.entity.ContractCredit;
import com.yonyou.scf.common.entity.ContractCreditExample;
import com.yonyou.scf.common.entity.ContractSigner;
import com.yonyou.scf.common.entity.ContractSignerExample;
import com.yonyou.scf.common.entity.ContractTemplate;
import com.yonyou.scf.common.entity.ContractTemplateExample;
import com.yonyou.scf.common.entity.File;
import com.yonyou.scf.common.entity.FileExample;
import com.yonyou.scf.common.gateway.entity.TokenBean;
import com.yonyou.scf.common.input.FDDFinanceConListBAS;
import com.yonyou.scf.common.input.Finance1011Request;
import com.yonyou.scf.common.mapper.auto.ContractCreditMapper;
import com.yonyou.scf.common.mapper.auto.ContractSignerMapper;
import com.yonyou.scf.common.mapper.auto.ContractTemplateMapper;
import com.yonyou.scf.common.mapper.auto.FileMapper;
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.common.util.CreateID;
import com.yonyou.scf.common.util.StringUtil;
import com.yonyou.scf.common.util.Timer;
import com.yonyou.scf.common.util.TokenUtil;
import com.yonyou.scf.common.util.net.HttpClientUtil;
import com.yonyou.scf.contract.constant.Constant;
import com.yonyou.scf.contract.constant.IpFactory;
import com.yonyou.scf.contract.gatewayBean.ResponseBean;
import com.yonyou.scf.contract.mapper.ContractUtilMapper;
import com.yonyou.scf.contract.util.CommonUtil;
import com.yonyou.scf.contract.util.ConstractTools;
import com.yonyou.scf.contract.util.TPNContractToolService;
import com.yonyou.scf.contract.utilEntity.ConstractInCreditEntity;

@Service
public class CreditConService {
	
	private Logger logger = LoggerFactory.getLogger(CreditConService.class);
	
	@Autowired
	private ContractUtilMapper contractUtilMapper;
	@Autowired
	private ContractSignerMapper contractSignerMapper;
	@Autowired
	private RedisTemplate<Object,Object> redisTemplate;
	@Autowired
	private ContractCreditMapper contractCreditMapper;
	@Autowired
	private FileMapper fileMapper;
	@Autowired
	private ContractTemplateMapper contractTemplateMapper;
	@Autowired
	private TPNContractToolService tPNContractToolService;
	
	/*
	 * 配置授信合同，合同模版列表
	 * capitalId
	 * companyId
	 * signNo
	 * signer
	 * isSpecialCompnay
	 * contractName
	 * @return
	 */
	public ResultBean conTemplateList(JSONObject obj) throws Exception{
		
		if(StringUtils.isEmpty(obj)) {
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
		
		if(!obj.containsKey("capitalId")  || !obj.containsKey("signNo") || !obj.containsKey("roleId")) {
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
		
		Long capitalId = Long.parseLong(obj.getString("capitalId"));//* 出借方id
		Long companyId = 0L;
		
		if(obj.containsKey("companyId") && !StringUtils.isEmpty(obj.getString("companyId"))) {
			companyId = Long.parseLong(obj.getString("companyId"));//* 核心企业id
		}
		String signNo = obj.getString("signNo");//* 签署时点
		String signer = obj.getString("roleId");//* 当前签署方
		
		if(StringUtils.isEmpty(signNo) || StringUtils.isEmpty(signer)){
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
		
		if(StringUtils.isEmpty(capitalId) || StringUtils.isEmpty(companyId) || StringUtils.isEmpty(signNo)) {
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		map.put("capitalId", capitalId);
		map.put("signNo", signNo);
		//TODO
		
		if(!StringUtils.isEmpty(obj.getString("isSpecialCompany"))) {
			Integer isSpecialCompnay = Integer.parseInt(obj.getString("isSpecialCompany"));//是否指定核心企业
			if(isSpecialCompnay==0) {
				map.put("companyId", companyId);
			}else {
				companyId = null;
			}
			map.put("isSpecialCompany", isSpecialCompnay);
		}else{
			companyId = null;
		}
		if(!StringUtils.isEmpty(obj.getString("contractName"))) {
			String contractName = obj.getString("contractName");//模版名称 模糊查询
			map.put("contractName", contractName);
		}
		
		List<Map<String, Object>> searchList = contractUtilMapper.selectListForCrediCon(map);
		long  cid = StringUtils.isEmpty(companyId)?-1L:companyId;
		
		List<Map<String, Object>> resultList = searchList.stream().filter(x->{
					if(cid!=-1L && !StringUtils.isEmpty(x.get("companyId"))) {
						if(cid==Long.parseLong(x.get("companyId").toString())) {
							return true;
						}else {
							return false;
						}
					}else {
						return true;
					}
				})
				.filter(x->Arrays.asList(String.valueOf(x.get("singers")).split(",")).contains(signer))
				.collect(Collectors.toList());
		
		return new ResultBean(Constant.CODE_2000,Constant.MSG_2000,resultList);
//		
//		List l = new ArrayList();
//		Map<String,String> m = new HashMap<String,String>();
//		m.put("id", "123456789");
//		m.put("contractName", "贷前准备合同");
//		m.put("isSpecial", "否");
//		m.put("fundNo", "02");
//		m.put("signNo", "30");
//		m.put("fileId", "123");
//		m.put("viewUrl", IpFactory.viewUrl+"123");
//		m.put("downUrl", IpFactory.downUrl+"123");
//		l.add(m);
//		m = new HashMap<String,String>();
//		m.put("id", "1234567891");
//		m.put("contractName", "融资申请合同");
//		m.put("isSpecial", "是");
//		m.put("fundNo", "01");
//		m.put("signNo", "20");
//		m.put("fileId", "123123");
//		m.put("viewUrl", IpFactory.viewUrl+"123123");
//		m.put("downUrl", IpFactory.downUrl+"123123");
//		l.add(m);
	}

	public ResultBean beforeLoanConList(String token, String creditId) throws Exception {
		
		if(StringUtils.isEmpty(token)) {
			return new ResultBean(Constant.CODE_1000, Constant.MSG_TOKEN_1001);
		}
		
		TokenBean tokenBean = TokenUtil.getBean(token, redisTemplate);
		
		if(StringUtils.isEmpty(tokenBean)) {
			return new ResultBean(Constant.CODE_ERROR_OUTOFTIME, Constant.MSG_ERROR_OUTOFTIME);
		}
		
		if(StringUtils.isEmpty(creditId)) {
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
		
		long cId = Long.parseLong(creditId);
		Map<String,Long> requestMap = new HashMap<String,Long>();
		requestMap.put("creditId", cId);
		
		//授信信息
		//String creditDetail = HttpClientUtil.post(IpFactory.CREDIT_IP+":"+IpFactory.CREDIT_PORT+"/credit/6602017", requestMap);
		String creditDetail = HttpClientUtil.post(URLConst.URL_CREDIT+"/6602017", requestMap);
		
		String signNo = Constant.SIGN_TIME_10;//签署时点 属于10-贷前
		
		Map<String,Object> map = new HashMap<>();
		map.put("signNo", signNo);
		map.put("creditId", cId);
		
		
		//获取当前授信合同所有记录
		List<Map<String, Object>> listMap = contractUtilMapper.selectForSignCreditCon(map);
		
		//获取签署方id和名字
		//String userList = HttpClientUtil.get(IpFactory.COMPANY_USER_IP+":"+IpFactory.COMPANY_USER_PORT+"/user/0002");
//		String userList = HttpClientUtil.get(URLConst.URL_CUSTOMER+"/0002");
//		Map<String,String> userMap = JSON.parseObject(userList, HashMap.class);
		
//		List<Map<String, Object>> resultList = listMap.stream().map(x->{
////			String newFileId = CommonUtil.createFileId();
//			String serialNum = (String)x.get("serialNum");
//			x.put("SignerName", userMap.get(x.get("signerId")));
////			x.put("newFileId", newFileId);
//			x.put("viewUrl", "http://"+IpFactory.IP+":"+IpFactory.PORT+"/constract/viewNewPDFCredit?serialNum="+serialNum);//只存redis
//			x.put("downUrl", "http://"+IpFactory.IP+":"+IpFactory.PORT+"/constract/downNewPDFCredit?serialNum="+serialNum);//只存redis
//			x.put("signUrl", "http://"+IpFactory.IP+":"+IpFactory.PORT+"/creditCon/beforeLoanConSign?serialNum="+serialNum);//这个操作的时候 才会落地文件
//			return x;
//		}).collect(Collectors.toList());
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		
		resultMap.put("creditInfo", creditDetail);
		resultMap.put("contract", listMap);
		
		return new ResultBean(Constant.CODE_2000,Constant.MSG_2000,resultMap);
	}
	
//	public ResultBean financeConListCnt(String financeId) {
//		if(StringUtils.isEmpty(financeId)) {
//			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
//		}
//		
//		long fId = Long.parseLong(financeId);
//		
//		List<Map<String, Object>> resultList = financeConlist(fId);
//		
//		long resultInt = resultList.stream().filter(x->!"1".equals(x.get("isS").toString())).count();
//		
//		ResultBean rb = new ResultBean();
//		rb.setCode(Constant.CODE_2000);
//		rb.setMessage(Constant.MSG_2000);
//		rb.setDataListCnt(1);
//		rb.setDataList(Arrays.asList(JSON.toJSONString(resultInt)));
//		
//		return rb;
//	}
	
	public ResultBean financeConListAfterSigned(JSONObject obj) throws Exception {
			
			String financeId = CommonUtil.getFromJSONObject(obj, "financeId").toString();
			
			Map<String,Object> map = new HashMap<>();
			if(!obj.containsKey("signerNo") && !StringUtils.isEmpty(obj.getString("signerNo"))) {
				String signerNo = CommonUtil.getFromJSONObject(obj, "signerNo").toString();
				map.put("signerNo", signerNo);//签署方
			}
		
			long fId = Long.parseLong(financeId);
			String signNo = Constant.SIGN_TIME_20;
			
			map.put("signNo", signNo);//融资申请签署时点
			map.put("financeId", fId);
			map.put("isSigned", 1);//已签署
			
			
			List<Map<String, Object>> resultList = financeConlist(map);
			
			return new ResultBean(Constant.CODE_2000,Constant.MSG_2000,resultList);
	}
	public ResultBean financeConListBeforeAllSigned(FDDFinanceConListBAS fDDFinanceConListBAS) throws Exception {
			
			String financeId = fDDFinanceConListBAS.getFinanceId();
			String signerNo = fDDFinanceConListBAS.getSignerNo();
			String creditid = fDDFinanceConListBAS.getCreditId();
			String tokenKey = fDDFinanceConListBAS.getTokenKey();
			
			TokenBean tokenBean = TokenUtil.getBean(tokenKey, redisTemplate);
			
			if(StringUtils.isEmpty(tokenBean)) {
				return new ResultBean(Constant.CODE_1000,Constant.MSG_TOKEN_1000);
			}
			if(StringUtils.isEmpty(financeId) || StringUtils.isEmpty(signerNo)) {
				return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
			}
			
			//确认页面显示
			if(ContractConstant.IS_SAVE_NO.equals(fDDFinanceConListBAS.getIsSave())) {
				
				List<String> list =  fDDFinanceConListBAS.getSerialNums();
				
				//当合同流水号不存在 去查询所有需要签署的合同，当存在，则判断是否全部签署
				if(list==null || list.size()<1) {
					String signNo = Constant.SIGN_TIME_20;//签署时点
					
					Map<String,Object> map = new HashMap<>();
					map.put("signNo", signNo);
					map.put("signerNo", tokenBean.getOrganizeRoleNo());
					map.put("creditId", creditid);
					List<Map<String, Object>> resultList = contractUtilMapper.selectConWithoutSign(map);
					if(resultList==null || resultList.size()<1) {
						return new ResultBean(Constant.CODE_2000,"没有需要的合同");
					}
					
					return new ResultBean(Constant.CODE_2000,Constant.MSG_2000,resultList);
				}
				
				String value = "";
				label1 : for (String key : list) {
					
					if(StringUtils.isEmpty(key)) {
						continue label1;
					}
					
					value = String.valueOf(redisTemplate.opsForValue().get(ConstractTools.SN_PREFIX+key));
					
					if(!StringUtils.isEmpty(value) && "0".equals(value)) {
						return new ResultBean(Constant.CODE_1000,"",ContractConstant.IS_SAVE_RESULT_NO);
					}
					
				}
				
				return new ResultBean(Constant.CODE_2000,Constant.MSG_2000,ContractConstant.IS_SAVE_RESULT_OK);
			}else if(ContractConstant.IS_SAVE_YES.equals(fDDFinanceConListBAS.getIsSave())) {//已保存签署记录
				List<Map<String, Object>> resultList = getConListWithoutSigned(financeId, signerNo);
				if(resultList==null || resultList.size()<1) {
					return new ResultBean(Constant.CODE_2000,"签署合同不存在");
				}
				
				return new ResultBean(Constant.CODE_2000,Constant.MSG_2000,resultList);
			}else {
				return new ResultBean(Constant.CODE_1000,"请传入正确isSave字段值且不能为空");
			}
			
	}

	private List<Map<String, Object>> getConListWithoutSigned(String financeId, String signerNo) throws Exception {
		long fId = Long.parseLong(financeId);
		String signNo = Constant.SIGN_TIME_20;
		
		Map<String,Object> map = new HashMap<>();
		map.put("signNo", signNo);//融资申请签署时点
		map.put("financeId", fId);//融资单主键id
		map.put("signerNo", signerNo);//签署方
		
		List<Map<String, Object>> resultList = financeConlist(map);
		return resultList;
	}

	private List<Map<String, Object>> creditConlist(Map<String,Object> map) throws Exception{
		//获取当前授信合同所有记录
		List<Map<String, Object>> listMap = contractUtilMapper.selectForSignCredit(map);
		
		return listMap;
	}
	private List<Map<String, Object>> financeConlist(Map<String,Object> map) throws Exception{
		//获取当前授信合同所有记录
		List<Map<String, Object>> listMap = contractUtilMapper.selectForSignFianceCon(map);
		
		return listMap;
	}
	/*
	 * 授信--合同查询
	 * @param stringValue
	 * @return
	 */
	public ResultBean selectCreditOption(JSONObject obj) throws Exception{
		
//		if(StringUtils.isEmpty(obj) || !obj.containsKey("token") || StringUtils.isEmpty(obj.getString("token"))) {
//			return new ResultBean(Constant.CODE_1000, Constant.MSG_TOKEN_1001);
//		}
		
//		String token = CommonUtil.getFromJSONObject(obj, "token").toString();
//		TokenBean tokenBean = TokenUtil.getBean(token, redisTemplate);
//		
//		if(StringUtils.isEmpty(tokenBean)) {
//			return new ResultBean(Constant.CODE_ERROR_OUTOFTIME, Constant.MSG_ERROR_OUTOFTIME);
//		}
		
		String creditId = CommonUtil.getFromJSONObject(obj, "creditId").toString();//授信id
		
//		ContractCreditExample contractCreditExample = new ContractCreditExample();
//		contractCreditExample.createCriteria().andCreditIdEqualTo(Long.parseLong(creditId));
//		contractCreditExample.setOrderByClause("SIGNER_NO ASC,ORDER_NO ASC");
		
		Map<String,Object> map = new HashMap<>();
		map.put("creditId", Long.parseLong(creditId));
		
		List<ConstractInCreditEntity> contractCreditList = contractUtilMapper.ContractCredit(map);
		
		if(StringUtils.isEmpty(contractCreditList) || contractCreditList.size()<1){
			return new ResultBean("2020","当前授信id在数据库中不存在");
		}
		
		Map<String,List<ConstractInCreditEntity>> resultMap = contractCreditList.stream()
				.collect(Collectors.groupingBy(
						ConstractInCreditEntity::getCreditId));
		
		List<ConstractInCreditEntity> list1 = resultMap.get(creditId);
		
		List<String> signerRoleList = list1.stream().filter(x->{return !StringUtils.isEmpty(x);})
				.map(x->{ return x.getRoleId()+","+x.getSignerId();}).distinct().collect(Collectors.toList());
		
		List<Map<String,Object>> finalList = new ArrayList<>();
//		Map<String,Object> result1 = null;
		
		//取企业和个人 的 id和name 对应的值
		logger.info("请求customer项目 开始--参数：：空");
		String stringValue = HttpClientUtil.post(URLConst.URL_CUSTOMER+"/0002", "");
		logger.info("请求customer项目结束，返回值："+stringValue);
		Map<String,Object> stringMap = JSON.parseObject(stringValue, HashMap.class);
		
		for (String signerRole : signerRoleList) {
			String role = signerRole.split(",")[0];
			String signerId = signerRole.split(",")[1];
			
			Map<String,Object> result1 = new HashMap<>();
			List<Map<String,Object>> ok = list1.stream().filter(x->signerId.equals(x.getSignerId()))
			.map(re->{
				Map<String,Object> m = new HashMap<>();
				m.put("tctId", StringUtils.isEmpty(re.getTctId())?"":re.getTctId());
				m.put("contractNamne", StringUtils.isEmpty(re.getContractName())?"":re.getContractName());
				m.put("fileId",StringUtils.isEmpty(re.getFileId())?"":re.getFileId());
				m.put("fileName", StringUtils.isEmpty(re.getFileName())?"":re.getFileName());
				m.put("signNo", StringUtils.isEmpty(re.getSignNo())?"":re.getSignNo());
				m.put("order", StringUtils.isEmpty(re.getOrder())?"":re.getOrder());
				m.put("id", StringUtils.isEmpty(re.getId())?"":re.getId());
				
				result1.put("roleName", re.getRoleName());
				result1.put("userName", re.getUserName());
				result1.put("type", re.getType());
				result1.put("signerId", re.getSignerId());
				result1.put("signerName", stringMap.get(re.getSignerId()));
				return m;
			}).collect(Collectors.toList());
			
			result1.put("roleId", role);
			result1.put("contract", ok);
			finalList.add(result1);
		}
		
		Map<String,Object> finalMap = new HashMap<>();
		finalMap.put("creditId", creditId);
		finalMap.put("data", finalList);
		
		return new ResultBean(Constant.CODE_2000,Constant.MSG_2000,finalMap);
		
		
		
		
//		List<Long> fIds = contractCreditList.stream().map(x->x.getFileId()).map(Long::parseLong).collect(Collectors.toList());
		
		//取文件id（名）
//		FileExample fileExample = new FileExample();
//		fileExample.createCriteria().andIdIn(fIds);
////		dddd
//		List<File> listFile = fileMapper.selectByExample(fileExample);
//		
//		List<Map<String,Object>> listFie =  listFile.stream().map(x->{
//			Map<String,Object> map = new HashMap<>();
//			map.put("fileId", x.getId());
//			map.put("fileRealId", x.getFileId());
//			map.put("viewUrl", IpFactory.downUrl+x.getFileId());
//			map.put("downUrl", IpFactory.viewUrl+x.getFileId());
//			return map;
//		}).collect(Collectors.toList());
	}
	
	/*
	 *  保存授信合同配置，最外层
	 * @param reultValue
	 * @return
	 */
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public ResultBean saveCreditOption(JSONObject obj) throws Exception{
		
		logger.info("enter into saveCreditOption() 授信合同配置页面保存方法");
		
		String token = String.valueOf(CommonUtil.getFromJSONObject(obj, "token"));
		TokenBean tb = TokenUtil.getBean(token, redisTemplate);
		
		if(StringUtils.isEmpty(tb)) {
			logger.warn("方法入参为空");
			return new ResultBean(Constant.CODE_ERROR_OUTOFTIME, Constant.MSG_ERROR_OUTOFTIME);
		}
		
		String creditId = String.valueOf(CommonUtil.getFromJSONObject(obj, "creditId"));//授信id
		
		if(!obj.containsKey("data") || StringUtils.isEmpty(obj)) {
			logger.warn("主要数据体不存在");
			return new ResultBean(Constant.CODE_1000, Constant.MSG_1000);
		}
		
		//contractCreditMapper.selectByPrimaryKey(Long.parseLong(creditId));
		
//		JSONArray arrayOne = obj.getJSONArray("data");
		List<Map<String,Object>> dataList = JSON.parseObject(JSON.toJSONString(obj.get("data")), ArrayList.class);
		logger.info("解析并装配主要数据体开始....");
		//整合所有数据
		List<Map<String,Object>> list = new ArrayList<>();
		dataList.stream().forEach(x->list.addAll(mediateSigner(creditId,JSONObject.parseObject(x.toString()))));
		
		String currentTime = Timer.getDateTimeNow(Timer.Role2);
		String crrentSigner = tb.getUserId();
		
		//新增
		List<Map<String,Object>> add_list = new ArrayList<>();
				
		list.stream().filter(x->{
			return (x!=null && x.size()>0);
		}).filter(x->{
			return (!x.containsKey("id") || StringUtils.isEmpty(x.get("id"))); 
		}).forEach(x->{
			Map<String,Object> childMap = new HashMap<>();
			childMap.putAll(x);
			childMap.put("id", CreateID.createId());
			childMap.put("creUserId", crrentSigner);
			childMap.put("gmtModified", currentTime);
			childMap.put("modUserId", crrentSigner);
			childMap.put("gmtCreate", currentTime);
			childMap.put("creditId", creditId);
			add_list.add(childMap);
		});
		
		//更新
		List<Map<String,Object>> update_list = new ArrayList<>();
		
		List<Long> delete_list_id = new ArrayList<>();
		
		//查询所有的关于当前授信的数据 
		ContractCreditExample contractCreditExample = new ContractCreditExample();
		contractCreditExample.createCriteria().andCreditIdEqualTo(Long.parseLong(creditId));//.andPlaceholderNoEqualTo(Constant.SIGN_TIME_10);
		List<ContractCredit> contractCreditList  = contractCreditMapper.selectByExample(contractCreditExample);
		
		List<Long> idList = new ArrayList<>();
		//取当前存在的所有id
		if(contractCreditList!=null && contractCreditList.size()>0) {
			contractCreditList.stream().forEach(x->idList.add(x.getId()));
		}
		
		
		list.stream().filter(x->{
			return (x!=null && x.size()>0);
		}).filter(x->{
			return (x.containsKey("id") && !StringUtils.isEmpty(x.get("id"))); 
		}).forEach(x->{
			Long id = Long.parseLong(x.get("id").toString());
			
			idList.remove(id);
			
			Map<String,Object> childMap = new HashMap<>();
			childMap.putAll(x);
			childMap.put("modUserId", Long.parseLong(crrentSigner));
			childMap.put("gmtCreate", currentTime);
			update_list.add(childMap);
		});
		
		//如果都为空，则立刻返回
		if((add_list==null || add_list.size()<1) && (update_list==null || update_list.size()<1) && (idList==null || idList.size()<1)) {
			return new ResultBean("3030", "没有任何合同需要更改");
		}
		
		logger.info("解析并装配主要数据体结束....删除List数据主要长度："+idList.size());
		if(!StringUtils.isEmpty(idList) && idList.size()>0) {
			logger.info("存在删除数据");
			ContractCreditExample contractCE = new ContractCreditExample();
			contractCE.createCriteria().andIdIn(idList);
			
			int creditInt = contractCreditMapper.deleteByExample(contractCE);
			logger.info("删除结束，操作条数："+creditInt);
		}
		
		logger.info("解析并装配主要数据体结束....新增List数据主要长度："+add_list.size());
		if(!StringUtils.isEmpty(add_list) && add_list.size()>0) {
			logger.info("存在新增数据");
			int creditInt = contractUtilMapper.insertBatchDataCredit(add_list);
			logger.info("新增结束，操作条数："+creditInt);
		}
		
		logger.info("解析并装配主要数据体结束....更新List数据主要长度："+update_list.size());
		if(!StringUtils.isEmpty(update_list) && update_list.size()>0) {
			logger.info("存在更新数据");
			for (Map<String, Object> map : update_list) {
				ContractCredit contractCredit = new ContractCredit();
				contractCredit.setId(Long.parseLong(map.get("id").toString()));
				contractCredit.setFileId(map.get("fileId").toString());
				contractCredit.setGmtModified(currentTime);
				contractCredit.setModUserId(Long.parseLong(tb.getUserId()));
				contractCredit.setOrderNo(Integer.parseInt(map.get("orderNo").toString()));
				contractCredit.setSignerId(Long.parseLong(map.get("signerId").toString()));
				contractCredit.setSignerNo(map.get("signerNo").toString());
				contractCredit.setTctId(Long.parseLong(map.get("tctId").toString()));
				int rs = contractCreditMapper.updateByPrimaryKeySelective(contractCredit);
				logger.info("更新结束，操作条数："+rs);
			}
		}
		
		//分别保存两张表  用filter进行过滤
		//授信-贷前 签署时点  直接存入签署表中 额外操作
		List<ContractSigner> creditSignList = creditPackageSign(tb, creditId, list, currentTime);
		
		if(creditSignList!=null && creditSignList.size()>0) {
			//先删除之前所有的
			ContractSignerExample contractSignerExample = new ContractSignerExample();
			contractSignerExample.createCriteria().andCreditIdEqualTo(Long.parseLong(creditId)).andPlaceholderNoEqualTo(Constant.SIGN_TIME_10);
			
			int deleInt = contractSignerMapper.deleteByExample(contractSignerExample);
			int financeInt = contractUtilMapper.insertBatchDataFinance(creditSignList);
			logger.info("删除贷前签署合同数据结果："+deleInt);
			logger.info("插入贷前签署合同数据结果："+financeInt);
		}
		
		
		
		logger.info("授信合同配置方法结束");
		
		return new ResultBean(Constant.CODE_2000, Constant.MSG_2000);
	}

	private List<ContractSigner> creditPackageSign(TokenBean tb, String creditId, List<Map<String, Object>> list,
			String currentTime) throws Exception {
		logger.info("筛选出贷前签署时点，直接插入sign表中--开始");
		
		String contractNoKey = ConstractTools.CON_NO_IDKEYS+creditId;
		
		
		//筛选出要插入签署表的数据
		List<Map<String,Object>> creditList = list.stream().filter(x->Constant.SIGN_TIME_10.equals(StringUtil.toString(x.get("signNo")))).collect(Collectors.toList());
		
		List<String> signerIds = creditList.stream().filter(x->UserConst.user_role_type_4.equals(String.valueOf(x.get("signerNo")))).map(x->String.valueOf(x.get("signerId"))).collect(Collectors.toList());
		
		//生成一套合同号编号
		Map<Object, Object> nosMap = tPNContractToolService.getOnePieceCreditNo(signerIds, contractNoKey, tb);
		
		AtomicInteger ai = new AtomicInteger(0);
		List<ContractSigner> resultList = new ArrayList<>();
		ContractTemplate contractTemplate = null;
		
		for (Map<String,Object> resultMap : creditList) {
			contractTemplate = contractTemplateMapper.selectByPrimaryKey(Long.parseLong(resultMap.get("tctId").toString()));
			
			ContractSigner contractS = new ContractSigner();
			contractS.setTctId(Long.parseLong(resultMap.get("tctId").toString()));
			contractS.setCreditId(Long.parseLong(creditId));
			contractS.setCreUserId(Long.parseLong(tb.getUserId()));
			contractS.setFileId(StringUtil.toString(resultMap.get("fileId")));
			contractS.setGmtCreate(currentTime);
			contractS.setGmtModified(currentTime);
			contractS.setId(CreateID.createId());
			contractS.setIsSigned(Constant.SIGN_NOT_0);
			contractS.setModUserId(Long.parseLong(tb.getUserId()));
			contractS.setOrderNo(Integer.parseInt(resultMap.get("orderNo").toString()));
			contractS.setPlaceholderNo(Constant.SIGN_TIME_10);
			contractS.setSerialNum(CommonUtil.createFileId());
			
			//从一套合同编号中取合编号
			String contractKey = ContractConstant.exchangeType(contractTemplate);
			
			if(ContractConstant.CONTRACT_TPN_BZ_TYPE.equals(contractTemplate.getContractType())) {
				String crrentFile = StringUtil.toString(resultMap.get("fileId"));
				Optional<String> dbUserIdO = creditList.stream().parallel().filter(x->crrentFile.equals(String.valueOf(x.get("fileId"))))
											.filter(x->UserConst.user_role_type_4.equals(String.valueOf(x.get("signerNo")))).map(x->String.valueOf(x.get("signerId"))).findFirst();
				
				contractS.setSignContractNo(StringUtil.toString((nosMap.get(contractKey+dbUserIdO.orElseGet(()->"")))));
			}else {
				contractS.setSignContractNo(String.valueOf(nosMap.get(contractKey)));
			}
			contractS.setSignContractId(creditId+resultMap.get("fileId"));
			
			contractS.setSignerId(Long.parseLong(String.valueOf(resultMap.get("signerId"))));
			contractS.setSignerNo(String.valueOf(resultMap.get("signerNo")));
			resultList.add(contractS);
		}
		
		logger.info("筛选贷前签署合同数据结束");
		return resultList;
//			if(UserConst.user_role_type_4.equals(String.valueOf(resultMap.get("signerNo")))) {
//				//这是一个约定，当为担保方的时候，合同编号的key 要在CONTRACT_XXX_TYPE_KEY基础上加 序号
//				contractS.setSignContractId(creditId+resultMap.get("signerId"));
//				String contractKey = ContractConstant.exchangeType(Long.parseLong(resultMap.get("tctId").toString()), contractTemplateMapper);
//				contractS.setSignContractNo(String.valueOf(nosMap.get(contractKey+ai.incrementAndGet())));
//			}else {
//				contractS.setSignContractId(creditId+resultMap.get("fileId"));
//				String contractKey = ContractConstant.exchangeType(Long.parseLong(resultMap.get("tctId").toString()), contractTemplateMapper);
//				contractS.setSignContractNo(String.valueOf(nosMap.get(contractKey)));
//			}
	}

	/*
	 * 保存授信合同配置，签署方粒度
	 * @param creditId
	 * @param arrayOne
	 * @return
	 */
	private List<JSONObject> mediateSigner(String creditId,JSONObject arrayOne) {
//		if(!arrayOne.containsKey("contract") || StringUtils.isEmpty(arrayOne.get("contract")) 
//				|| JSONArray.parseArray(arrayOne.get("contract").toString()).size()<1) {
//			return Collections.emptyList();
//		}
		String signerNo = arrayOne.getString("roleId");//签署方序号
		String signerId = arrayOne.getString("signerId");//签署方id
//		String type = arrayOne.getString("type");//签署方类型 02-个人  01-企业
		
		JSONArray arrayTwo = JSONArray.parseArray(String.valueOf(arrayOne.get("contract"))) ;//两个签署时点的所有合同
		List<JSONObject> list = new ArrayList<>();
		if(StringUtils.isEmpty(arrayTwo) || arrayTwo.size()<1){
			JSONObject map = new JSONObject();
			map.put("signerNo", signerNo);
			map.put("signerId", signerId);
//			map.put("type", type);
			list.add(map);
			return list;
		}
		arrayTwo.stream().forEach(x->list.addAll(mediateCons(creditId, signerNo, signerId, JSON.parseObject(x.toString(), JSONObject.class))));//type, 
		return list;
	}

	/*
	 * 保存授信合同配置，合同粒度
	 * @param creditId
	 * @param signerNo 签署方序号
	 * @param singerId 签署方id
	 * @param signerType 签署方类型 02-个人  01-企业
	 * @param parseObject 两个签署时点的所有合同
	 * @return
	 */
	private List<JSONObject> mediateCons(String creditId, String signerNo, String singerId,// String signerType,
			JSONObject obj) {
		
		List<JSONObject> list = new ArrayList<>();
//			Map<String,Object> map = new HashMap<>();
//			JSONObject obj = JSONObject.parseObject(x.toString());
//			map.putAll(obj);
			obj.put("tctId", CommonUtil.getFromJSONObject(obj, "tctId").toString());
			obj.put("orderNo", obj.getString("order"));
			obj.put("signerNo", signerNo);
			obj.put("signerId", singerId);
//			obj.put("type", signerType);
			list.add(obj);
//		}).collect(Collectors.toCollection(ArrayList::new));
		return list;
	}

	public ResultBean creditDetail(JSONObject obj) throws Exception {
		
		logger.info("查询待办贷前详情页面，包含授信信息和合同信息..开始");
		
		String token = CommonUtil.getFromJSONObject(obj, "token").toString();
		
		TokenBean tokenBean = TokenUtil.getBean(token, redisTemplate);
		
		if(StringUtils.isEmpty(tokenBean)) {
			logger.warn("token值存在，但是取不到value,直接返回状态1000");
			return new ResultBean(Constant.CODE_1000,"token值存在，但是取不到value");
		}
		
		String creditId = CommonUtil.getFromJSONObject(obj, "creditId").toString();
		logger.info("当前授信id，creditId："+creditId);
		Long cId = Long.parseLong(creditId);
		
		String signNo = Constant.SIGN_TIME_10;
		
		Map<String,Object> map = new HashMap<>();
		map.put("creditId", cId);
		map.put("signNo", signNo);
		
		//平台可以看到所有
		if(!UserConst.user_role_type_6.equals(tokenBean.getOrganizeRoleNo())) {
			map.put("signerNo", tokenBean.getOrganizeRoleNo());
			map.put("signerId", tokenBean.getOrganizeId());
		}
		
		List<Map<String, Object>> resultList = creditConlist(map);
		
		logger.info("查询合同信息返回的结果集为：resultList："+resultList);
		
		JSONArray json = packWithoutSignCon(tokenBean, resultList);
		
		logger.info("查询待办贷前详情页面，包含授信信息和合同信息..正常结束");
		return new ResultBean(Constant.CODE_2000,Constant.MSG_2000,json);
	}
	public ResultBean financeDetail(JSONObject obj) throws Exception {
		
		logger.info("开始查询待办融资详情页面，包含融资单信息和合同信息..开始");
		
		String token = CommonUtil.getFromJSONObject(obj, "token").toString();
		
		TokenBean tokenBean = TokenUtil.getBean(token, redisTemplate);
		
		if(StringUtils.isEmpty(tokenBean)) {
			logger.warn("token值存在，但是取不到value,直接返回状态1000");
			return new ResultBean(Constant.CODE_1000,"token值存在，但是取不到value");
		}
		
		String financeId = CommonUtil.getFromJSONObject(obj, "financeId").toString();
		logger.info("当前融资单id，financeId："+financeId);
		Long fId = Long.parseLong(financeId);
		
		String signNo = Constant.SIGN_TIME_20;
		
		Map<String,Object> map = new HashMap<>();
		map.put("financeId", fId);
		//平台可以看到所有
		if(!UserConst.user_role_type_6.equals(tokenBean.getOrganizeRoleNo())) {
			map.put("signerNo", tokenBean.getOrganizeRoleNo());
			map.put("signerId", tokenBean.getOrganizeId());
		}
		
		List<Map<String, Object>> resultList = financeConlist(map);
		
		logger.info("查询合同信息返回的结果集为：resultList："+resultList);
		
		JSONArray json = packWithoutSignCon(tokenBean, resultList);
		
		logger.info("查询待办融资详情页面，包含融资单信息和合同信息..正常结束");
		return new ResultBean(Constant.CODE_2000,Constant.MSG_2000,json);
	}
	
	private String  getCustomerName(Long userId) throws IOException {
		logger.info("根据用户id获取用户名开始userId："+userId);
		String name = HttpClientUtil.post(URLConst.URL_CUSTOMER + "/0001/" + userId, "");
		logger.info("根据用户id获取用户名结束：name："+name);
		return name;
	}
	
	private JSONArray packWithoutSignCon(TokenBean tokenBean, List<Map<String, Object>> resultList) throws Exception {
		//取到最后合同相关信 当前融资id所有的签署方
		List<Map<String, Object>> contractList = resultList.stream().map(x->{
			if(tokenBean.getOrganizeRoleNo().equals(StringUtil.toString(x.get("signerNo"))) 
					&& tokenBean.getOrganizeId().equals(StringUtil.toString(x.get("signerId")))) {
				x.put("isCurrenter", "yes");
			}
			return x;
		}).collect(Collectors.toList());
		
		
//		JSONObject resultObject = new JSONObject();
		JSONArray json = new JSONArray();
		
		JSONObject resultParam = new JSONObject();
		
		// 借款方
		List<Map<String,Object>> capitalList = contractList.stream().filter(x->UserConst.user_role_type_3.equals(x.get("signerNo"))).collect(Collectors.toList());
		resultParam.put("list", capitalList);
		resultParam.put("signerNo", UserConst.user_role_type_3_name);
		if(capitalList!=null && capitalList.size()>0) {
			resultParam.put("signerId", capitalList.get(0).get("signerId"));
			resultParam.put("signerName", getCustomerName(Long.parseLong(StringUtil.toString(capitalList.get(0).get("signerId")))));
		}
//		resultObject.put("capital", resultParam);
		json.add(resultParam);
		
		resultParam = new JSONObject();
		// 核心企业
		List<Map<String,Object>> companyList = contractList.stream().filter(x->UserConst.user_role_type_1.equals(x.get("signerNo"))).collect(Collectors.toList());
		resultParam.put("list", companyList);
		resultParam.put("signerNo", UserConst.user_role_type_1_name);
		if(companyList!=null && companyList.size()>0) {
			resultParam.put("signerId", companyList.get(0).get("signerId"));
			resultParam.put("signerName", getCustomerName(Long.parseLong(StringUtil.toString(companyList.get(0).get("signerId")))));
		}
		json.add(resultParam);
//		resultObject.put("company", resultParam);
		
		resultParam = new JSONObject();
		// 出借方
		List<Map<String,Object>> agencyList = contractList.stream().filter(x->UserConst.user_role_type_2.equals(x.get("signerNo"))).collect(Collectors.toList());
		resultParam.put("list", agencyList);
		resultParam.put("signerNo", UserConst.user_role_type_2_name);
		if(agencyList!=null && agencyList.size()>0) {
			resultParam.put("signerId", agencyList.get(0).get("signerId"));
			resultParam.put("signerName", getCustomerName(Long.parseLong(StringUtil.toString(agencyList.get(0).get("signerId")))));
		}
//		resultObject.put("agency", resultParam);
		json.add(resultParam);
		
		// 担保方
		Map<String, List<Map<String, Object>>> promiseList1 = contractList.stream()
											.filter(x->UserConst.user_role_type_4.equals(x.get("signerNo")))
											.collect(Collectors.groupingBy(x->StringUtil.toString(x.get("signerId"))));
		
		Iterator<Entry<String, List<Map<String, Object>>>> prPro = promiseList1.entrySet().iterator();
		
		while(prPro.hasNext()) {
			
			resultParam = new JSONObject();
			
			Entry<String, List<Map<String, Object>>> entry = prPro.next();
			List<Map<String, Object>> value = entry.getValue();
			
			String signerId = entry.getKey();
			String signerName = StringUtil.toString(value.get(0).get("signerName"));
			resultParam.put("signerId", signerId);
			resultParam.put("signerName", getCustomerName(Long.parseLong(signerId)));
			resultParam.put("signerNo", UserConst.user_role_type_4_name);
			resultParam.put("list", value);
			
			json.add(resultParam);
		}
		
		
		// 担保方
		Map<String, List<Map<String, Object>>> togetherList1 = contractList.stream()
											.filter(x->UserConst.user_role_type_5.equals(x.get("signerNo")))
											.collect(Collectors.groupingBy(x->StringUtil.toString(x.get("signerId"))));
		
		Iterator<Entry<String, List<Map<String, Object>>>> toPro = togetherList1.entrySet().iterator();
		
		while(toPro.hasNext()) {
			
			resultParam = new JSONObject();
			
			Entry<String, List<Map<String, Object>>> entry = toPro.next();
			List<Map<String, Object>> value = entry.getValue();
			
			String signerId = entry.getKey();
			String signerName = StringUtil.toString(value.get(0).get("signerName"));
			resultParam.put("signerId", signerId);
			resultParam.put("signerName", getCustomerName(Long.parseLong(signerId)));
			resultParam.put("signerNo", UserConst.user_role_type_5_name);
			resultParam.put("list", value);
			
			json.add(resultParam);
		}
		
		resultParam = new JSONObject();
		
		// 平台
		List<Map<String,Object>> scfList = contractList.stream().filter(x->UserConst.user_role_type_6.equals(x.get("signerNo"))).collect(Collectors.toList());
		resultParam.put("list", scfList);
		resultParam.put("signerNo", UserConst.user_role_type_6_name);
		if(scfList!=null && scfList.size()>0) {
			resultParam.put("signerId", scfList.get(0).get("signerId"));
			resultParam.put("signerName", getCustomerName(Long.parseLong(StringUtil.toString(scfList.get(0).get("signerId")))));
		}
//		resultObject.put("scf", resultParam);
		json.add(resultParam);
		return json;
	}

}
