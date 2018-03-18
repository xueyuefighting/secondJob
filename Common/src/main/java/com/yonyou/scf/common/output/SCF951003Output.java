package com.yonyou.scf.common.output;

import java.util.List;

import com.yonyou.scf.common.entity.Role;

public class SCF951003Output {

	// 操作员ID
	private Long operatorId;
	// 操作员名称
	private String operatorName;
	// 所属企业
	private Long userId;
	// 所属企业名称
	private String userName;
	// 业务角色ID
	private String userRole;
	// 业务角色
	private String UserRoleName;
	// 角色
	private List<Role> roleList;
	//贷后管家账号
	private String account;
	// 手机号
	private String phone;
	// 邮箱
	private String email;
	// 启用状态
	private String status;
	// 证件类型
	private String credentialType;
	// 证件号码
	private String credentialNum;
	// 创建时间
	private String createTime;

	public Long getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCredentialType() {
		return credentialType;
	}

	public void setCredentialType(String credentialType) {
		this.credentialType = credentialType;
	}

	public String getCredentialNum() {
		return credentialNum;
	}

	public void setCredentialNum(String credentialNum) {
		this.credentialNum = credentialNum;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the userRoleName
	 */
	public String getUserRoleName() {
		return UserRoleName;
	}

	/**
	 * @param userRoleName the userRoleName to set
	 */
	public void setUserRoleName(String userRoleName) {
		UserRoleName = userRoleName;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
}
