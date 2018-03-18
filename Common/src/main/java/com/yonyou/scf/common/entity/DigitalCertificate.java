package com.yonyou.scf.common.entity;

public class DigitalCertificate {
    private Long id;

    private Long userId;

    private Long signBankId;

    private String sn;

    private String dn;

    private String ca;

    private String expireDate;

    private Long fileId;

    private String bindStatus;

    private String auditingStatus;

    private String createTime;

    private Long createUser;

    private String updateTime;

    private Long updateUser;

    private Long credentialPic;

    private Long credentialPic2;

    private Long credentialHand;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getSignBankId() {
        return signBankId;
    }

    public void setSignBankId(Long signBankId) {
        this.signBankId = signBankId;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn == null ? null : dn.trim();
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca == null ? null : ca.trim();
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate == null ? null : expireDate.trim();
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public String getBindStatus() {
        return bindStatus;
    }

    public void setBindStatus(String bindStatus) {
        this.bindStatus = bindStatus == null ? null : bindStatus.trim();
    }

    public String getAuditingStatus() {
        return auditingStatus;
    }

    public void setAuditingStatus(String auditingStatus) {
        this.auditingStatus = auditingStatus == null ? null : auditingStatus.trim();
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

    public Long getCredentialPic() {
        return credentialPic;
    }

    public void setCredentialPic(Long credentialPic) {
        this.credentialPic = credentialPic;
    }

    public Long getCredentialPic2() {
        return credentialPic2;
    }

    public void setCredentialPic2(Long credentialPic2) {
        this.credentialPic2 = credentialPic2;
    }

    public Long getCredentialHand() {
        return credentialHand;
    }

    public void setCredentialHand(Long credentialHand) {
        this.credentialHand = credentialHand;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}