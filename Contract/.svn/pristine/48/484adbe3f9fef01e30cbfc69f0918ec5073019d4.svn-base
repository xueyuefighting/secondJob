package com.yonyou.scf.contract.utilEntity;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

import org.springframework.util.FileCopyUtils;

import com.yonyou.scf.common.entity.File;

/**
 * 文件与redis之间的桥梁
 * @author zhangjlm
 *
 */
public class SignFTPFileEntity  implements Serializable{
	private static final long serialVersionUID = -29880651253305948L;
	
	private String fileId;
	private String name;
	private String subfix;
	private byte[] file;
	private String keyPrefix;
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubfix() {
		return subfix;
	}
	public void setSubfix(String subfix) {
		this.subfix = subfix;
	}
	public byte[] getFile() {
		return file;
	}
	public void setFile(byte[] file) {
		this.file = file;
	}
	
	public String getKeyPrefix() {
		return keyPrefix;
	}
	public void setKeyPrefix(String keyPrefix) {
		this.keyPrefix = keyPrefix;
	}
	
	public SignFTPFileEntity(String fileId, String name, String subfix, byte[] file, String keyPrefix) {
		super();
		this.fileId = fileId;
		this.name = name;
		this.subfix = subfix;
		this.file = file;
		this.keyPrefix = keyPrefix;
	}
	public SignFTPFileEntity() {
	}
	public SignFTPFileEntity(File file,ByteArrayOutputStream bos) {
		this.fileId = file.getFileId();
		this.name = file.getName();
		this.subfix = file.getNameSubfix();
		this.file = bos.toByteArray();
	}
	public SignFTPFileEntity(File file,InputStream is) throws IOException {
		this.fileId = file.getFileId();
		this.name = file.getName();
		this.subfix = file.getNameSubfix();
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		FileCopyUtils.copy(is, bos);
		
		this.file = bos.toByteArray();
	}
}
