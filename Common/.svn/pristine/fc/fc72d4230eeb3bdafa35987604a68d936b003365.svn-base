package com.yonyou.scf.common.input.msgtemplate;

import org.hibernate.validator.constraints.NotBlank;

public class Mes1003Request extends MesBaseRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = -444648652483389429L;
	// 融资申请日期
	@NotBlank(message = "融资申请日期不能为空")
	private String creatDate;
	// 融资申请单号
	@NotBlank(message = "融资申请单号不能为空")
	private String FinanceId;
	// 融资金额
	@NotBlank(message = "融资金额不能为空")
	private String financeAmount;
	// 驳回方
	@NotBlank(message = "驳回方不能为空")
	private String operateName;

	public String getCreatDate() {
		return creatDate;
	}

	public void setCreatDate(String creatDate) {
		this.creatDate = creatDate;
	}

	public String getFinanceId() {
		return FinanceId;
	}

	public void setFinanceId(String financeId) {
		FinanceId = financeId;
	}

	public String getFinanceAmount() {
		return financeAmount;
	}

	public void setFinanceAmount(String financeAmount) {
		this.financeAmount = financeAmount;
	}

	public String getOperateName() {
		return operateName;
	}

	public void setOperateName(String operateName) {
		this.operateName = operateName;
	}

}
