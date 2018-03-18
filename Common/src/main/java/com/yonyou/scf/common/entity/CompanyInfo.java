package com.yonyou.scf.common.entity;

public class CompanyInfo {
    private Long userId;

    private String userType;

    private String companyName;

    private String companyShortName;

    private String threeExaminationsToOne;

    private String unifiedSocialCreditCode;

    private String businessLicence;

    private String taxId;

    private Long unifiedSocialCreditCodePic;

    private Long businessLicencePic;

    private Long taxIdPic;

    private String areaP;

    private String areaC;

    private String areaQ;

    private String industryWhichBelongsTo;

    private String enableStatus;

    private String auditingStatus;

    private String createTime;

    private Long createUser;

    private String updateTime;

    private Long updateUser;

    private String loanName;

    private String loanAccount;

    private String loanDepositBank;

    private String receivedPaymentsName;

    private String receivedPaymentsAccount;

    private String receivedPaymentsDepositBank;

    private String address;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyShortName() {
        return companyShortName;
    }

    public void setCompanyShortName(String companyShortName) {
        this.companyShortName = companyShortName == null ? null : companyShortName.trim();
    }

    public String getThreeExaminationsToOne() {
        return threeExaminationsToOne;
    }

    public void setThreeExaminationsToOne(String threeExaminationsToOne) {
        this.threeExaminationsToOne = threeExaminationsToOne == null ? null : threeExaminationsToOne.trim();
    }

    public String getUnifiedSocialCreditCode() {
        return unifiedSocialCreditCode;
    }

    public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
        this.unifiedSocialCreditCode = unifiedSocialCreditCode == null ? null : unifiedSocialCreditCode.trim();
    }

    public String getBusinessLicence() {
        return businessLicence;
    }

    public void setBusinessLicence(String businessLicence) {
        this.businessLicence = businessLicence == null ? null : businessLicence.trim();
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId == null ? null : taxId.trim();
    }

    public Long getUnifiedSocialCreditCodePic() {
        return unifiedSocialCreditCodePic;
    }

    public void setUnifiedSocialCreditCodePic(Long unifiedSocialCreditCodePic) {
        this.unifiedSocialCreditCodePic = unifiedSocialCreditCodePic;
    }

    public Long getBusinessLicencePic() {
        return businessLicencePic;
    }

    public void setBusinessLicencePic(Long businessLicencePic) {
        this.businessLicencePic = businessLicencePic;
    }

    public Long getTaxIdPic() {
        return taxIdPic;
    }

    public void setTaxIdPic(Long taxIdPic) {
        this.taxIdPic = taxIdPic;
    }

    public String getAreaP() {
        return areaP;
    }

    public void setAreaP(String areaP) {
        this.areaP = areaP == null ? null : areaP.trim();
    }

    public String getAreaC() {
        return areaC;
    }

    public void setAreaC(String areaC) {
        this.areaC = areaC == null ? null : areaC.trim();
    }

    public String getAreaQ() {
        return areaQ;
    }

    public void setAreaQ(String areaQ) {
        this.areaQ = areaQ == null ? null : areaQ.trim();
    }

    public String getIndustryWhichBelongsTo() {
        return industryWhichBelongsTo;
    }

    public void setIndustryWhichBelongsTo(String industryWhichBelongsTo) {
        this.industryWhichBelongsTo = industryWhichBelongsTo == null ? null : industryWhichBelongsTo.trim();
    }

    public String getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus == null ? null : enableStatus.trim();
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

    public String getLoanName() {
        return loanName;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName == null ? null : loanName.trim();
    }

    public String getLoanAccount() {
        return loanAccount;
    }

    public void setLoanAccount(String loanAccount) {
        this.loanAccount = loanAccount == null ? null : loanAccount.trim();
    }

    public String getLoanDepositBank() {
        return loanDepositBank;
    }

    public void setLoanDepositBank(String loanDepositBank) {
        this.loanDepositBank = loanDepositBank == null ? null : loanDepositBank.trim();
    }

    public String getReceivedPaymentsName() {
        return receivedPaymentsName;
    }

    public void setReceivedPaymentsName(String receivedPaymentsName) {
        this.receivedPaymentsName = receivedPaymentsName == null ? null : receivedPaymentsName.trim();
    }

    public String getReceivedPaymentsAccount() {
        return receivedPaymentsAccount;
    }

    public void setReceivedPaymentsAccount(String receivedPaymentsAccount) {
        this.receivedPaymentsAccount = receivedPaymentsAccount == null ? null : receivedPaymentsAccount.trim();
    }

    public String getReceivedPaymentsDepositBank() {
        return receivedPaymentsDepositBank;
    }

    public void setReceivedPaymentsDepositBank(String receivedPaymentsDepositBank) {
        this.receivedPaymentsDepositBank = receivedPaymentsDepositBank == null ? null : receivedPaymentsDepositBank.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}