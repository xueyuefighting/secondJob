package com.yonyou.scf.common.output;

import java.io.Serializable;
import java.math.BigDecimal;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf98010Response  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//编号
	private String financeNo;
	//模式
	private String financeMode;
	//产品名称
	private String productName;
	//融资开始日
	private String repayTime;
	//融资到期日
	private String financeEndDate;
	//融资金额
	private BigDecimal financeAmount;
	//借款企业名称
	private String agencyId;
	//融资状态
	private String financeStatus;
	//资方名称
	private String capitalId;
	
	//融资ID
	private Long financeId;
	//还款状态
	private String repayStatus;
	//核心企业名称
	private String companyId;
	//融资申请时间
	private String createTime;
	
	private Long principalAmount;
	private Long principalAlreadyAmount;
	private Long interestAmount;
	private Long interestAlreadyAmount;
	private Long serviceChargeAmount;
	private Long serviceChargeAlreadyAmount;
	
	public String getFinanceNo() {
		return financeNo;
	}

	public void setFinanceNo(String financeNo) {
		this.financeNo = financeNo;
	}

	public String getFinanceMode() {
		return financeMode;
	}

	public void setFinanceMode(String financeMode) {
		this.financeMode = financeMode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getRepayTime() {
		return repayTime;
	}

	public void setRepayTime(String repayTime) {
		this.repayTime = repayTime;
	}

	public String getFinanceEndDate() {
		return financeEndDate;
	}

	public void setFinanceEndDate(String financeEndDate) {
		this.financeEndDate = financeEndDate;
	}

	public BigDecimal getFinanceAmount() {
		return financeAmount;
	}

	public void setFinanceAmount(BigDecimal financeAmount) {
		this.financeAmount = financeAmount;
	}

	public String getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(String agencyId) {
		this.agencyId = agencyId;
	}

	public String getFinanceStatus() {
		return financeStatus;
	}

	public void setFinanceStatus(String financeStatus) {
		this.financeStatus = financeStatus;
	}

	public String getCapitalId() {
		return capitalId;
	}

	public void setCapitalId(String capitalId) {
		this.capitalId = capitalId;
	}

	public Long getFinanceId() {
		return financeId;
	}

	public void setFinanceId(Long financeId) {
		this.financeId = financeId;
	}

	public String getRepayStatus() {
		return repayStatus;
	}

	public void setRepayStatus(String repayStatus) {
		this.repayStatus = repayStatus;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Long getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(Long principalAmount) {
		this.principalAmount = principalAmount;
	}

	public Long getPrincipalAlreadyAmount() {
		return principalAlreadyAmount;
	}

	public void setPrincipalAlreadyAmount(Long principalAlreadyAmount) {
		this.principalAlreadyAmount = principalAlreadyAmount;
	}

	public Long getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(Long interestAmount) {
		this.interestAmount = interestAmount;
	}

	public Long getInterestAlreadyAmount() {
		return interestAlreadyAmount;
	}

	public void setInterestAlreadyAmount(Long interestAlreadyAmount) {
		this.interestAlreadyAmount = interestAlreadyAmount;
	}

	public Long getServiceChargeAmount() {
		return serviceChargeAmount;
	}

	public void setServiceChargeAmount(Long serviceChargeAmount) {
		this.serviceChargeAmount = serviceChargeAmount;
	}

	public Long getServiceChargeAlreadyAmount() {
		return serviceChargeAlreadyAmount;
	}

	public void setServiceChargeAlreadyAmount(Long serviceChargeAlreadyAmount) {
		this.serviceChargeAlreadyAmount = serviceChargeAlreadyAmount;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
