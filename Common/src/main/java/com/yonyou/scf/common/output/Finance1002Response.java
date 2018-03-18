package com.yonyou.scf.common.output;

import java.io.Serializable;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance1002Response   implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//产品ID
	private Long productId;
	//还款状态
	private String repayStatus;
	
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getRepayStatus() {
		return repayStatus;
	}

	public void setRepayStatus(String repayStatus) {
		this.repayStatus = repayStatus;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
