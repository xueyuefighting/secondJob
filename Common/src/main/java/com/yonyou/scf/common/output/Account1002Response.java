package com.yonyou.scf.common.output;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Account1002Response implements Serializable   {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull(message = "账户余额不能为空")
	private Double balane;
	@NotNull(message = "账户可用余额不能为空")
	private Double usebalane;
	@NotNull(message = "冻结金额不能为空")
	private Double frozenBalance;
	
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

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
