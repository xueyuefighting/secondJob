package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import com.yonyou.scf.common.util.json.JsonUtil;


public class Scf98008Request  implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 借款企业ID
	@NotNull(message = "借款企业ID不能为空，且不超过32")
	@Max(value = 32, message = "借款企业ID不超过32")
	private Long financeId;

	public Long getFinanceId() {
		return financeId;
	}

	public void setFinanceId(Long financeId) {
		this.financeId = financeId;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
