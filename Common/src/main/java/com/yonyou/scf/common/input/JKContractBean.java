package com.yonyou.scf.common.input;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;

import com.yonyou.scf.common.util.AmountFormat;
import com.yonyou.scf.common.util.StringUtil;
import com.yonyou.scf.common.util.Timer;

/**
 * 借款合同业务bean
 * @author zhangjlm
 *
 */
public class JKContractBean implements Serializable {

	private static final long serialVersionUID = 8565462768578837016L;
	
	
	private String secondCompanyName;//借款方企业名称
	private String secondeLegalPersonName;//借款企业的法人（个人的时候空着）
	private String secondeLegalPersonNo;//借款企业的法人身份证号（个人的时候空着）
	private String secondCompanyAdress;//借款企业住所地
	private String secondConcatPersonName;//借款企业联系人名字
	private String secondConcatPersonTel;//借款企业联系人电话
	private String creditAmount;//授信额度  单位：万元   321.00    .00暂时先定死  
	private String creditDate;//授信期限：授信结束月-授信开始月
	private String creditStartDate;//授信开始日``  'yyyyMMdd'
	private String creditEndDate;//授信结束日``  'yyyyMMdd'
	private String monthRate;//月费率``  eg:80%
	private String financeId;//融资申请id  （没有空着）
	private String creditId;//授信id
	
	private String upperCreditAmount;//授信额度 大写
	private String creditStartYear;//授信开始-年
	private String creditStartMonth;//授信开始-月
	private String creditStartDayOfMonth;//授信开始-日
	private String creditEndYear;//授信结束-年
	private String creditEndMonth;//授信结束-月
	private String creditEndDayOfMonth;//授信结束-日
	private String jKContractNo;//借款合同编号
	private String bZContractNo;//担保合同  以逗号分割
	private String currentYear;//当前年 *
	private String currentMonth;//当前月 *
	private String currentDay;//当前日 *
	
	
	public String getjKContractNo() {
		return jKContractNo;
	}
	public void setjKContractNo(String jKContractNo) {
		this.jKContractNo = jKContractNo;
	}
	
