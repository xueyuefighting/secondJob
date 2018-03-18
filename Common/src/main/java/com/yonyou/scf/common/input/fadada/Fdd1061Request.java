package com.yonyou.scf.common.input.fadada;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

/**
 * 法大大，合同签署接口
 * 
 * @author shengsu
 *
 */
public class Fdd1061Request extends FddBaseRequest {
	private static final long serialVersionUID = 643072382556180619L;

	@NotBlank(message = "签署流水号不得为空")
	private String transaction_id;
	@NotBlank(message = "客户名称不得为空")
	private String customer_id;
	@NotBlank(message = "客户类型不得为空")
	@Range(max = 1, min = 0, message = "客户类型枚举值有误")
	private String customer_type;
	@NotBlank(message = "邮箱地址不得为空")
	private String email;
	@NotBlank(message = "手机号不得为空")
	private String mobile;
	@NotBlank(message = "合同编号不得为空")
	private String contract_id;
	@NotBlank(message = "合同路径不得为空")
	private String file_pathname;
	@NotBlank(message = "合同标题不得为空")
	private String doc_title;
	@NotBlank(message = "定位关键字不得为空")
	private String sign_keyword;
	//@NotBlank(message = "页面跳转URL不得为空")
	private String return_url;
	//@NotBlank(message = "异步通知URL不得为空")
	private String notify_url;
	@NotBlank(message = "客户业务角色不得为空")
	@Range(max = 5, min = 0, message = "客户业务角色枚举值有误")
	private String client_role;
	@NotBlank(message = "处理模式不得为空")
	@Range(max = 1, min = 0, message = "处理模式枚举值有误")
	private String is_automated;
	private String fdd_customer_id;
	private String doc_url;
	@NotBlank(message = "回调地址不得为空")
	private String callback_url;

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_type() {
		return customer_type;
	}

	public void setCustomer_type(String customer_type) {
		this.customer_type = customer_type;
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

	public String getContract_id() {
		return contract_id;
	}

	public void setContract_id(String contract_id) {
		this.contract_id = contract_id;
	}

	public String getFile_pathname() {
		return file_pathname;
	}

	public void setFile_pathname(String file_pathname) {
		this.file_pathname = file_pathname;
	}

	public String getDoc_title() {
		return doc_title;
	}

	public void setDoc_title(String doc_title) {
		this.doc_title = doc_title;
	}

	public String getSign_keyword() {
		return sign_keyword;
	}

	public void setSign_keyword(String sign_keyword) {
		this.sign_keyword = sign_keyword;
	}

	public String getReturn_url() {
		return return_url;
	}

	public void setReturn_url(String return_url) {
		this.return_url = return_url;
	}

	public String getNotify_url() {
		return notify_url;
	}

	public void setNotify_url(String notify_url) {
		this.notify_url = notify_url;
	}

	public String getClient_role() {
		return client_role;
	}

	public void setClient_role(String client_role) {
		this.client_role = client_role;
	}

	public String getIs_automated() {
		return is_automated;
	}

	public void setIs_automated(String is_automated) {
		this.is_automated = is_automated;
	}

	public String getFdd_customer_id() {
		return fdd_customer_id;
	}

	public void setFdd_customer_id(String fdd_customer_id) {
		this.fdd_customer_id = fdd_customer_id;
	}

	public String getDoc_url() {
		return doc_url;
	}

	public void setDoc_url(String doc_url) {
		this.doc_url = doc_url;
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