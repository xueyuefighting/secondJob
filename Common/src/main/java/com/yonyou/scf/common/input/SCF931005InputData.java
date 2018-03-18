package com.yonyou.scf.common.input;

public class SCF931005InputData {

	// 客户ID
	private Long userId;

	// 业务角色
	private String roleType;

	// 客户ID2
	private Long userId2;

	// 业务角色2
	private String roleType2;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public Long getUserId2() {
		return userId2;
	}

	public void setUserId2(Long userId2) {
		this.userId2 = userId2;
	}

	public String getRoleType2() {
		return roleType2;
	}

	public void setRoleType2(String roleType2) {
		this.roleType2 = roleType2;
	}
}
