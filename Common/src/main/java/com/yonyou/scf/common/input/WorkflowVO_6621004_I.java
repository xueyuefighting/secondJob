package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 66210004接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class WorkflowVO_6621004_I implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1210058924824123563L;

	@NotNull(message = "融资申请ID不能为空")
	@Length(max = 20, message = "融资申请ID不超过20位")
	private Long financeId;
	@NotNull(message = "授信ID不能为空")
	@Length(max = 20, message = "授信ID不超过20位")
	private Long creditId;
	@NotNull(message = "操作员ID不能为空")
	@Length(max = 20, message = "操作员ID不超过20位")
	private Long userId;

	public Long getFinanceId() {
		return financeId;
	}

	public void setFinanceId(Long financeId) {
		this.financeId = financeId;
	}

	public Long getCreditId() {
		return creditId;
	}

	public void setCreditId(Long creditId) {
		this.creditId = creditId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
