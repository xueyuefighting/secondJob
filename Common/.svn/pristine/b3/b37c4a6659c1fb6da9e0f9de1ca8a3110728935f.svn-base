package com.yonyou.scf.common.input.msgtemplate;

import org.hibernate.validator.constraints.NotBlank;

public class Mes1019Request extends MesBaseRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3153177710114245619L;

	// 借款方名称
	@NotBlank(message = "短信验证码不能为空")
	private String temp;
	
	// 借款方名称
	@NotBlank(message = "超时时间不能为空")
	private String min;

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getMin() {
		return min;
	}

	public void setMin(String min) {
		this.min = min;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
