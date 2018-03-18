package com.yonyou.scf.common.bank.lccb;

import java.io.Serializable;

public class F612Request implements Serializable{

	private static final long serialVersionUID = -7978720301283501363L;
	
	/**
	 * 商户号
	 */
	private String busiNum;
	
	/**
	 * 操作类型
	 */
	private String flag;

	/**
	 * 商户端流水号
	 */
	private String busiSerialNum;
	
	/**
	 * 币种代码
	 */
	private String currency;

	/**
	 * 发生金额/转出金额
	 */
	private Double amount;
	
	/**
	 * 发生时间
	 */
	private String tradeTime;

	/**
	 * 是否加急
	 */
	private String atOnce;
	
	/**
	 * 手续费模型编号
	 */
	private String feeNo;

	/**
	 * 手续费
	 */
	private Double fee;
	
	/**
	 * 是否跨行
	 */
	private String isCrossLine;

	/**
	 * 转入账户开户行机构号
	 */
	private String targetAccountBankNum;
	
	/**
	 * 转入账户开户行
	 */
	private String targetAccountBank;

	/**
	 * 转入账户开户行全称
	 */
	private String targetAccountBankName;
	
	/**
	 * 转入账户名称
	 */
	private String targetAccountName;

	/**
	 * 转入账号
	 */
	private String targetAccount;
	
	/**
	 * 转出账户名称
	 */
	private String sourceAccountName;

	/**
	 * 转出账号
	 */
	private String sourceAccount;
	
	/**
	 * 备注
	 */
	private String remark;

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

	public String getFlag() {
		return flag;
	}

	public String getBusiSerialNum() {
		return busiSerialNum;
	}

	public String getCurrency() {
		return currency;
	}

	public Double getAmount() {
		return amount;
	}

	public String getTradeTime() {
		return tradeTime;
	}

	public String getAtOnce() {
		return atOnce;
	}

	public String getFeeNo() {
		return feeNo;
	}

	public Double getFee() {
		return fee;
	}

	public String getIsCrossLine() {
		return isCrossLine;
	}

	public String getTargetAccountBankNum() {
		return targetAccountBankNum;
	}

	public String getTargetAccountBank() {
		return targetAccountBank;
	}

	public String getTargetAccountBankName() {
		return targetAccountBankName;
	}

	public String getTargetAccountName() {
		return targetAccountName;
	}

	public String getTargetAccount() {
		return targetAccount;
	}

	public String getSourceAccountName() {
		return sourceAccountName;
	}

	public String getSourceAccount() {
		return sourceAccount;
	}

	public String getRemark() {
		return remark;
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

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public void setBusiSerialNum(String busiSerialNum) {
		this.busiSerialNum = busiSerialNum;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void setTradeTime(String tradeTime) {
		this.tradeTime = tradeTime;
	}

	public void setAtOnce(String atOnce) {
		this.atOnce = atOnce;
	}

	public void setFeeNo(String feeNo) {
		this.feeNo = feeNo;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public void setIsCrossLine(String isCrossLine) {
		this.isCrossLine = isCrossLine;
	}

	public void setTargetAccountBankNum(String targetAccountBankNum) {
		this.targetAccountBankNum = targetAccountBankNum;
	}

	public void setTargetAccountBank(String targetAccountBank) {
		this.targetAccountBank = targetAccountBank;
	}

	public void setTargetAccountBankName(String targetAccountBankName) {
		this.targetAccountBankName = targetAccountBankName;
	}

	public void setTargetAccountName(String targetAccountName) {
		this.targetAccountName = targetAccountName;
	}

	public void setTargetAccount(String targetAccount) {
		this.targetAccount = targetAccount;
	}

	public void setSourceAccountName(String sourceAccountName) {
		this.sourceAccountName = sourceAccountName;
	}

	public void setSourceAccount(String sourceAccount) {
		this.sourceAccount = sourceAccount;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
		return "F612Request [busiNum=" + busiNum + ", flag=" + flag
				+ ", busiSerialNum=" + busiSerialNum + ", currency=" + currency
				+ ", amount=" + amount + ", tradeTime=" + tradeTime
				+ ", atOnce=" + atOnce + ", feeNo=" + feeNo + ", fee=" + fee
				+ ", isCrossLine=" + isCrossLine + ", targetAccountBankNum="
				+ targetAccountBankNum + ", targetAccountBank="
				+ targetAccountBank + ", targetAccountBankName="
				+ targetAccountBankName + ", targetAccountName="
				+ targetAccountName + ", targetAccount=" + targetAccount
				+ ", sourceAccountName=" + sourceAccountName
				+ ", sourceAccount=" + sourceAccount + ", remark=" + remark
				+ ", filed1=" + filed1 + ", filed2=" + filed2 + ", filed3="
				+ filed3 + "]";
	}
	
}
