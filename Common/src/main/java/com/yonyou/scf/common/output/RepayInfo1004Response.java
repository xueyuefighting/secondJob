package com.yonyou.scf.common.output;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.yonyou.scf.common.util.json.JsonUtil;

public class RepayInfo1004Response   implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//还款记录编号
	private String financeNo;
	private String financeMode;
	private Long financeId;
	//产品名称
	private String productName;
	//产品ID
	private Long productId;
	//借款人ID
	private Long agencyId;
	//待还金额
	private Long noRepayAmount;
	//已还本金
	private Long alreadyPrincipalAmount;
	//已还利息
	private Long alreadyInterestAmount;
	//还款计划主KEY
	private Long rsId;
	private Long creditId;
	
	private List<RepayInfo1004Response_repayDetail> repayDetails = new ArrayList<RepayInfo1004Response_repayDetail>();
	public String getFinanceNo() {
		return financeNo;
	}

	public void setFinanceNo(String financeNo) {
		this.financeNo = financeNo;
	}

	public String getFinanceMode() {
		return financeMode;
	}

	public void setFinanceMode(String financeMode) {
		this.financeMode = financeMode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(Long agencyId) {
		this.agencyId = agencyId;
	}

	public Long getNoRepayAmount() {
		return noRepayAmount;
	}

	public void setNoRepayAmount(Long noRepayAmount) {
		this.noRepayAmount = noRepayAmount;
	}

	public Long getAlreadyPrincipalAmount() {
		return alreadyPrincipalAmount;
	}

	public void setAlreadyPrincipalAmount(Long alreadyPrincipalAmount) {
		this.alreadyPrincipalAmount = alreadyPrincipalAmount;
	}

	public Long getAlreadyInterestAmount() {
		return alreadyInterestAmount;
	}

	public void setAlreadyInterestAmount(Long alreadyInterestAmount) {
		this.alreadyInterestAmount = alreadyInterestAmount;
	}

	public Long getRsId() {
		return rsId;
	}

	public void setRsId(Long rsId) {
		this.rsId = rsId;
	}

	public List<RepayInfo1004Response_repayDetail> getRepayDetails() {
		return repayDetails;
	}

	public void setRepayDetails(List<RepayInfo1004Response_repayDetail> repayDetails) {
		this.repayDetails = repayDetails;
	}

	public Long getFinanceId() {
		return financeId;
	}

	public void setFinanceId(Long financeId) {
		this.financeId = financeId;
	}

	public Long getCreditId() {
		return creditId;
	}

	public void setCreditId(Long creditId) {
		this.creditId = creditId;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
