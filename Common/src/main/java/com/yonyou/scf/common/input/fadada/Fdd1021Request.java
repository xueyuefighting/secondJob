package com.yonyou.scf.common.input.fadada;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

/**
 * 法大大，企业CA申请接口
 * 
 * @author shengsu
 *
 */
public class Fdd1021Request extends FddBaseRequest {

	private static final long serialVersionUID = 5104225322343656582L;
	@NotBlank(message = "客户名称不得为空")
	private String customer_name;
	@NotBlank(message = "邮箱地址不得为空")
	private String email;
	@NotBlank(message = "身份证号不得为空")
	private String id_card;
	@Range(max = 8, min = 7, message = "证件类型枚举值有误")
	private String ident_type;
	@NotBlank(message = "手机号不得为空")
	private String mobile;
	@NotBlank(message = "客户档案编号不得为空")
	private String customer_id;
	@NotBlank(message = "处理模式不得为空")
	@Range(max = 1, min = 0, message = "处理模式枚举值有误")
	private String is_automated;
	@NotBlank(message = "回调地址不得为空")
	private String callback_url;

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId_card() {
		return id_card;
	}

	public void setId_card(String id_card) {
		this.id_card = id_card;
	}

	public String getIdent_type() {
		return ident_type;
	}

	public void setIdent_type(String ident_type) {
		this.ident_type = ident_type;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getIs_automated() {
		return is_automated;
	}

	public void setIs_automated(String is_automated) {
		this.is_automated = is_automated;
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