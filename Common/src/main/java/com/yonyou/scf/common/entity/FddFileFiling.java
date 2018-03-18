package com.yonyou.scf.common.entity;

public class FddFileFiling {
    private Long id;

    private String contractId;

    private String filePathname;

    private Short status;

    private String fddResult;

    private String fddCode;

    private String fddMsg;

    private String fddViewUrl;

    private String createTime;

    private Long createUser;

    private String updateTime;

    private Long updateUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getFilePathname() {
        return filePathname;
    }

    public void setFilePathname(String filePathname) {
        this.filePathname = filePathname == null ? null : filePathname.trim();
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

    public String getFddViewUrl() {
        return fddViewUrl;
    }

    public void setFddViewUrl(String fddViewUrl) {
        this.fddViewUrl = fddViewUrl == null ? null : fddViewUrl.trim();
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
}