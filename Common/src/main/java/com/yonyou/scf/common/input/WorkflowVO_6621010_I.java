package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 66210010接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class WorkflowVO_6621010_I implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6633271736168043429L;
	
	@NotNull(message = "工作流ID不能为空")
	@Length(max = 20, message = "工作流ID不超过20位")
	private Long wkId;

	public Long getWkId() {
		return wkId;
	}

	public void setWkId(Long wkId) {
		this.wkId = wkId;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
