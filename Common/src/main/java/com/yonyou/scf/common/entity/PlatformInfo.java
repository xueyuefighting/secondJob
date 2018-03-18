package com.yonyou.scf.common.entity;

public class PlatformInfo {
    private Long id;

    private String platformId;

    private String platformName;

    private String informUrl;

    private String contact;

    private String telNum;

    private String depositBankName;

    private String bankNum;

    private String area;

    private String x509certificate;

    private String whitelistIp;

    private String creater;

    private String createTime;

    private String modifier;

    private String modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId == null ? null : platformId.trim();
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName == null ? null : platformName.trim();
    }

    public String getInformUrl() {
        return informUrl;
    }

    public void setInformUrl(String informUrl) {
        this.informUrl = informUrl == null ? null : informUrl.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum == null ? null : telNum.trim();
    }

    public String getDepositBankName() {
        return depositBankName;
    }

    public void setDepositBankName(String depositBankName) {
        this.depositBankName = depositBankName == null ? null : depositBankName.trim();
    }

    public String getBankNum() {
        return bankNum;
    }

    public void setBankNum(String bankNum) {
        this.bankNum = bankNum == null ? null : bankNum.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getX509certificate() {
        return x509certificate;
    }

    public void setX509certificate(String x509certificate) {
        this.x509certificate = x509certificate == null ? null : x509certificate.trim();
    }

    public String getWhitelistIp() {
        return whitelistIp;
    }

    public void setWhitelistIp(String whitelistIp) {
        this.whitelistIp = whitelistIp == null ? null : whitelistIp.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime == null ? null : modifyTime.trim();
    }
}