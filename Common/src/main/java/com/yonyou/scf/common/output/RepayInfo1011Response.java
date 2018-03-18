package com.yonyou.scf.common.output;

import java.io.Serializable;

import com.yonyou.scf.common.util.json.JsonUtil;

public class RepayInfo1011Response   implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//未还金额
	private Long noRepayAmount;
	//已还本金
	private Long principalAmount;
	//已还利息
	private Long interestAmount;
	
	
	public Long getNoRepayAmount() {
		return noRepayAmount;
	}

	public void setNoRepayAmount(Long noRepayAmount) {
		this.noRepayAmount = noRepayAmount;
	}

	public Long getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(Long principalAmount) {
		this.principalAmount = principalAmount;
	}

	public Long getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(Long interestAmount) {
		this.interestAmount = interestAmount;
	}
	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
