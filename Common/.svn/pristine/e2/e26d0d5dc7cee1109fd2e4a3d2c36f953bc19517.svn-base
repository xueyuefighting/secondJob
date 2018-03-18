package com.yonyou.scf.common.input;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yonyou.scf.common.entity.Role;

public class SCF951006Input {
	// 操作员ID
	private Long id;
	// 操作员名称
	@NotBlank(message="操作员名称不能为空")
    @Length(max=50,message="操作员名称超长")
	private String operatorName;
	// 所属企业
    @NotNull(message="所属企业不能为空")
	private Long userId;
	// 业务角色
    @NotBlank(message="业务角色不能为空")
	private String userRole;
	// 角色
    //@NotEmpty(message="角色不能为空")
	private List<Role> roleList;
	// 手机号
    @NotBlank(message="手机号不能为空")
	private String phone;
	// 邮箱
    @NotBlank(message="邮箱不能为空")
	private String email;
	// 证件类型
	private String credentialType;
	// 证件号码
	private String credentialNum;
	// 登陆者ID
	private Long operatorId;
	// 登陆者token
	private String token;
	// 贷后管家账号
	private String account;

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

}
