package com.yonyou.scf.common.input;

import org.hibernate.validator.constraints.NotBlank;

public class SCF914006Input {

	// TOKEN
	@NotBlank(message = "登录信息已经失效")
	private String token;

	// 新手机号
	@NotBlank(message = "新邮件地址不能为空")
	private String email;

	// 邮箱验证码
	@NotBlank(message = "邮箱验证码不能为空")
	private String mcode;

	// 图形验证码
	@NotBlank(message = "图形验证码不能为空")
	private String pcode;

	// 图形验证码原始码
	@NotBlank(message = "超时，请重新登录")
	private String verifySerNo;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMcode() {
		return mcode;
	}

	public void setMcode(String mcode) {
		this.mcode = mcode;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getVerifySerNo() {
		return verifySerNo;
	}

	public void setVerifySerNo(String verifySerNo) {
		this.verifySerNo = verifySerNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
