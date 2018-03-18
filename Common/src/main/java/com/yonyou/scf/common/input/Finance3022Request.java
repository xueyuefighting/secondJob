package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;


import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance3022Request implements Serializable   {

	private static final long serialVersionUID = 1L;
	@NotNull(message = "账款ID不能为空")
	private Long receId;
	private String token;
	
	public Long getReceId() {
		return receId;
	}

	public void setReceId(Long receId) {
		this.receId = receId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
