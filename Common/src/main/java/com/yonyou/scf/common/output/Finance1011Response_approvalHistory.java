package com.yonyou.scf.common.output;

import java.io.Serializable;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance1011Response_approvalHistory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String appStep;
	private String appOperator;
	private String appTime;
	private String appResult;
	private String appStatus;

	public String getAppStep() {
		return appStep;
	}

	public void setAppStep(String appStep) {
		this.appStep = appStep;
	}

	public String getAppOperator() {
		return appOperator;
	}

	public void setAppOperator(String appOperator) {
		this.appOperator = appOperator;
	}

	public String getAppTime() {
		return appTime;
	}

	public void setAppTime(String appTime) {
		this.appTime = appTime;
	}

	public String getAppResult() {
		return appResult;
	}

	public void setAppResult(String appResult) {
		this.appResult = appResult;
	}

	public String getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(String appStatus) {
		this.appStatus = appStatus;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
