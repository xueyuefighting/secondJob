package com.yonyou.scf.common.bank.lccb;

import java.io.Serializable;

public class F606Request implements Serializable{
 
	private static final long serialVersionUID = 8152922943535605089L;
	
	/**
	 * 商户号
	 */
	private String busiNum;
	
	/**
	 * 币种代码
	 */
	private String currency;
	
	/**
	 * 商户端流水号
	 */
	private String busiSerialNum;
	/**
	 * 会员虚拟账号
	 */
	private String memNum;
	/**
	 * 入金账号
	 */
	
	private String accNum;
	
	/**
	 * 申请入金金额
	 */
	private Double ammount;
	
	/**
	 * 申请时间
	 */
	private String time;
	
	/**
	 * 是否跨行
	 */
	private String isCrossLine;
	
	/**
	 * 手续费模型编号
	 */
	private String feeNo;
	/**
	 * 手续费
	 */
	private String fee;
	
	/**
	 * 收款账号
	 */
	private String toAccNum;
	
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

	public String getCurrency() {
		return currency;
	}

	public String getBusiSerialNum() {
		return busiSerialNum;
	}

	public String getMemNum() {
		return memNum;
	}

	public String getAccNum() {
		return accNum;
	}

	public Double getAmmount() {
		return ammount;
	}

	public String getTime() {
		return time;
	}

	public String getIsCrossLine() {
		return isCrossLine;
	}

	public String getFeeNo() {
		return feeNo;
	}

	public String getFee() {
		return fee;
	}

	public String getToAccNum() {
		return toAccNum;
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

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setBusiSerialNum(String busiSerialNum) {
		this.busiSerialNum = busiSerialNum;
	}

	public void setMemNum(String memNum) {
		this.memNum = memNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public void setAmmount(Double ammount) {
		this.ammount = ammount;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setIsCrossLine(String isCrossLine) {
		this.isCrossLine = isCrossLine;
	}

	public void setFeeNo(String feeNo) {
		this.feeNo = feeNo;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public void setToAccNum(String toAccNum) {
		this.toAccNum = toAccNum;
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
		return "F606Request [busiNum=" + busiNum + ", currency=" + currency
				+ ", busiSerialNum=" + busiSerialNum + ", memNum=" + memNum
				+ ", accNum=" + accNum + ", ammount=" + ammount + ", time="
				+ time + ", isCrossLine=" + isCrossLine + ", feeNo=" + feeNo
				+ ", fee=" + fee + ", toAccNum=" + toAccNum + ", filed1="
				+ filed1 + ", filed2=" + filed2 + ", filed3=" + filed3 + "]";
	}
	
}
