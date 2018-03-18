package com.yonyou.scf.common.entity;

public class FddFileSign {
    private Long id;

    private String transactionId;

    private String customerId;

    private Short customerType;

    private String email;

    private String mobile;

    private Short clientRole;

    private String fddCustomerId;

    private String contractId;

    private String docTitle;

    private String signKeyword;

    private String returnUrl;

    private String notifyUrl;

    private Short isAutomated;

    private Short status;

    private String fddResult;

    private String fddCode;

    private String fddMsg;

    private String fddUrl;

    private String fddDownloadUrl;

    private String fddViewpdfUrl;

    private String fddResultCode;

    private String fddResultDesc;

    private String fddTimestamp;

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

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public Short getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Short customerType) {
        this.customerType = customerType;
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

    public Short getClientRole() {
        return clientRole;
    }

    public void setClientRole(Short clientRole) {
        this.clientRole = clientRole;
    }

    public String getFddCustomerId() {
        return fddCustomerId;
    }

    public void setFddCustomerId(String fddCustomerId) {
        this.fddCustomerId = fddCustomerId == null ? null : fddCustomerId.trim();
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getDocTitle() {
        return docTitle;
    }

    public void setDocTitle(String docTitle) {
        this.docTitle = docTitle == null ? null : docTitle.trim();
    }

    public String getSignKeyword() {
        return signKeyword;
    }

    public void setSignKeyword(String signKeyword) {
        this.signKeyword = signKeyword == null ? null : signKeyword.trim();
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl == null ? null : returnUrl.trim();
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
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

    public String getFddUrl() {
        return fddUrl;
    }

    public void setFddUrl(String fddUrl) {
        this.fddUrl = fddUrl == null ? null : fddUrl.trim();
    }

    public String getFddDownloadUrl() {
        return fddDownloadUrl;
    }

    public void setFddDownloadUrl(String fddDownloadUrl) {
        this.fddDownloadUrl = fddDownloadUrl == null ? null : fddDownloadUrl.trim();
    }

    public String getFddViewpdfUrl() {
        return fddViewpdfUrl;
    }

    public void setFddViewpdfUrl(String fddViewpdfUrl) {
        this.fddViewpdfUrl = fddViewpdfUrl == null ? null : fddViewpdfUrl.trim();
    }

    public String getFddResultCode() {
        return fddResultCode;
    }

    public void setFddResultCode(String fddResultCode) {
        this.fddResultCode = fddResultCode == null ? null : fddResultCode.trim();
    }

    public String getFddResultDesc() {
        return fddResultDesc;
    }

    public void setFddResultDesc(String fddResultDesc) {
        this.fddResultDesc = fddResultDesc == null ? null : fddResultDesc.trim();
    }

    public String getFddTimestamp() {
        return fddTimestamp;
    }

    public void setFddTimestamp(String fddTimestamp) {
        this.fddTimestamp = fddTimestamp == null ? null : fddTimestamp.trim();
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