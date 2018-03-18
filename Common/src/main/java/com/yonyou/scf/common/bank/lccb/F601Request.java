package com.yonyou.scf.common.bank.lccb;

import java.io.Serializable;

public class F601Request implements Serializable {

	private static final long serialVersionUID = 2825009859367991293L;
	/**
	 * 商户号
	 */
	private String busiNum;
	
	/**
	 * 商户类别
	 */
	private String busiType;
	
	/**
	 * 备用字段1
	 */
	private String filed1;
	
	/**
	 * 备用字段2
	 */
	private String filed2;
	/**
	 * 备用字段3
	 */
	private String filed3;
	
	
	public String getBusiNum() {
		return busiNum;
	}


	public String getBusiType() {
		return busiType;
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


	public void setBusiType(String busiType) {
		this.busiType = busiType;
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
		return "F601 [busiNum=" + busiNum + ", busiType=" + busiType
				+ ", filed1=" + filed1 + ", filed2=" + filed2 + ", filed3="
				+ filed3 + "]";
	}
	
	
}
