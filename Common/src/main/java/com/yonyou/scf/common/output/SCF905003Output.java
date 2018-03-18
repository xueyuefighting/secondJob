package com.yonyou.scf.common.output;

public class SCF905003Output {

	/** 产品ID */
	private Long productId;
	/** 授信ID */
	private Long creditId;
	/** 资方ID */
	private Long capitalId;
	/** 产品名称 */
	private String productName;
	/** 授信额度 */
	private Long creditAmoutAll;
	/** 日期 */
	private String date;
	/** 服务费金额 */
	private Long serviceCharge;
	/** 缴费状态 */
	private String status;
	/** 付款时间 */
	private String payTime;
	/** 退款时间 */
	private String rebateTime;

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
	 * @return the creditId
	 */
	public Long getCreditId() {
		return creditId;
	}

	/**
	 * @param creditId
	 *            the creditId to set
	 */
	public void setCreditId(Long creditId) {
		this.creditId = creditId;
	}

	/**
	 * @return the capitalId
	 */
	public Long getCapitalId() {
		return capitalId;
	}

	/**
	 * @param capitalId
	 *            the capitalId to set
	 */
	public void setCapitalId(Long capitalId) {
		this.capitalId = capitalId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName
	 *            the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the creditAmoutAll
	 */
	public Long getCreditAmoutAll() {
		return creditAmoutAll;
	}

	/**
	 * @param creditAmoutAll
	 *            the creditAmoutAll to set
	 */
	public void setCreditAmoutAll(Long creditAmoutAll) {
		this.creditAmoutAll = creditAmoutAll;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the serviceCharge
	 */
	public Long getServiceCharge() {
		return serviceCharge;
	}

	/**
	 * @param serviceCharge
	 *            the serviceCharge to set
	 */
	public void setServiceCharge(Long serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the payTime
	 */
	public String getPayTime() {
		return payTime;
	}

	/**
	 * @param payTime
	 *            the payTime to set
	 */
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	/**
	 * @return the rebateTime
	 */
	public String getRebateTime() {
		return rebateTime;
	}

	/**
	 * @param rebateTime
	 *            the rebateTime to set
	 */
	public void setRebateTime(String rebateTime) {
		this.rebateTime = rebateTime;
	}

}
