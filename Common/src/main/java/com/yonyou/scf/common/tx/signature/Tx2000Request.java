package com.yonyou.scf.common.tx.signature;

import com.yonyou.scf.common.tx.base.BaseRequest;

public class Tx2000Request extends BaseRequest {

	private static final long serialVersionUID = 5883510539321814524L;
	private String message;
	private String signature;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}