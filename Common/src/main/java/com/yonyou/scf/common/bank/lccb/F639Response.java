package com.yonyou.scf.common.bank.lccb;

public class F639Response {
	//商户号
	private String busiNum;
	//还款总额
	private Double amount;
	//实际应收利息
	private Double interest;
	//应收欠息
	private Double ysqianxi;
	//应收罚息
	private Double yshofaxi;
	//备用字段
	private String filed1;
	//备用字段
	private String filed2;
	//备用字段
	private String filed3;
	public String getBusiNum() {
		return busiNum;
	}
	public void setBusiNum(String busiNum) {
		this.busiNum = busiNum;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getInterest() {
		return interest;
	}
	public void setInterest(Double interest) {
		this.interest = interest;
	}
	public Double getYsqianxi() {
		return ysqianxi;
	}
	public void setYsqianxi(Double ysqianxi) {
		this.ysqianxi = ysqianxi;
	}
	public Double getYshofaxi() {
		return yshofaxi;
	}
	public void setYshofaxi(Double yshofaxi) {
		this.yshofaxi = yshofaxi;
	}
	public String getFiled1() {
		return filed1;
	}
	public void setFiled1(String filed1) {
		this.filed1 = filed1;
	}
	public String getFiled2() {
		return filed2;
	}
	public void setFiled2(String filed2) {
		this.filed2 = filed2;
	}
	public String getFiled3() {
		return filed3;
	}
	public void setFiled3(String filed3) {
		this.filed3 = filed3;
	}
	@Override
	public String toString() {
		return "F639Response [busiNum=" + busiNum + ", amount=" + amount
				+ ", interest=" + interest + ", ysqianxi=" + ysqianxi
				+ ", yshofaxi=" + yshofaxi + ", filed1=" + filed1 + ", filed2="
				+ filed2 + ", filed3=" + filed3 + "]";
	}
	
	
}
