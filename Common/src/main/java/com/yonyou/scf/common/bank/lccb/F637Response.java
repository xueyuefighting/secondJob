package com.yonyou.scf.common.bank.lccb;

public class F637Response {
	
	private String busiNum;
	
	private String memNum;
	
	private String fcsSerialNum;
	
	private String busiSerialNum;
	
	private Double loanAmount;
	
	private Double giveAmount;
	
	private String loanWorkDate;
	
	private String loanExpireDate;
	
	private String loanTerm;
	
	private String feeNo;
	
	private String loanAccountNum;
	
	private String repAccountNum;
	
	private String epaymentModel;
	
	private Double yearInterestRate;
	
	private String filed1;
	
	private String filed2;
	
	private String filed3;

	public String getBusiNum() {
		return busiNum;
	}

	public String getMemNum() {
		return memNum;
	}

	public String getFcsSerialNum() {
		return fcsSerialNum;
	}

	public String getBusiSerialNum() {
		return busiSerialNum;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public Double getGiveAmount() {
		return giveAmount;
	}

	public String getLoanWorkDate() {
		return loanWorkDate;
	}

	public String getLoanExpireDate() {
		return loanExpireDate;
	}

	public String getLoanTerm() {
		return loanTerm;
	}

	public String getFeeNo() {
		return feeNo;
	}

	public String getLoanAccountNum() {
		return loanAccountNum;
	}

	public String getRepAccountNum() {
		return repAccountNum;
	}

	public String getEpaymentModel() {
		return epaymentModel;
	}

	public Double getYearInterestRate() {
		return yearInterestRate;
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

	public void setBusiNum(String busiNum) {
		this.busiNum = busiNum;
	}

	public void setMemNum(String memNum) {
		this.memNum = memNum;
	}

	public void setFcsSerialNum(String fcsSerialNum) {
		this.fcsSerialNum = fcsSerialNum;
	}

	public void setBusiSerialNum(String busiSerialNum) {
		this.busiSerialNum = busiSerialNum;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public void setGiveAmount(Double giveAmount) {
		this.giveAmount = giveAmount;
	}

	public void setLoanWorkDate(String loanWorkDate) {
		this.loanWorkDate = loanWorkDate;
	}

	public void setLoanExpireDate(String loanExpireDate) {
		this.loanExpireDate = loanExpireDate;
	}

	public void setLoanTerm(String loanTerm) {
		this.loanTerm = loanTerm;
	}

	public void setFeeNo(String feeNo) {
		this.feeNo = feeNo;
	}

	public void setLoanAccountNum(String loanAccountNum) {
		this.loanAccountNum = loanAccountNum;
	}

	public void setRepAccountNum(String repAccountNum) {
		this.repAccountNum = repAccountNum;
	}

	public void setEpaymentModel(String epaymentModel) {
		this.epaymentModel = epaymentModel;
	}

	public void setYearInterestRate(Double yearInterestRate) {
		this.yearInterestRate = yearInterestRate;
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
		return "F637Response [busiNum=" + busiNum + ", memNum=" + memNum
				+ ", fcsSerialNum=" + fcsSerialNum + ", busiSerialNum="
				+ busiSerialNum + ", loanAmount=" + loanAmount
				+ ", giveAmount=" + giveAmount + ", loanWorkDate="
				+ loanWorkDate + ", loanExpireDate=" + loanExpireDate
				+ ", loanTerm=" + loanTerm + ", feeNo=" + feeNo
				+ ", loanAccountNum=" + loanAccountNum + ", repAccountNum="
				+ repAccountNum + ", epaymentModel=" + epaymentModel
				+ ", yearInterestRate=" + yearInterestRate + ", filed1="
				+ filed1 + ", filed2=" + filed2 + ", filed3=" + filed3 + "]";
	}
	
}
