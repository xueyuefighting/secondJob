package com.yonyou.scf.user.mapper.hand;
import java.util.List;
import java.util.Map;

import com.yonyou.scf.common.entity.Authority;


/**
 * 用户信息模块持久层
 * @author 杜瑞 2017-08-30
 *
 */
public interface RoleHMapper {

	/**
	 * 角色列表获取
	 * @param params
	 * @return 角色列表
	 */
	List<Map<String, Object>> getRoleInfoList(Map<String, Object> params);
	
	/**
	 * 操作员列表获取
	 * @param params
	 * @return 操作员列表
	 */
	List<Map<String, Object>> getOpInfoList(Map<String, Object> params);
	
	/**
	 * 操作员列表获取2
	 * @param params
	 * @return 操作员列表
	 */
	List<Map<String, Object>> getAdminOpInfoList(Map<String, Object> params);
	
	/**
	 * 操作员列表获取3
	 * @param params
	 * @return 操作员列表
	 */
	List<Map<String, Object>> getAdminOpInfoList3(Map<String, Object> params);
	
	/**
	 * 菜单列表获取
	 * @param params
	 * @return 菜单列表
	 */
	List<Map<String, Object>> getMenuInfoList(Map<String, Object> params);
	
	/**
	 * 批量插入权限
	 * @param List<Authority>
	 * @return 结果
	 */
	int insertBatch(List<Authority> alist);
	
	/**
	 * 针对单个人取得所属企业 业务类型和角色 
	 * @param params
	 * @return 所属企业 业务类型和角色列表
	 */
	List<Map<String, Object>> getRoleList4Op(Map<String, Object> params);
	
	/**
	 * 用操作员ID换可用的业务角色
	 * @param params
	 * @return 可用业务角色列表
	 */
	List<Map<String, Object>> getUserRoleInfoListByOpId(Map<String, Object> params);
	
	/**
	 * 用操作员ID换可用的业务角色
	 * @param params
	 * @return 可用业务角色列表
	 */
	List<Map<String, Object>> getRoleInfoListByOpIdAndUserRole(Map<String, Object> params);
	
}