package com.yonyou.scf.common.input.msgtemplate;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * MsgTemplate的共通字段Bean。
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu      2017-11-23  Create this file
 * </pre>
 * 
 */
public abstract class MesBaseRequest implements Serializable {

	private static final long serialVersionUID = 4933074464864502779L;

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.getDesensitizationJSON(this);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// 手机号码
	@NotBlank(message = "手机号不能为空")
	private String phone;
	// 邮件
	@NotBlank(message = "邮箱地址不能为空")
	private String mail;
	// 平台Id
	@NotBlank(message = "平台ID不能为空")
	private String platformId;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

}
