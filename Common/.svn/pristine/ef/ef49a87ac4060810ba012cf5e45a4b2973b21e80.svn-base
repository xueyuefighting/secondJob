package com.yonyou.scf.common.output;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Account1003Response implements Serializable   {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull(message = "手续费金额不能为空")
	private Double feeAmount;
	@NotNull(message = "手续费模型编号不能为空")
	private String feeNo;
	
	public Double getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(Double feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getFeeNo() {
		return feeNo;
	}

	public void setFeeNo(String feeNo) {
		this.feeNo = feeNo;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
