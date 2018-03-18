package com.yonyou.scf.common.output;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.yonyou.scf.common.entity.File;
import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance1011Response   implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//区分是那个资方
	private String capitalNo;
	//融资单编号
	private String financeNo;
	//产品名称
	private String productName;
	//待还余额
	private Long noRepayAmount;
	//还款到期日
	private String repayEndDate;
	//融资单状态
	private String financeStatus;
	//融资单状态
	private String financeStatusName;
	//已还本金
	private Long repayAmount;
	//已还利息
	private Long repayFee;
	//借款方
	private String agencyId;
	//资方名称
	private String captialId;
	//融资模式
	private String financeMode;
	//融资模式名称
	private String financeModeName;
	//还款方式名称
	private String repayType;
	//产品利率
	private float productRate;
	//逾期利率
	private float overdueRate;
	//是否冻结自有资金
	private String isFrozen;
	private Long financeAmount;
	private String financePurpose;
	//还款状态
	private String repayStatus;
	//融资期限
	private int financeDay;
	//放款日期
	private String repayTime;
//	//相关协议ID,协议名称，协议URL
	private List<Finance1011Response_contractFiles> contractFiles = new ArrayList<Finance1011Response_contractFiles>();
	
	//保理数据

	//提前还款手续费
	private Long prepaymentAmount;
	private Long useRepaymentAmount;
	private Long noRepaymentAmount;
	//展期手续费
	private Long esfAmount;
	private Long uesfAmount;
	private Long nesfAmount;
	//展期利息
	private Long riAmount;
	private Long uriAmount;
	private Long nriAmount;
	//逾期利息
	private Long oiAmount;
	private Long uoiAmount;
	private Long noiAmount;
	
