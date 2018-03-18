package com.yonyou.scf.common.entity;

public class F625 {
    private Long id;

    private String busiNum;

    private String virAccType;

    private String memNum;

    private String queryDate;

    private Long balance;

    private Long useableBalance;

    private String ptdwh;

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

    public String getVirAccType() {
        return virAccType;
    }

    public void setVirAccType(String virAccType) {
        this.virAccType = virAccType == null ? null : virAccType.trim();
    }

    public String getMemNum() {
        return memNum;
    }

    public void setMemNum(String memNum) {
        this.memNum = memNum == null ? null : memNum.trim();
    }

    public String getQueryDate() {
        return queryDate;
    }

    public void setQueryDate(String queryDate) {
        this.queryDate = queryDate == null ? null : queryDate.trim();
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getUseableBalance() {
        return useableBalance;
    }

    public void setUseableBalance(Long useableBalance) {
        this.useableBalance = useableBalance;
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

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
    }
}