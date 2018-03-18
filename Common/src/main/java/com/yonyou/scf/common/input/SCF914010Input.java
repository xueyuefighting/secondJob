package com.yonyou.scf.common.input;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class SCF914010Input {

	@NotBlank(message = "操作超时，请从第一步开始")
	private String operatorId;

	// 证件号码
	@NotBlank(message = "证件号码不能为空")
	@Length(max = 100, message = "证件号码超长")
	private String code;

	// 短信验证码
	@NotBlank(message = "短信验证码不能为空")
	private String ccode;

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCcode() {
		return ccode;
	}

	public void setCcode(String ccode) {
		this.ccode = ccode;
	}

}
