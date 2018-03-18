package com.yonyou.scf.common.bank.lccb;

import java.io.Serializable;

public class F637Request implements Serializable{

	private static final long serialVersionUID = 6860929332414555604L;
	
	/**
	 * 商户号
	 */
	private String busiNum;
	
	/**
	 * 商户端流水号
	 */
	private String busiSerialNum;

	/**
	 * 会员编号
	 */
	private String memNum;
	
	/**
	 * 额度编号
	 */
	private String crLmtId;

	/**
	 * 产品
	 */
	private String productCode;
	
	/**
	 * 融资申请批复编号
	 */
	private String financingNum;

	/**
	 * 贷款金额 
	 */
	private Double loanAmount;
	
	/**
	 * 贷款期限
	 */
	//private String loanTerm;
	
	/**
	 * 币种
	 */
	private String currency;
	
	 /** 
	 * 是否入金
	 */
	private String isRecharge;

	/**
	 * 受托账户
	 */
	private String account;
	
	/**
	 * 受托账户名称
	 */
	private String accountName;

	/**
	 * 受托账户开户行全称
	 */
	private String accountBankName;
	
	/**
	 * 受托联行行号
	 */
	private String jointLineNum;

	/**
	 * 是否跨行
	 */
	private String isCrossLine;
	
	/**
	 * 受托金额
	 */
	private Double amount;

	/**
	 * 手续费模型编号
	 */
	private String feeNo;

	/**
	 * 手续费
	 */
	private Double fee;
	
	/**
	 * 备用字段
	 */
	private String filed1;

	/**
	 * 备用字段
	 */
	private String filed2;
	
	/**
	 * 备用字段
	 */
	private String filed3;

	public String getBusiNum() {
		return busiNum;
	}

	public String getBusiSerialNum() {
		return busiSerialNum;
	}

	public String getMemNum() {
		return memNum;
	}

	public String getCrLmtId() {
		return crLmtId;
	}

	public String getProductCode() {
		return productCode;
	}

	public String getFinancingNum() {
		return financingNum;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

//	public String getLoanTerm() {
//		return loanTerm;
//	}

	public String getCurrency() {
		return currency;
	}

	public String getIsRecharge() {
		return isRecharge;
	}

	public String getAccount() {
		return account;
	}

	public String getAccountName() {
		return accountName;
	}

	public String getAccountBankName() {
		return accountBankName;
	}

	public String getJointLineNum() {
		return jointLineNum;
	}

	public String getIsCrossLine() {
		return isCrossLine;
	}

	public Double getAmount() {
		return amount;
	}

	public String getFeeNo() {
		return feeNo;
	}

	public Double getFee() {
		return fee;
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

	public void setBusiSerialNum(String busiSerialNum) {
		this.busiSerialNum = busiSerialNum;
	}

	public void setMemNum(String memNum) {
		this.memNum = memNum;
	}

	public void setCrLmtId(String crLmtId) {
		this.crLmtId = crLmtId;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public void setFinancingNum(String financingNum) {
		this.financingNum = financingNum;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

//	public void setLoanTerm(String loanTerm) {
//		this.loanTerm = loanTerm;
//	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setIsRecharge(String isRecharge) {
		this.isRecharge = isRecharge;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void setAccountBankName(String accountBankName) {
		this.accountBankName = accountBankName;
	}

	public void setJointLineNum(String jointLineNum) {
		this.jointLineNum = jointLineNum;
	}

	public void setIsCrossLine(String isCrossLine) {
		this.isCrossLine = isCrossLine;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void setFeeNo(String feeNo) {
		this.feeNo = feeNo;
	}

	public void setFee(Double fee) {
		this.fee = fee;
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
		return "F637Request [busiNum=" + busiNum + ", busiSerialNum="
				+ busiSerialNum + ", memNum=" + memNum + ", crLmtId=" + crLmtId
				+ ", productCode=" + productCode + ", financingNum="
				+ financingNum + ", loanAmount=" + loanAmount + ", currency="
				+ currency + ", isRecharge=" + isRecharge + ", account="
				+ account + ", accountName=" + accountName
				+ ", accountBankName=" + accountBankName + ", jointLineNum="
				+ jointLineNum + ", isCrossLine=" + isCrossLine + ", amount="
				+ amount + ", feeNo=" + feeNo + ", fee=" + fee + ", filed1="
				+ filed1 + ", filed2=" + filed2 + ", filed3=" + filed3 + "]";
	}
	
}
