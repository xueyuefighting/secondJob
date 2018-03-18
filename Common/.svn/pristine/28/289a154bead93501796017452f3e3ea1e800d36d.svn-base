package com.yonyou.scf.common.input;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class SCF914009Input {

	// TOKEN
	private String token;

	// // 新手机号
	// @NotBlank(message = "新手机号不能为空")
	// private String phone;

	// 企业个人标识
	@NotBlank(message = "请选择个人或者企业")
	private String req_select;

	// 账号
	@NotBlank(message = "账号不能为空")
	@Length(max = 100, message = "账号长度超长")
	private String account;

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

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
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

	public String getReq_select() {
		return req_select;
	}

	public void setReq_select(String req_select) {
		this.req_select = req_select;
	}
}
