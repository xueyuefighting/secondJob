package com.yonyou.scf.common.input.msgtemplate;

import org.hibernate.validator.constraints.NotBlank;

public class Mes1014Request extends MesBaseRequest {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5643671973420307444L;
	// 资方名称
	@NotBlank(message = "资方名称不能为空")
	private String capitalName;
	// 借款方名称
	@NotBlank(message = "借款方名称不能为空")
	private String agencyName;

	public String getCapitalName() {
		return capitalName;
	}

	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

}
