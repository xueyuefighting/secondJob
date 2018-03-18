package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

public class RepayInfo1006Request  implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull(message = "还款计划主表ID不能为空")
	private Long rsId;
	private Long financeId;
	@NotNull(message = "融资模式不能为空")
	private String financeMode;
	private String token;
	@NotNull(message = "还款日期不能为空")
	@Length(max = 10, message = "还款日期不超过10位")
	private String repaymentDate;
	@NotNull(message = "借款方不能为空")
	private Long agencyId;
	@NotNull(message = "产品ID不能为空")
	private Long productId;
	@NotNull(message = "授信ID不能为空")
	private Long creditId;
	public Long getRsId() {
		return rsId;
	}

	public void setRsId(Long rsId) {
		this.rsId = rsId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getFinanceId() {
		return financeId;
	}

	public void setFinanceId(Long financeId) {
		this.financeId = financeId;
	}

	public String getFinanceMode() {
		return financeMode;
	}

	public void setFinanceMode(String financeMode) {
		this.financeMode = financeMode;
	}

	
	public String getRepaymentDate() {
		return repaymentDate;
	}

	public void setRepaymentDate(String repaymentDate) {
		this.repaymentDate = repaymentDate;
	}

	public Long getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(Long agencyId) {
		this.agencyId = agencyId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getCreditId() {
		return creditId;
	}

	public void setCreditId(Long creditId) {
		this.creditId = creditId;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
