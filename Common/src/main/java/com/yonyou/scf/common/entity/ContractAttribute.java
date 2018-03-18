package com.yonyou.scf.common.entity;

public class ContractAttribute {
    private Long id;

    private String contractType;

    private String contractGenerateRule;

    private String mainContractType;

    private String gmtCreate;

    private Long creUserId;

    private String gmtModified;

    private Long modUserId;

    private Integer signerNo;

    private String repalceWord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType == null ? null : contractType.trim();
    }

    public String getContractGenerateRule() {
        return contractGenerateRule;
    }

    public void setContractGenerateRule(String contractGenerateRule) {
        this.contractGenerateRule = contractGenerateRule == null ? null : contractGenerateRule.trim();
    }

    public String getMainContractType() {
        return mainContractType;
    }

    public void setMainContractType(String mainContractType) {
        this.mainContractType = mainContractType == null ? null : mainContractType.trim();
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

    public Integer getSignerNo() {
        return signerNo;
    }

    public void setSignerNo(Integer signerNo) {
        this.signerNo = signerNo;
    }

    public String getRepalceWord() {
        return repalceWord;
    }

    public void setRepalceWord(String repalceWord) {
        this.repalceWord = repalceWord == null ? null : repalceWord.trim();
    }
}