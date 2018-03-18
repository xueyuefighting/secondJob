package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 工作流&用户权限接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class WorkflowVO_Role_I implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4996302783599779146L;

	@NotNull(message = "企业或者个人ID不能为空")
	@Length(max = 20, message = "企业或者个人ID不超过20位")
	private Long companyId;
	@NotNull(message = "用户角色ID不能为空")
	@Length(max = 20, message = "用户角色ID不超过20位")
	private Long roleID;

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getRoleID() {
		return roleID;
	}

	public void setRoleID(Long roleID) {
		this.roleID = roleID;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
