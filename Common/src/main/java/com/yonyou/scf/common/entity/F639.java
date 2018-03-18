package com.yonyou.scf.common.entity;

public class F639 {
    private Long id;

    private String busiNum;

    private String fcsSerialNum;

    private String repayType;

    private String repayMode;

    private Long amount;

    private String currency;

    private Long resultAmount;

    private Long interest;

    private Long ysqianxi;

    private Long yshofaxi;

    private String ptdwh;

    private String cuowuxx;

    private Long financeid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusiNum() {
        return busiNum;
    }

    public void setBusiNum(String busiNum) {
        this.busiNum = busiNum == null ? null : busiNum.trim();
    }

    public String getFcsSerialNum() {
        return fcsSerialNum;
    }

    public void setFcsSerialNum(String fcsSerialNum) {
        this.fcsSerialNum = fcsSerialNum == null ? null : fcsSerialNum.trim();
    }

    public String getRepayType() {
        return repayType;
    }

    public void setRepayType(String repayType) {
        this.repayType = repayType == null ? null : repayType.trim();
    }

    public String getRepayMode() {
        return repayMode;
    }

    public void setRepayMode(String repayMode) {
        this.repayMode = repayMode == null ? null : repayMode.trim();
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Long getResultAmount() {
        return resultAmount;
    }

    public void setResultAmount(Long resultAmount) {
        this.resultAmount = resultAmount;
    }

    public Long getInterest() {
        return interest;
    }

    public void setInterest(Long interest) {
        this.interest = interest;
    }

    public Long getYsqianxi() {
        return ysqianxi;
    }

    public void setYsqianxi(Long ysqianxi) {
        this.ysqianxi = ysqianxi;
    }

    public Long getYshofaxi() {
        return yshofaxi;
    }

    public void setYshofaxi(Long yshofaxi) {
        this.yshofaxi = yshofaxi;
    }

    public String getPtdwh() {
        return ptdwh;
    }

    public void setPtdwh(String ptdwh) {
        this.ptdwh = ptdwh == null ? null : ptdwh.trim();
    }

    public String getCuowuxx() {
        return cuowuxx;
    }

    public void setCuowuxx(String cuowuxx) {
        this.cuowuxx = cuowuxx == null ? null : cuowuxx.trim();
    }

    public Long getFinanceid() {
        return financeid;
    }

    public void setFinanceid(Long financeid) {
        this.financeid = financeid;
    }
}