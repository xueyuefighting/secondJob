package com.yonyou.scf.common.output;

import java.io.Serializable;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance1011Response_repayInfo   implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//应还本金
	private Long rsdId;
	//还款日期
	private String repaymentDate;
	//应还本金
	private Long  principalAmount;
	//应还利息
	private Long interestAmount;
	//单笔还款状态
	private String currentStatus;
	//实际还款日期
	private String realRepaymentDate;
	
	public Long getRsdId() {
		return rsdId;
	}

	public void setRsdId(Long rsdId) {
		this.rsdId = rsdId;
	}

	public String getRepaymentDate() {
		return repaymentDate;
	}

	public void setRepaymentDate(String repaymentDate) {
		this.repaymentDate = repaymentDate;
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

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String getRealRepaymentDate() {
		return realRepaymentDate;
	}

	public void setRealRepaymentDate(String realRepaymentDate) {
		this.realRepaymentDate = realRepaymentDate;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
