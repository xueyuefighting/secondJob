package com.yonyou.scf.common.tx.gateway;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf1401Response {
	//响应码
	
	private String code;
	
	//响应信息
	
	private String message;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
