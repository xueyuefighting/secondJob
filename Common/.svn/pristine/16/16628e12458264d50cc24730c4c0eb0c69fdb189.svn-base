package com.yonyou.scf.common.input;

import org.hibernate.validator.constraints.NotBlank;

public class SCF914003Input {

	// TOKEN
	@NotBlank(message = "登录信息已经失效")
	private String token;

	// 短信验证码
	@NotBlank(message = "短信验证码不能为空")
	private String ccode;

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

	public String getCcode() {
		return ccode;
	}

	public void setCcode(String ccode) {
		this.ccode = ccode;
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

}
