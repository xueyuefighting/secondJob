package com.yonyou.scf.common.input;

import java.io.Serializable;

import com.yonyou.scf.common.util.AmountFormat;

public class RecieveCNotice implements Serializable {

	private static final long serialVersionUID = -2358179209251952727L;
	
	private String currentYear;//当前年 *
	private String currentMonth;//当前月 *
	private String currentDay;//当前日 *
	private String tZcontractNo;//合同编号 *
	private String bLContractNo;//保理合同编号 *
	private String coreCompanyName;//核心企业名称
	private String secondCompanyName;//借款方企业名称
	private String recieveConNo;//应收账款中的合同编号
	private String recieveBalance;//应收帐款余额
	private String loanCompanyBackName;//借款企业回款 户名
	private String loanCompanyBackAcc;//借款企业回款 账号
	private String loanCompanyBackBank;//借款企业回款 开户行
	private String financeId;//用于查询保理合同编号
	private String secondeLegalPersonName;//借款企业的法人名称
	private String creditId;
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
	public String getCoreCompanyName() {
		return coreCompanyName;
	}
	public void setCoreCompanyName(String coreCompanyName) {
		this.coreCompanyName = coreCompanyName;
	}
	public String getSecondCompanyName() {
		return secondCompanyName;
	}
	public void setSecondCompanyName(String secondCompanyName) {
		this.secondCompanyName = secondCompanyName;
	}
	public String getRecieveConNo() {
		return recieveConNo;
	}
	public void setRecieveConNo(String recieveConNo) {
		this.recieveConNo = recieveConNo;
	}
	public String getRecieveBalance() {
		return recieveBalance;
	}
	public void setRecieveBalance(String recieveBalance) {
		String money = recieveBalance;
		this.recieveBalance =  AmountFormat.formatMoneyString(money);
	}
	public RecieveCNotice() {
	}
	public String getLoanCompanyBackName() {
		return loanCompanyBackName;
	}
	public void setLoanCompanyBackName(String loanCompanyBackName) {
		this.loanCompanyBackName = loanCompanyBackName;
	}
	public String getLoanCompanyBackAcc() {
		return loanCompanyBackAcc;
	}
	public void setLoanCompanyBackAcc(String loanCompanyBackAcc) {
		this.loanCompanyBackAcc = loanCompanyBackAcc;
	}
	public String getLoanCompanyBackBank() {
		return loanCompanyBackBank;
	}
	public void setLoanCompanyBackBank(String loanCompanyBackBank) {
		this.loanCompanyBackBank = loanCompanyBackBank;
	}
	
	public String getFinanceId() {
		return financeId;
	}
	public void setFinanceId(String financeId) {
		this.financeId = financeId;
	}
	
	public String getSecondeLegalPersonName() {
		return secondeLegalPersonName;
	}
	public void setSecondeLegalPersonName(String secondeLegalPersonName) {
		this.secondeLegalPersonName = secondeLegalPersonName;
	}
	
	public String getbLContractNo() {
		return bLContractNo;
	}
	public void setbLContractNo(String bLContractNo) {
		this.bLContractNo = bLContractNo;
	}
	public String gettZcontractNo() {
		return tZcontractNo;
	}
	public void settZcontractNo(String tZcontractNo) {
		this.tZcontractNo = tZcontractNo;
	}
	
	public String getCreditId() {
		return creditId;
	}
	public void setCreditId(String creditId) {
		this.creditId = creditId;
	}
	public RecieveCNotice(String currentYear, String currentMonth, String currentDay, String tZcontractNo,
			String bLContractNo, String coreCompanyName, String secondCompanyName, String recieveConNo,
			String recieveBalance, String loanCompanyBackName, String loanCompanyBackAcc, String loanCompanyBackBank,
			String financeId, String secondeLegalPersonName, String creditId) {
		super();
		this.currentYear = currentYear;
		this.currentMonth = currentMonth;
		this.currentDay = currentDay;
		this.tZcontractNo = tZcontractNo;
		this.bLContractNo = bLContractNo;
		this.coreCompanyName = coreCompanyName;
		this.secondCompanyName = secondCompanyName;
		this.recieveConNo = recieveConNo;
		this.recieveBalance = recieveBalance;
		this.loanCompanyBackName = loanCompanyBackName;
		this.loanCompanyBackAcc = loanCompanyBackAcc;
		this.loanCompanyBackBank = loanCompanyBackBank;
		this.financeId = financeId;
		this.secondeLegalPersonName = secondeLegalPersonName;
		this.creditId = creditId;
	}
	@Override
	public String toString() {
		return "RecieveCNotice [currentYear=" + currentYear + ", currentMonth=" + currentMonth + ", currentDay="
				+ currentDay + ", tZcontractNo=" + tZcontractNo + ", bLContractNo=" + bLContractNo
				+ ", coreCompanyName=" + coreCompanyName + ", secondCompanyName=" + secondCompanyName
				+ ", recieveConNo=" + recieveConNo + ", recieveBalance=" + recieveBalance + ", loanCompanyBackName="
				+ loanCompanyBackName + ", loanCompanyBackAcc=" + loanCompanyBackAcc + ", loanCompanyBackBank="
				+ loanCompanyBackBank + ", financeId=" + financeId + ", secondeLegalPersonName="
				+ secondeLegalPersonName + ", creditId=" + creditId + "]";
	}
	
}
