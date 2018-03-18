package com.yonyou.scf.common.entity;

public class F650 {
    private Long id;

    private Long payId;

    private String flag;

    private String busiNum;

    private String memNum;

    private String cfcaSn;

    private String cfcaDn;

    private String cfcaEffDate;

    private String ptwdh;

    private String result;

    private String cuowuxx;

    private String payStatus;

    private String createTime;

    private Long createUser;

    private String updateTime;

    private Long updateUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPayId() {
        return payId;
    }

    public void setPayId(Long payId) {
        this.payId = payId;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
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

    public String getCfcaSn() {
        return cfcaSn;
    }

    public void setCfcaSn(String cfcaSn) {
        this.cfcaSn = cfcaSn == null ? null : cfcaSn.trim();
    }

    public String getCfcaDn() {
        return cfcaDn;
    }

    public void setCfcaDn(String cfcaDn) {
        this.cfcaDn = cfcaDn == null ? null : cfcaDn.trim();
    }

    public String getCfcaEffDate() {
        return cfcaEffDate;
    }

    public void setCfcaEffDate(String cfcaEffDate) {
        this.cfcaEffDate = cfcaEffDate == null ? null : cfcaEffDate.trim();
    }

    public String getPtwdh() {
        return ptwdh;
    }

    public void setPtwdh(String ptwdh) {
        this.ptwdh = ptwdh == null ? null : ptwdh.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getCuowuxx() {
        return cuowuxx;
    }

    public void setCuowuxx(String cuowuxx) {
        this.cuowuxx = cuowuxx == null ? null : cuowuxx.trim();
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
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
}