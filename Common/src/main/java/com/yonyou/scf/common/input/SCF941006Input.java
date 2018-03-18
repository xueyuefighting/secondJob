package com.yonyou.scf.common.input;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yonyou.scf.common.entity.Menu;

public class SCF941006Input {

	// 角色ID
	private Long roleId;
	
	// 角色名称
	@NotBlank(message="角色名称不能为空")
	@Length(max=50,message="角色名称长度超长")
	private String roleName;

	// 所属企业
	@NotNull(message="所属企业不能为空")
	private Long companyId;
	
	// 业务角色
	@NotBlank(message="业务角色不能为空")
	private String roleType;
	
	// 描述
	private String roleDsc;
	
	// 操作者
	private Long operatorId;
	
	// 功能权限列表
	private List<Menu> menuList;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getRoleDsc() {
		return roleDsc;
	}

	public void setRoleDsc(String roleDsc) {
		this.roleDsc = roleDsc;
	}

	public Long getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

}
