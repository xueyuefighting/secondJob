package com.yonyou.scf.common.output;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance1028Response   implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//区分是那个资方
	private String capitalNo;
	//融资单编号
	private String financeNo;
	//产品名称
	private String productName;
	//融资单状态
	private String financeStatus;
	//融资单状态
	//借款方
	private String agencyId;
	//资方名称
	private String captitalId;
	//融资模式
	private String financeMode;
	//融资模式名称
	//还款方式名称
	private String repayType;
	//产品利率
	private float productRate;
	//逾期利率
	//是否冻结自有资金
	private Long financeAmount;
	private String financePurpose;
	//融资期限
	private int financeDay;
	//放款日期

	//融资申请ID
	private Long financeId;
	//核心企业ID
	private Long companyId;
	//融资申请日期
	private String createTime;
	//融资用途其他的场合
	private String financePurposeMark;
	
	public String getCapitalNo() {
		return capitalNo;
	}

	public void setCapitalNo(String capitalNo) {
		this.capitalNo = capitalNo;
	}

	public String getFinanceNo() {
		return financeNo;
	}

	public void setFinanceNo(String financeNo) {
		this.financeNo = financeNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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

	public String getCaptitalId() {
		return captitalId;
	}

	public void setCaptitalId(String captitalId) {
		this.captitalId = captitalId;
	}

	public String getFinanceMode() {
		return financeMode;
	}

	public void setFinanceMode(String financeMode) {
		this.financeMode = financeMode;
	}

	public String getRepayType() {
		return repayType;
	}

	public void setRepayType(String repayType) {
		this.repayType = repayType;
	}

	public float getProductRate() {
		return productRate;
	}

	public void setProductRate(float productRate) {
		this.productRate = productRate;
	}

	public Long getFinanceAmount() {
		return financeAmount;
	}

	public void setFinanceAmount(Long financeAmount) {
		this.financeAmount = financeAmount;
	}

	public String getFinancePurpose() {
		return financePurpose;
	}

	public void setFinancePurpose(String financePurpose) {
		this.financePurpose = financePurpose;
	}

	public int getFinanceDay() {
		return financeDay;
	}

	public void setFinanceDay(int financeDay) {
		this.financeDay = financeDay;
	}

	public Long getFinanceId() {
		return financeId;
	}

	public void setFinanceId(Long financeId) {
		this.financeId = financeId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getFinancePurposeMark() {
		return financePurposeMark;
	}

	public void setFinancePurposeMark(String financePurposeMark) {
		this.financePurposeMark = financePurposeMark;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
