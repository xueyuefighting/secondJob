package com.yonyou.scf.common.entity;

public class File {
	
	//主键id，加上指定前缀 会成为放入redis中的key  前后端交互 与其他服务交互用的都是这个id
    private Long id;

    private String fileId;//	存放在ftp中的文件名字

    private String name;//上传时的文件名字

    private String nameSubfix;

    private String filePath;//在ftp系统中的文件路径

    private String exclusiveNo;

    private String gmtCreate;

    private Long creUserId;

    private String gmtModified;

    private Long modUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNameSubfix() {
        return nameSubfix;
    }

    public void setNameSubfix(String nameSubfix) {
        this.nameSubfix = nameSubfix == null ? null : nameSubfix.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public String getExclusiveNo() {
        return exclusiveNo;
    }

    public void setExclusiveNo(String exclusiveNo) {
        this.exclusiveNo = exclusiveNo == null ? null : exclusiveNo.trim();
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate == null ? null : gmtCreate.trim();
    }

    public Long getCreUserId() {
        return creUserId;
    }

    public void setCreUserId(Long creUserId) {
        this.creUserId = creUserId;
    }

    public String getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified == null ? null : gmtModified.trim();
    }

    public Long getModUserId() {
        return modUserId;
    }

    public void setModUserId(Long modUserId) {
        this.modUserId = modUserId;
    }
}