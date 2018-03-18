package com.yonyou.scf.common.output;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance1014Response implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull(message = "缴费状态不能为空")
	@Length(max = 1, message = "缴费状态不超过1位")
	private String isService;
	@NotNull(message = "服务费不能为空")
	@Length(max = 11, message = "服务费不超过11位")
	private Long serviceFee;
	@Length(max = 15, message = "余额不超过15位")
	private Double balance;
	@Length(max = 15, message = "可用余额不超过15位")
	private Double useableBalance;
	@NotNull(message = "资方代码不能为空")
	@Length(max = 2, message = "资方代码不超过2位")
	private String capitalNo;
	
	
	public String getIsService() {
		return isService;
	}


	public void setIsService(String isService) {
		this.isService = isService;
	}


	public Long getServiceFee() {
		return serviceFee;
	}


	public void setServiceFee(Long serviceFee) {
		this.serviceFee = serviceFee;
	}


	public Double getBalance() {
		return balance;
	}


	public void setBalance(Double balance) {
		this.balance = balance;
	}


	public Double getUseableBalance() {
		return useableBalance;
	}


	public void setUseableBalance(Double useableBalance) {
		this.useableBalance = useableBalance;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String getCapitalNo() {
		return capitalNo;
	}


	public void setCapitalNo(String capitalNo) {
		this.capitalNo = capitalNo;
	}


	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
