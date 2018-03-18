package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf98006Request implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 融资单编号
	@NotNull(message = "融资单编号不能为空，且不超过20")
	@Max(value = 20, message = "融资单编号不超过20")
	private Long financingApplicationNo;

	// 借款企业ID
	@NotNull(message = "借款企业ID不能为空，且不超过32")
	@Max(value = 32, message = "借款企业ID不超过32")
	private Long agencyId;

	// 资方ID
	@NotNull(message = "资方ID不能为空，且不超过32")
	@Max(value = 32, message = "资方ID不超过32")
	private Long capitalId;

	// 还款金额
	@NotNull(message = "还款金额不能为空，且不超过20")
	@Max(value = 20, message = "还款金额不超过20")
	private Long amount;

	// 币种
	@NotNull(message = "币种不能为空，且不超过3")
	@Max(value = 3, message = "币种不超过3")
	private String currency;

	// 还款时间
	@NotNull(message = "还款时间不能为空，且不超过10")
	@Max(value = 10, message = "还款时间不超过10")
	private String repaymentTime;

	// 创建用户
	@NotNull(message = "创建用户不能为空，且不超过20")
	@Max(value = 20, message = "创建用户不超过20")
	private Long createUser;

	@NotNull(message = "产品ID不能为空，且不超过20")
	@Max(value = 20, message = "产品ID不超过20")
	private Long productId;

	@NotNull(message = "还款明细主键ID不能为空，且不超过20")
	@Max(value = 20, message = "还款明细主键ID不超过20")
	private Long repayId;

	public Long getFinancingApplicationNo() {
		return financingApplicationNo;
	}

	public void setFinancingApplicationNo(Long financingApplicationNo) {
		this.financingApplicationNo = financingApplicationNo;
	}

	public Long getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(Long agencyId) {
		this.agencyId = agencyId;
	}

	public Long getCapitalId() {
		return capitalId;
	}

	public void setCapitalId(Long capitalId) {
		this.capitalId = capitalId;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getRepaymentTime() {
		return repaymentTime;
	}

	public void setRepaymentTime(String repaymentTime) {
		this.repaymentTime = repaymentTime;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

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
