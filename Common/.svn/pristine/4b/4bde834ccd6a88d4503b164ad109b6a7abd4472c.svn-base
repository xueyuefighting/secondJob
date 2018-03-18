package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 工作流&融资申请接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class WorkflowVO_Finance_I implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7256427149712436492L;

	@NotNull(message = "融资申请ID不能为空")
	@Length(max = 20, message = "融资申请ID不超过20位")
	private Long financeId;
	@NotNull(message = "用户ID不能为空")
	@Length(max = 20, message = "用户ID不超过20位")
	private Long userID;
	
	public Long getFinanceId() {
		return financeId;
	}

	public void setFinanceId(Long financeId) {
		this.financeId = financeId;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
