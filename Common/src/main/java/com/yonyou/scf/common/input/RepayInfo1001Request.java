package com.yonyou.scf.common.input;

import java.io.Serializable;


import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

public class RepayInfo1001Request implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String repaymentNo;
	@Length(max = 17, message = "还款日期不超过17位")
	private String repayTimeFrom;
	@Length(max = 17, message = "还款日期不超过17位")
	private String repayTimeTo;
	private Long productId;
	@Length(max = 2, message = "融资模式不超过2位")
	private String financeMode;
	private Long agencyId;
	private Long capitalId;
	private Long companyId;
	private String token ;
	

	public String getRepaymentNo() {
		return repaymentNo;
	}

	public void setRepaymentNo(String repaymentNo) {
		this.repaymentNo = repaymentNo;
	}

	public String getRepayTimeFrom() {
		return repayTimeFrom;
	}

	public void setRepayTimeFrom(String repayTimeFrom) {
		this.repayTimeFrom = repayTimeFrom;
	}

	public String getRepayTimeTo() {
		return repayTimeTo;
	}

	public void setRepayTimeTo(String repayTimeTo) {
		this.repayTimeTo = repayTimeTo;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getFinanceMode() {
		return financeMode;
	}

	public void setFinanceMode(String financeMode) {
		this.financeMode = financeMode;
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

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
