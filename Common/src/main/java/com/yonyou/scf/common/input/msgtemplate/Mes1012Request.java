package com.yonyou.scf.common.input.msgtemplate;

import org.hibernate.validator.constraints.NotBlank;

public class Mes1012Request extends MesBaseRequest {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2379617219906857826L;
	// 资方名称
	@NotBlank(message = "资方名称不能为空")
	private String capitalName;

	public String getCapitalName() {
		return capitalName;
	}

	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}

}
