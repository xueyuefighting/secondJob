package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import com.yonyou.scf.common.util.json.JsonUtil;


public class Scf98007Request  implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

	public Long getAgencyId() {
		return agencyId;
	}

	public Long getCapitalId() {
		return capitalId;
	}

	public void setCapitalId(Long capitalId) {
		this.capitalId = capitalId;
	}

	public void setAgencyId(Long agencyId) {
		this.agencyId = agencyId;
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
	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
