package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance1006Request implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull(message = "融资申请ID不能为空")
	private Long financeId;
	
	@NotNull(message = "操作员ID不能为空")
	private Long updateUser;
	@NotNull(message = "放款日期不能为空")
	@Length(max = 17, message = "放款日期不超过17位")
	private String iouDate;
	
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

	public String getIouDate() {
		return iouDate;
	}

	public void setIouDate(String iouDate) {
		this.iouDate = iouDate;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}