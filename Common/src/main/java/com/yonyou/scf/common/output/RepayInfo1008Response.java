package com.yonyou.scf.common.output;

import java.io.Serializable;

import com.yonyou.scf.common.util.json.JsonUtil;

public class RepayInfo1008Response   implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//待还金额
	private Long noRepayAmount;
	//应还本金
	private Long principalAmount;
	//应还利息
	private Long interestAmount;
	//还款计划主KEY
	private Long rsId;
	
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

	public Long getRsId() {
		return rsId;
	}

	public void setRsId(Long rsId) {
		this.rsId = rsId;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
