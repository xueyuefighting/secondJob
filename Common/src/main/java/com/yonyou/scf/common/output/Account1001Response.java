package com.yonyou.scf.common.output;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Account1001Response implements Serializable   {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message = "会员账号不能为空")
	private String memNum;
	@NotNull(message = "账户号码不能为空")
	private String accountCode;
	@NotNull(message = "资方ID不能为空")
	private Long capitalId;
	
	@NotNull(message = "业务角色类型不能为空")
	private String organizeRoleNo;
	
	@NotNull(message = "账户余额不能为空")
	private Double balane;
	@NotNull(message = "账户可用余额不能为空")
	private Double usebalane;
	@NotNull(message = "冻结金额不能为空")
	private Double frozenBalance;

	private String capitalNo;
	
	public String getMemNum() {
		return memNum;
	}

	public void setMemNum(String memNum) {
		this.memNum = memNum;
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public Long getCapitalId() {
		return capitalId;
	}

	public void setCapitalId(Long capitalId) {
		this.capitalId = capitalId;
	}

	public String getOrganizeRoleNo() {
		return organizeRoleNo;
	}

	public void setOrganizeRoleNo(String organizeRoleNo) {
		this.organizeRoleNo = organizeRoleNo;
	}

	

	
	public Double getBalane() {
		return balane;
	}

	public void setBalane(Double balane) {
		this.balane = balane;
	}

	public Double getUsebalane() {
		return usebalane;
	}

	public void setUsebalane(Double usebalane) {
		this.usebalane = usebalane;
	}

	public Double getFrozenBalance() {
		return frozenBalance;
	}

	public void setFrozenBalance(Double frozenBalance) {
		this.frozenBalance = frozenBalance;
	}

	public String getCapitalNo() {
		return capitalNo;
	}

	public void setCapitalNo(String capitalNo) {
		this.capitalNo = capitalNo;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
