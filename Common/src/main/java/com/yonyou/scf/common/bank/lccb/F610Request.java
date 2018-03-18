package com.yonyou.scf.common.bank.lccb;

import java.io.Serializable;

public class F610Request implements Serializable{

	private static final long serialVersionUID = -368102680669090480L;
	
	/**
	 * 商户号
	 */
	private String busiNum;
	
	/**
	 * 资金管控流水号
	 */
	private String fcsSerialNum;
	
	/**
	 * 商户端流水号
	 */
	private String busiSerialNum;
	
	/**
	 * 摘要
	 */
	private String brief;
	
	/**
	 * 入账类型
	 */
	private String depositType;
	
	
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

	public String getFcsSerialNum() {
		return fcsSerialNum;
	}

	public String getBusiSerialNum() {
		return busiSerialNum;
	}

	public String getBrief() {
		return brief;
	}

	public String getDepositType() {
		return depositType;
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

	public void setFcsSerialNum(String fcsSerialNum) {
		this.fcsSerialNum = fcsSerialNum;
	}

	public void setBusiSerialNum(String busiSerialNum) {
		this.busiSerialNum = busiSerialNum;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public void setDepositType(String depositType) {
		this.depositType = depositType;
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
		return "F610Request [busiNum=" + busiNum + ", fcsSerialNum="
				+ fcsSerialNum + ", busiSerialNum=" + busiSerialNum
				+ ", brief=" + brief + ", depositType=" + depositType
				+ ", filed1=" + filed1 + ", filed2=" + filed2 + ", filed3="
				+ filed3 + "]";
	}
	
}
