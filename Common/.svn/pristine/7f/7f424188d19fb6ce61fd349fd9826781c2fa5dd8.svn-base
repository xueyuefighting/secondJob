package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 66210006接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class WorkflowVO_6621006_I implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4420598198377126028L;

	@NotNull(message = "融资申请ID不能为空")
	@Length(max = 20, message = "融资申请ID不超过20位")
	private Long financeId;

	public Long getFinanceId() {
		return financeId;
	}

	public void setFinanceId(Long financeId) {
		this.financeId = financeId;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
