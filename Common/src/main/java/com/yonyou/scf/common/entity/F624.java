package com.yonyou.scf.common.entity;

public class F624 {
    private Long id;

    private String busiNum;

    private String busiSerialNum;

    private String operType;

    private String orgBusiSerialNum;

    private String fromAccountName;

    private Long amount;

    private String toAccountName;

    private String fcsSerialNum;

    private String resultCode;

    private String ptwdh;

    private String cuowuxx;

    private String roleType;

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

    public String getBusiSerialNum() {
        return busiSerialNum;
    }

    public void setBusiSerialNum(String busiSerialNum) {
        this.busiSerialNum = busiSerialNum == null ? null : busiSerialNum.trim();
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType == null ? null : operType.trim();
    }

    public String getOrgBusiSerialNum() {
        return orgBusiSerialNum;
    }

    public void setOrgBusiSerialNum(String orgBusiSerialNum) {
        this.orgBusiSerialNum = orgBusiSerialNum == null ? null : orgBusiSerialNum.trim();
    }

    public String getFromAccountName() {
        return fromAccountName;
    }

    public void setFromAccountName(String fromAccountName) {
        this.fromAccountName = fromAccountName == null ? null : fromAccountName.trim();
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getToAccountName() {
        return toAccountName;
    }

    public void setToAccountName(String toAccountName) {
        this.toAccountName = toAccountName == null ? null : toAccountName.trim();
    }

    public String getFcsSerialNum() {
        return fcsSerialNum;
    }

    public void setFcsSerialNum(String fcsSerialNum) {
        this.fcsSerialNum = fcsSerialNum == null ? null : fcsSerialNum.trim();
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode == null ? null : resultCode.trim();
    }

    public String getPtwdh() {
        return ptwdh;
    }

    public void setPtwdh(String ptwdh) {
        this.ptwdh = ptwdh == null ? null : ptwdh.trim();
    }

    public String getCuowuxx() {
        return cuowuxx;
    }

    public void setCuowuxx(String cuowuxx) {
        this.cuowuxx = cuowuxx == null ? null : cuowuxx.trim();
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
    }
}