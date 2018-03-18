package com.yonyou.scf.common.input;

import java.io.Serializable;

import com.yonyou.scf.common.util.json.JsonUtil;

public class SCF12028Response implements Serializable   {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//主键 
	private String Financing;

	private Long orderAmount;

	public String getFinancing() {
		return Financing;
	}

	public void setFinancing(String financing) {
		Financing = financing;
	}

	public Long getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
