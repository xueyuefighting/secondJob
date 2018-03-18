package com.yonyou.scf.common.entity;

public class InvoiceBillingDetail {
    private Long ibdId;

    private Long ibId;

    private Long principal;

    private Long principalAlready;

    private Long interest;

    private Long serviceCharge;

    private Long rolloverInterest;

    private Long extensionServiceFee;

    private Long overdueInterest;

    private Long overdueServiceFee;

    private String currency;

    private Long createId;

    private String createTime;

    private String effective;

    private Long preRepayFee;

    private Long preRepayFeeAlready;

    private Long extensionFee;

    private Long extensionFeeAlready;

    private Long otherFee;

    private Long otherFeeAlready;

    private Long balance;

    public Long getIbdId() {
        return ibdId;
    }

    public void setIbdId(Long ibdId) {
        this.ibdId = ibdId;
    }

    public Long getIbId() {
        return ibId;
    }

    public void setIbId(Long ibId) {
        this.ibId = ibId;
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

    public Long getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Long serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Long getRolloverInterest() {
        return rolloverInterest;
    }

    public void setRolloverInterest(Long rolloverInterest) {
        this.rolloverInterest = rolloverInterest;
    }

    public Long getExtensionServiceFee() {
        return extensionServiceFee;
    }

    public void setExtensionServiceFee(Long extensionServiceFee) {
        this.extensionServiceFee = extensionServiceFee;
    }

    public Long getOverdueInterest() {
        return overdueInterest;
    }

    public void setOverdueInterest(Long overdueInterest) {
        this.overdueInterest = overdueInterest;
    }

    public Long getOverdueServiceFee() {
        return overdueServiceFee;
    }

    public void setOverdueServiceFee(Long overdueServiceFee) {
        this.overdueServiceFee = overdueServiceFee;
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

    public String getEffective() {
        return effective;
    }

    public void setEffective(String effective) {
        this.effective = effective == null ? null : effective.trim();
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