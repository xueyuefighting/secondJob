package com.yonyou.scf.common.entity;

public class Product {
    private Long productId;

    private String mode;

    private String productName;

    private Long capitalId;

    private Long companyId;

    private Integer productRate;

    private Integer financeRate;

    private Integer serviceRate;

    private Long productUseAmount;

    private Long productCreditAmount;

    private Long minFinanceMoney;

    private Integer minFinanceDay;

    private Integer maxFinanceDay;

    private Integer transferPeriod;

    private String repayType;

    private String isdelay;

    private Integer extendDay;

    private Integer extensionChargeRate;

    private Integer prepaymentChargeRate;

    private Integer continuationFloatRate;

    private Integer overdueFloatRate;

    private Integer continuationRate;

    private Integer overdueRate;

    private String status;

    private String platformId;

    private String isFrozenOwnFunds;

    private String createTime;

    private Long createUser;

    private String updateTime;

    private Long updateUser;

    private Integer monthlyRate;

    private Integer marginRate;

    private String wayOfGuarantee;

    private String runBatch;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode == null ? null : mode.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Long getCapitalId() {
        return capitalId;
    }

    public void setCapitalId(Long capitalId) {
        this.capitalId = capitalId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Integer getProductRate() {
        return productRate;
    }

    public void setProductRate(Integer productRate) {
        this.productRate = productRate;
    }

    public Integer getFinanceRate() {
        return financeRate;
    }

    public void setFinanceRate(Integer financeRate) {
        this.financeRate = financeRate;
    }

    public Integer getServiceRate() {
        return serviceRate;
    }

    public void setServiceRate(Integer serviceRate) {
        this.serviceRate = serviceRate;
    }

    public Long getProductUseAmount() {
        return productUseAmount;
    }

    public void setProductUseAmount(Long productUseAmount) {
        this.productUseAmount = productUseAmount;
    }

    public Long getProductCreditAmount() {
        return productCreditAmount;
    }

    public void setProductCreditAmount(Long productCreditAmount) {
        this.productCreditAmount = productCreditAmount;
    }

    public Long getMinFinanceMoney() {
        return minFinanceMoney;
    }

    public void setMinFinanceMoney(Long minFinanceMoney) {
        this.minFinanceMoney = minFinanceMoney;
    }

    public Integer getMinFinanceDay() {
        return minFinanceDay;
    }

    public void setMinFinanceDay(Integer minFinanceDay) {
        this.minFinanceDay = minFinanceDay;
    }

    public Integer getMaxFinanceDay() {
        return maxFinanceDay;
    }

    public void setMaxFinanceDay(Integer maxFinanceDay) {
        this.maxFinanceDay = maxFinanceDay;
    }

    public Integer getTransferPeriod() {
        return transferPeriod;
    }

    public void setTransferPeriod(Integer transferPeriod) {
        this.transferPeriod = transferPeriod;
    }

    public String getRepayType() {
        return repayType;
    }

    public void setRepayType(String repayType) {
        this.repayType = repayType == null ? null : repayType.trim();
    }

    public String getIsdelay() {
        return isdelay;
    }

    public void setIsdelay(String isdelay) {
        this.isdelay = isdelay == null ? null : isdelay.trim();
    }

    public Integer getExtendDay() {
        return extendDay;
    }

    public void setExtendDay(Integer extendDay) {
        this.extendDay = extendDay;
    }

    public Integer getExtensionChargeRate() {
        return extensionChargeRate;
    }

    public void setExtensionChargeRate(Integer extensionChargeRate) {
        this.extensionChargeRate = extensionChargeRate;
    }

    public Integer getPrepaymentChargeRate() {
        return prepaymentChargeRate;
    }

    public void setPrepaymentChargeRate(Integer prepaymentChargeRate) {
        this.prepaymentChargeRate = prepaymentChargeRate;
    }

    public Integer getContinuationFloatRate() {
        return continuationFloatRate;
    }

    public void setContinuationFloatRate(Integer continuationFloatRate) {
        this.continuationFloatRate = continuationFloatRate;
    }

    public Integer getOverdueFloatRate() {
        return overdueFloatRate;
    }

    public void setOverdueFloatRate(Integer overdueFloatRate) {
        this.overdueFloatRate = overdueFloatRate;
    }

    public Integer getContinuationRate() {
        return continuationRate;
    }

    public void setContinuationRate(Integer continuationRate) {
        this.continuationRate = continuationRate;
    }

    public Integer getOverdueRate() {
        return overdueRate;
    }

    public void setOverdueRate(Integer overdueRate) {
        this.overdueRate = overdueRate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId == null ? null : platformId.trim();
    }

    public String getIsFrozenOwnFunds() {
        return isFrozenOwnFunds;
    }

    public void setIsFrozenOwnFunds(String isFrozenOwnFunds) {
        this.isFrozenOwnFunds = isFrozenOwnFunds == null ? null : isFrozenOwnFunds.trim();
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

    public Integer getMonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(Integer monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    public Integer getMarginRate() {
        return marginRate;
    }

    public void setMarginRate(Integer marginRate) {
        this.marginRate = marginRate;
    }

    public String getWayOfGuarantee() {
        return wayOfGuarantee;
    }

    public void setWayOfGuarantee(String wayOfGuarantee) {
        this.wayOfGuarantee = wayOfGuarantee == null ? null : wayOfGuarantee.trim();
    }

    public String getRunBatch() {
        return runBatch;
    }

    public void setRunBatch(String runBatch) {
        this.runBatch = runBatch == null ? null : runBatch.trim();
    }
}