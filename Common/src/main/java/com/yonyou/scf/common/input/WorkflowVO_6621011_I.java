package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 66210011接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class WorkflowVO_6621011_I implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6085798633252712324L;

	@NotNull(message = "工作流ID不能为空")
	@Length(max = 20, message = "工作流ID不超过20位")
	private Long wkId;
	@NotNull(message = "合同ID不能为空")
	@Length(max = 20, message = "合同ID不超过20位")
	private Long contractId;
	@NotNull(message = "类型不能为空")
	@Length(max = 2, message = "类型不超过2位")
	private String type;
	@NotNull(message = "操作员ID不能为空")
	@Length(max = 20, message = "操作员ID不超过20位")
	private Long userId;
	@NotNull(message = "token不能为空")
	@Length(max = 36, message = "token不超过36位")
	private String token;

	public Long getWkId() {
		return wkId;
	}

	public void setWkId(Long wkId) {
		this.wkId = wkId;
	}

	public Long getContractId() {
		return contractId;
	}

	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
