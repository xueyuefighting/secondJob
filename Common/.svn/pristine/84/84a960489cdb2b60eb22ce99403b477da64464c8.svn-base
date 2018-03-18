package com.yonyou.scf.common.input;

import java.io.Serializable;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 66210007接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class WorkflowVO_6621007_I implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7256427149712436492L;

	@NotNull(message = "企业ID不能为空")
	@Length(max = 20, message = "企业ID不超过20位")
	private Long companyId;
	@NotNull(message = "角色ID不能为空")
	@Length(max = 20, message = "角色ID不超过20位")
	private Long roleId;
	private List<Long> financeIdList;

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}

	public List<Long> getFinanceIdList() {
		return financeIdList;
	}

	public void setFinanceIdList(List<Long> financeIdList) {
		this.financeIdList = financeIdList;
	}
}
