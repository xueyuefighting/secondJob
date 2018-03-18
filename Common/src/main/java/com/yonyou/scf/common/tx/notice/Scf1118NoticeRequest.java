package com.yonyou.scf.common.tx.notice;

import java.io.Serializable;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf1118NoticeRequest implements Serializable{

	private static final long serialVersionUID = 9003142023804579016L;

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

	// 或前状态
	
	private Integer beforeLoanStatus;

	public Scf1118NoticeRequest() {
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

	public void setBeforeLoanStatus(Integer beforeLoanStatus) {
		this.beforeLoanStatus = beforeLoanStatus;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}