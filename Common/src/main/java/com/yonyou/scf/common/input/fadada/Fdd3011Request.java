package com.yonyou.scf.common.input.fadada;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

/**
 * 法大大，个人CA信息修改接口
 * 
 * @author shengsu
 *
 */
public class Fdd3011Request extends FddBaseRequest {

	private static final long serialVersionUID = -1868330880725972123L;
	@NotBlank(message = "客户名称不得为空")
	private String customer_id;
	@NotBlank(message = "修改前邮箱地址不得为空")
	private String email;
	@NotBlank(message = "修改前手机号不得为空")
	private String mobile;
	@NotBlank(message = "客户类型不得为空")
	@Range(max = 1, min = 0, message = "客户类型枚举值有误")
	private String customer_type;
	@NotBlank(message = "修改后邮箱地址不得为空")
	private String email_new;
	@NotBlank(message = "修改后手机号不得为空")
	private String mobile_new;
	private String fdd_customer_id;
	@NotBlank(message = "回调地址不得为空")
	private String callback_url;

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCustomer_type() {
		return customer_type;
	}

	public void setCustomer_type(String customer_type) {
		this.customer_type = customer_type;
	}

	public String getEmail_new() {
		return email_new;
	}

	public void setEmail_new(String email_new) {
		this.email_new = email_new;
	}

	public String getMobile_new() {
		return mobile_new;
	}

	public void setMobile_new(String mobile_new) {
		this.mobile_new = mobile_new;
	}

	public String getFdd_customer_id() {
		return fdd_customer_id;
	}

	public void setFdd_customer_id(String fdd_customer_id) {
		this.fdd_customer_id = fdd_customer_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCallback_url() {
		return callback_url;
	}

	public void setCallback_url(String callback_url) {
		this.callback_url = callback_url;
	}

}