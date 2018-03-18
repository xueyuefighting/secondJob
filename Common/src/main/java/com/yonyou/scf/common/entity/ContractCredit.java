package com.yonyou.scf.common.entity;

public class ContractCredit {
    private Long id;

    private Long tctId;

    private Long creditId;

    private String signerNo;

    private Long signerId;

    private String fileId;

    private String placeholderNo;

    private Long signUserId;

    private Integer orderNo;

    private String gmtCreate;

    private Long creUserId;

    private String gmtModified;

    private Long modUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTctId() {
        return tctId;
    }

    public void setTctId(Long tctId) {
        this.tctId = tctId;
    }

    public Long getCreditId() {
        return creditId;
    }

    public void setCreditId(Long creditId) {
        this.creditId = creditId;
    }

    public String getSignerNo() {
        return signerNo;
    }

    public void setSignerNo(String signerNo) {
        this.signerNo = signerNo == null ? null : signerNo.trim();
    }

    public Long getSignerId() {
        return signerId;
    }

    public void setSignerId(Long signerId) {
        this.signerId = signerId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getPlaceholderNo() {
        return placeholderNo;
    }

    public void setPlaceholderNo(String placeholderNo) {
        this.placeholderNo = placeholderNo == null ? null : placeholderNo.trim();
    }

    public Long getSignUserId() {
        return signUserId;
    }

    public void setSignUserId(Long signUserId) {
        this.signUserId = signUserId;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate == null ? null : gmtCreate.trim();
    }

    public Long getCreUserId() {
        return creUserId;
    }

    public void setCreUserId(Long creUserId) {
        this.creUserId = creUserId;
    }

    public String getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified == null ? null : gmtModified.trim();
    }

    public Long getModUserId() {
        return modUserId;
    }

    public void setModUserId(Long modUserId) {
        this.modUserId = modUserId;
    }
}