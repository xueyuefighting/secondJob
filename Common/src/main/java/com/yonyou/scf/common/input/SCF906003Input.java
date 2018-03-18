package com.yonyou.scf.common.input;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class SCF906003Input {

	/** 起始日期 */
	private String fromDate;

	/** 截止日期 */
	private String toDate;

	/** 产品ID */
	private Long productId;

	/** 缴费状态 */
	@NotBlank(message = "缴费状态未选择")
	private String serviceChargeStatus;
	
	/** 操作者 */
	@NotNull(message = "登陆信息取得失败")
	private Long operatorId;

	/**
	 * @return the fromDate
	 */
	public String getFromDate() {
		return fromDate;
	}

	/**
	 * @param fromDate
	 *            the fromDate to set
	 */
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * @return the toDate
	 */
	public String getToDate() {
		return toDate;
	}

	/**
	 * @param toDate
	 *            the toDate to set
	 */
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

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
	 * @return the serviceChargeStatus
	 */
	public String getServiceChargeStatus() {
		return serviceChargeStatus;
	}

	/**
	 * @param serviceChargeStatus
	 *            the serviceChargeStatus to set
	 */
	public void setServiceChargeStatus(String serviceChargeStatus) {
		this.serviceChargeStatus = serviceChargeStatus;
	}

	/**
	 * @return the operatorId
	 */
	public Long getOperatorId() {
		return operatorId;
	}

	/**
	 * @param operatorId the operatorId to set
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}

}
