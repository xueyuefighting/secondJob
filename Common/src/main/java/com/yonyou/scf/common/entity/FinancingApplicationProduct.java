package com.yonyou.scf.common.entity;

public class FinancingApplicationProduct {
    private Long id;

    private String interfaceNo;

    private String financingApplicationId;

    private String productName;

    private String productStandard;

    private String productUnit;

    private Integer productNum;

    private Long productAmount;

    private String productStorageName;

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

    public String getProductStandard() {
        return productStandard;
    }

    public void setProductStandard(String productStandard) {
        this.productStandard = productStandard == null ? null : productStandard.trim();
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

    public Long getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(Long productAmount) {
        this.productAmount = productAmount;
    }

    public String getProductStorageName() {
        return productStorageName;
    }

    public void setProductStorageName(String productStorageName) {
        this.productStorageName = productStorageName == null ? null : productStorageName.trim();
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