package com.yonyou.scf.common.input.fadada;

import org.hibernate.validator.constraints.NotBlank;

public class Fdd3031Request extends FddBaseRequest {
	private static final long serialVersionUID = -106190768802673526L;

	@NotBlank(message = "合同编号不得为空")
	private String contract_id;
	private String file_pathname;

	public String getFile_pathname() {
		return file_pathname;
	}

	public void setFile_pathname(String file_pathname) {
		this.file_pathname = file_pathname;
	}

	public String getContract_id() {
		return contract_id;
	}

	public void setContract_id(String contract_id) {
		this.contract_id = contract_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}