//	//流程审批历史
//	//单据信息
	private List<Finance1011Response_approvalHistory> approvalHistory = new ArrayList<Finance1011Response_approvalHistory>();
	private List<Finance1011Response_BillInfo> billInfo = new ArrayList<Finance1011Response_BillInfo>();
	private List<Finance1011Response_repayInfo> repayInfo = new ArrayList<Finance1011Response_repayInfo>();
	//附件信息
	private File remarkFile;
	
	public File getRemarkFile() {
		return remarkFile;
	}
	public void setRemarkFile(File remarkFile) {
		this.remarkFile = remarkFile;
	}
	public String getCapitalNo() {
		return capitalNo;
	}
	public void setCapitalNo(String capitalNo) {
		this.capitalNo = capitalNo;
	}
	public String getFinanceNo() {
		return financeNo;
	}
	public void setFinanceNo(String financeNo) {
		this.financeNo = financeNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Long getNoRepayAmount() {
		return noRepayAmount;
	}
	public void setNoRepayAmount(Long noRepayAmount) {
		this.noRepayAmount = noRepayAmount;
	}
	public String getRepayEndDate() {
		return repayEndDate;
	}
	public void setRepayEndDate(String repayEndDate) {
		this.repayEndDate = repayEndDate;
	}
	public String getFinanceStatus() {
		return financeStatus;
	}
	public void setFinanceStatus(String financeStatus) {
		this.financeStatus = financeStatus;
	}
	public String getFinanceStatusName() {
		return financeStatusName;
	}
	public void setFinanceStatusName(String financeStatusName) {
		this.financeStatusName = financeStatusName;
	}
	public Long getRepayAmount() {
		return repayAmount;
	}
	public void setRepayAmount(Long repayAmount) {
		this.repayAmount = repayAmount;
	}
	public Long getRepayFee() {
		return repayFee;
	}
	public void setRepayFee(Long repayFee) {
		this.repayFee = repayFee;
	}
	
	public String getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(String agencyId) {
		this.agencyId = agencyId;
	}
	public String getCaptialId() {
		return captialId;
	}
	public void setCaptialId(String captialId) {
		this.captialId = captialId;
	}
	public String getFinanceMode() {
		return financeMode;
	}
	public void setFinanceMode(String financeMode) {
		this.financeMode = financeMode;
	}
	public String getFinanceModeName() {
		return financeModeName;
	}
	public void setFinanceModeName(String financeModeName) {
		this.financeModeName = financeModeName;
	}
	public String getRepayType() {
		return repayType;
	}
	public void setRepayType(String repayType) {
		this.repayType = repayType;
	}
	public float getProductRate() {
		return productRate;
	}
	public void setProductRate(float productRate) {
		this.productRate = productRate;
	}
	public float getOverdueRate() {
		return overdueRate;
	}
	public void setOverdueRate(float overdueRate) {
		this.overdueRate = overdueRate;
	}
	public String getIsFrozen() {
		return isFrozen;
	}
	public void setIsFrozen(String isFrozen) {
		this.isFrozen = isFrozen;
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
	public String getRepayTime() {
		return repayTime;
	}
	public void setRepayTime(String repayTime) {
		this.repayTime = repayTime;
	}

	
	
	public Long getUseRepaymentAmount() {
		return useRepaymentAmount;
	}
	public void setUseRepaymentAmount(Long useRepaymentAmount) {
		this.useRepaymentAmount = useRepaymentAmount;
	}
	public Long getNoRepaymentAmount() {
		return noRepaymentAmount;
	}
	public void setNoRepaymentAmount(Long noRepaymentAmount) {
		this.noRepaymentAmount = noRepaymentAmount;
	}
	
		
	public Long getPrepaymentAmount() {
		return prepaymentAmount;
	}
	public void setPrepaymentAmount(Long prepaymentAmount) {
		this.prepaymentAmount = prepaymentAmount;
	}
	public Long getEsfAmount() {
		return esfAmount;
	}
	public void setEsfAmount(Long esfAmount) {
		this.esfAmount = esfAmount;
	}
	public Long getUesfAmount() {
		return uesfAmount;
	}
	public void setUesfAmount(Long uesfAmount) {
		this.uesfAmount = uesfAmount;
	}
	public Long getNesfAmount() {
		return nesfAmount;
	}
	public void setNesfAmount(Long nesfAmount) {
		this.nesfAmount = nesfAmount;
	}
	public Long getRiAmount() {
		return riAmount;
	}
	public void setRiAmount(Long riAmount) {
		this.riAmount = riAmount;
	}
	public Long getUriAmount() {
		return uriAmount;
	}
	public void setUriAmount(Long uriAmount) {
		this.uriAmount = uriAmount;
	}
	public Long getNriAmount() {
		return nriAmount;
	}
	public void setNriAmount(Long nriAmount) {
		this.nriAmount = nriAmount;
	}
	public Long getOiAmount() {
		return oiAmount;
	}
	public void setOiAmount(Long oiAmount) {
		this.oiAmount = oiAmount;
	}
	public Long getUoiAmount() {
		return uoiAmount;
	}
	public void setUoiAmount(Long uoiAmount) {
		this.uoiAmount = uoiAmount;
	}
	public Long getNoiAmount() {
		return noiAmount;
	}
	public void setNoiAmount(Long noiAmount) {
		this.noiAmount = noiAmount;
	}
	public String getRepayStatus() {
		return repayStatus;
	}
	public void setRepayStatus(String repayStatus) {
		this.repayStatus = repayStatus;
	}
	
	public List<Finance1011Response_contractFiles> getContractFiles() {
		return contractFiles;
	}
	public void setContractFiles(List<Finance1011Response_contractFiles> contractFiles) {
		this.contractFiles = contractFiles;
	}
	public List<Finance1011Response_approvalHistory> getApprovalHistory() {
		return approvalHistory;
	}
	public void setApprovalHistory(List<Finance1011Response_approvalHistory> approvalHistory) {
		this.approvalHistory = approvalHistory;
	}
	
	public List<Finance1011Response_BillInfo> getBillInfo() {
		return billInfo;
	}
	public void setBillInfo(List<Finance1011Response_BillInfo> billInfo) {
		this.billInfo = billInfo;
	}
	
	public List<Finance1011Response_repayInfo> getRepayInfo() {
		return repayInfo;
	}
	public void setRepayInfo(List<Finance1011Response_repayInfo> repayInfo) {
		this.repayInfo = repayInfo;
	}
	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
