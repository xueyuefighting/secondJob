package com.yonyou.scf.common.input;

import org.hibernate.validator.constraints.NotBlank;

public class SCF931002Input {
	
	//客户名称
	private String companyName;
	
	//证件号码
	private String credentialNum;
	
	//客户类型
	private String userType;
	
	//业务角色
	private String roleType;
	


	public String getCredentialNum() {
		return credentialNum;
	}

	public void setCredentialNum(String credentialNum) {
		this.credentialNum = credentialNum;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
