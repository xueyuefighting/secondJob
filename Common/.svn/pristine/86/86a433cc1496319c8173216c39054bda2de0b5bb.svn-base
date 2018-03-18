package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;


import com.yonyou.scf.common.util.json.JsonUtil;

public class Account1001Request implements Serializable   {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message = "组织ID不能为空")
	private Long organizeId;
	@NotNull(message = "业务角色类型不能为空")
	private String organizeRoleNo;

	public Long getOrganizeId() {
		return organizeId;
	}

	public void setOrganizeId(Long organizeId) {
		this.organizeId = organizeId;
	}

	public String getOrganizeRoleNo() {
		return organizeRoleNo;
	}

	public void setOrganizeRoleNo(String organizeRoleNo) {
		this.organizeRoleNo = organizeRoleNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
