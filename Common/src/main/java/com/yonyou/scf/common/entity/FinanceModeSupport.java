package com.yonyou.scf.common.entity;

public class FinanceModeSupport {
    private Long id;

    private Long ledingId;

    private String financeMode;

    private Short operateFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLedingId() {
        return ledingId;
    }

    public void setLedingId(Long ledingId) {
        this.ledingId = ledingId;
    }

    public String getFinanceMode() {
        return financeMode;
    }

    public void setFinanceMode(String financeMode) {
        this.financeMode = financeMode == null ? null : financeMode.trim();
    }

    public Short getOperateFlag() {
        return operateFlag;
    }

    public void setOperateFlag(Short operateFlag) {
        this.operateFlag = operateFlag;
    }
}