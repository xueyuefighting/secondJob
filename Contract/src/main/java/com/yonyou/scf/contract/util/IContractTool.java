package com.yonyou.scf.contract.util;

import java.util.List;
import java.util.Map;

import com.yonyou.scf.common.gateway.entity.TokenBean;
import com.yonyou.scf.common.mapper.auto.ContractAttributeMapper;
import com.yonyou.scf.common.mapper.auto.ContractNoMapper;

public interface IContractTool {
	
	/*
	 * 获取贷前一套合同号
	 * @param tokenBean
	 * @param contractAttributeMapper
	 * @param contractNoMapper
	 * @return
	 * @throws Exception
	 */
	public Map<Object,Object> getOnePieceCreditNo(List<String> signerIds,String redisKey,  TokenBean tokenBean) throws Exception;
	/*
	 * 获取贷前一套合同号
	 * @param tokenBean
	 * @param contractAttributeMapper
	 * @param contractNoMapper
	 * @return
	 * @throws Exception
	 */
	public Map<Object,Object> getOnePieceFinanceNo(String redisKey,  TokenBean tokenBean) throws Exception;
	/*
	 * 获取整套模版的编号
	 * @param tokenBean
	 * @param contractAttributeMapper
	 * @param contractNoMapper
	 * @return 
	 * @throws Exception
	 */
	public Map<Object,Object> getOnePieceNo_cre(List<String> signerIds, TokenBean tokenBean) throws Exception;
	/*
	 * 获取整套模版的编号
	 * @param tokenBean
	 * @param contractAttributeMapper
	 * @param contractNoMapper
	 * @return 
	 * @throws Exception
	 */
	public Map<Object,Object> getOnePieceNo_fin(TokenBean tokenBean) throws Exception;
	
	/*
	 * 根据合同专属号 或许当前合同编号
	 * 
	 * 获取到合同编号的规则后 进行替换
	 * 
	 * @param contractType 合同专属号
	 * @param bean 当前登录人的token
	 * @param mapper  ContractAttributeMapper存放专属号的表
	 * @param contractNoMapper contractNoMapper 流水
	 * @return
	 * @throws Exception
	 */
	public String getContractNoByRule(String contractType,TokenBean bean)throws Exception;
	
}
