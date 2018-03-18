package com.yonyou.scf.common.output;

import java.io.Serializable;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance3017Response   implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//融资单编号
	private String financeNo;
	//融资单状态
	private String financeStatus;
	//融资单状态
	//借款方
	private String agencyId;
	//融资模式
	private String financeMode;
	//融资金额
	private Long financeAmount;
	//融资申请ID
	private Long financeId;
	//融资申请日期
	private String createTime;
	
	public String getFinanceNo() {
		return financeNo;
	}

	public void setFinanceNo(String financeNo) {
		this.financeNo = financeNo;
	}

	public String getFinanceStatus() {
		return financeStatus;
	}

	public void setFinanceStatus(String financeStatus) {
		this.financeStatus = financeStatus;
	}

	public String getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(String agencyId) {
		this.agencyId = agencyId;
	}

	public String getFinanceMode() {
		return financeMode;
	}

	public void setFinanceMode(String financeMode) {
		this.financeMode = financeMode;
	}

	public Long getFinanceAmount() {
		return financeAmount;
	}

	public void setFinanceAmount(Long financeAmount) {
		this.financeAmount = financeAmount;
	}

	public Long getFinanceId() {
		return financeId;
	}

	public void setFinanceId(Long financeId) {
		this.financeId = financeId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
