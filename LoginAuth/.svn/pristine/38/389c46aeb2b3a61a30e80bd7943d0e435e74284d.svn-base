package com.yonyou.scf.userFace.utilEntity;

import java.io.Serializable;

import org.apache.commons.codec.digest.DigestUtils;

/*
 * 登录交互类
 * @author zhangjlm
 *
 */
public class LoginEntity implements Serializable{
	
	private static final long serialVersionUID = 7877835437316442971L;
	
	private String userName;
	private String password;
	private String md5;
	private String key;
	private String roleId;//所属方序号
	private String roleName;//所属方名称
	private String operatorType;//01-企业  02-个人
	private String verifyCode;//验证码
	private int organizeRoleCnt;//拥有的组织角色数量，用于控制“切换角色按钮”
	private String platformId;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) { 
		if(!"".equals(password) && password!=null) {
			this.md5 = DigestUtils.md5Hex(password);//直接转化md5值
		}
		this.password = password;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	public String getMd5() {
		return md5;
	}
	public void setMd5(String md5) {
		if(!"".equals(md5) && md5!=null) {
			this.md5 = md5;
		}
	}
	
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public String getOperatorType() {
		return operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}
	
	public String getVerifyCode() {
		return verifyCode;
	}
	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
	
	public int getOrganizeRoleCnt() {
		return organizeRoleCnt;
	}
	public void setOrganizeRoleCnt(int organizeRoleCnt) {
		this.organizeRoleCnt = organizeRoleCnt;
	}
	
	public String getPlatformId() {
		return platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}
	public LoginEntity() {
	}
	public LoginEntity(String userName, String password, String md5, String key, String roleId, String roleName,
			String operatorType, String verifyCode, int organizeRoleCnt, String platformId) {
		super();
		this.userName = userName;
		this.password = password;
		this.md5 = md5;
		this.key = key;
		this.roleId = roleId;
		this.roleName = roleName;
		this.operatorType = operatorType;
		this.verifyCode = verifyCode;
		this.organizeRoleCnt = organizeRoleCnt;
		this.platformId = platformId;
	}
	
}
