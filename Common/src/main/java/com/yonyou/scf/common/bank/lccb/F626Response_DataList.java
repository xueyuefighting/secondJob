package com.yonyou.scf.common.bank.lccb;

public class F626Response_DataList {
	
	private String fcsSerialNum;
	
	private String accName;
	
	private String AccNum;
	
	private String addReduce;
	
	private Double tradeAmount;
	
	private String currency;
	
	private String procTime;
	
	private String otherAccBankName;
	
	private String otherAccName;
	
	private String otherAccNum;
	
	private String memName;
	
	private String memNum;
	
	private String brief;
	
	private String filed1;
	
	private String filed2;
	
	private String filed3;

	public String getFcsSerialNum() {
		return fcsSerialNum;
	}

	public String getAccName() {
		return accName;
	}

	public String getAccNum() {
		return AccNum;
	}

	public String getAddReduce() {
		return addReduce;
	}

	public Double getTradeAmount() {
		return tradeAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public String getProcTime() {
		return procTime;
	}

	public String getOtherAccBankName() {
		return otherAccBankName;
	}

	public String getOtherAccName() {
		return otherAccName;
	}

	public String getOtherAccNum() {
		return otherAccNum;
	}

	public String getMemName() {
		return memName;
	}

	public String getMemNum() {
		return memNum;
	}

	public String getBrief() {
		return brief;
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

	public void setFcsSerialNum(String fcsSerialNum) {
		this.fcsSerialNum = fcsSerialNum;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public void setAccNum(String accNum) {
		AccNum = accNum;
	}

	public void setAddReduce(String addReduce) {
		this.addReduce = addReduce;
	}

	public void setTradeAmount(Double tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setProcTime(String procTime) {
		this.procTime = procTime;
	}

	public void setOtherAccBankName(String otherAccBankName) {
		this.otherAccBankName = otherAccBankName;
	}

	public void setOtherAccName(String otherAccName) {
		this.otherAccName = otherAccName;
	}

	public void setOtherAccNum(String otherAccNum) {
		this.otherAccNum = otherAccNum;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public void setMemNum(String memNum) {
		this.memNum = memNum;
	}

	public void setBrief(String brief) {
		this.brief = brief;
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
		return "F626Response_DataList [fcsSerialNum=" + fcsSerialNum
				+ ", accName=" + accName + ", AccNum=" + AccNum
				+ ", addReduce=" + addReduce + ", tradeAmount=" + tradeAmount
				+ ", currency=" + currency + ", procTime=" + procTime
				+ ", otherAccBankName=" + otherAccBankName + ", otherAccName="
				+ otherAccName + ", otherAccNum=" + otherAccNum + ", memName="
				+ memName + ", memNum=" + memNum + ", brief=" + brief
				+ ", filed1=" + filed1 + ", filed2=" + filed2 + ", filed3="
				+ filed3 + "]";
	}

	
}
