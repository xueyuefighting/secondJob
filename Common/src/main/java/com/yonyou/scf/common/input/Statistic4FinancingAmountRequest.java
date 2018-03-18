package com.yonyou.scf.common.input;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

public class Statistic4FinancingAmountRequest implements Serializable {

	private static final long serialVersionUID = -7862377089981747424L;

	/**
	 * 组织id（所属方主键id），对应于TokenBean的organizeId，为当前登录操作员的所属企业/个人ID
	 */
	@NotBlank(message = "组织id（所属方主键id）不能为空")
	private String organizeId;
	/**
	 * 客户类型 01-企业  02-个人，对应于TokenBean的userType，参考UserConst.fdd_person等
	 */
	@NotBlank(message = "客户类型不能为空")
	private String userType;
	/**
	 * 组织角色序号（当前所属方角色序号），对应于TokenBean的organizeRoleNo，参考UserConst.user_role_type_1等
	 */
	@NotBlank(message = "组织角色序号（当前所属方角色序号）不能为空")
	private String organizeRoleNo;

	@Override
	public String toString() {
		return "Statistic4FinancingAmountRequest [organizeId=" + organizeId + ", userType=" + userType + ", organizeRoleNo=" + organizeRoleNo + "]";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getOrganizeId() {
		return organizeId;
	}

	public void setOrganizeId(String organizeId) {
		this.organizeId = organizeId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getOrganizeRoleNo() {
		return organizeRoleNo;
	}

	public void setOrganizeRoleNo(String organizeRoleNo) {
		this.organizeRoleNo = organizeRoleNo;
	}

}
