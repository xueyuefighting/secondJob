package com.yonyou.scf.common.gateway.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/**
 * 当前登陆人的session bean
 * @author zhangjlm
 *
 */
public class TokenBean implements Serializable{
	
	private static final long serialVersionUID = 3752320308503421868L;
	
	private String userId;//当前用户id
	private String userName;//当前登录人用户名
	private ArrayList<String> roleNo;// 角色主键id
	private Map<String,String> roles;//角色主键id-角色名称
	private String organizeId;//组织id（所属方主键id）
	private String userType;//客户类型 01-企业  02-个人
	private String organizeName;//组织名称（所属方名称）
	private String organizeRoleNo;//组织角色序号（当前所属方角色序号）
	private String organizeRoleName;//组织角色名称（当前所属方角色名称：eg：出借方）
	private int organizeRoleCnt;//拥有的组织角色数量，用于控制“切换角色按钮”
	private String concaterPhone;//联系人手机（个人的话 就是当前人的手机）
	private String concaterMail;//邮箱
	private String ip;//登陆者ip
	private String beforeLoginTime;//当次登陆的时间（yyyyMMddHHmmssSSS）从数据库读取，登录成功，将当前时间刷新回到这个字段
	private String platformId;
	private ArrayList<String>  appId;//当前用户所拥有的角色并集对应的所有菜单的appid
	
	public TokenBean() {
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
	
	public String getOrganizeId() {
		return organizeId;
	}

	public void setOrganizeId(String organizeId) {
		this.organizeId = organizeId;
	}

	public String getOrganizeName() {
		return organizeName;
	}

	public void setOrganizeName(String organizeName) {
		this.organizeName = organizeName;
	}

	public String getOrganizeRoleNo() {
		return organizeRoleNo;
	}

	public void setOrganizeRoleNo(String organizeRoleNo) {
		this.organizeRoleNo = organizeRoleNo;
	}

	public String getOrganizeRoleName() {
		return organizeRoleName;
	}

	public void setOrganizeRoleName(String organizeRoleName) {
		this.organizeRoleName = organizeRoleName;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	
	public ArrayList<String> getRoleNo() {
		return roleNo;
	}

	public void setRoleNo(ArrayList<String> roleNo) {
		this.roleNo = roleNo;
	}

	public String getBeforeLoginTime() {
		return beforeLoginTime;
	}

	public void setBeforeLoginTime(String beforeLoginTime) {
		this.beforeLoginTime = beforeLoginTime;
	}

	public Map<String, String> getRoles() {
		return roles;
	}

	public void setRoles(Map<String, String> roles) {
		this.roles = roles;
	}

	public String getConcaterPhone() {
		return concaterPhone;
	}

	public void setConcaterPhone(String concaterPhone) {
		this.concaterPhone = concaterPhone;
	}

	public String getConcaterMail() {
		return concaterMail;
	}

	public void setConcaterMail(String concaterMail) {
		this.concaterMail = concaterMail;
	}
	
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public ArrayList<String> getAppId() {
		return appId;
	}

	public void setAppId(ArrayList<String> appId) {
		this.appId = appId;
	}
	
	
	public int getOrganizeRoleCnt() {
		return organizeRoleCnt;
	}

	public void setOrganizeRoleCnt(int organizeRoleCnt) {
		this.organizeRoleCnt = organizeRoleCnt;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public TokenBean(String userId, String userName, ArrayList<String> roleNo, Map<String, String> roles,
			String organizeId, String userType, String organizeName, String organizeRoleNo, String organizeRoleName,
			int organizeRoleCnt, String concaterPhone, String concaterMail, String ip, String beforeLoginTime,
			String platformId, ArrayList<String> appId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.roleNo = roleNo;
		this.roles = roles;
		this.organizeId = organizeId;
		this.userType = userType;
		this.organizeName = organizeName;
		this.organizeRoleNo = organizeRoleNo;
		this.organizeRoleName = organizeRoleName;
		this.organizeRoleCnt = organizeRoleCnt;
		this.concaterPhone = concaterPhone;
		this.concaterMail = concaterMail;
		this.ip = ip;
		this.beforeLoginTime = beforeLoginTime;
		this.platformId = platformId;
		this.appId = appId;
	}

	
	
	
	
}
