package com.yonyou.scf.common.input;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance3016Request  implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long financeId;
	@NotNull(message = "产品ID不能为空")
	private Long productId;
	@NotNull(message = "授信ID不能为空")
	private Long creditId;
	@NotNull(message = "借款企业ID不能为空")
	private Long agencyId;
	@NotNull(message = "融资金额不能为空")
	private Long financeAmount;
	@NotNull(message = "融资用途不能为空")
	@Length(max = 2, message = "融资用途不超过2位")
	private String financePurpose;
	@NotNull(message = "融资期限不能为空")
	private int financeDay;
	@Length(max = 100, message = "融资期限不超过100位")
	private String financePurposeRemark;
	@NotNull(message = "融资模式不能为空")
	@Length(max = 2, message = "融资模式不超过2位")
	private String financeMode;
	@NotNull(message = "是否冻结自有资金不能为空")
	@Length(max = 2, message = "是否冻结自有资金不超过2位")
	private String isForzen;
	@NotNull(message = "自有资金不能为空")
	private Long forzenAmount;
	@NotNull(message = "资方ID不能为空")
	private Long capitalId;
	@NotNull(message = "还款方式不能为空")
	@Length(max = 2, message = "还款方式不超过2位")
	private String repayType;
	private String token;
	private List fileId ;//存储文件ID
	private List snId;//合同流水号
	@NotNull(message = "单据ID不能为空")
	private List<Long> billId;
	//融资申请上传的附件
	private String financeFileId;
	
	
	public String getFinanceFileId() {
		return financeFileId;
	}
	public void setFinanceFileId(String financeFileId) {
		this.financeFileId = financeFileId;
	}
	public List getFileId() {
		return fileId;
	}
	public void setFileId(List fileId) {
		this.fileId = fileId;
	}
	public List getSnId() {
		return snId;
	}
	public void setSnId(List snId) {
		this.snId = snId;
	}
	public String getRepayType() {
		return repayType;
	}
	public void setRepayType(String repayType) {
		this.repayType = repayType;
	}
	
	
	public Long getCapitalId() {
		return capitalId;
	}
	public void setCapitalId(Long capitalId) {
		this.capitalId = capitalId;
	}
	
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
	public Long getFinanceAmount() {
		return financeAmount;
	}
	public void setFinanceAmount(Long financeAmount) {
		this.financeAmount = financeAmount;
	}
	public String getFinancePurpose() {
		return financePurpose;
	}
	public void setFinancePurpose(String financePurpose) {
		this.financePurpose = financePurpose;
	}
	public int getFinanceDay() {
		return financeDay;
	}
	public void setFinanceDay(int financeDay) {
		this.financeDay = financeDay;
	}
	public String getFinancePurposeRemark() {
		return financePurposeRemark;
	}
	public void setFinancePurposeRemark(String financePurposeRemark) {
		this.financePurposeRemark = financePurposeRemark;
	}
	public String getFinanceMode() {
		return financeMode;
	}
	public void setFinanceMode(String financeMode) {
		this.financeMode = financeMode;
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
	
	public List<Long> getBillId() {
		return billId;
	}
	public void setBillId(List<Long> billId) {
		this.billId = billId;
	}
	public Long getFinanceId() {
		return financeId;
	}
	public void setFinanceId(Long financeId) {
		this.financeId = financeId;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
