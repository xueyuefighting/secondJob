package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Account1005Request implements Serializable   {

	
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
	@NotNull(message = "账户名称不能为空")
	private String accountName;
	
	@NotNull(message = "提现金额不能为空")
	private Double outAmount;
	@NotNull(message = "手续费不能为空")
	private Double fee;
	@NotNull(message = "资方ID不能为空")
	private Long capitalId;
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

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Double getOutAmount() {
		return outAmount;
	}

	public void setOutAmount(Double outAmount) {
		this.outAmount = outAmount;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public Long getCapitalId() {
		return capitalId;
	}

	public void setCapitalId(Long capitalId) {
		this.capitalId = capitalId;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
