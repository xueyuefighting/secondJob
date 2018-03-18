package com.yonyou.scf.common.bank.lccb;

import java.io.Serializable;

public class F624Request implements Serializable{

	private static final long serialVersionUID = 5169623311644765997L;
	
	/**
	 * 商户号
	 */
	private String busiNum;
	
	/**
	 * 商户端流水号
	 */
	private String busiSerialNum;

	/**
	 * 业务类型
	 */
	private String opeType;
	
	/**
	 * 原请求流水号(暂不启用)
	 */
	private String orgBusiSerialNum;

	/**
	 * 需要调出的会员号
	 */
	private String fromAccountName;
	
	/**
	 * 金额
	 */
	private Double amount;

	/**
	 * 需调入的会员号
	 */
	private String toAccountName;
	
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

	public String getOpeType() {
		return opeType;
	}

	public String getOrgBusiSerialNum() {
		return orgBusiSerialNum;
	}

	public String getFromAccountName() {
		return fromAccountName;
	}

	public Double getAmount() {
		return amount;
	}

	public String getToAccountName() {
		return toAccountName;
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

	public void setOpeType(String opeType) {
		this.opeType = opeType;
	}

	public void setOrgBusiSerialNum(String orgBusiSerialNum) {
		this.orgBusiSerialNum = orgBusiSerialNum;
	}

	public void setFromAccountName(String fromAccountName) {
		this.fromAccountName = fromAccountName;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void setToAccountName(String toAccountName) {
		this.toAccountName = toAccountName;
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
		return "F624Request [busiNum=" + busiNum + ", busiSerialNum="
				+ busiSerialNum + ", opeType=" + opeType
				+ ", orgBusiSerialNum=" + orgBusiSerialNum
				+ ", fromAccountName=" + fromAccountName + ", amount=" + amount
				+ ", toAccountName=" + toAccountName + ", filed1=" + filed1
				+ ", filed2=" + filed2 + ", filed3=" + filed3 + "]";
	}
	
}
