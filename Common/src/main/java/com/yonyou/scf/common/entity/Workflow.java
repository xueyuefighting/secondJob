package com.yonyou.scf.common.entity;

public class Workflow {
    private Long nodeId;

    private String name;

    private String orderNo;

    private String childFlg;

    private Long faId;

    private String createTime;

    private Long createUserId;

    private String updateTime;

    private Long updateUserId;

    private String enable;

    private Long sameLevel;

    private Long wkId;

    private String invalid;

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getChildFlg() {
        return childFlg;
    }

    public void setChildFlg(String childFlg) {
        this.childFlg = childFlg == null ? null : childFlg.trim();
    }

    public Long getFaId() {
        return faId;
    }

    public void setFaId(Long faId) {
        this.faId = faId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable == null ? null : enable.trim();
    }

    public Long getSameLevel() {
        return sameLevel;
    }

    public void setSameLevel(Long sameLevel) {
        this.sameLevel = sameLevel;
    }

    public Long getWkId() {
        return wkId;
    }

    public void setWkId(Long wkId) {
        this.wkId = wkId;
    }

    public String getInvalid() {
        return invalid;
    }

    public void setInvalid(String invalid) {
        this.invalid = invalid == null ? null : invalid.trim();
    }
}