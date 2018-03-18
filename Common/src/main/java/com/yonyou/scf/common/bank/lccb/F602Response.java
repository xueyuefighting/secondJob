package com.yonyou.scf.common.bank.lccb;

public class F602Response {
	/**
	 * 商户号
	 */
	private String busiNum;
	/**
	 * 处理结果
	 */
	private String result;
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
	public String getResult() {
		return result;
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
	public void setResult(String result) {
		this.result = result;
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
		return "F602Response [busiNum=" + busiNum + ", result=" + result
				+ ", filed1=" + filed1 + ", filed2=" + filed2 + ", filed3="
				+ filed3 + "]";
	}
	
}
