package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 66210005接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class WorkflowVO_6621005_I implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2828609018194124475L;

	@NotNull(message = "融资申请ID不能为空")
	@Length(max = 20, message = "融资申请ID不超过20位")
	private Long financeId;
	// @NotNull(message = "授信ID不能为空")
	// @Length(max = 20, message = "授信ID不超过20位")
	// private Long creditId;
	// @NotNull(message = "角色ID不能为空")
	// @Length(max = 20, message = "角色ID不超过20位")
	// private Long roleId;
	@NotNull(message = "工作流ID不能为空")
	@Length(max = 20, message = "工作流ID不超过20位")
	private Long wkId;
	@NotNull(message = "节点ID不能为空")
	@Length(max = 20, message = "节点ID不超过20位")
	private Long nodeId;
	@NotNull(message = "用户ID不能为空")
	@Length(max = 20, message = "用户ID不超过20位")
	private Long userId;
	@NotNull(message = "审核状态不能为空")
	@Length(max = 1, message = "审核状态不超过1位")
	private String status;
	@NotNull(message = "审核意见不能为空")
	@Length(max = 200, message = "审核意见不超过200位")
	private String info;

	public Long getFinanceId() {
		return financeId;
	}

	public void setFinanceId(Long financeId) {
		this.financeId = financeId;
	}

	// public Long getCreditId() {
	// return creditId;
	// }
	//
	// public void setCreditId(Long creditId) {
	// this.creditId = creditId;
	// }
	//
	// public Long getRoleId() {
	// return roleId;
	// }
	//
	// public void setRoleId(Long roleId) {
	// this.roleId = roleId;
	// }

	public Long getWkId() {
		return wkId;
	}

	public void setWkId(Long wkId) {
		this.wkId = wkId;
	}

	public Long getNodeId() {
		return nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
