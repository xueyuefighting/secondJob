package com.yonyou.scf.common.entity;

public class AccountsFinancingApplicationAccdetail {
    private Long id;

    private String interfaceNo;

    private String financingApplicationId;

    private String productName;

    private String productSpecifications;

    private String productUnit;

    private Integer productNum;

    private Long noTaxAmount;

    private Long noTaxUnitPrice;

    private Integer taxRate;

    private Long taxAmount;

    private Long allAmount;

    private Long productStocks;

    private String createTime;

    private String modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInterfaceNo() {
        return interfaceNo;
    }

    public void setInterfaceNo(String interfaceNo) {
        this.interfaceNo = interfaceNo == null ? null : interfaceNo.trim();
    }

    public String getFinancingApplicationId() {
        return financingApplicationId;
    }

    public void setFinancingApplicationId(String financingApplicationId) {
        this.financingApplicationId = financingApplicationId == null ? null : financingApplicationId.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductSpecifications() {
        return productSpecifications;
    }

    public void setProductSpecifications(String productSpecifications) {
        this.productSpecifications = productSpecifications == null ? null : productSpecifications.trim();
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit == null ? null : productUnit.trim();
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public Long getNoTaxAmount() {
        return noTaxAmount;
    }

    public void setNoTaxAmount(Long noTaxAmount) {
        this.noTaxAmount = noTaxAmount;
    }

    public Long getNoTaxUnitPrice() {
        return noTaxUnitPrice;
    }

    public void setNoTaxUnitPrice(Long noTaxUnitPrice) {
        this.noTaxUnitPrice = noTaxUnitPrice;
    }

    public Integer getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Integer taxRate) {
        this.taxRate = taxRate;
    }

    public Long getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Long taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Long getAllAmount() {
        return allAmount;
    }

    public void setAllAmount(Long allAmount) {
        this.allAmount = allAmount;
    }

    public Long getProductStocks() {
        return productStocks;
    }

    public void setProductStocks(Long productStocks) {
        this.productStocks = productStocks;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime == null ? null : modifyTime.trim();
    }
}