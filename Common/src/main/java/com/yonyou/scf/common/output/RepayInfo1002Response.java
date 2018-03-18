package com.yonyou.scf.common.output;

import java.io.Serializable;
import java.math.BigDecimal;

import com.yonyou.scf.common.util.json.JsonUtil;

public class RepayInfo1002Response   implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//还款记录编号
	private String financeNo;
	//已还本金
	private BigDecimal principalAlreadyAmount;
	//已还利息
	private BigDecimal interestAlreadyAmount;
	
	public String getFinanceNo() {
		return financeNo;
	}

	public void setFinanceNo(String financeNo) {
		this.financeNo = financeNo;
	}

	public BigDecimal getPrincipalAlreadyAmount() {
		return principalAlreadyAmount;
	}

	public void setPrincipalAlreadyAmount(BigDecimal principalAlreadyAmount) {
		this.principalAlreadyAmount = principalAlreadyAmount;
	}

	public BigDecimal getInterestAlreadyAmount() {
		return interestAlreadyAmount;
	}

	public void setInterestAlreadyAmount(BigDecimal interestAlreadyAmount) {
		this.interestAlreadyAmount = interestAlreadyAmount;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
