package com.yonyou.scf.common.input;

import org.hibernate.validator.constraints.NotBlank;

public class SCF914008Input {

	// TOKEN
	@NotBlank(message = "登录信息已经失效")
	private String token;

	// 新邮件地址
	@NotBlank(message = "新邮件地址不能为空")
	private String email;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
