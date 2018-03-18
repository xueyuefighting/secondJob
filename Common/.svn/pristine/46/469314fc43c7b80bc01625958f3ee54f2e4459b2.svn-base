package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance1017Request  implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull(message = "产品ID不能为空")
	private Long productId;
	@NotNull(message = "授信ID不能为空")
	private Long creditId;
	@NotNull(message = "借款企业ID不能为空")
	private Long agencyId;
	@NotNull(message = "核心企业ID不能为空")
	private Long companyId;
	
	@NotNull(message = "融资金额不能为空")
	private Long financeAmount;
	
	@NotNull(message = "融资模式不能为空")
	@Length(max = 2, message = "融资模式不超过2位")
	private String financeMode;
	@NotNull(message = "平台ID不能为空")
	private Long platformId;
	@NotNull(message = "是否冻结自有资金不能为空")
	@Length(max = 2, message = "是否冻结自有资金不超过2位")
	private String isForzen;
	@NotNull(message = "自有资金不能为空")
	private Long forzenAmount;
	@NotNull(message = "资方ID不能为空")
	private Long capitalId;
	
	

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
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

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getFinanceAmount() {
		return financeAmount;
	}

	public void setFinanceAmount(Long financeAmount) {
		this.financeAmount = financeAmount;
	}

	public String getFinanceMode() {
		return financeMode;
	}

	public void setFinanceMode(String financeMode) {
		this.financeMode = financeMode;
	}

	public Long getPlatformId() {
		return platformId;
	}

	public void setPlatformId(Long platformId) {
		this.platformId = platformId;
	}

	public String getIsForzen() {
		return isForzen;
	}

	public void setIsForzen(String isForzen) {
		this.isForzen = isForzen;
	}

	public Long getForzenAmount() {
		return forzenAmount;
	}

	public void setForzenAmount(Long forzenAmount) {
		this.forzenAmount = forzenAmount;
	}

	public Long getCapitalId() {
		return capitalId;
	}

	public void setCapitalId(Long capitalId) {
		this.capitalId = capitalId;
	}
	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
