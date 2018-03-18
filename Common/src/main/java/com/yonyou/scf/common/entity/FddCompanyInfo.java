package com.yonyou.scf.common.entity;

public class FddCompanyInfo {
    private Long id;

    private String customerName;

    private String email;

    private String idCard;

    private Short identType;

    private String mobile;

    private String customerId;

    private Short isAutomated;

    private Short status;

    private String fddFlag;

    private String fddNopassreason;

    private String fddMsg;

    private String fddCustomerId;

    private String createTime;

    private Long createUser;

    private String updateTime;

    private Long updateUser;

    private String callbackUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Short getIdentType() {
        return identType;
    }

    public void setIdentType(Short identType) {
        this.identType = identType;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public Short getIsAutomated() {
        return isAutomated;
    }

    public void setIsAutomated(Short isAutomated) {
        this.isAutomated = isAutomated;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getFddFlag() {
        return fddFlag;
    }

    public void setFddFlag(String fddFlag) {
        this.fddFlag = fddFlag == null ? null : fddFlag.trim();
    }

    public String getFddNopassreason() {
        return fddNopassreason;
    }

    public void setFddNopassreason(String fddNopassreason) {
        this.fddNopassreason = fddNopassreason == null ? null : fddNopassreason.trim();
    }

    public String getFddMsg() {
        return fddMsg;
    }

    public void setFddMsg(String fddMsg) {
        this.fddMsg = fddMsg == null ? null : fddMsg.trim();
    }

    public String getFddCustomerId() {
        return fddCustomerId;
    }

    public void setFddCustomerId(String fddCustomerId) {
        this.fddCustomerId = fddCustomerId == null ? null : fddCustomerId.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl == null ? null : callbackUrl.trim();
    }
}