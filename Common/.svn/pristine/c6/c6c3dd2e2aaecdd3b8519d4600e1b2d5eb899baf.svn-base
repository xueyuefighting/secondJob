package com.yonyou.scf.common.input;

import java.io.Serializable;


import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf98010Request implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Length(max = 17, message = "融资单编号不超过17位")
	private String financeNo;
	private Long capitalId;
	private Long companyId;
	@Length(max = 17, message = "融资开始日不超过17位")
	private String repayTimeFrom;
	@Length(max = 17, message = "融资开始日不超过17位")
	private String repayTimeTo;
	@Length(max = 17, message = "融资到期日不超过17位")
	private String financeEndDateFrom;
	@Length(max = 17, message = "融资到期日不超过17位")
	private String financeEndDateTo;
	private Long productId;
	@Length(max = 2, message = "融资模式不超过2位")
	private String financeMode;
	private Long agencyId;
	@Length(max = 2, message = "融资单状态不超过2位")
	private String financeStatus;
	
	
	private String token ;
	public String getFinanceNo() {
		return financeNo;
	}
	public void setFinanceNo(String financeNo) {
		this.financeNo = financeNo;
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
	public String getFinanceEndDateFrom() {
		return financeEndDateFrom;
	}
	public void setFinanceEndDateFrom(String financeEndDateFrom) {
		this.financeEndDateFrom = financeEndDateFrom;
	}
	public String getFinanceEndDateTo() {
		return financeEndDateTo;
	}
	public void setFinanceEndDateTo(String financeEndDateTo) {
		this.financeEndDateTo = financeEndDateTo;
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
	public String getFinanceStatus() {
		return financeStatus;
	}
	public void setFinanceStatus(String financeStatus) {
		this.financeStatus = financeStatus;
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
