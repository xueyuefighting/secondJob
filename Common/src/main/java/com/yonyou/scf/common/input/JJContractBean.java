package com.yonyou.scf.common.input;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Optional;
import java.util.stream.Stream;

import com.yonyou.scf.common.util.AmountFormat;
import com.yonyou.scf.common.util.StringUtil;
import com.yonyou.scf.common.util.Timer;

/**
 * 借据合同--太平鸟
 * @author zhangjlm
 *
 */
public class JJContractBean implements Serializable {

	private static final long serialVersionUID = 5880879785945689213L;
	
	private String financeId;//融资申请id  （没有空着）
	private String creditId;//授信id
	private String secondCompanyName;//借款方企业名称
	private String wayOfGuarantee;//产品表中，担保方式
	private String purposes;//借款用途
	private String monthRate;//月费率``  80%
	private String loanCompanyBackAcc;//借款企业回款 账号
	private String loanCompanyBackBank;//借款企业回款 开户行
	private String loanAmount;//借款金额 单位：分
	private String loadDate;//融资申请日期／借款日期  'yyyyMMdd'
	private String endDate;//融资申请日期+产品的单笔借款期限  'yyyyMMdd'
	private String secondeLegalPersonName;//借款企业的法人（个人的时候空着）
	
	private String jKContractNo;//借款合同编号
	private String bZContractNo;//担保合同  以逗号分割
	private String jJContractNo;//借据合同编号
	private String currentYear;//当前年 *
	private String currentMonth;//当前月 *
	private String currentDay;//当前日 *
	
	//融资申请开始日期拆分
	private String loadDateYear;
	private String loadDateMonth;
	private String loadDateDay;
	//融资申请结束日期拆分
	private String endDateYear;
	private String endDateMonth;
	private String endDateDay;
	
