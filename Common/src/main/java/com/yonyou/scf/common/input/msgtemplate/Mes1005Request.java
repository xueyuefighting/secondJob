package com.yonyou.scf.common.input.msgtemplate;

import org.hibernate.validator.constraints.NotBlank;

public class Mes1005Request extends MesBaseRequest {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2025193444689531900L;
	// 产品名称
	@NotBlank(message = "产品名称不能为空")
	private String productName;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}
