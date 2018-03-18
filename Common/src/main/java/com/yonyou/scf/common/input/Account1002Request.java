package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;


import com.yonyou.scf.common.util.json.JsonUtil;

public class Account1002Request implements Serializable   {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message = "会员账号不能为空")
	private String memNum;

	

	public String getMemNum() {
		return memNum;
	}



	public void setMemNum(String memNum) {
		this.memNum = memNum;
	}



	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
