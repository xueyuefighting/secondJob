package com.yonyou.scf.common.input.msgtemplate;

import org.hibernate.validator.constraints.NotBlank;

public class Mes1007Request extends MesBaseRequest {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6231745186202275262L;
	// 资方名称
	@NotBlank(message = "资方名称不能为空")
	private String capitalName;
	// 产品名称
	@NotBlank(message = "产品名称不能为空")
	private String productName;

	public String getCapitalName() {
		return capitalName;
	}

	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}
