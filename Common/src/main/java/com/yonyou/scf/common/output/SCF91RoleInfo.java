package com.yonyou.scf.common.output;

public class SCF91RoleInfo {
	/** ID */
	private Long roleId;
	/** 名称 */
	private String roleName;
	/** 选中状态 */
	private Boolean check;

	/**
	 * @return the roleId
	 */
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId
	 *            the roleId to set
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName
	 *            the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @return the check
	 */
	public Boolean getCheck() {
		return check;
	}

	/**
	 * @param check
	 *            the check to set
	 */
	public void setCheck(Boolean check) {
		this.check = check;
	}

}
