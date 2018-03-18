package com.yonyou.scf.common.tx.send;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.yonyou.scf.common.tx.base.BaseRequest;

public class SMS2Send extends BaseRequest {

	private static final long serialVersionUID = 3377042428910185023L;

	@Length(max = 32, message = "短信序号长度不能大于32位")
	private String txNo;

	@NotBlank(message = "手机号不能为空")
	@Length(max = 11, message = "手机号长度不能大于11位")
	private String mobile;

	@NotBlank(message = "平台ID不能为空")
	@Length(max = 8, message = "平台ID长度不能大于8位")
	private String platformId;

	@NotBlank(message = "模板号不能为空")
	@Length(max = 8, message = "模板号长度不能大于8位")
	private String templateId;

	@NotEmpty(message = "参数列表不能为空")
	@Size(min=2, message = "参数列表个数有误")
	private String[] args;

	public String getTxNo() {
		return txNo;
	}

	public void setTxNo(String txNo) {
		this.txNo = txNo;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String[] getArgs() {
		return args;
	}

	public void setArgs(String[] args) {
		this.args = args;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
