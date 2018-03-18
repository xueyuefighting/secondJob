package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;


import com.yonyou.scf.common.util.json.JsonUtil;

public class RepayInfo1008Request  implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull(message = "还款计划明细表ID不能为空")
	private Long rsId;
	private String token;
	
	public Long getRsId() {
		return rsId;
	}

	public void setRsId(Long rsId) {
		this.rsId = rsId;
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
