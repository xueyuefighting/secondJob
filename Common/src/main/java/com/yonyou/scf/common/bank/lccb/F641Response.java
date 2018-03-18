package com.yonyou.scf.common.bank.lccb;

public class F641Response {
	//商户号
	private String busiNum;
	//资金监管流水号
	private String fcsSerialNum;
	//商户端流水号
	private String busiSerialNum;
	//卖方会员虚拟账号
	private String toMemNum;
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
	public String getToMemNum() {
		return toMemNum;
	}
	public void setToMemNum(String toMemNum) {
		this.toMemNum = toMemNum;
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
		return "F641Response [busiNum=" + busiNum + ", fcsSerialNum="
				+ fcsSerialNum + ", busiSerialNum=" + busiSerialNum
				+ ", toMemNum=" + toMemNum + ", filed1=" + filed1 + ", filed2="
				+ filed2 + ", filed3=" + filed3 + "]";
	}
	
	
}
