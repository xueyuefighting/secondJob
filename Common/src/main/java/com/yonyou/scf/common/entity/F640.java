package com.yonyou.scf.common.entity;

public class F640 {
    private Long id;

    private String busiNum;

    private String memNum;

    private String imtType;

    private Integer startNum;

    private Integer queryNum;

    private Integer totalNum;

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

    public String getMemNum() {
        return memNum;
    }

    public void setMemNum(String memNum) {
        this.memNum = memNum == null ? null : memNum.trim();
    }

    public String getImtType() {
        return imtType;
    }

    public void setImtType(String imtType) {
        this.imtType = imtType == null ? null : imtType.trim();
    }

    public Integer getStartNum() {
        return startNum;
    }

    public void setStartNum(Integer startNum) {
        this.startNum = startNum;
    }

    public Integer getQueryNum() {
        return queryNum;
    }

    public void setQueryNum(Integer queryNum) {
        this.queryNum = queryNum;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
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