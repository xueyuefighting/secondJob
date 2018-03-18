package com.yonyou.scf.common.input.fadada;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 法大大，合同归档接口
 * @author shengsu
 *
 */
public class Fdd1081Request extends FddBaseRequest {

	private static final long serialVersionUID = -6628818513103865825L;

	@NotBlank(message = "合同编号不得为空")
	private String contract_id;
	private String file_pathname;

	public String getContract_id() {
		return contract_id;
	}

	public void setContract_id(String contract_id) {
		this.contract_id = contract_id;
	}

	public String getFile_pathname() {
		return file_pathname;
	}

	public void setFile_pathname(String file_pathname) {
		this.file_pathname = file_pathname;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}