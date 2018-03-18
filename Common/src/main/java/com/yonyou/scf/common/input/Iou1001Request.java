package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Iou1001Request  implements Serializable   {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message = "融资申请ID不能为空")
	private Long financeId;
	@NotNull(message = "放款金额不能为空")
	private Long loadAmount;
	@NotNull(message = "会员编号不能为空")
	@Length(max = 12, message = "会员编号不超过12位")
	private String memNum;
	@NotNull(message = "操作员不能为空")
	private Long operatorUser;
	@NotNull(message = "借据号不能为空")
	@Length(max = 24, message = "会员编号不超过24位")
	private String fcsSerialNum;
	
	
	public Long getFinanceId() {
		return financeId;
	}


	public void setFinanceId(Long financeId) {
		this.financeId = financeId;
	}


	public Long getLoadAmount() {
		return loadAmount;
	}


	public void setLoadAmount(Long loadAmount) {
		this.loadAmount = loadAmount;
	}


	public String getMemNum() {
		return memNum;
	}


	public void setMemNum(String memNum) {
		this.memNum = memNum;
	}


	public Long getOperatorUser() {
		return operatorUser;
	}


	public void setOperatorUser(Long operatorUser) {
		this.operatorUser = operatorUser;
	}


	public String getFcsSerialNum() {
		return fcsSerialNum;
	}


	public void setFcsSerialNum(String fcsSerialNum) {
		this.fcsSerialNum = fcsSerialNum;
	}


	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
