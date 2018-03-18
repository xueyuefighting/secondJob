package com.yonyou.scf.common.tx.messenger;

//import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.yonyou.scf.common.tx.base.BaseRequest;

public class Tx1000Request extends BaseRequest {

	private static final long serialVersionUID = -400317517924163813L;

	@NotNull(message = "发送URL不能为空")
	@Size(max = 256, message = "发送URL长度不能大于256位")
//	
	private String url;

	@NotNull(message = "发送模式不能为空")
	@Size(max = 1, message = "发送模式长度不能大于1位")
	@Pattern(regexp = "^(0|1|2)$", message = "发送模式格式错误")
//	
	private String connectionMode;

	@NotNull(message = "发送消息明文不能为空")
	@Size(max = 2048, message = "发送消息明文长度不能大于2048位")
//	
	private String jsonMessage;

	@NotNull(message = "发送消息密文不能为空")
	@Size(max = 2048, message = "发送消息密文长度不能大于2048位")
//	
	private String jsonSignature;

	@NotNull(message = "发送流水号不能为空")
	@Size(max = 32, message = "发送流水号长度不能大于32位")
//	
	private String txNo;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getConnectionMode() {
		return connectionMode;
	}

	public void setConnectionMode(String connectionMode) {
		this.connectionMode = connectionMode;
	}

	public String getJsonMessage() {
		return jsonMessage;
	}

	public void setJsonMessage(String jsonMessage) {
		this.jsonMessage = jsonMessage;
	}

	public String getJsonSignature() {
		return jsonSignature;
	}

	public void setJsonSignature(String jsonSignature) {
		this.jsonSignature = jsonSignature;
	}

	public String getTxNo() {
		return txNo;
	}

	public void setTxNo(String txNo) {
		this.txNo = txNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}