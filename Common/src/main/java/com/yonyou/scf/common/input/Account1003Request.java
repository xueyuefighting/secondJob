package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;


import com.yonyou.scf.common.util.json.JsonUtil;

public class Account1003Request implements Serializable   {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message = "查询金额不能为空")
	private Double moneyAmount;

	

	public Double getMoneyAmount() {
		return moneyAmount;
	}



	public void setMoneyAmount(Double moneyAmount) {
		this.moneyAmount = moneyAmount;
	}



	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
