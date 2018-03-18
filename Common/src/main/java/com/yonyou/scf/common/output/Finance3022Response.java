package com.yonyou.scf.common.output;

import java.io.Serializable;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance3022Response   implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//融资申请ID
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
