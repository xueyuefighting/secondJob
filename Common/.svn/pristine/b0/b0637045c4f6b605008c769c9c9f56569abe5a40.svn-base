package com.yonyou.scf.common.output;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 6601017接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class ProductVO_6601017_O implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1607915860936073307L;

	@Length(max = 20, message = "产品ID不超过20位")
	private Long productId;
	@Length(max = 2, message = "融资模式不超过2位")
	private String mode;
	@Length(max = 100, message = "产品名称不超过100位")
	private String productName;
	@Length(max = 20, message = "资方不超过20位")
	private Long capitalId;
	private String capitalName;
	@Length(max = 20, message = "核心企业不超过20位")
	private Long companyId;
	private String companyName;
	@Length(max = 11, message = "产品利率（年化）不超过11位")
	private Integer productRate;
	// @Length(max = 11, message = "融资比例不超过11位")
	// private Integer financeRate;
	@Length(max = 20, message = "产品已使用额度不超过20位")
	private Long productUseAmount;
	@Length(max = 20, message = "产品总授信额度不超过20位")
	private Long productCreditAmount;
	// @Length(max = 20, message = "最小融资金额不超过20位")
	// private Long minFinanceMoney;
	// @Length(max = 11, message = "最短融资期限不超过11位")
	// private Integer minFinanceDay;
	@Length(max = 11, message = "最长融资期限不超过11位")
	private Integer maxFinanceDay;
	@Length(max = 2, message = "还款方式不超过2位")
	private String repayType;
	// @Length(max = 2, message = "是否遇节假日顺延不超过2位")
	// private String isdelay;
	// @Length(max = 11, message = "宽限期不超过11位")
	// private Integer extendDay;
	// @Length(max = 11, message = "展期手续费率不超过11位")
	// private Integer extensionChargeRate;
	// @Length(max = 11, message = "提前还款手续费率不超过11位")
	// private Integer prepaymentChargeRate;
	// @Length(max = 11, message = "展期利率上浮比例不超过11位")
	// private Integer continuationFloatRate;
	// @Length(max = 11, message = "逾期利率上浮比例不超过11位")
	// private Integer overdueFloatRate;
	// @Length(max = 11, message = "展期利率（年化）不超过11位")
	// private Integer continuationRate;
	// @Length(max = 11, message = "逾期利率（年化）不超过11位")
	// private Integer overdueRate;
	// @Length(max = 2, message = "产品状态不超过2位")
	// private String status;
	// @Length(max = 20, message = "平台来源不超过20位")
	// private Long platformId;
	// @Length(max = 2, message = "是否冻结自有资金不超过20位")
	// private String isFrozenOwnFunds;
	// @Length(max = 20, message = "创建人ID不超过20位")
	// private Long createUser;
	@Length(max = 20, message = "授信ID不超过20位")
	private Long creditId;
	private Long availableAmount;
	@Length(max = 20, message = "借款企业ID不超过20位")
	private Long agencyId;

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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName == null ? null : productName.trim();
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

	// public Integer getFinanceRate() {
	// return financeRate;
	// }
	//
	// public void setFinanceRate(Integer financeRate) {
	// this.financeRate = financeRate;
	// }

	public Long getProductUseAmount() {
		return productUseAmount;
	}

	public void setProductUseAmount(Long productUseAmount) {
		this.productUseAmount = productUseAmount;
	}

	public Long getProductCreditAmount() {
		return productCreditAmount;
	}

	public void setProductCreditAmount(Long productCreditAmount) {
		this.productCreditAmount = productCreditAmount;
	}

	// public Long getMinFinanceMoney() {
	// return minFinanceMoney;
	// }
	//
	// public void setMinFinanceMoney(Long minFinanceMoney) {
	// this.minFinanceMoney = minFinanceMoney;
	// }
	//
	// public Integer getMinFinanceDay() {
	// return minFinanceDay;
	// }
	//
	// public void setMinFinanceDay(Integer minFinanceDay) {
	// this.minFinanceDay = minFinanceDay;
	// }

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

	// public String getIsdelay() {
	// return isdelay;
	// }
	//
	// public void setIsdelay(String isdelay) {
	// this.isdelay = isdelay == null ? null : isdelay.trim();
	// }
	//
	// public Integer getExtendDay() {
	// return extendDay;
	// }
	//
	// public void setExtendDay(Integer extendDay) {
	// this.extendDay = extendDay;
	// }
	//
	// public Integer getExtensionChargeRate() {
	// return extensionChargeRate;
	// }
	//
	// public void setExtensionChargeRate(Integer extensionChargeRate) {
	// this.extensionChargeRate = extensionChargeRate;
	// }
	//
	// public Integer getPrepaymentChargeRate() {
	// return prepaymentChargeRate;
	// }
	//
	// public void setPrepaymentChargeRate(Integer prepaymentChargeRate) {
	// this.prepaymentChargeRate = prepaymentChargeRate;
	// }
	//
	// public Integer getContinuationFloatRate() {
	// return continuationFloatRate;
	// }
	//
	// public void setContinuationFloatRate(Integer continuationFloatRate) {
	// this.continuationFloatRate = continuationFloatRate;
	// }
	//
	// public Integer getOverdueFloatRate() {
	// return overdueFloatRate;
	// }
	//
	// public void setOverdueFloatRate(Integer overdueFloatRate) {
	// this.overdueFloatRate = overdueFloatRate;
	// }
	//
	// public Integer getContinuationRate() {
	// return continuationRate;
	// }
	//
	// public void setContinuationRate(Integer continuationRate) {
	// this.continuationRate = continuationRate;
	// }
	//
	// public Integer getOverdueRate() {
	// return overdueRate;
	// }
	//
	// public void setOverdueRate(Integer overdueRate) {
	// this.overdueRate = overdueRate;
	// }
	//
	// public String getStatus() {
	// return status;
	// }
	//
	// public void setStatus(String status) {
	// this.status = status == null ? null : status.trim();
	// }
	//
	// public Long getPlatformId() {
	// return platformId;
	// }
	//
	// public void setPlatformId(Long platformId) {
	// this.platformId = platformId;
	// }
	//
	// public String getIsFrozenOwnFunds() {
	// return isFrozenOwnFunds;
	// }
	//
	// public void setIsFrozenOwnFunds(String isFrozenOwnFunds) {
	// this.isFrozenOwnFunds = isFrozenOwnFunds == null ? null
	// : isFrozenOwnFunds.trim();
	// }
	//
	// public Long getCreateUser() {
	// return createUser;
	// }
	//
	// public void setCreateUser(Long createUser) {
	// this.createUser = createUser;
	// }

	public Long getCreditId() {
		return creditId;
	}

	public void setCreditId(Long creditId) {
		this.creditId = creditId;
	}

	public Long getAvailableAmount() {
		return availableAmount;
	}

	public void setAvailableAmount(Long availableAmount) {
		this.availableAmount = availableAmount;
	}

	public Long getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(Long agencyId) {
		this.agencyId = agencyId;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
