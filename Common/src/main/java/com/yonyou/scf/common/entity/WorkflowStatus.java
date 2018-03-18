package com.yonyou.scf.common.entity;

public class WorkflowStatus {
    private Long statusId;

    private Long confId;

    private Long wkId;

    private Long nodeId;

    private Integer status;

    private String invalid;

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public Long getConfId() {
        return confId;
    }

    public void setConfId(Long confId) {
        this.confId = confId;
    }

    public Long getWkId() {
        return wkId;
    }

    public void setWkId(Long wkId) {
        this.wkId = wkId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getInvalid() {
        return invalid;
    }

    public void setInvalid(String invalid) {
        this.invalid = invalid == null ? null : invalid.trim();
    }
}