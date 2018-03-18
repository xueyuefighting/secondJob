package com.yonyou.scf.common.bank.lccb;

import java.io.Serializable;
import java.util.Date;

public class F640Response_DataList  implements Serializable{
	
	private static final long serialVersionUID = -87518514402452252L;
	//融资品种
	private String lmtType;
	//额度编号
	private String crLmtId;
	//合同编号
	private String contractNo;
	//授信额度
	private Double lmtAmt;
	//可用额度
	private Double lmtAmtUseable;
	//融资比例
	private Double financeScale;
	//币种
	private String currency;
	//生效日(YYYYMMDD)
	private Date effDay;
	//到期日(YYYYMMDD)
	private Date exDay;
	//贷款期限
	private String loanTerm;
	//执行利率
	private Double yearInterestRate;
	//逾期罚息率
	private Double penaltyRate;
	//未按合同贷款用途罚息利率 
	private Double abPenaltyRate;
	//贷款本息归还方式
	private String repayMode;
	//还款账号
	private String repayAccNum;
	//备用字段penaltyRate
	private String filed1;
	//备用字段penaltyRate
	private String filed2;
	//备用字段
	private String filed3;
	public String getLmtType() {
		return lmtType;
	}
	public String getCrLmtId() {
		return crLmtId;
	}
	public String getContractNo() {
		return contractNo;
	}
	public Double getLmtAmt() {
		return lmtAmt;
	}
	public Double getLmtAmtUseable() {
		return lmtAmtUseable;
	}
	public Double getFinanceScale() {
		return financeScale;
	}
	public String getCurrency() {
		return currency;
	}
	public Date getEffDay() {
		return effDay;
	}
	public Date getExDay() {
		return exDay;
	}
	public String getLoanTerm() {
		return loanTerm;
	}
	public Double getYearInterestRate() {
		return yearInterestRate;
	}
	public Double getPenaltyRate() {
		return penaltyRate;
	}
	public Double getAbPenaltyRate() {
		return abPenaltyRate;
	}
	public String getRepayMode() {
		return repayMode;
	}
	public String getRepayAccNum() {
		return repayAccNum;
	}
	public String getFiled1() {
		return filed1;
	}
	public String getFiled2() {
		return filed2;
	}
	public String getFiled3() {
		return filed3;
	}
	public void setLmtType(String lmtType) {
		this.lmtType = lmtType;
	}
	public void setCrLmtId(String crLmtId) {
		this.crLmtId = crLmtId;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public void setLmtAmt(Double lmtAmt) {
		this.lmtAmt = lmtAmt;
	}
	public void setLmtAmtUseable(Double lmtAmtUseable) {
		this.lmtAmtUseable = lmtAmtUseable;
	}
	public void setFinanceScale(Double financeScale) {
		this.financeScale = financeScale;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public void setEffDay(Date effDay) {
		this.effDay = effDay;
	}
	public void setExDay(Date exDay) {
		this.exDay = exDay;
	}
	public void setLoanTerm(String loanTerm) {
		this.loanTerm = loanTerm;
	}
	public void setYearInterestRate(Double yearInterestRate) {
		this.yearInterestRate = yearInterestRate;
	}
	public void setPenaltyRate(Double penaltyRate) {
		this.penaltyRate = penaltyRate;
	}
	public void setAbPenaltyRate(Double abPenaltyRate) {
		this.abPenaltyRate = abPenaltyRate;
	}
	public void setRepayMode(String repayMode) {
		this.repayMode = repayMode;
	}
	public void setRepayAccNum(String repayAccNum) {
		this.repayAccNum = repayAccNum;
	}
	public void setFiled1(String filed1) {
		this.filed1 = filed1;
	}
	public void setFiled2(String filed2) {
		this.filed2 = filed2;
	}
	public void setFiled3(String filed3) {
		this.filed3 = filed3;
	}
	@Override
	public String toString() {
		return "F640Response_DataList [lmtType=" + lmtType + ", crLmtId="
				+ crLmtId + ", contractNo=" + contractNo + ", lmtAmt=" + lmtAmt
				+ ", lmtAmtUseable=" + lmtAmtUseable + ", financeScale="
				+ financeScale + ", currency=" + currency + ", effDay="
				+ effDay + ", exDay=" + exDay + ", loanTerm=" + loanTerm
				+ ", yearInterestRate=" + yearInterestRate + ", penaltyRate="
				+ penaltyRate + ", abPenaltyRate=" + abPenaltyRate
				+ ", repayMode=" + repayMode + ", repayAccNum=" + repayAccNum
				+ ", filed1=" + filed1 + ", filed2=" + filed2 + ", filed3="
				+ filed3 + "]";
	}
	
}
