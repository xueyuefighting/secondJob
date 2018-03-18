package com.yonyou.scf.common.output;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 6601018接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class ProductVO_6601018_O implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8097482589454619846L;

	@Length(max = 20, message = "产品ID不超过20位")
	private Long productId;
	@Length(max = 20, message = "授信ID不超过20位")
	private Long creditId;
	@Length(max = 20, message = "借款企业ID不超过20位")
	private Long agencyId;
	@Length(max = 2, message = "融资模式不超过2位")
	private String mode;
	@Length(max = 20, message = "资方不超过20位")
	private Long capitalId;
	private String capitalName;
	@Length(max = 20, message = "核心企业不超过20位")
	private Long companyId;
	private String companyName;
	@Length(max = 11, message = "产品利率（年化）不超过11位")
	private Integer productRate;
	private Integer financeRate;
	private Long availableAmount;
	private Long minFinanceMoney;
	@Length(max = 2, message = "是否冻结自有资金不超过2位")
	private String isForzen;
	@Length(max = 11, message = "最长融资期限不超过11位")
	private Integer maxFinanceDay;
	@Length(max = 2, message = "还款方式不超过2位")
	private String repayType;
	@Length(max = 2, message = "授信状态不超过2位")
	private String creditStatus;

	private String productName;
	private Long overdueRate;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Long getCapitalId() {
		return capitalId;
	}

	public void setCapitalId(Long capitalId) {
		this.capitalId = capitalId;
	}

	public String getCapitalName() {
		return capitalName;
	}

	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getProductRate() {
		return productRate;
	}

	public void setProductRate(Integer productRate) {
		this.productRate = productRate;
	}

	public Integer getFinanceRate() {
		return financeRate;
	}

	public void setFinanceRate(Integer financeRate) {
		this.financeRate = financeRate;
	}

	public Long getAvailableAmount() {
		return availableAmount;
	}

	public void setAvailableAmount(Long availableAmount) {
		this.availableAmount = availableAmount;
	}

	public Long getMinFinanceMoney() {
		return minFinanceMoney;
	}

	public void setMinFinanceMoney(Long minFinanceMoney) {
		this.minFinanceMoney = minFinanceMoney;
	}

	public Integer getMaxFinanceDay() {
		return maxFinanceDay;
	}

	public void setMaxFinanceDay(Integer maxFinanceDay) {
		this.maxFinanceDay = maxFinanceDay;
	}

	public String getRepayType() {
		return repayType;
	}

	public void setRepayType(String repayType) {
		this.repayType = repayType == null ? null : repayType.trim();
	}

	public String getCreditStatus() {
		return creditStatus;
	}

	public void setCreditStatus(String creditStatus) {
		this.creditStatus = creditStatus;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getOverdueRate() {
		return overdueRate;
	}

	public void setOverdueRate(Long overdueRate) {
		this.overdueRate = overdueRate;
	}

	public Long getCreditId() {
		return creditId;
	}

	public void setCreditId(Long creditId) {
		this.creditId = creditId;
	}

	public Long getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(Long agencyId) {
		this.agencyId = agencyId;
	}

	public String getIsForzen() {
		return isForzen;
	}

	public void setIsForzen(String isForzen) {
		this.isForzen = isForzen;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
