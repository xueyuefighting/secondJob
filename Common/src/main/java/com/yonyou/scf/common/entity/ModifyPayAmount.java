package com.yonyou.scf.common.entity;

public class ModifyPayAmount {
    private Long id;

    private String interfaceNo;

    private String platformId;

    private String fundId;

    private String centerCompanyId;

    private String fsId;

    private String financingApplicationNo;

    private String fsManagedAccountBankId;

    private String fsManagedAccountNumber;

    private String payRecevieVoucherNo;

    private String modifyTime;

    private Integer modifyNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInterfaceNo() {
        return interfaceNo;
    }

    public void setInterfaceNo(String interfaceNo) {
        this.interfaceNo = interfaceNo == null ? null : interfaceNo.trim();
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId == null ? null : platformId.trim();
    }

    public String getFundId() {
        return fundId;
    }

    public void setFundId(String fundId) {
        this.fundId = fundId == null ? null : fundId.trim();
    }

    public String getCenterCompanyId() {
        return centerCompanyId;
    }

    public void setCenterCompanyId(String centerCompanyId) {
        this.centerCompanyId = centerCompanyId == null ? null : centerCompanyId.trim();
    }

    public String getFsId() {
        return fsId;
    }

    public void setFsId(String fsId) {
        this.fsId = fsId == null ? null : fsId.trim();
    }

    public String getFinancingApplicationNo() {
        return financingApplicationNo;
    }

    public void setFinancingApplicationNo(String financingApplicationNo) {
        this.financingApplicationNo = financingApplicationNo == null ? null : financingApplicationNo.trim();
    }

    public String getFsManagedAccountBankId() {
        return fsManagedAccountBankId;
    }

    public void setFsManagedAccountBankId(String fsManagedAccountBankId) {
        this.fsManagedAccountBankId = fsManagedAccountBankId == null ? null : fsManagedAccountBankId.trim();
    }

    public String getFsManagedAccountNumber() {
        return fsManagedAccountNumber;
    }

    public void setFsManagedAccountNumber(String fsManagedAccountNumber) {
        this.fsManagedAccountNumber = fsManagedAccountNumber == null ? null : fsManagedAccountNumber.trim();
    }

    public String getPayRecevieVoucherNo() {
        return payRecevieVoucherNo;
    }

    public void setPayRecevieVoucherNo(String payRecevieVoucherNo) {
        this.payRecevieVoucherNo = payRecevieVoucherNo == null ? null : payRecevieVoucherNo.trim();
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime == null ? null : modifyTime.trim();
    }

    public Integer getModifyNum() {
        return modifyNum;
    }

    public void setModifyNum(Integer modifyNum) {
        this.modifyNum = modifyNum;
    }
}