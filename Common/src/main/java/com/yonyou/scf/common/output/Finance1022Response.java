package com.yonyou.scf.common.output;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.yonyou.scf.common.entity.File;
import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance1022Response   implements Serializable{

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
	//融资单状态
	private String financeStatus;
	//融资单状态
	private String financeStatusName;
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
	//融资期限
	private int financeDay;
	//放款日期
	private String repayTime;
	private String createTime;
	private String companyId;

	
//	//流程审批历史
//	//单据信息
	private List<Finance1011Response_approvalHistory> approvalHistory = new ArrayList<Finance1011Response_approvalHistory>();
	private List<Finance1011Response_BillInfo> billInfo = new ArrayList<Finance1011Response_BillInfo>();
	//操作员
	private String operator;
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

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
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

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
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

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
