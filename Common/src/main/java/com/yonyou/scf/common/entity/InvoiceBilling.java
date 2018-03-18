package com.yonyou.scf.common.entity;

public class InvoiceBilling {
    private Long ibId;

    private Long agencyId;

    private String financeProductType;

    private Long productId;

    private Long productRate;

    private Long overdueRate;

    private Long financingApplicationNo;

    private String financingStartDate;

    private String financingEndDate;

    private String extendStartDate;

    private String extendEndDate;

    private Long loanAmount;

    private Long principal;

    private Long principalAlready;

    private Long interest;

    private Long interestAlready;

    private Long serviceCharge;

    private Long serviceChargeAlready;

    private Long rolloverInterest;

    private Long rolloverInterestAlready;

    private Long extensionServiceFee;

    private Long extensionServiceFeeAlready;

    private Long overdueInterest;

    private Long overdueInterestAlready;

    private Long overdueServiceFee;

    private Long overdueServiceFeeAlready;

    private String currency;

    private Long createId;

    private String createTime;

    private Long updateId;

    private String updateTime;

    private String repayStatus;

    private Long preRepayFee;

    private Long preRepayFeeAlready;

    private Long extensionFee;

    private Long extensionFeeAlready;

    private Long otherFee;

    private Long otherFeeAlready;

    private Long balance;

    public Long getIbId() {
        return ibId;
    }

    public void setIbId(Long ibId) {
        this.ibId = ibId;
    }

    public Long getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }

    public String getFinanceProductType() {
        return financeProductType;
    }

    public void setFinanceProductType(String financeProductType) {
        this.financeProductType = financeProductType == null ? null : financeProductType.trim();
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductRate() {
        return productRate;
    }

    public void setProductRate(Long productRate) {
        this.productRate = productRate;
    }

    public Long getOverdueRate() {
        return overdueRate;
    }

    public void setOverdueRate(Long overdueRate) {
        this.overdueRate = overdueRate;
    }

    public Long getFinancingApplicationNo() {
        return financingApplicationNo;
    }

    public void setFinancingApplicationNo(Long financingApplicationNo) {
        this.financingApplicationNo = financingApplicationNo;
    }

    public String getFinancingStartDate() {
        return financingStartDate;
    }

    public void setFinancingStartDate(String financingStartDate) {
        this.financingStartDate = financingStartDate == null ? null : financingStartDate.trim();
    }

    public String getFinancingEndDate() {
        return financingEndDate;
    }

    public void setFinancingEndDate(String financingEndDate) {
        this.financingEndDate = financingEndDate == null ? null : financingEndDate.trim();
    }

    public String getExtendStartDate() {
        return extendStartDate;
    }

    public void setExtendStartDate(String extendStartDate) {
        this.extendStartDate = extendStartDate == null ? null : extendStartDate.trim();
    }

    public String getExtendEndDate() {
        return extendEndDate;
    }

    public void setExtendEndDate(String extendEndDate) {
        this.extendEndDate = extendEndDate == null ? null : extendEndDate.trim();
    }

    public Long getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Long loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Long getPrincipal() {
        return principal;
    }

    public void setPrincipal(Long principal) {
        this.principal = principal;
    }

    public Long getPrincipalAlready() {
        return principalAlready;
    }

    public void setPrincipalAlready(Long principalAlready) {
        this.principalAlready = principalAlready;
    }

    public Long getInterest() {
        return interest;
    }

    public void setInterest(Long interest) {
        this.interest = interest;
    }

    public Long getInterestAlready() {
        return interestAlready;
    }

    public void setInterestAlready(Long interestAlready) {
        this.interestAlready = interestAlready;
    }

    public Long getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Long serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Long getServiceChargeAlready() {
        return serviceChargeAlready;
    }

    public void setServiceChargeAlready(Long serviceChargeAlready) {
        this.serviceChargeAlready = serviceChargeAlready;
    }

    public Long getRolloverInterest() {
        return rolloverInterest;
    }

    public void setRolloverInterest(Long rolloverInterest) {
        this.rolloverInterest = rolloverInterest;
    }

    public Long getRolloverInterestAlready() {
        return rolloverInterestAlready;
    }

    public void setRolloverInterestAlready(Long rolloverInterestAlready) {
        this.rolloverInterestAlready = rolloverInterestAlready;
    }

    public Long getExtensionServiceFee() {
        return extensionServiceFee;
    }

    public void setExtensionServiceFee(Long extensionServiceFee) {
        this.extensionServiceFee = extensionServiceFee;
    }

    public Long getExtensionServiceFeeAlready() {
        return extensionServiceFeeAlready;
    }

    public void setExtensionServiceFeeAlready(Long extensionServiceFeeAlready) {
        this.extensionServiceFeeAlready = extensionServiceFeeAlready;
    }

    public Long getOverdueInterest() {
        return overdueInterest;
    }

    public void setOverdueInterest(Long overdueInterest) {
        this.overdueInterest = overdueInterest;
    }

    public Long getOverdueInterestAlready() {
        return overdueInterestAlready;
    }

    public void setOverdueInterestAlready(Long overdueInterestAlready) {
        this.overdueInterestAlready = overdueInterestAlready;
    }

    public Long getOverdueServiceFee() {
        return overdueServiceFee;
    }

    public void setOverdueServiceFee(Long overdueServiceFee) {
        this.overdueServiceFee = overdueServiceFee;
    }

    public Long getOverdueServiceFeeAlready() {
        return overdueServiceFeeAlready;
    }

    public void setOverdueServiceFeeAlready(Long overdueServiceFeeAlready) {
        this.overdueServiceFeeAlready = overdueServiceFeeAlready;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getRepayStatus() {
        return repayStatus;
    }

    public void setRepayStatus(String repayStatus) {
        this.repayStatus = repayStatus == null ? null : repayStatus.trim();
    }

    public Long getPreRepayFee() {
        return preRepayFee;
    }

    public void setPreRepayFee(Long preRepayFee) {
        this.preRepayFee = preRepayFee;
    }

    public Long getPreRepayFeeAlready() {
        return preRepayFeeAlready;
    }

    public void setPreRepayFeeAlready(Long preRepayFeeAlready) {
        this.preRepayFeeAlready = preRepayFeeAlready;
    }

    public Long getExtensionFee() {
        return extensionFee;
    }

    public void setExtensionFee(Long extensionFee) {
        this.extensionFee = extensionFee;
    }

    public Long getExtensionFeeAlready() {
        return extensionFeeAlready;
    }

    public void setExtensionFeeAlready(Long extensionFeeAlready) {
        this.extensionFeeAlready = extensionFeeAlready;
    }

    public Long getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(Long otherFee) {
        this.otherFee = otherFee;
    }

    public Long getOtherFeeAlready() {
        return otherFeeAlready;
    }

    public void setOtherFeeAlready(Long otherFeeAlready) {
        this.otherFeeAlready = otherFeeAlready;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}