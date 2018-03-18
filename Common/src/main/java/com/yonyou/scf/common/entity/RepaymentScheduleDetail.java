package com.yonyou.scf.common.entity;

public class RepaymentScheduleDetail {
    private Long rsdId;

    private Long rsId;

    private Long capitalId;

    private String repaymentDate;

    private String realRepaymentDate;

    private Long principalAmount;

    private Long interestAmount;

    private String currentPeriodsNumber;

    private String childPeriods;

    private String startDate;

    private String endDate;

    private Long totalRepaymentAmount;

    private Long initialPrincipal;

    private Long initialInterest;

    private Long loanId;

    private Long financeId;

    private String graceperiodExpirydate;

    private Long principal;

    private Long receivableAccruedInterest;

    private Long collectionAccruedInterest;

    private Long receivableOwe;

    private Long collectionOwe;

    private Long receivableAccruedPenaltyInterest;

    private Long collectionAccruedPenaltyInterest;

    private Long receivablePenaltyInterest;

    private Long collectionPenaltyInterest;

    private Long accrued;

    private Long recipe;

    private String lastRepaymentDate;

    private String type;

    private String currentStatus;

    private String accruedAccrualState;

    public Long getRsdId() {
        return rsdId;
    }

    public void setRsdId(Long rsdId) {
        this.rsdId = rsdId;
    }

    public Long getRsId() {
        return rsId;
    }

    public void setRsId(Long rsId) {
        this.rsId = rsId;
    }

    public Long getCapitalId() {
        return capitalId;
    }

    public void setCapitalId(Long capitalId) {
        this.capitalId = capitalId;
    }

    public String getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(String repaymentDate) {
        this.repaymentDate = repaymentDate == null ? null : repaymentDate.trim();
    }

    public String getRealRepaymentDate() {
        return realRepaymentDate;
    }

    public void setRealRepaymentDate(String realRepaymentDate) {
        this.realRepaymentDate = realRepaymentDate == null ? null : realRepaymentDate.trim();
    }

    public Long getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(Long principalAmount) {
        this.principalAmount = principalAmount;
    }

    public Long getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(Long interestAmount) {
        this.interestAmount = interestAmount;
    }

    public String getCurrentPeriodsNumber() {
        return currentPeriodsNumber;
    }

    public void setCurrentPeriodsNumber(String currentPeriodsNumber) {
        this.currentPeriodsNumber = currentPeriodsNumber == null ? null : currentPeriodsNumber.trim();
    }

    public String getChildPeriods() {
        return childPeriods;
    }

    public void setChildPeriods(String childPeriods) {
        this.childPeriods = childPeriods == null ? null : childPeriods.trim();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    public Long getTotalRepaymentAmount() {
        return totalRepaymentAmount;
    }

    public void setTotalRepaymentAmount(Long totalRepaymentAmount) {
        this.totalRepaymentAmount = totalRepaymentAmount;
    }

    public Long getInitialPrincipal() {
        return initialPrincipal;
    }

    public void setInitialPrincipal(Long initialPrincipal) {
        this.initialPrincipal = initialPrincipal;
    }

    public Long getInitialInterest() {
        return initialInterest;
    }

    public void setInitialInterest(Long initialInterest) {
        this.initialInterest = initialInterest;
    }

    public Long getLoanId() {
        return loanId;
    }

    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    public Long getFinanceId() {
        return financeId;
    }

    public void setFinanceId(Long financeId) {
        this.financeId = financeId;
    }

    public String getGraceperiodExpirydate() {
        return graceperiodExpirydate;
    }

    public void setGraceperiodExpirydate(String graceperiodExpirydate) {
        this.graceperiodExpirydate = graceperiodExpirydate == null ? null : graceperiodExpirydate.trim();
    }

    public Long getPrincipal() {
        return principal;
    }

    public void setPrincipal(Long principal) {
        this.principal = principal;
    }

    public Long getReceivableAccruedInterest() {
        return receivableAccruedInterest;
    }

    public void setReceivableAccruedInterest(Long receivableAccruedInterest) {
        this.receivableAccruedInterest = receivableAccruedInterest;
    }

    public Long getCollectionAccruedInterest() {
        return collectionAccruedInterest;
    }

    public void setCollectionAccruedInterest(Long collectionAccruedInterest) {
        this.collectionAccruedInterest = collectionAccruedInterest;
    }

    public Long getReceivableOwe() {
        return receivableOwe;
    }

    public void setReceivableOwe(Long receivableOwe) {
        this.receivableOwe = receivableOwe;
    }

    public Long getCollectionOwe() {
        return collectionOwe;
    }

    public void setCollectionOwe(Long collectionOwe) {
        this.collectionOwe = collectionOwe;
    }

    public Long getReceivableAccruedPenaltyInterest() {
        return receivableAccruedPenaltyInterest;
    }

    public void setReceivableAccruedPenaltyInterest(Long receivableAccruedPenaltyInterest) {
        this.receivableAccruedPenaltyInterest = receivableAccruedPenaltyInterest;
    }

    public Long getCollectionAccruedPenaltyInterest() {
        return collectionAccruedPenaltyInterest;
    }

    public void setCollectionAccruedPenaltyInterest(Long collectionAccruedPenaltyInterest) {
        this.collectionAccruedPenaltyInterest = collectionAccruedPenaltyInterest;
    }

    public Long getReceivablePenaltyInterest() {
        return receivablePenaltyInterest;
    }

    public void setReceivablePenaltyInterest(Long receivablePenaltyInterest) {
        this.receivablePenaltyInterest = receivablePenaltyInterest;
    }

    public Long getCollectionPenaltyInterest() {
        return collectionPenaltyInterest;
    }

    public void setCollectionPenaltyInterest(Long collectionPenaltyInterest) {
        this.collectionPenaltyInterest = collectionPenaltyInterest;
    }

    public Long getAccrued() {
        return accrued;
    }

    public void setAccrued(Long accrued) {
        this.accrued = accrued;
    }

    public Long getRecipe() {
        return recipe;
    }

    public void setRecipe(Long recipe) {
        this.recipe = recipe;
    }

    public String getLastRepaymentDate() {
        return lastRepaymentDate;
    }

    public void setLastRepaymentDate(String lastRepaymentDate) {
        this.lastRepaymentDate = lastRepaymentDate == null ? null : lastRepaymentDate.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus == null ? null : currentStatus.trim();
    }

    public String getAccruedAccrualState() {
        return accruedAccrualState;
    }

    public void setAccruedAccrualState(String accruedAccrualState) {
        this.accruedAccrualState = accruedAccrualState == null ? null : accruedAccrualState.trim();
    }
}