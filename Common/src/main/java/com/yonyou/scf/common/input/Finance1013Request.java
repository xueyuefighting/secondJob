package com.yonyou.scf.common.input;

import java.io.Serializable;



import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance1013Request implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String token;
	
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
