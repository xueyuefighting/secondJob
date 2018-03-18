package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;


import com.yonyou.scf.common.util.json.JsonUtil;

public class RepayInfo1002Request  implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull(message = "还款记录主键不能为空")
	private Long repayId;
	
	public Long getRepayId() {
		return repayId;
	}

	public void setRepayId(Long repayId) {
		this.repayId = repayId;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
