package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import com.yonyou.scf.common.util.json.JsonUtil;


public class Scf98003Request  implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 借款企业ID
	@NotNull(message = "借款企业ID不能为空，且不超过32")
	@Max(value = 32, message = "借款企业ID不超过32")
	private Long agencyId;

	// 融资模式
	@NotNull(message = "融资模式不能为空，且不超过2")
	@Max(value = 2, message = "融资模式不超过2")
	private String financeProductType;

	// 产品ID
	@NotNull(message = "产品ID不能为空，且不超过32")
	@Max(value = 32, message = "产品ID不超过32")
	private Long productId;

	// 产品利率
	@NotNull(message = "产品利率不能为空")
	private Long productRate;

	// 逾期利率
	@NotNull(message = "逾期利率不能为空")
	private Long overdueRate;

	// 融资单编号
	@NotNull(message = "融资单编号不能为空，且不超过32")
	@Max(value = 32, message = "融资单编号不超过32")
	private Long financingApplicationNo;

	// 融资起始日
	@NotNull(message = "融资起始日不能为空，且不超过20")
	@Max(value = 20, message = "融资起始日不超过20")
	private String financingStartDate;

	// 融资到期日
	@NotNull(message = "融资到期日不能为空，且不超过20")
	@Max(value = 20, message = "融资到期日不超过20")
	private String financingEndDate;

	// 展期起始日
	@NotNull(message = "展期起始日不能为空，且不超过20")
	@Max(value = 20, message = "展期起始日不超过20")
	private String extendStartDate;

	// 展期到期日
	@NotNull(message = "展期到期日不能为空，且不超过20")
	@Max(value = 20, message = "展期到期日不超过20")
	private String extendEndDate;

	// 币种
	@NotNull(message = "币种不能为空，且不超过3")
	@Max(value = 3, message = "币种不超过3")
	private String currency;

	// 创建用户
	@NotNull(message = "创建用户不能为空，且不超过32")
	@Max(value = 32, message = "创建用户不超过32")
	private Long createId;

	public Long getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(Long agencyId) {
		this.agencyId = agencyId;
	}

	public String getFinanceProductType() {
		return financeProductType;
	}

	public void setFinanceProductType(String financeProductType) {
		this.financeProductType = financeProductType;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getProductRate() {
		return productRate;
	}

	public void setProductRate(Long productRate) {
		this.productRate = productRate;
	}

	public Long getOverdueRate() {
		return overdueRate;
	}

	public void setOverdueRate(Long overdueRate) {
		this.overdueRate = overdueRate;
	}

	public Long getFinancingApplicationNo() {
		return financingApplicationNo;
	}

	public void setFinancingApplicationNo(Long financingApplicationNo) {
		this.financingApplicationNo = financingApplicationNo;
	}

	public String getFinancingStartDate() {
		return financingStartDate;
	}

	public void setFinancingStartDate(String financingStartDate) {
		this.financingStartDate = financingStartDate;
	}

	public String getFinancingEndDate() {
		return financingEndDate;
	}

	public void setFinancingEndDate(String financingEndDate) {
		this.financingEndDate = financingEndDate;
	}

	public String getExtendStartDate() {
		return extendStartDate;
	}

	public void setExtendStartDate(String extendStartDate) {
		this.extendStartDate = extendStartDate;
	}

	public String getExtendEndDate() {
		return extendEndDate;
	}

	public void setExtendEndDate(String extendEndDate) {
		this.extendEndDate = extendEndDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Long getCreateId() {
		return createId;
	}

	public void setCreateId(Long createId) {
		this.createId = createId;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
