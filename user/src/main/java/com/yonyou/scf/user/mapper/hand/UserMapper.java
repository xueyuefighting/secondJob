package com.yonyou.scf.user.mapper.hand;

import java.util.List;
import java.util.Map;

/**
 * 用户信息模块持久层
 * 
 * @author 杜瑞 2017-08-30
 *
 */
public interface UserMapper {

	/**
	 * 客户名称获取
	 * 
	 * @param params
	 * @return List<Map<String, Object>>
	 */
	List<Map<String, Object>> getUserNameList(Map<String, Object> params);
	
	/**
	 * 客户名称获取
	 * 
	 * @param params
	 * @return List<Map<String, Object>>
	 */
	List<Map<String, Object>> getUserNameListDj(Map<String, Object> params);

	/**
	 * 客户名称获取2
	 * 
	 * @param params
	 * @return List<Map<String, Object>>
	 */
	List<Map<String, Object>> getUserNameListByRole(Map<String, Object> params);

	/**
	 * 证件号码获取
	 * 
	 * @param params
	 * @return credentialnum/userid
	 */
	List<Map<String, Object>> getCredentialNumList(Map<String, Object> params);

	/**
	 * 客户信息检索
	 * 
	 * @param params
	 * @return List<Map<String, Object>>
	 */
	List<Map<String, Object>> getUserInfoList(Map<String, Object> params);

	/**
	 * 客户关系检索
	 * 
	 * @param params
	 * @return List<Map<String, Object>>
	 */
	List<Map<String, Object>> getUserRelationshipList(Map<String, Object> params);

	/**
	 * 通过某资方检索所有相关方
	 * 
	 * @param params
	 * @return List<Map<String, Object>>
	 */
	List<Map<String, Object>> getRelationshipList2(Map<String, Object> params);

}