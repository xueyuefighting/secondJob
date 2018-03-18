package com.yonyou.scf.common.entity;

public class OrderInfo {
    private Long id;

    private String code;

    private String date;

    private Long amount;

    private Long borrowingBusiness;

    private String documentNumber;

    private Long coreBusiness;

    private String commodityCategories;

    private String financing;

    private Long createUser;

    private String createTime;

    private Long updateUser;

    private String updateTime;

    private String invalid;

    private String borrowingBusinessType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getBorrowingBusiness() {
        return borrowingBusiness;
    }

    public void setBorrowingBusiness(Long borrowingBusiness) {
        this.borrowingBusiness = borrowingBusiness;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber == null ? null : documentNumber.trim();
    }

    public Long getCoreBusiness() {
        return coreBusiness;
    }

    public void setCoreBusiness(Long coreBusiness) {
        this.coreBusiness = coreBusiness;
    }

    public String getCommodityCategories() {
        return commodityCategories;
    }

    public void setCommodityCategories(String commodityCategories) {
        this.commodityCategories = commodityCategories == null ? null : commodityCategories.trim();
    }

    public String getFinancing() {
        return financing;
    }

    public void setFinancing(String financing) {
        this.financing = financing == null ? null : financing.trim();
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getInvalid() {
        return invalid;
    }

    public void setInvalid(String invalid) {
        this.invalid = invalid == null ? null : invalid.trim();
    }

    public String getBorrowingBusinessType() {
        return borrowingBusinessType;
    }

    public void setBorrowingBusinessType(String borrowingBusinessType) {
        this.borrowingBusinessType = borrowingBusinessType == null ? null : borrowingBusinessType.trim();
    }
}