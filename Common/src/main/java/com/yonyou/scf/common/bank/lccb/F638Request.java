package com.yonyou.scf.common.bank.lccb;

import java.io.Serializable;

public class F638Request implements Serializable{

	private static final long serialVersionUID = 6107825369277543538L;
	
	//商户号
	private String busiNum;
	//会员编号
	private String memNum;
	//借据号
	private String fcsSerialNum;
	//商户端流水号
	private String busiSerialNum;
	//还款类型
	private String repaymentType;
	//还款模式
	private String repaymentMode;
	//还款金额
	private Double amount;
	//归还欠息
	private Double ysqianxi;
	//佣金金额
	private Double brokerage;
	//还款方式
	private String filed1;
	public String getBusiNum() {
		return busiNum;
	}
	public void setBusiNum(String busiNum) {
		this.busiNum = busiNum;
	}
	public String getMemNum() {
		return memNum;
	}
	public void setMemNum(String memNum) {
		this.memNum = memNum;
	}
	public String getFcsSerialNum() {
		return fcsSerialNum;
	}
	public void setFcsSerialNum(String fcsSerialNum) {
		this.fcsSerialNum = fcsSerialNum;
	}
	public String getBusiSerialNum() {
		return busiSerialNum;
	}
	public void setBusiSerialNum(String busiSerialNum) {
		this.busiSerialNum = busiSerialNum;
	}
	public String getRepaymentType() {
		return repaymentType;
	}
	public void setRepaymentType(String repaymentType) {
		this.repaymentType = repaymentType;
	}
	public String getRepaymentMode() {
		return repaymentMode;
	}
	public void setRepaymentMode(String repaymentMode) {
		this.repaymentMode = repaymentMode;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getYsqianxi() {
		return ysqianxi;
	}
	public void setYsqianxi(Double ysqianxi) {
		this.ysqianxi = ysqianxi;
	}
	public Double getBrokerage() {
		return brokerage;
	}
	public void setBrokerage(Double brokerage) {
		this.brokerage = brokerage;
	}
	public String getFiled1() {
		return filed1;
	}
	public void setFiled1(String filed1) {
		this.filed1 = filed1;
	}
	@Override
	public String toString() {
		return "F638Request [busiNum=" + busiNum + ", memNum=" + memNum
				+ ", fcsSerialNum=" + fcsSerialNum + ", busiSerialNum="
				+ busiSerialNum + ", repaymentType=" + repaymentType
				+ ", repaymentMode=" + repaymentMode + ", amount=" + amount
				+ ", ysqianxi=" + ysqianxi + ", brokerage=" + brokerage
				+ ", filed1=" + filed1 + "]";
	}
	
	

	
}
