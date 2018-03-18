package com.yonyou.scf.common.output;

import java.io.Serializable;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance1011Response_contractFiles   implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long fileId;
	private String fileName;
	private String isS;
	private String subfix;
	
	public Long getFileId() {
		return fileId;
	}
	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
	public String getIsS() {
		return isS;
	}
	public void setIsS(String isS) {
		this.isS = isS;
	}
	public String getSubfix() {
		return subfix;
	}
	public void setSubfix(String subfix) {
		this.subfix = subfix;
	}
	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
