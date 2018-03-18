package com.yonyou.scf.common.input;

import java.io.Serializable;

import com.yonyou.scf.common.util.AmountFormat;

/**
 * 应收账款转让登记协议
 * @author zhangjlm
 *
 */
public class RecieveCLPBean implements Serializable{
	
	private static final long serialVersionUID = 1187060571718166281L;
	
	private String secondCompanyName;//借款方企业名称
	private String currentYear;//当前年 *
	private String currentMonth;//当前月 *
	private String currentDay;//当前日 *
	private String dJcontractNo;//合同编号 *
	private String bLContractNo;//保理合同编号 *
	private String coreCompanyName;//核心企业名称
	private String recieveBalance;//应收帐款余额
	private String secondeLegalPersonName;//借款企业的法人/代表
	private String financeId;//融资申请ID
	private String creditId;
	public String getSecondCompanyName() {
		return secondCompanyName;
	}
	public void setSecondCompanyName(String secondCompanyName) {
		this.secondCompanyName = secondCompanyName;
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
	
	public String getbLContractNo() {
		return bLContractNo;
	}
	public void setbLContractNo(String bLContractNo) {
		this.bLContractNo = bLContractNo;
	}
	public String getCoreCompanyName() {
		return coreCompanyName;
	}
	public void setCoreCompanyName(String coreCompanyName) {
		this.coreCompanyName = coreCompanyName;
	}
	public String getRecieveBalance() {
		return recieveBalance;
	}
	public void setRecieveBalance(String recieveBalance) {
		String money = recieveBalance;
		this.recieveBalance =  AmountFormat.formatMoneyString(money);
	}
	public String getSecondeLegalPersonName() {
		return secondeLegalPersonName;
	}
	public void setSecondeLegalPersonName(String secondeLegalPersonName) {
		this.secondeLegalPersonName = secondeLegalPersonName;
	}
	
	public String getFinanceId() {
		return financeId;
	}
	public void setFinanceId(String financeId) {
		this.financeId = financeId;
	}
	public RecieveCLPBean() {
	}
	public String getdJcontractNo() {
		return dJcontractNo;
	}
	public void setdJcontractNo(String dJcontractNo) {
		this.dJcontractNo = dJcontractNo;
	}
	
	public String getCreditId() {
		return creditId;
	}
	public void setCreditId(String creditId) {
		this.creditId = creditId;
	}
	public RecieveCLPBean(String secondCompanyName, String currentYear, String currentMonth, String currentDay,
			String dJcontractNo, String bLContractNo, String coreCompanyName, String recieveBalance,
			String secondeLegalPersonName, String financeId, String creditId) {
		super();
		this.secondCompanyName = secondCompanyName;
		this.currentYear = currentYear;
		this.currentMonth = currentMonth;
		this.currentDay = currentDay;
		this.dJcontractNo = dJcontractNo;
		this.bLContractNo = bLContractNo;
		this.coreCompanyName = coreCompanyName;
		this.recieveBalance = recieveBalance;
		this.secondeLegalPersonName = secondeLegalPersonName;
		this.financeId = financeId;
		this.creditId = creditId;
	}
	@Override
	public String toString() {
		return "RecieveCLPBean [secondCompanyName=" + secondCompanyName + ", currentYear=" + currentYear
				+ ", currentMonth=" + currentMonth + ", currentDay=" + currentDay + ", dJcontractNo=" + dJcontractNo
				+ ", bLContractNo=" + bLContractNo + ", coreCompanyName=" + coreCompanyName + ", recieveBalance="
				+ recieveBalance + ", secondeLegalPersonName=" + secondeLegalPersonName + ", financeId=" + financeId
				+ ", creditId=" + creditId + "]";
	}
	
}
