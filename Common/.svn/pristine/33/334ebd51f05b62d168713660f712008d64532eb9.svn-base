package com.yonyou.scf.common.tx.notice;

import java.io.Serializable;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf1108NoticeRequest implements Serializable {

	private static final long serialVersionUID = 8439746939145992538L;

	// 资方ID
	
	private String fundId;

	// 融资产品类型
	
	private Integer financeProductionType;

	// 产品ID
	
	private String productId;

	// 产品名称
	
	private String productName;

	// 商户端核心企业ID
	
	private String centerCompanyId;

	// 商户端融资方ID
	
	private String fsId;

	// 商户端资方共管账户银行ID
	
	private String fsManagedAccountBankID="0000";

	// 商户端资方共管账户号码
	
	private String fsManagedAccountNumber="0000";

	// 或前准备
	
	private Integer beforeLoanStatus;

	public Scf1108NoticeRequest() {
	}

	public String getFundId() {
		return fundId;
	}

	public Integer getFinanceProductionType() {
		return financeProductionType;
	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public String getCenterCompanyId() {
		return centerCompanyId;
	}

	public String getFsId() {
		return fsId;
	}

	public String getFsManagedAccountBankID() {
		return fsManagedAccountBankID;
	}

	public String getFsManagedAccountNumber() {
		return fsManagedAccountNumber;
	}

	public Integer getBeforeLoanStatus() {
		return beforeLoanStatus;
	}

	public void setFundId(String fundId) {
		this.fundId = fundId == null ? null : fundId.trim();
	}

	public void setFinanceProductionType(Integer financeProductionType) {
		this.financeProductionType = financeProductionType;
	}

	public void setProductId(String productId) {
		this.productId = productId == null ? null : productId.trim();
	}

	public void setProductName(String productName) {
		this.productName = productName == null ? null : productName.trim();
	}

	public void setCenterCompanyId(String centerCompanyId) {
		this.centerCompanyId = centerCompanyId == null ? null : centerCompanyId.trim();
	}

	public void setFsId(String fsId) {
		this.fsId = fsId == null ? null : fsId.trim();
	}

	public void setFsManagedAccountBankID(String fsManagedAccountBankID) {
		this.fsManagedAccountBankID = fsManagedAccountBankID == null ? null : fsManagedAccountBankID.trim();
	}

	public void setFsManagedAccountNumber(String fsManagedAccountNumber) {
		this.fsManagedAccountNumber = fsManagedAccountNumber == null ? null : fsManagedAccountNumber.trim();
	}

	public void setBeforeLoanStatus(Integer beforeLoanStatus) {
		this.beforeLoanStatus = beforeLoanStatus;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}