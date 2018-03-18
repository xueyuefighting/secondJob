package com.yonyou.scf.common.tx.send;

//import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yonyou.scf.common.tx.base.BaseRequest;

public class MailSend extends BaseRequest {

	private static final long serialVersionUID = -1509509982097848958L;

	public MailSend() {
		// todo
	}

	public String getMailTo() {
		return mailTo;
	}

	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTxNo() {
		return txNo;
	}

	public void setTxNo(String txNo) {
		this.txNo = txNo;
	}

	// @ApiModelProperty("邮件序号")
	@NotBlank(message = "邮件序号不能为空")
	@Length(max = 32, message = "邮件序号长度不能大于32位")
//	
	private String txNo;

	// @ApiModelProperty("接收者")
	@NotBlank(message = "接收者不能为空")
	@Length(max = 50, message = "接收者长度不能大于50位")
	@Pattern(regexp = "[a-za-z0-9._%+-]+@[a-za-z0-9.-]+\\.[a-za-z]{2,4}", message = "邮件格式错误")
//	
	private String mailTo;

	// @ApiModelProperty("邮件主题")
	@NotBlank(message = "邮件主题不能为空")
	@Length(max = 50, message = "邮件主题长度不能大于50位")
//	
	private String subject;

	// @ApiModelProperty("邮件内容")
	@NotBlank(message = "邮件内容不能为空")
	@Length(max = 2000, message = "邮件内容长度不能大于2000位")
//	
	private String text;
}
