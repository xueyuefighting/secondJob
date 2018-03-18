package com.yonyou.scf.common.input;

import java.io.Serializable;

import com.yonyou.scf.common.util.AmountFormat;

/**
 * 保理合同交互类
 * @author zhangjlm
 *
 */
public class BLContractBean implements Serializable{

	private static final long serialVersionUID = -7345833313059586918L;
	
	private String currentYear;//当前年 *
	private String currentMonth;//当前月 *
	private String currentDay;//当前日 *
	private String bLContractNo;//合同编号 *
	private String concatPhone;//联系电话
	private String secondCompanyName;//借款方企业名称
	private String secondeLegalPersonName;//借款企业的法人
	private String secondCompanyAdress;//借款企业住所地
	private String secondConcatTel;//借款企业手机号
	private String limitDate;//限定日期：甲方在出具《保理融资核准通知书》后     个工作日内将融资款划付至乙方指定的账户
	private String loanCompanyName;//取借款企业名称
	private String loanCompanyAcc;//取借款企业放款账户
	private String loanCompanyBank;//开户行
	private String productRate;//产品利率
	private String interrestOfMonth;//这个公式是月利息 = 融资金额 * 利率/12，需要现算
	private String financeId;
	private String creditId;
	public String getConcatPhone() {
		return concatPhone;
	}
	public void setConcatPhone(String concatPhone) {
		this.concatPhone = concatPhone;
	}
	public String getSecondCompanyName() {
		return secondCompanyName;
	}
	public void setSecondCompanyName(String secondCompanyName) {
		this.secondCompanyName = secondCompanyName;
	}
	public String getSecondeLegalPersonName() {
		return secondeLegalPersonName;
	}
	public void setSecondeLegalPersonName(String secondeLegalPersonName) {
		this.secondeLegalPersonName = secondeLegalPersonName;
	}
	public String getSecondCompanyAdress() {
		return secondCompanyAdress;
	}
	public void setSecondCompanyAdress(String secondCompanyAdress) {
		this.secondCompanyAdress = secondCompanyAdress;
	}
	public String getSecondConcatTel() {
		return secondConcatTel;
	}
	public void setSecondConcatTel(String secondConcatTel) {
		this.secondConcatTel = secondConcatTel;
	}
	public String getLimitDate() {
		return limitDate;
	}
	public void setLimitDate(String limitDate) {
		this.limitDate = limitDate;
	}
	public String getLoanCompanyName() {
		return loanCompanyName;
	}
	public void setLoanCompanyName(String loanCompanyName) {
		this.loanCompanyName = loanCompanyName;
	}
	public String getLoanCompanyAcc() {
		return loanCompanyAcc;
	}
	public void setLoanCompanyAcc(String loanCompanyAcc) {
		this.loanCompanyAcc = loanCompanyAcc;
	}
	public String getLoanCompanyBank() {
		return loanCompanyBank;
	}
	public void setLoanCompanyBank(String loanCompanyBank) {
		this.loanCompanyBank = loanCompanyBank;
	}
	public String getProductRate() {
		return productRate;
	}
	public void setProductRate(String productRate) {
		this.productRate = productRate;
	}
	public String getInterrestOfMonth() {
		return interrestOfMonth;
	}
	public void setInterrestOfMonth(String interrestOfMonth) {
		String money = interrestOfMonth;
		this.interrestOfMonth =  AmountFormat.formatMoneyString(money);
	}
	public BLContractBean() {
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
	
	public String getFinanceId() {
		return financeId;
	}
	public void setFinanceId(String financeId) {
		this.financeId = financeId;
	}
	public String getbLContractNo() {
		return bLContractNo;
	}
	public void setbLContractNo(String bLContractNo) {
		this.bLContractNo = bLContractNo;
	}
	
	public String getCreditId() {
		return creditId;
	}
	public void setCreditId(String creditId) {
		this.creditId = creditId;
	}
	public BLContractBean(String currentYear, String currentMonth, String currentDay, String bLContractNo,
			String concatPhone, String secondCompanyName, String secondeLegalPersonName, String secondCompanyAdress,
			String secondConcatTel, String limitDate, String loanCompanyName, String loanCompanyAcc,
			String loanCompanyBank, String productRate, String interrestOfMonth, String financeId, String creditId) {
		super();
		this.currentYear = currentYear;
		this.currentMonth = currentMonth;
		this.currentDay = currentDay;
		this.bLContractNo = bLContractNo;
		this.concatPhone = concatPhone;
		this.secondCompanyName = secondCompanyName;
		this.secondeLegalPersonName = secondeLegalPersonName;
		this.secondCompanyAdress = secondCompanyAdress;
		this.secondConcatTel = secondConcatTel;
		this.limitDate = limitDate;
		this.loanCompanyName = loanCompanyName;
		this.loanCompanyAcc = loanCompanyAcc;
		this.loanCompanyBank = loanCompanyBank;
		this.productRate = productRate;
		this.interrestOfMonth = interrestOfMonth;
		this.financeId = financeId;
		this.creditId = creditId;
	}
	@Override
	public String toString() {
		return "BLContractBean [currentYear=" + currentYear + ", currentMonth=" + currentMonth + ", currentDay="
				+ currentDay + ", bLContractNo=" + bLContractNo + ", concatPhone=" + concatPhone
				+ ", secondCompanyName=" + secondCompanyName + ", secondeLegalPersonName=" + secondeLegalPersonName
				+ ", secondCompanyAdress=" + secondCompanyAdress + ", secondConcatTel=" + secondConcatTel
				+ ", limitDate=" + limitDate + ", loanCompanyName=" + loanCompanyName + ", loanCompanyAcc="
				+ loanCompanyAcc + ", loanCompanyBank=" + loanCompanyBank + ", productRate=" + productRate
				+ ", interrestOfMonth=" + interrestOfMonth + ", financeId=" + financeId + ", creditId=" + creditId
				+ "]";
	}
	
}
