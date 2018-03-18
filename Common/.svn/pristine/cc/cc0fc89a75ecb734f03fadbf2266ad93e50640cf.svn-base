package com.yonyou.scf.common.input;

import java.io.Serializable;

/**
 * 通过授信id 查询所有签署时点的合同，去重规则是根据file表的主键id
 * @author zhangjlm
 *
 */
public class SelectConsByCreditId implements Serializable {

	private static final long serialVersionUID = -427095923202010159L;
	
	private String fileName;//名称
	private String fileId;//file表主键
	private String subfix;//后缀
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getSubfix() {
		return subfix;
	}
	public void setSubfix(String subfix) {
		this.subfix = subfix;
	}
	public SelectConsByCreditId(String fileName, String fileId, String subfix) {
		super();
		this.fileName = fileName;
		this.fileId = fileId;
		this.subfix = subfix;
	}
	public SelectConsByCreditId() {
		super();
	}
	@Override
	public String toString() {
		return "SelectConsByCreditId [fileName=" + fileName + ", fileId=" + fileId + ", subfix=" + subfix + "]";
	}
	
}
