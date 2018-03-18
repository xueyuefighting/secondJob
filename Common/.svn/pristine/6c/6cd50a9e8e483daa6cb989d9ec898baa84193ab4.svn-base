package com.yonyou.scf.common.tx.send;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yonyou.scf.common.tx.base.BaseRequest;

public class SMSSend extends BaseRequest {

	private static final long serialVersionUID = -6612052684439109354L;

	// @ApiModelProperty("邮件序号")
	//@NotBlank(message = "短信序号不能为空")
	@Length(max = 32, message = "短信序号长度不能大于32位")
//	
	private String txNo;

	// @ApiModelProperty("接收者")
	@NotBlank(message = "手机号不能为空")
	@Length(max = 11, message = "手机号长度不能大于11位")
//	
	private String mobile;

	// @ApiModelProperty("邮件内容")
	@NotBlank(message = "短信内容不能为空")
	@Length(max = 200, message = "短信内容长度不能大于200位")
//	
	private String text;

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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
