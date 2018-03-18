package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance1025Request  implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull(message = "融资申请ID不能为空")
	private Long financeId;
	@NotNull(message = "产品ID不能为空")
	private Long productId;
	@NotNull(message = "借款企业ID不能为空")
	private Long agencyId;
	@NotNull(message = "融资金额不能为空")
	private Long financeAmount;
	@NotNull(message = "融资模式不能为空")
	@Length(max = 2, message = "融资模式不超过2位")
	private String financeMode;

	private String token;
	@NotNull(message = "合同文件ID不能为空")
	private Long fileId;
	//@NotNull(message = "单据ID不能为空")中心小贷的场合为空
	private Long billId;
	@NotNull(message = "合同类型不能为空")
	private String contractType;
	@NotNull(message = "授信ID不能为空")
	private Long creditId;
	//中心小贷用
	private String purpose;
	//中心小贷用
	private String purposeMark;
	
	public Long getFinanceId() {
		return financeId;
	}

	public void setFinanceId(Long financeId) {
		this.financeId = financeId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(Long agencyId) {
		this.agencyId = agencyId;
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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getFileId() {
		return fileId;
	}

	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}

	public Long getBillId() {
		return billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public Long getCreditId() {
		return creditId;
	}

	public void setCreditId(Long creditId) {
		this.creditId = creditId;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getPurposeMark() {
		return purposeMark;
	}

	public void setPurposeMark(String purposeMark) {
		this.purposeMark = purposeMark;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
