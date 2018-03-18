package com.yonyou.scf.contract.util;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.yonyou.scf.common.constant.ContractConstant;
import com.yonyou.scf.common.entity.ContractAttribute;
import com.yonyou.scf.common.entity.ContractAttributeExample;
import com.yonyou.scf.common.gateway.entity.TokenBean;
import com.yonyou.scf.common.mapper.auto.ContractAttributeMapper;
import com.yonyou.scf.common.mapper.auto.ContractNoMapper;

/**
 * 获取太平鸟 合同编号
 * @author zhangjlm
 *
 */
@Service
public class TPNContractToolService implements IContractTool {

	private Logger logger = LoggerFactory.getLogger(TPNContractToolService.class);
	
	@Autowired
	private ContractAttributeMapper contractAttributeMapper;
	@Autowired
	private ContractNoMapper contractNoMapper;
	@Autowired
	private RedisTemplate<Object,Object> redisTemplate;
	
	@Override
	public Map<Object, Object> getOnePieceCreditNo(List<String> signerIds,String redisKey, TokenBean tokenBean) throws Exception {
		Map<Object, Object> entriesMap = null;
		logger.info("去redis中取当前融资申请所有合同模版的一套编号，redis中的key："+redisKey);
		
		logger.info("确认redis中是否存在这套编号");
		if(!redisTemplate.hasKey(redisKey)) {
			logger.info("确认结果key不存在，新获取..");
			entriesMap = getOnePieceNo_cre(signerIds,tokenBean);
			redisTemplate.opsForHash().putAll(redisKey, entriesMap);
		}else {
			logger.info("确认结果key存在，继续确认是否可以取到值");
			entriesMap = redisTemplate.opsForHash().entries(redisKey);
			if(entriesMap!=null) {
				logger.info("确认结果key："+redisKey+"的一套编号存在");
				return entriesMap;
			}else {
				logger.info("确认结果key存在，但没有值，新获取..");
				entriesMap = getOnePieceNo_cre(signerIds, tokenBean);
				redisTemplate.opsForHash().putAll(redisKey, entriesMap);
			}
		}
		return entriesMap;
	}
	

	@Override
	public Map<Object, Object> getOnePieceFinanceNo(String redisKey, TokenBean tokenBean)
			throws Exception {
		Map<Object, Object> entriesMap = null;
		logger.info("去redis中取当前融资申请所有合同模版的一套编号，redis中的key："+redisKey);
		
		logger.info("确认redis中是否存在这套编号");
		if(!redisTemplate.hasKey(redisKey)) {
			logger.info("确认结果key不存在，新获取..");
			entriesMap = getOnePieceNo_fin(tokenBean);
			redisTemplate.opsForHash().putAll(redisKey, entriesMap);
		}else {
			logger.info("确认结果key存在，继续确认是否可以取到值");
			entriesMap = redisTemplate.opsForHash().entries(redisKey);
			if(entriesMap!=null) {
				logger.info("确认结果key："+redisKey+"的一套编号存在");
				return entriesMap;
			}else {
				logger.info("确认结果key存在，但没有值，新获取..");
				entriesMap = getOnePieceNo_fin(tokenBean);
				redisTemplate.opsForHash().putAll(redisKey, entriesMap);
			}
		}
		return entriesMap;
	}

	@Override
	public Map<Object, Object> getOnePieceNo_cre(List<String> signerIds, TokenBean tokenBean) throws Exception {

		Map<Object,Object> map = new HashMap<>();
		
		String bzContractNo = getContractNoByRule(ContractConstant.CONTRACT_TPN_BZ_TYPE,tokenBean);
		
		map.put(ContractConstant.CONTRACT_TPN_JK_TYPE_KEY, bzContractNo);
		
		int i = 0;//担保方个数/序号
		DecimalFormat df = new DecimalFormat("000");
		for (String signerId : signerIds) {
			i+=1;
			map.put(ContractConstant.CONTRACT_TPN_BZ_TYPE_KEY+signerId, bzContractNo+"-"+df.format(i));
		}
		
		return map;
	}

	@Override
	public String getContractNoByRule(String contractType, TokenBean bean) throws Exception {
		ContractAttributeExample contractAttributeExample = new ContractAttributeExample();
		contractAttributeExample.createCriteria().andContractTypeEqualTo(contractType);//.andSignerNoEqualTo(Integer.parseInt(bean.getOrganizeRoleNo()));
		List<ContractAttribute> contractAttributeList = contractAttributeMapper.selectByExample(contractAttributeExample);
		if(contractAttributeList==null || contractAttributeList.size()<1) {
			logger.info("..............当前合同没有编号");
			return "";
		}
		
		ContractAttribute ContractAttribute = contractAttributeList.get(0);
		
		String rule = ContractAttribute.getContractGenerateRule();
		String limitStr = ContractAttribute.getRepalceWord();
		
		String limitDate = CommonUtil.formatRuleByTime(limitStr);
		rule = CommonUtil.formatRuleByTime(rule);
		
		//获取当前流水号
		String conGeneratNo = ConstractTools.getConGeneratNo(contractType,bean,limitDate,contractNoMapper);
		return rule+conGeneratNo;
	}

	@Override
	public Map<Object, Object> getOnePieceNo_fin(TokenBean tokenBean) throws Exception {

		Map<Object,Object> map = new HashMap<>();
		
		map.put(ContractConstant.CONTRACT_TPN_JJ_TYPE_KEY, getContractNoByRule(ContractConstant.CONTRACT_TPN_JJ_TYPE,tokenBean));
		
		return map;
	}

}
