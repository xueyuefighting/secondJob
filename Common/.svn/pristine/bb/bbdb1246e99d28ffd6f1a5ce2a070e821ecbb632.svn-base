package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Iou1005Request implements Serializable   {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message = "融资申请不能为空")
	private Long financeId;
	private String token;
	public Long getFinanceId() {
		return financeId;
	}


	public void setFinanceId(Long financeId) {
		this.financeId = financeId;
	}


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
