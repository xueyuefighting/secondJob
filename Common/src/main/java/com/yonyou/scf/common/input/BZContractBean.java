package com.yonyou.scf.common.input;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;

import com.yonyou.scf.common.util.AmountFormat;
import com.yonyou.scf.common.util.StringUtil;
import com.yonyou.scf.common.util.Timer;

/**
 * 保证合同业务bean<==>保证合同业务bean
 * @author zhangjlm
 *
 */
public class BZContractBean implements Serializable {

	private static final long serialVersionUID = -9160889924868657756L;
	
	private String dbCompanyName;//担保方企业名称
	private String dbLegalPersonName;//担保企业的法人（个人的时候空着）
	private String dbCompanyAdress;//担保企业住所地
	private String dbConcatPersonName;//担保企业联系人名字
	private String dbConcatPersonTel;//担保企业联系人电话 
	private String secondCompanyName;//借款方企业名称
	private String creditAmount;//授信额度  单位：万元   321.00    .00暂时先定死  
	private String creditDate;//授信期限：授信结束月-授信开始月  按月计算
	private String rate;//月费率``  eg:80%
	private String creditStartDate;//授信开始日``  'yyyyMMdd'
	private String creditEndDate;//授信结束日``  'yyyyMMdd'
	
	private String upperCreditAmount;//授信额度 大写
	private String creditStartYear;//授信开始-年
	private String creditStartMonth;//授信开始-月
	private String creditStartDayOfMonth;//授信开始-日
	private String creditEndYear;//授信结束-年
	private String creditEndMonth;//授信结束-月
	private String creditEndDayOfMonth;//授信结束-日
	private String bZContractNo;//担保合同编号
	private String jKContractNo;//借款合同编号
	private String currentYear;//当前年 *
	private String currentMonth;//当前月 *
	private String currentDay;//当前日 *
	public String getDbCompanyName() {
		return dbCompanyName;
	}
	public void setDbCompanyName(String dbCompanyName) {
		this.dbCompanyName = dbCompanyName;
	}
	public String getDbLegalPersonName() {
		return dbLegalPersonName;
	}
	public void setDbLegalPersonName(String dbLegalPersonName) {
		this.dbLegalPersonName = dbLegalPersonName;
	}
	public String getDbCompanyAdress() {
		return dbCompanyAdress;
	}
	public void setDbCompanyAdress(String dbCompanyAdress) {
		this.dbCompanyAdress = dbCompanyAdress;
	}
	public String getDbConcatPersonName() {
		return dbConcatPersonName;
	}
	public void setDbConcatPersonName(String dbConcatPersonName) {
		this.dbConcatPersonName = dbConcatPersonName;
	}
	public String getDbConcatPersonTel() {
		return dbConcatPersonTel;
	}
	public void setDbConcatPersonTel(String dbConcatPersonTel) {
		this.dbConcatPersonTel = dbConcatPersonTel;
	}
	public String getSecondCompanyName() {
		return secondCompanyName;
	}
	public void setSecondCompanyName(String secondCompanyName) {
		this.secondCompanyName = secondCompanyName;
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
		String cd = creditDate+"个月";
		this.creditDate = cd;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = "月费率"+rate;
	}
	public String getCreditStartDate() {
		return creditStartDate;
	}
	
	public String getUpperCreditAmount() {
		return upperCreditAmount;
	}
	public void setUpperCreditAmount(String upperCreditAmount) {
		this.upperCreditAmount = upperCreditAmount;
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
	public String getbZContractNo() {
		return bZContractNo;
	}
	public void setbZContractNo(String bZContractNo) {
		this.bZContractNo = bZContractNo;
	}
	public String getjKContractNo() {
		return jKContractNo;
	}
	public void setjKContractNo(String jKContractNo) {
		this.jKContractNo = jKContractNo;
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
	public BZContractBean(String dbCompanyName, String dbLegalPersonName, String dbCompanyAdress,
			String dbConcatPersonName, String dbConcatPersonTel, String secondCompanyName, String creditAmount,
			String creditDate, String rate, String creditStartDate, String creditEndDate, String upperCreditAmount,
			String creditStartYear, String creditStartMonth, String creditStartDayOfMonth, String creditEndYear,
			String creditEndMonth, String creditEndDayOfMonth, String bZContractNo, String jKContractNo,
			String currentYear, String currentMonth, String currentDay) {
		super();
		this.dbCompanyName = dbCompanyName;
		this.dbLegalPersonName = dbLegalPersonName;
		this.dbCompanyAdress = dbCompanyAdress;
		this.dbConcatPersonName = dbConcatPersonName;
		this.dbConcatPersonTel = dbConcatPersonTel;
		this.secondCompanyName = secondCompanyName;
		this.creditAmount = creditAmount;
		this.creditDate = creditDate;
		this.rate = rate;
		this.creditStartDate = creditStartDate;
		this.creditEndDate = creditEndDate;
		this.upperCreditAmount = upperCreditAmount;
		this.creditStartYear = creditStartYear;
		this.creditStartMonth = creditStartMonth;
		this.creditStartDayOfMonth = creditStartDayOfMonth;
		this.creditEndYear = creditEndYear;
		this.creditEndMonth = creditEndMonth;
		this.creditEndDayOfMonth = creditEndDayOfMonth;
		this.bZContractNo = bZContractNo;
		this.jKContractNo = jKContractNo;
		this.currentYear = currentYear;
		this.currentMonth = currentMonth;
		this.currentDay = currentDay;
	}
	public BZContractBean() {
	}
	@Override
	public String toString() {
		return "BZContractBean [dbCompanyName=" + dbCompanyName + ", dbLegalPersonName=" + dbLegalPersonName
				+ ", dbCompanyAdress=" + dbCompanyAdress + ", dbConcatPersonName=" + dbConcatPersonName
				+ ", dbConcatPersonTel=" + dbConcatPersonTel + ", secondCompanyName=" + secondCompanyName
				+ ", creditAmount=" + creditAmount + ", creditDate=" + creditDate + ", rate=" + rate
				+ ", creditStartDate=" + creditStartDate + ", creditEndDate=" + creditEndDate + ", upperCreditAmount="
				+ upperCreditAmount + ", creditStartYear=" + creditStartYear + ", creditStartMonth=" + creditStartMonth
				+ ", creditStartDayOfMonth=" + creditStartDayOfMonth + ", creditEndYear=" + creditEndYear
				+ ", creditEndMonth=" + creditEndMonth + ", creditEndDayOfMonth=" + creditEndDayOfMonth
				+ ", bZContractNo=" + bZContractNo + ", jKContractNo=" + jKContractNo + ", currentYear=" + currentYear
				+ ", currentMonth=" + currentMonth + ", currentDay=" + currentDay + "]";
	}
	
}
