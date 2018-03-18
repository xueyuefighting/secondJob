package com.yonyou.scf.common.tx.gateway;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf1401Request implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 273433318075486487L;
	
    //商户端核心企业ID
	@NotBlank(message="商户端核心企业ID不能为空,且不超过32位")
	@Length(max=32,message="商户端核心企业ID不超过32位")
    
    private String centerCompanyId;
    
	//商户端融资方ID
	@NotBlank(message="商户端融资方ID不能为空,且不超过32位")
	@Length(max=32,message="商户端融资方ID不超过32位")
	
	 private String fsId;
	
	//融资申请流水号
	@NotBlank(message="融资申请流水号不能为空,且不超过32位")
	@Length(max=32,message="融资申请流水号不超过32位")
	
	private String financingApplicationNo;
	
	//付款凭证编号
	@NotBlank(message="付款凭证编号不能为空,且不超过32位")
	@Length(max=32,message="付款凭证编号不超过32位")
	
	private String accountsRecevieVoucherNo;
	
	//共管账号银行ID
	@NotBlank(message="共管账号银行ID不能为空,且不超过32位")
	@Length(max=32,message="共管账号银行ID不超过32位")
	
	private String fsManagedAccountBankID;
	
	//共管账号账户号码
	@NotBlank(message="共管账号账户号码不能为空,且不超过32位")
	@Length(max=32,message="共管账号账户号码不超过32位")
	
	private String fsManagedAccountNumber;
	
	public String getCenterCompanyId() {
		return centerCompanyId;
	}

	public String getFsId() {
		return fsId;
	}

	public String getFinancingApplicationNo() {
		return financingApplicationNo ==null ?null : financingApplicationNo.trim();
	}

	public String getAccountsRecevieVoucherNo() {
		return accountsRecevieVoucherNo == null?null:accountsRecevieVoucherNo.trim();
	}

	public String getFsManagedAccountBankID() {
		return fsManagedAccountBankID == null? null:fsManagedAccountBankID.trim();
	}

	public String getFsManagedAccountNumber() {
		return fsManagedAccountNumber == null ?null:fsManagedAccountNumber.trim();
	}

	public void setCenterCompanyId(String centerCompanyId) {
		this.centerCompanyId = centerCompanyId;
	}

	public void setFsId(String fsId) {
		this.fsId = fsId;
	}

	public void setFinancingApplicationNo(String financingApplicationNo) {
		this.financingApplicationNo = financingApplicationNo;
	}

	public void setAccountsRecevieVoucherNo(String accountsRecevieVoucherNo) {
		this.accountsRecevieVoucherNo = accountsRecevieVoucherNo;
	}

	public void setFsManagedAccountBankID(String fsManagedAccountBankID) {
		this.fsManagedAccountBankID = fsManagedAccountBankID;
	}

	public void setFsManagedAccountNumber(String fsManagedAccountNumber) {
		this.fsManagedAccountNumber = fsManagedAccountNumber;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
