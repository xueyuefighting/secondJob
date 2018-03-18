package com.yonyou.scf.common.tx.gateway;

import com.yonyou.scf.common.util.json.JsonUtil;



public class Scf1215Response_DataList {
	
	
	private String fundId;
	
	
	private String fsId;
	
	
	
	private String centerCompanyId;
	
	
	private String financingApplicationNo;
	
	
	private String accountsRecevieVoucherNo;
	
	
	private Integer accountsRecevieVoucherType;
	
	
	private String financingProductName;
	
	
	private Integer financeProductionInterest;
	
	
	private Integer overdueInterest;
	
	
	private Integer repayWay;
	
	
	private Integer financeAmount;
	
	
	private Integer applicationBillStatus;

	public String getFundId() {
		return fundId;
	}

	public String getFsId() {
		return fsId;
	}

	public String getCenterCompanyId() {
		return centerCompanyId;
	}

	public String getFinancingApplicationNo() {
		return financingApplicationNo;
	}

	public String getAccountsRecevieVoucherNo() {
		return accountsRecevieVoucherNo;
	}

	public Integer getAccountsRecevieVoucherType() {
		return accountsRecevieVoucherType;
	}

	public String getFinancingProductName() {
		return financingProductName;
	}

	public Integer getFinanceProductionInterest() {
		return financeProductionInterest;
	}

	public Integer getOverdueInterest() {
		return overdueInterest;
	}

	public Integer getRepayWay() {
		return repayWay;
	}

	public Integer getFinanceAmount() {
		return financeAmount;
	}

	public Integer getApplicationBillStatus() {
		return applicationBillStatus;
	}

	public void setFundId(String fundId) {
		this.fundId = fundId;
	}

	public void setFsId(String fsId) {
		this.fsId = fsId;
	}

	public void setCenterCompanyId(String centerCompanyId) {
		this.centerCompanyId = centerCompanyId;
	}

	public void setFinancingApplicationNo(String financingApplicationNo) {
		this.financingApplicationNo = financingApplicationNo;
	}

	public void setAccountsRecevieVoucherNo(String accountsRecevieVoucherNo) {
		this.accountsRecevieVoucherNo = accountsRecevieVoucherNo;
	}

	public void setAccountsRecevieVoucherType(Integer accountsRecevieVoucherType) {
		this.accountsRecevieVoucherType = accountsRecevieVoucherType;
	}

	public void setFinancingProductName(String financingProductName) {
		this.financingProductName = financingProductName;
	}

	public void setFinanceProductionInterest(Integer financeProductionInterest) {
		this.financeProductionInterest = financeProductionInterest;
	}

	public void setOverdueInterest(Integer overdueInterest) {
		this.overdueInterest = overdueInterest;
	}

	public void setRepayWay(Integer repayWay) {
		this.repayWay = repayWay;
	}

	public void setFinanceAmount(Integer financeAmount) {
		this.financeAmount = financeAmount;
	}

	public void setApplicationBillStatus(Integer applicationBillStatus) {
		this.applicationBillStatus = applicationBillStatus;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
	
	
	
	
	

}
