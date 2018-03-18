package com.yonyou.scf.common.tx.notice;

import java.io.Serializable;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf1208NoticeRequest implements Serializable{

	private static final long serialVersionUID = 2225726893675710907L;

	// 资方ID
	
	private String fundID;

	// 商户断融资方ID
	
	private String fsID;

	// 商户端核心企业ID
	
	private String centerCompanyID;

	// 融资申请流水号
	
	private String financingApplicationNo;

	// 订单编号
	
	private String billNo;

	// 融资产品类型
	
	private Integer financeProductionType;

	// 产品利率
	
	private Integer financeProductionInterest;

	// 预期利率
	
	private Integer overdueInterest;

	// 还款方式
	
	private Integer repayWay;

	// 融资金额
	
	private Integer financeAmount;

	// 申请单状态
	
	private Integer applicationBillStatus;

	public Scf1208NoticeRequest() {
	}

	public String getFundID() {
		return fundID;
	}

	public void setFundID(String fundID) {
		this.fundID = fundID;
	}

	public String getFsID() {
		return fsID;
	}

	public void setFsID(String fsID) {
		this.fsID = fsID;
	}

	public String getCenterCompanyID() {
		return centerCompanyID;
	}

	public void setCenterCompanyID(String centerCompanyID) {
		this.centerCompanyID = centerCompanyID;
	}

	public String getFinancingApplicationNo() {
		return financingApplicationNo;
	}

	public void setFinancingApplicationNo(String financingApplicationNo) {
		this.financingApplicationNo = financingApplicationNo;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public Integer getFinanceProductionType() {
		return financeProductionType;
	}

	public Integer getFinanceProductionInterest() {
		return financeProductionInterest;
	}

	public Integer getOverdueInterest() {
		return overdueInterest;
	}

	public Integer getRepayWay() {
		return repayWay;
	}

	public Integer getFinanceAmount() {
		return financeAmount;
	}

	public Integer getApplicationBillStatus() {
		return applicationBillStatus;
	}

	public void setFinanceProductionType(Integer financeProductionType) {
		this.financeProductionType = financeProductionType;
	}

	public void setFinanceProductionInterest(Integer financeProductionInterest) {
		this.financeProductionInterest = financeProductionInterest;
	}

	public void setOverdueInterest(Integer overdueInterest) {
		this.overdueInterest = overdueInterest;
	}

	public void setRepayWay(Integer repayWay) {
		this.repayWay = repayWay;
	}

	public void setFinanceAmount(Integer financeAmount) {
		this.financeAmount = financeAmount;
	}

	public void setApplicationBillStatus(Integer applicationBillStatus) {
		this.applicationBillStatus = applicationBillStatus;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}