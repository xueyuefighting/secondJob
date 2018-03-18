package com.yonyou.scf.common.tx.gateway;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class Scf1211Request implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9010971953701593527L;

	//资方ID
	@NotBlank(message = "资方ID不能为空,且不超过32位")
	@Length(max = 32,message = "资方ID不超过32位")
	
	private String fundID;
	//商户端融资方ID
	@NotBlank(message = "商户端融资方ID不能为空,且不超过32位")
	@Length(max = 32,message = "商户端融资方ID不超过32位")
	
	private String fsID;
	//商户端核心企业ID
	@NotBlank(message = "核心企业ID不能为空,且不超过32位")
	@Length(max = 32,message = "核心企业ID不超过32位")
	
	private String centerCompanyID;

	//融资申请流水号
	@NotBlank(message = "融资申请流水号不能为空,且不超过32位")
	@Length(max = 32,message = "融资申请流水号不超过32位")
	
	private String financingApplicationNo;
	//应收凭证编号（发票编号）
	@NotBlank(message = "应收凭证号不能为空,且不超过32位")
	@Length(max = 32,message = "应收凭证号不超过32位")
	
	private String accountsRecevieVoucherNo;
	
	//应收凭证类型
	@NotNull(message = "应收凭证类型不能为空,且不超过2位")
	@Max(value = 99,message = "应收凭证类型不超过2位")
	
	private String accountsRecevieVoucherType;
	
	//应收凭证金额（发票金额） 单位：分
	@NotNull(message = "应收凭证金额不能为空，且不超过12位")
	@Max(value=999999999999L,message = "应收凭证金额不超过12位")
	
	private Long accountsRecevieVoucherAmount;
	
	//应收金额 单位：分
	@NotNull(message = "应收金额不能为空，且不超过12位")
	@Max(value=999999999999L,message = "应收金额不超过12位")
	
	private Long accountsRecevieNetAmount;
	
	//开票金额 单位：分
	@NotNull(message = "开票金额不能为空，且不超过12位")
	@Max(value=999999999999L,message = "开票金额不超过12位")
	
	private Long accountsRecevieOpenAmount;
	
	//凭证生成日期
	@NotBlank(message = "凭证生成日期不能为空,且不超过17位")
	@Length(max = 17,message = "凭证生成日期不超过17位")
	
	private String accountsRecevieVoucherDate;
	
	//收款截止日
	@NotBlank(message = "收款截止日不能为空,且不超过17位")
	@Length(max = 17,message = "收款截止日不超过17位")
	
	private String accountsRecevieDeadline;
	
	//摘要
	
	private String accountsRecevieDesc;
	//商务合同编号
	
	private String businessContractNo;
	//商务合同总金额 单位：分
	
	private Long businessContractAmount;
	
	//返回商户端url
	//@NotBlank(message = "返回商户端url不能为空,且不超过500位")
	@Length(max = 500,message = "返回商户端url不超过500位")
	
	private String returnURL;
	
	@NotNull(message ="循环域条数不能为空，且不超过1000")
	@Max(value=1000,message = "循环域条数不超过1000")
	
	private int dataListCnt;
	
	
	@Valid
	private List<Scf1211Request_DataList> dataList;

	public String getFundID() {
		return fundID;
	}

	public String getFsID() {
		return fsID;
	}

	public String getCenterCompanyID() {
		return centerCompanyID;
	}

	public String getFinancingApplicationNo() {
		return financingApplicationNo;
	}

	public String getAccountsRecevieVoucherNo() {
		return accountsRecevieVoucherNo;
	}

	public String getAccountsRecevieVoucherType() {
		return accountsRecevieVoucherType;
	}

	public Long getAccountsRecevieVoucherAmount() {
		return accountsRecevieVoucherAmount;
	}

	public Long getAccountsRecevieNetAmount() {
		return accountsRecevieNetAmount;
	}

	public Long getAccountsRecevieOpenAmount() {
		return accountsRecevieOpenAmount;
	}

	public String getAccountsRecevieVoucherDate() {
		return accountsRecevieVoucherDate;
	}

	public String getAccountsRecevieDeadline() {
		return accountsRecevieDeadline;
	}

	public String getAccountsRecevieDesc() {
		return accountsRecevieDesc;
	}

	public String getBusinessContractNo() {
		return businessContractNo;
	}

	public Long getBusinessContractAmount() {
		return businessContractAmount;
	}

	public String getReturnURL() {
		return returnURL;
	}

	public int getDataListCnt() {
		return dataListCnt;
	}

	public List<Scf1211Request_DataList> getDataList() {
		return dataList;
	}

	public void setFundID(String fundID) {
		this.fundID = fundID;
	}

	public void setFsID(String fsID) {
		this.fsID = fsID;
	}

	public void setCenterCompanyID(String centerCompanyID) {
		this.centerCompanyID = centerCompanyID;
	}

	public void setFinancingApplicationNo(String financingApplicationNo) {
		this.financingApplicationNo = financingApplicationNo;
	}

	public void setAccountsRecevieVoucherNo(String accountsRecevieVoucherNo) {
		this.accountsRecevieVoucherNo = accountsRecevieVoucherNo;
	}

	public void setAccountsRecevieVoucherType(String accountsRecevieVoucherType) {
		this.accountsRecevieVoucherType = accountsRecevieVoucherType;
	}

	public void setAccountsRecevieVoucherAmount(Long accountsRecevieVoucherAmount) {
		this.accountsRecevieVoucherAmount = accountsRecevieVoucherAmount;
	}

	public void setAccountsRecevieNetAmount(Long accountsRecevieNetAmount) {
		this.accountsRecevieNetAmount = accountsRecevieNetAmount;
	}

	public void setAccountsRecevieOpenAmount(Long accountsRecevieOpenAmount) {
		this.accountsRecevieOpenAmount = accountsRecevieOpenAmount;
	}

	public void setAccountsRecevieVoucherDate(String accountsRecevieVoucherDate) {
		this.accountsRecevieVoucherDate = accountsRecevieVoucherDate;
	}

	public void setAccountsRecevieDeadline(String accountsRecevieDeadline) {
		this.accountsRecevieDeadline = accountsRecevieDeadline;
	}

	public void setAccountsRecevieDesc(String accountsRecevieDesc) {
		this.accountsRecevieDesc = accountsRecevieDesc;
	}

	public void setBusinessContractNo(String businessContractNo) {
		this.businessContractNo = businessContractNo;
	}

	public void setBusinessContractAmount(Long businessContractAmount) {
		this.businessContractAmount = businessContractAmount;
	}

	public void setReturnURL(String returnURL) {
		this.returnURL = returnURL;
	}

	public void setDataListCnt(int dataListCnt) {
		this.dataListCnt = dataListCnt;
	}

	public void setDataList(List<Scf1211Request_DataList> dataList) {
		this.dataList = dataList;
	}

	

}
