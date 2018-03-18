package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;


import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance1004Request implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull(message = "融资申请ID不能为空")
	private Long financeId;
	
	@NotNull(message = "操作员ID不能为空")
	private Long updateUser;
	//审批建议
	private String applyIdea;
	//流ID
	private Long flowId;
	//节点Id
	private Long stepId;
	private String token;
	
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

	public String getApplyIdea() {
		return applyIdea;
	}

	public void setApplyIdea(String applyIdea) {
		this.applyIdea = applyIdea;
	}

	public Long getFlowId() {
		return flowId;
	}

	public void setFlowId(Long flowId) {
		this.flowId = flowId;
	}

	public Long getStepId() {
		return stepId;
	}

	public void setStepId(Long stepId) {
		this.stepId = stepId;
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