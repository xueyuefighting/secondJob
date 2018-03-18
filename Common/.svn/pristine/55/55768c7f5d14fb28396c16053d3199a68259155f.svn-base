package com.yonyou.scf.common.input;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class SCF902002Input {

	/** 产品ID */
	@NotNull(message = "未选择一个产品")
	private Long productId;

	/** 收费规则 */
	@NotBlank(message = "收费规则未选择")
	private String ruleRadio;

	/** 收费模式 */
	@NotBlank(message = "收费模式未选择")
	private String modeRadio;

	/** 收费比例 */
	private Integer serviceChargeRate;

	/** 收费金额 */
	private Long serviceChargeAmount;

	/** 操作者 */
	private Long operatorId;

	/**
	 * @return the productId
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * @return the ruleRadio
	 */
	public String getRuleRadio() {
		return ruleRadio;
	}

	/**
	 * @param ruleRadio
	 *            the ruleRadio to set
	 */
	public void setRuleRadio(String ruleRadio) {
		this.ruleRadio = ruleRadio;
	}

	/**
	 * @return the modeRadio
	 */
	public String getModeRadio() {
		return modeRadio;
	}

	/**
	 * @param modeRadio
	 *            the modeRadio to set
	 */
	public void setModeRadio(String modeRadio) {
		this.modeRadio = modeRadio;
	}

	/**
	 * @return the serviceChargeRate
	 */
	public Integer getServiceChargeRate() {
		return serviceChargeRate;
	}

	/**
	 * @param serviceChargeRate
	 *            the serviceChargeRate to set
	 */
	public void setServiceChargeRate(Integer serviceChargeRate) {
		this.serviceChargeRate = serviceChargeRate;
	}

	/**
	 * @return the serviceChargeAmount
	 */
	public Long getServiceChargeAmount() {
		return serviceChargeAmount;
	}

	/**
	 * @param serviceChargeAmount
	 *            the serviceChargeAmount to set
	 */
	public void setServiceChargeAmount(Long serviceChargeAmount) {
		this.serviceChargeAmount = serviceChargeAmount;
	}

	/**
	 * @return the operatorId
	 */
	public Long getOperatorId() {
		return operatorId;
	}

	/**
	 * @param operatorId
	 *            the operatorId to set
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
}
