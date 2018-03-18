package com.yonyou.scf.common.entity;

public class FitPersionalInformation {
    private Long id;

    private String fiGroupId;

    private String fsId;

    private Integer fsType;

    private String fsName;

    private String fsGroupNo;

    private String fsConcater;

    private String fsTel;

    private String fsMail;

    private Integer status;

    private Integer terminalSource;

    private String createTime;

    private String modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFiGroupId() {
        return fiGroupId;
    }

    public void setFiGroupId(String fiGroupId) {
        this.fiGroupId = fiGroupId == null ? null : fiGroupId.trim();
    }

    public String getFsId() {
        return fsId;
    }

    public void setFsId(String fsId) {
        this.fsId = fsId == null ? null : fsId.trim();
    }

    public Integer getFsType() {
        return fsType;
    }

    public void setFsType(Integer fsType) {
        this.fsType = fsType;
    }

    public String getFsName() {
        return fsName;
    }

    public void setFsName(String fsName) {
        this.fsName = fsName == null ? null : fsName.trim();
    }

    public String getFsGroupNo() {
        return fsGroupNo;
    }

    public void setFsGroupNo(String fsGroupNo) {
        this.fsGroupNo = fsGroupNo == null ? null : fsGroupNo.trim();
    }

    public String getFsConcater() {
        return fsConcater;
    }

    public void setFsConcater(String fsConcater) {
        this.fsConcater = fsConcater == null ? null : fsConcater.trim();
    }

    public String getFsTel() {
        return fsTel;
    }

    public void setFsTel(String fsTel) {
        this.fsTel = fsTel == null ? null : fsTel.trim();
    }

    public String getFsMail() {
        return fsMail;
    }

    public void setFsMail(String fsMail) {
        this.fsMail = fsMail == null ? null : fsMail.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTerminalSource() {
        return terminalSource;
    }

    public void setTerminalSource(Integer terminalSource) {
        this.terminalSource = terminalSource;
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