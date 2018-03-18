package com.yonyou.scf.common.input;

import java.io.Serializable;


import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance1020Request implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Length(max = 17, message = "融资单编号不超过17位")
	private String financeNo;
	private Long capitalId;
	private Long productId;
	@Length(max = 2, message = "融资模式不超过2位")
	private String financeMode;
	private Long agencyId;
	@Length(max = 2, message = "融资单状态不超过2位")
	private String financeStatus;
	//放款信息用
	@Length(max = 17, message = "融资申请日期不超过17位")
	private String createTimeStart;
	@Length(max = 17, message = "融资申请日期不超过17位")
	private String createTimeEnd;
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

	public String getCreateTimeStart() {
		return createTimeStart;
	}

	public void setCreateTimeStart(String createTimeStart) {
		this.createTimeStart = createTimeStart;
	}

	public String getCreateTimeEnd() {
		return createTimeEnd;
	}

	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
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