	public String getbZContractNo() {
		return bZContractNo;
	}
	public void setbZContractNo(String bZContractNo) {
		this.bZContractNo = bZContractNo;
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
	public String getSecondeLegalPersonNo() {
		return secondeLegalPersonNo;
	}
	public void setSecondeLegalPersonNo(String secondeLegalPersonNo) {
		this.secondeLegalPersonNo = secondeLegalPersonNo;
	}
	public String getSecondCompanyAdress() {
		return secondCompanyAdress;
	}
	public void setSecondCompanyAdress(String secondCompanyAdress) {
		this.secondCompanyAdress = secondCompanyAdress;
	}
	public String getSecondConcatPersonName() {
		return secondConcatPersonName;
	}
	public void setSecondConcatPersonName(String secondConcatPersonName) {
		this.secondConcatPersonName = secondConcatPersonName;
	}
	public String getSecondConcatPersonTel() {
		return secondConcatPersonTel;
	}
	public void setSecondConcatPersonTel(String secondConcatPersonTel) {
		this.secondConcatPersonTel = secondConcatPersonTel;
	}
	public String getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(String creditAmount) throws Exception {
		this.upperCreditAmount = AmountFormat.moneyNumberTransferToChinese(creditAmount);
		String money = creditAmount;
        money = AmountFormat.formatMoneyString(money);
		this.creditAmount = money;
	}
	public String getCreditDate() {
		return creditDate;
	}
	public void setCreditDate(String creditDate) {
		this.creditDate = creditDate;
	}
	public String getCreditStartDate() {
		return creditStartDate;
	}
	public void setCreditStartDate(String creditStartDate) {
		LocalDate localDate = Timer.transferDateWithStr(creditStartDate);
		this.creditStartYear= StringUtil.toString(localDate.getYear());
		this.creditStartMonth= StringUtil.toString(localDate.getMonthValue());
		this.creditStartDayOfMonth= StringUtil.toString(localDate.getDayOfMonth());
		this.creditStartDate = creditStartDate;
	}
	public String getCreditEndDate() {
		return creditEndDate;
	}
	public void setCreditEndDate(String creditEndDate) {
		LocalDate localDate = Timer.transferDateWithStr(creditEndDate);
		this.creditEndYear= StringUtil.toString(localDate.getYear());
		this.creditEndMonth= StringUtil.toString(localDate.getMonthValue());
		this.creditEndDayOfMonth= StringUtil.toString(localDate.getDayOfMonth());
		this.creditEndDate = creditEndDate;
	}
	public String getMonthRate() {
		return monthRate;
	}
	public void setMonthRate(String monthRate) {
		this.monthRate = "月费率"+monthRate;
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
	public String getCreditId() {
		return creditId;
	}
	public void setCreditId(String creditId) {
		this.creditId = creditId;
	}
	
	public String getCreditStartYear() {
		return creditStartYear;
	}
	public void setCreditStartYear(String creditStartYear) {
		this.creditStartYear = creditStartYear;
	}
	public String getCreditStartMonth() {
		return creditStartMonth;
	}
	public void setCreditStartMonth(String creditStartMonth) {
		this.creditStartMonth = creditStartMonth;
	}
	public String getCreditStartDayOfMonth() {
		return creditStartDayOfMonth;
	}
	public void setCreditStartDayOfMonth(String creditStartDayOfMonth) {
		this.creditStartDayOfMonth = creditStartDayOfMonth;
	}
	public String getCreditEndYear() {
		return creditEndYear;
	}
	public void setCreditEndYear(String creditEndYear) {
		this.creditEndYear = creditEndYear;
	}
	public String getCreditEndMonth() {
		return creditEndMonth;
	}
	public void setCreditEndMonth(String creditEndMonth) {
		this.creditEndMonth = creditEndMonth;
	}
	public String getCreditEndDayOfMonth() {
		return creditEndDayOfMonth;
	}
	public void setCreditEndDayOfMonth(String creditEndDayOfMonth) {
		this.creditEndDayOfMonth = creditEndDayOfMonth;
	}
	
	public String getUpperCreditAmount() {
		return upperCreditAmount;
	}
	public void setUpperCreditAmount(String upperCreditAmount) {
		this.upperCreditAmount = upperCreditAmount;
	}
	public JKContractBean() {
	}
	@Override
	public String toString() {
		return "JKContractBean [secondCompanyName=" + secondCompanyName + ", secondeLegalPersonName="
				+ secondeLegalPersonName + ", secondeLegalPersonNo=" + secondeLegalPersonNo + ", secondCompanyAdress="
				+ secondCompanyAdress + ", secondConcatPersonName=" + secondConcatPersonName
				+ ", secondConcatPersonTel=" + secondConcatPersonTel + ", creditAmount=" + creditAmount
				+ ", creditDate=" + creditDate + ", creditStartDate=" + creditStartDate + ", creditEndDate="
				+ creditEndDate + ", monthRate=" + monthRate + ", financeId=" + financeId + ", creditId=" + creditId
				+ ", upperCreditAmount=" + upperCreditAmount + ", creditStartYear=" + creditStartYear
				+ ", creditStartMonth=" + creditStartMonth + ", creditStartDayOfMonth=" + creditStartDayOfMonth
				+ ", creditEndYear=" + creditEndYear + ", creditEndMonth=" + creditEndMonth + ", creditEndDayOfMonth="
				+ creditEndDayOfMonth + ", jKContractNo=" + jKContractNo + ", bZContractNo=" + bZContractNo
				+ ", currentYear=" + currentYear + ", currentMonth=" + currentMonth + ", currentDay=" + currentDay
				+ "]";
	}
	public JKContractBean(String secondCompanyName, String secondeLegalPersonName, String secondeLegalPersonNo,
			String secondCompanyAdress, String secondConcatPersonName, String secondConcatPersonTel,
			String creditAmount, String creditDate, String creditStartDate, String creditEndDate, String monthRate,
			String financeId, String creditId, String upperCreditAmount, String creditStartYear,
			String creditStartMonth, String creditStartDayOfMonth, String creditEndYear, String creditEndMonth,
			String creditEndDayOfMonth, String jKContractNo, String bZContractNo, String currentYear,
			String currentMonth, String currentDay) {
		super();
		this.secondCompanyName = secondCompanyName;
		this.secondeLegalPersonName = secondeLegalPersonName;
		this.secondeLegalPersonNo = secondeLegalPersonNo;
		this.secondCompanyAdress = secondCompanyAdress;
		this.secondConcatPersonName = secondConcatPersonName;
		this.secondConcatPersonTel = secondConcatPersonTel;
		this.creditAmount = creditAmount;
		this.creditDate = creditDate;
		this.creditStartDate = creditStartDate;
		this.creditEndDate = creditEndDate;
		this.monthRate = monthRate;
		this.financeId = financeId;
		this.creditId = creditId;
		this.upperCreditAmount = upperCreditAmount;
		this.creditStartYear = creditStartYear;
		this.creditStartMonth = creditStartMonth;
		this.creditStartDayOfMonth = creditStartDayOfMonth;
		this.creditEndYear = creditEndYear;
		this.creditEndMonth = creditEndMonth;
		this.creditEndDayOfMonth = creditEndDayOfMonth;
		this.jKContractNo = jKContractNo;
		this.bZContractNo = bZContractNo;
		this.currentYear = currentYear;
		this.currentMonth = currentMonth;
		this.currentDay = currentDay;
	}
	
}
