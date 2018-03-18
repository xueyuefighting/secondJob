package com.yonyou.scf.common.bank.lccb;

import java.io.Serializable;

public class F617Request implements Serializable{

	private static final long serialVersionUID = -4634815967422149205L;

	/**
	 * 商户号
	 */
	private String busiNum;
	
	/**
	 * 商户端流水号
	 */
	private String busiSerialNum;
	
	/**
	 * 订单号
	 */
	private String orderNum;

	/**
	 * 付款方会员号
	 */
	private String fromAccountName;
	
	/**
	 * 金额
	 */
	private Double amount;

	/**
	 * 付款方手续费
	 */
	private Double fee;
	
	/**
	 * 收款方会员号
	 */
	private String toAccountName;
	
	/**
	 * 收款方手续费
	 */
	private Double otherFee;

	
	/**
	 * 交易管理类型
	 */
	private String type;

	/**
	 * 买方保证金
	 */
	private Double fromBail;
	
	/**
	 * 卖方保证金
	 */
	private Double toBail;

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

	public String getOrderNum() {
		return orderNum;
	}

	public String getFromAccountName() {
		return fromAccountName;
	}

	public Double getAmount() {
		return amount;
	}

	public Double getFee() {
		return fee;
	}

	public String getToAccountName() {
		return toAccountName;
	}

	public Double getOtherFee() {
		return otherFee;
	}

	public String getType() {
		return type;
	}

	public Double getFromBail() {
		return fromBail;
	}

	public Double getToBail() {
		return toBail;
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

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public void setFromAccountName(String fromAccountName) {
		this.fromAccountName = fromAccountName;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public void setToAccountName(String toAccountName) {
		this.toAccountName = toAccountName;
	}

	public void setOtherFee(Double otherFee) {
		this.otherFee = otherFee;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setFromBail(Double fromBail) {
		this.fromBail = fromBail;
	}

	public void setToBail(Double toBail) {
		this.toBail = toBail;
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
		return "F617Request [busiNum=" + busiNum + ", busiSerialNum="
				+ busiSerialNum + ", orderNum=" + orderNum
				+ ", fromAccountName=" + fromAccountName + ", amount=" + amount
				+ ", fee=" + fee + ", toAccountName=" + toAccountName
				+ ", otherFee=" + otherFee + ", type=" + type + ", fromBail="
				+ fromBail + ", toBail=" + toBail + ", filed1=" + filed1
				+ ", filed2=" + filed2 + ", filed3=" + filed3 + "]";
	}

}
