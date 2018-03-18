package com.yonyou.scf.common.input.fadada;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

/**
 * 法大大，合同文档上传接口
 * 
 * @author shengsu
 *
 */
public class Fdd1031Request extends FddBaseRequest {
	private static final long serialVersionUID = -6825904284996597580L;

	@NotBlank(message = "合同编号不得为空")
	private String contract_id;
	@NotBlank(message = "合同标题不得为空")
	private String doc_title;
	private String file_pathname;
	private String doc_url;
	@NotBlank(message = "文档类型不得为空")
	@Range(max = 1, min = 1, message = "文档类型枚举值有误")
	private String doc_type;

	public String getContract_id() {
		return contract_id;
	}

	public void setContract_id(String contract_id) {
		this.contract_id = contract_id;
	}

	public String getDoc_title() {
		return doc_title;
	}

	public void setDoc_title(String doc_title) {
		this.doc_title = doc_title;
	}

	public String getFile_pathname() {
		return file_pathname;
	}

	public void setFile_pathname(String file_pathname) {
		this.file_pathname = file_pathname;
	}

	public String getDoc_url() {
		return doc_url;
	}

	public void setDoc_url(String doc_url) {
		this.doc_url = doc_url;
	}

	public String getDoc_type() {
		return doc_type;
	}

	public void setDoc_type(String doc_type) {
		this.doc_type = doc_type;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}