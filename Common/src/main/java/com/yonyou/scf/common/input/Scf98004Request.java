package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf98004Request  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 融资单编号
	@NotNull(message = "融资单编号不能为空，且不超过20")
	@Max(value = 20, message = "融资单编号不超过20")
	private Long financingApplicationNo;

	// 实际放款金额
	@NotNull(message = "实际放款金额不能为空，且不超过20")
	@Max(value = 20, message = "实际放款金额不超过20")
	private Long loanAmount;

	// 融资起始日
	@NotNull(message = "融资起始日不能为空，且不超过10")
	@Max(value = 10, message = "融资起始日不超过10")
	private String financing_start_date;

	// 融资到期日
	@NotNull(message = "融资到期日不能为空，且不超过10")
	@Max(value = 10, message = "融资到期日不超过10")
	private String financing_end_date;

	public Long getFinancingApplicationNo() {
		return financingApplicationNo;
	}

	public void setFinancingApplicationNo(Long financingApplicationNo) {
		this.financingApplicationNo = financingApplicationNo;
	}

	public Long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getFinancing_start_date() {
		return financing_start_date;
	}

	public void setFinancing_start_date(String financing_start_date) {
		this.financing_start_date = financing_start_date;
	}

	public String getFinancing_end_date() {
		return financing_end_date;
	}

	public void setFinancing_end_date(String financing_end_date) {
		this.financing_end_date = financing_end_date;
	}
	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
