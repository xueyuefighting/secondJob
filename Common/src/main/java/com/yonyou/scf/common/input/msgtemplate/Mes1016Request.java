package com.yonyou.scf.common.input.msgtemplate;

import org.hibernate.validator.constraints.NotBlank;

public class Mes1016Request extends MesBaseRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -383678751031139567L;

	
	// 资方名称
	@NotBlank(message = "资方名称不能为空")
	private String capitalName;
	// 产品名称
	@NotBlank(message = "产品名称不能为空")
	private String productName;
	// 借款方名称
		@NotBlank(message = "借款方名称不能为空")
		private String agencyName;

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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
}
