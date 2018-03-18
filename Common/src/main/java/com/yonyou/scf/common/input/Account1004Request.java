package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Account1004Request implements Serializable   {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message = "会员账号不能为空")
	@Length(max = 12, message = "会员账号不超过12位")
	private String memNum;
	@NotNull(message = "账户账号不能为空")
	@Length(max = 32, message = "会员账号不超过32位")
	private String accNum;
	
	@NotNull(message = "查询金额不能为空")
	private Double amount;
	@NotNull(message = "会员ID不能为空")
	private Long memId;
	@NotNull(message = "业务类型ID不能为空")
	private Long roleId;
	@NotNull(message = "核心企业ID不能为空")
	private Long companyId;
	
	public Long getMemId() {
		return memId;
	}

	public void setMemId(Long memId) {
		this.memId = memId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getMemNum() {
		return memNum;
	}

	public void setMemNum(String memNum) {
		this.memNum = memNum;
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