	//将loanAmount 依次划分出去
	private static String[] moneyKey = {"fen","jiao","yuan","shi","bai","qian","wan","shiWan","baiWan","qianWan"};
	private String fen;
	private String jiao;
	private String yuan;
	private String shi;
	private String bai;
	private String qian;
	private String wan;
	private String shiWan;
	private String baiWan;
	private String qianWan;
	private String upperLoadMoney;
	
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
	public String getSecondCompanyName() {
		return secondCompanyName;
	}
	public void setSecondCompanyName(String secondCompanyName) {
		this.secondCompanyName = secondCompanyName;
	}
	public String getWayOfGuarantee() {
		return wayOfGuarantee;
	}
	public void setWayOfGuarantee(String wayOfGuarantee) {
		this.wayOfGuarantee = wayOfGuarantee;
	}
	public String getPurposes() {
		return purposes;
	}
	public void setPurposes(String purposes) {
		this.purposes = purposes;
	}
	public String getMonthRate() {
		return monthRate;
	}
	public void setMonthRate(String monthRate) {
		this.monthRate = "月费率"+monthRate;
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
	public String getLoanAmount() {
		return loanAmount;
	}
	
	public String getLoadDateYear() {
		return loadDateYear;
	}
	public void setLoadDateYear(String loadDateYear) {
		this.loadDateYear = loadDateYear;
	}
	public String getLoadDateMonth() {
		return loadDateMonth;
	}
	public void setLoadDateMonth(String loadDateMonth) {
		this.loadDateMonth = loadDateMonth;
	}
	public String getLoadDateDay() {
		return loadDateDay;
	}
	public void setLoadDateDay(String loadDateDay) {
		this.loadDateDay = loadDateDay;
	}
	public String getEndDateYear() {
		return endDateYear;
	}
	public void setEndDateYear(String endDateYear) {
		this.endDateYear = endDateYear;
	}
	public String getEndDateMonth() {
		return endDateMonth;
	}
	public void setEndDateMonth(String endDateMonth) {
		this.endDateMonth = endDateMonth;
	}
	public String getEndDateDay() {
		return endDateDay;
	}
	public void setEndDateDay(String endDateDay) {
		this.endDateDay = endDateDay;
	}
	public static String[] getMoneyKey() {
		return moneyKey;
	}
	public static void setMoneyKey(String[] moneyKey) {
		JJContractBean.moneyKey = moneyKey;
	}
	public String getFen() {
		return fen;
	}
	public void setFen(String fen) {
		this.fen = fen;
	}
	public String getJiao() {
		return jiao;
	}
	public void setJiao(String jiao) {
		this.jiao = jiao;
	}
	public String getYuan() {
		return yuan;
	}
	public void setYuan(String yuan) {
		this.yuan = yuan;
	}
	public String getShi() {
		return shi;
	}
	public void setShi(String shi) {
		this.shi = shi;
	}
	public String getBai() {
		return bai;
	}
	public void setBai(String bai) {
		this.bai = bai;
	}
	public String getQian() {
		return qian;
	}
	public void setQian(String qian) {
		this.qian = qian;
	}
	public String getWan() {
		return wan;
	}
	public void setWan(String wan) {
		this.wan = wan;
	}
	public String getShiWan() {
		return shiWan;
	}
	public void setShiWan(String shiWan) {
		this.shiWan = shiWan;
	}
	public String getBaiWan() {
		return baiWan;
	}
	public void setBaiWan(String baiWan) {
		this.baiWan = baiWan;
	}
	public String getQianWan() {
		return qianWan;
	}
	public void setQianWan(String qianWan) {
		this.qianWan = qianWan;
	}
	public String getUpperLoadMoney() {
		return upperLoadMoney;
	}
	public void setUpperLoadMoney(String upperLoadMoney) {
		this.upperLoadMoney = upperLoadMoney;
	}
	/*
	 * 1)仅支持单位为分的金额
	 * 2）传入money金额后，将会被依次划分到其他属性中
	 * @param money
	 * @throws Exception
	 */
	public void setLoanAmount(String loanAmount) throws Exception {
		Field[] fields = this.getClass().getDeclaredFields();
		for (int i = 0; i < loanAmount.length(); i++) {
			String currentFieldName =  moneyKey[i];
			
			
			Optional<Field> fieldO = Stream.of(fields)
					.filter(x->x.getName().equalsIgnoreCase(currentFieldName)).findFirst();
			
			Field field = fieldO.orElseThrow(NullPointerException::new);
			
			field.setAccessible(true);
			field.set(this, StringUtil.toString(loanAmount.charAt(loanAmount.length()-i-1)));
		}
		
		String upperStrMoney = loanAmount.substring(0, loanAmount.length()-2)+"."+loanAmount.substring(loanAmount.length()-2);
		this.upperLoadMoney = AmountFormat.moneyFenNumberTransferToChinese(upperStrMoney);
		
		String money = loanAmount;
        money = AmountFormat.formatMoneyString(money);
		this.loanAmount = money;
	}
	
	public String getjKContractNo() {
		return jKContractNo;
	}
	public void setjKContractNo(String jKContractNo) {
		this.jKContractNo = jKContractNo;
	}
	public String getLoadDate() {
		return loadDate;
	}
	public void setLoadDate(String loadDate) {
		LocalDate localDate = Timer.transferDateWithStr(loadDate);
		this.loadDateYear= StringUtil.toString(localDate.getYear());
		this.loadDateMonth= StringUtil.toString(localDate.getMonthValue());
		this.loadDateDay= StringUtil.toString(localDate.getDayOfMonth());
		this.loadDate = loadDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		LocalDate localDate = Timer.transferDateWithStr(endDate);
		this.endDateYear= StringUtil.toString(localDate.getYear());
		this.endDateMonth= StringUtil.toString(localDate.getMonthValue());
		this.endDateDay= StringUtil.toString(localDate.getDayOfMonth());
		this.endDate = endDate;
	}
	public String getSecondeLegalPersonName() {
		return secondeLegalPersonName;
	}
	public void setSecondeLegalPersonName(String secondeLegalPersonName) {
		this.secondeLegalPersonName = secondeLegalPersonName;
	}
	public String getjJContractNo() {
		return jJContractNo;
	}
	public void setjJContractNo(String jJContractNo) {
		this.jJContractNo = jJContractNo;
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
	
	public JJContractBean(String financeId, String creditId, String secondCompanyName, String wayOfGuarantee,
			String purposes, String monthRate, String loanCompanyBackAcc, String loanCompanyBackBank, String loanAmount,
			String loadDate, String endDate, String secondeLegalPersonName, String jKContractNo, String bZContractNo,
			String jJContractNo, String currentYear, String currentMonth, String currentDay, String loadDateYear,
			String loadDateMonth, String loadDateDay, String endDateYear, String endDateMonth, String endDateDay,
			String fen, String jiao, String yuan, String shi, String bai, String qian, String wan, String shiWan,
			String baiWan, String qianWan, String upperLoadMoney) {
		super();
		this.financeId = financeId;
		this.creditId = creditId;
		this.secondCompanyName = secondCompanyName;
		this.wayOfGuarantee = wayOfGuarantee;
		this.purposes = purposes;
		this.monthRate = monthRate;
		this.loanCompanyBackAcc = loanCompanyBackAcc;
		this.loanCompanyBackBank = loanCompanyBackBank;
		this.loanAmount = loanAmount;
		this.loadDate = loadDate;
		this.endDate = endDate;
		this.secondeLegalPersonName = secondeLegalPersonName;
		this.jKContractNo = jKContractNo;
		this.bZContractNo = bZContractNo;
		this.jJContractNo = jJContractNo;
		this.currentYear = currentYear;
		this.currentMonth = currentMonth;
		this.currentDay = currentDay;
		this.loadDateYear = loadDateYear;
		this.loadDateMonth = loadDateMonth;
		this.loadDateDay = loadDateDay;
		this.endDateYear = endDateYear;
		this.endDateMonth = endDateMonth;
		this.endDateDay = endDateDay;
		this.fen = fen;
		this.jiao = jiao;
		this.yuan = yuan;
		this.shi = shi;
		this.bai = bai;
		this.qian = qian;
		this.wan = wan;
		this.shiWan = shiWan;
		this.baiWan = baiWan;
		this.qianWan = qianWan;
		this.upperLoadMoney = upperLoadMoney;
	}
	@Override
	public String toString() {
		return "JJContractBean [financeId=" + financeId + ", creditId=" + creditId + ", secondCompanyName="
				+ secondCompanyName + ", wayOfGuarantee=" + wayOfGuarantee + ", purposes=" + purposes + ", monthRate="
				+ monthRate + ", loanCompanyBackAcc=" + loanCompanyBackAcc + ", loanCompanyBackBank="
				+ loanCompanyBackBank + ", loanAmount=" + loanAmount + ", loadDate=" + loadDate + ", endDate=" + endDate
				+ ", secondeLegalPersonName=" + secondeLegalPersonName + ", jKContractNo=" + jKContractNo
				+ ", bZContractNo=" + bZContractNo + ", jJContractNo=" + jJContractNo + ", currentYear=" + currentYear
				+ ", currentMonth=" + currentMonth + ", currentDay=" + currentDay + ", loadDateYear=" + loadDateYear
				+ ", loadDateMonth=" + loadDateMonth + ", loadDateDay=" + loadDateDay + ", endDateYear=" + endDateYear
				+ ", endDateMonth=" + endDateMonth + ", endDateDay=" + endDateDay + ", fen=" + fen + ", jiao=" + jiao
				+ ", yuan=" + yuan + ", shi=" + shi + ", bai=" + bai + ", qian=" + qian + ", wan=" + wan + ", shiWan="
				+ shiWan + ", baiWan=" + baiWan + ", qianWan=" + qianWan + ", upperLoadMoney=" + upperLoadMoney + "]";
	}
	public JJContractBean() {
	}
	
}
