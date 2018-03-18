package com.yonyou.scf.common.input.msgtemplate;

import org.hibernate.validator.constraints.NotBlank;

public class Mes1002Request extends MesBaseRequest {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6796226208654358254L;
	// 登录名
	@NotBlank(message = "登录名不能为空")
	private String loginName;
	// 密码
	@NotBlank(message = "密码不能为空")
	private String password;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
