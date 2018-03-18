package com.yonyou.scf.common.input;

import java.io.Serializable;

/**
 * 居间服务费
 * @author zhangjlm
 *
 */
public class FWFContractBean implements Serializable {

	private static final long serialVersionUID = -7404498146448359681L;
	
	private String secondCompanyName;//借款方企业名称
	private String secondCompanyAdress;//借款企业住所地
	private String secondeLegalPersonName;//借款企业的法人（个人的时候空着）
	private String secondLegalPersonTel;//借款企业法人电话
	private String secondLegalPersonMail;//借款企业法人邮箱
	private String productServiceRate;//产品服务费率  不要百分号
	
	private String currentYear;//当前年 *
	private String currentMonth;//当前月 *
	private String currentDay;//当前日 *
	public String getSecondCompanyName() {
		return secondCompanyName;
	}
	public void setSecondCompanyName(String secondCompanyName) {
		this.secondCompanyName = secondCompanyName;
	}
	public String getSecondCompanyAdress() {
		return secondCompanyAdress;
	}
	public void setSecondCompanyAdress(String secondCompanyAdress) {
		this.secondCompanyAdress = secondCompanyAdress;
	}
	public String getSecondeLegalPersonName() {
		return secondeLegalPersonName;
	}
	public void setSecondeLegalPersonName(String secondeLegalPersonName) {
		this.secondeLegalPersonName = secondeLegalPersonName;
	}
	public String getSecondLegalPersonTel() {
		return secondLegalPersonTel;
	}
	public void setSecondLegalPersonTel(String secondLegalPersonTel) {
		this.secondLegalPersonTel = secondLegalPersonTel;
	}
	public String getSecondLegalPersonMail() {
		return secondLegalPersonMail;
	}
	public void setSecondLegalPersonMail(String secondLegalPersonMail) {
		this.secondLegalPersonMail = secondLegalPersonMail;
	}
	public String getProductServiceRate() {
		return productServiceRate;
	}
	public void setProductServiceRate(String productServiceRate) {
		this.productServiceRate = productServiceRate;
	}
	public String getCurrentYear() {
		return currentYear;
	}
	public void setCurrentYear(String currentYear) {
		this.currentYear = currentYear;
	}
	public String getCurrentMonth() {
		return currentMonth;
	}
	public void setCurrentMonth(String currentMonth) {
		this.currentMonth = currentMonth;
	}
	public String getCurrentDay() {
		return currentDay;
	}
	public void setCurrentDay(String currentDay) {
		this.currentDay = currentDay;
	}
	@Override
	public String toString() {
		return "FWFContractBean [secondCompanyName=" + secondCompanyName + ", secondCompanyAdress="
				+ secondCompanyAdress + ", secondeLegalPersonName=" + secondeLegalPersonName + ", secondLegalPersonTel="
				+ secondLegalPersonTel + ", secondLegalPersonMail=" + secondLegalPersonMail + ", productServiceRate="
				+ productServiceRate + ", currentYear=" + currentYear + ", currentMonth=" + currentMonth
				+ ", currentDay=" + currentDay + "]";
	}
	public FWFContractBean(String secondCompanyName, String secondCompanyAdress, String secondeLegalPersonName,
			String secondLegalPersonTel, String secondLegalPersonMail, String productServiceRate, String currentYear,
			String currentMonth, String currentDay) {
		super();
		this.secondCompanyName = secondCompanyName;
		this.secondCompanyAdress = secondCompanyAdress;
		this.secondeLegalPersonName = secondeLegalPersonName;
		this.secondLegalPersonTel = secondLegalPersonTel;
		this.secondLegalPersonMail = secondLegalPersonMail;
		this.productServiceRate = productServiceRate;
		this.currentYear = currentYear;
		this.currentMonth = currentMonth;
		this.currentDay = currentDay;
	}
	public FWFContractBean() {
	}
	
	
	
}
