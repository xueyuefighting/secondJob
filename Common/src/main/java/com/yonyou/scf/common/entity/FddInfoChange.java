package com.yonyou.scf.common.entity;

public class FddInfoChange {
    private Long id;

    private String customerId;

    private String email;

    private String mobile;

    private Short customerType;

    private String emailNew;

    private String mobileNew;

    private String fddCustomerId;

    private Short status;

    private String fddResult;

    private String fddCode;

    private String fddMsg;

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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Short getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Short customerType) {
        this.customerType = customerType;
    }

    public String getEmailNew() {
        return emailNew;
    }

    public void setEmailNew(String emailNew) {
        this.emailNew = emailNew == null ? null : emailNew.trim();
    }

    public String getMobileNew() {
        return mobileNew;
    }

    public void setMobileNew(String mobileNew) {
        this.mobileNew = mobileNew == null ? null : mobileNew.trim();
    }

    public String getFddCustomerId() {
        return fddCustomerId;
    }

    public void setFddCustomerId(String fddCustomerId) {
        this.fddCustomerId = fddCustomerId == null ? null : fddCustomerId.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getFddResult() {
        return fddResult;
    }

    public void setFddResult(String fddResult) {
        this.fddResult = fddResult == null ? null : fddResult.trim();
    }

    public String getFddCode() {
        return fddCode;
    }

    public void setFddCode(String fddCode) {
        this.fddCode = fddCode == null ? null : fddCode.trim();
    }

    public String getFddMsg() {
        return fddMsg;
    }

    public void setFddMsg(String fddMsg) {
        this.fddMsg = fddMsg == null ? null : fddMsg.trim();
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