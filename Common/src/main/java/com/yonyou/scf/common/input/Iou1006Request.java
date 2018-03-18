package com.yonyou.scf.common.input;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Iou1006Request implements Serializable   {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message = "融资申请ID不能为空")
	private Long financeId;
	@NotNull(message = "放款日期不能为空")
	private String lendingDate;
	@NotNull(message = "期数不能为空")
	private List<String> currentPeriodsNumber;
	@NotNull(message = "应还本金(元)不能为空")
	private List<String> principalAmount;
	@NotNull(message = "应还利息(元)不能为空")
	private List<String> interestAmount;
	@NotNull(message = "还款日期不能为空")
	private List<String> repaymengDate;
	@NotNull(message = "累计本金不能为空")
	private String sumPrincipal;
	@NotNull(message = "累计利息不能为空")
	private String sumInterest;
	
	private String token;
	
	public Long getFinanceId() {
		return financeId;
	}

	public void setFinanceId(Long financeId) {
		this.financeId = financeId;
	}

	public String getLendingDate() {
		return lendingDate;
	}

	public void setLendingDate(String lendingDate) {
		this.lendingDate = lendingDate;
	}

	public List<String> getCurrentPeriodsNumber() {
		return currentPeriodsNumber;
	}

	public void setCurrentPeriodsNumber(List<String> currentPeriodsNumber) {
		this.currentPeriodsNumber = currentPeriodsNumber;
	}

	public List<String> getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(List<String> principalAmount) {
		this.principalAmount = principalAmount;
	}

	public List<String> getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(List<String> interestAmount) {
		this.interestAmount = interestAmount;
	}

	public List<String> getRepaymengDate() {
		return repaymengDate;
	}

	public void setRepaymengDate(List<String> repaymengDate) {
		this.repaymengDate = repaymengDate;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getSumPrincipal() {
		return sumPrincipal;
	}

	public void setSumPrincipal(String sumPrincipal) {
		this.sumPrincipal = sumPrincipal;
	}

	public String getSumInterest() {
		return sumInterest;
	}

	public void setSumInterest(String sumInterest) {
		this.sumInterest = sumInterest;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
