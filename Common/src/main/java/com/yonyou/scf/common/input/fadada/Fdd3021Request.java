package com.yonyou.scf.common.input.fadada;

import org.hibernate.validator.constraints.NotBlank;

public class Fdd3021Request extends FddBaseRequest {

	private static final long serialVersionUID = 1969498538101663208L;
	
	@NotBlank(message = "合同编号不能为空")
	private String contract_id;

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