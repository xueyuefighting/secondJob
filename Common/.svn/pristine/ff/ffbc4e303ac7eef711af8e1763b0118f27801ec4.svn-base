package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance1007Request_Data implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull(message = "融资申请ID不能为空")
	private Long financeId;
	
	@NotNull(message = "操作员ID不能为空")
	private Long updateUser;
	
	@NotNull(message = "还款金额不能为空")
	private Long repayAmount;
	
	@NotNull(message = "还款状态不能为空")
	@Length(max = 2, message = "还款状态不超过2位")
	private String repayStatus;
	
	private String updateTime;
	
	public Long getFinanceId() {
		return financeId;
	}

	public void setFinanceId(Long financeId) {
		this.financeId = financeId;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	public Long getRepayAmount() {
		return repayAmount;
	}

	public void setRepayAmount(Long repayAmount) {
		this.repayAmount = repayAmount;
	}

	public String getRepayStatus() {
		return repayStatus;
	}

	public void setRepayStatus(String repayStatus) {
		this.repayStatus = repayStatus;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}