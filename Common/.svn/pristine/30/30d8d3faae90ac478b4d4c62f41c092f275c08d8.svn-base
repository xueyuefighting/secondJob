package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;


import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance3020Request implements Serializable   {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull(message = "授信ID不能为空")
	private Long creditId;
	private String token;
	

	public Long getCreditId() {
		return creditId;
	}

	public void setCreditId(Long creditId) {
		this.creditId = creditId;
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
