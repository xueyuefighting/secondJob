package com.yonyou.scf.common.input.msgtemplate;

import org.hibernate.validator.constraints.NotBlank;

public class Mes1017Request extends MesBaseRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5331098703538909166L;

	// 借款方名称
	@NotBlank(message = "借款方名称不能为空")
	private String agencyName;

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
