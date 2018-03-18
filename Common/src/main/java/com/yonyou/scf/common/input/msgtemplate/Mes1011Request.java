package com.yonyou.scf.common.input.msgtemplate;

import org.hibernate.validator.constraints.NotBlank;

public class Mes1011Request extends MesBaseRequest {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3679925273662817536L;
	// 授信额度
	@NotBlank(message = "授信额度不能为空")
	private String creditAmount;
	// 产品名称
	@NotBlank(message = "产品名称不能为空")
	private String productName;
	// 借款企业名称
	@NotBlank(message = "借款企业名称不能为空")
	private String agencyName;

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

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

}
