package com.yonyou.scf.common.input.msgtemplate;

import org.hibernate.validator.constraints.NotBlank;

public class Mes1010Request extends MesBaseRequest {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4673782722334541991L;
	// 授信额度
	@NotBlank(message = "授信额度不能为空")
	private String creditAmount;
	// 产品名称
	@NotBlank(message = "产品名称不能为空")
	private String productName;

	public String getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}
