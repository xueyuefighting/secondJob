package com.yonyou.scf.common.input;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class SCF914002Input {

	// TOKEN
	@NotBlank(message="登录信息已经失效")
	private String token;

	// 原密码
	@NotBlank(message="原密码不能为空")
	private String pass;

	// 新密码
	@Length(min=8,max=20,message="密码长度为8-20")
	@NotBlank(message="新密码不能为空")
	private String newPass;

	// 确认密码
	@Length(min=8,max=20,message="密码长度为8-20")
	@NotBlank(message="确认密码不能为空")
	private String confirmPass;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNewPass() {
		return newPass;
	}

	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}

	public String getConfirmPass() {
		return confirmPass;
	}

	public void setConfirmPass(String confirmPass) {
		this.confirmPass = confirmPass;
	}

}
