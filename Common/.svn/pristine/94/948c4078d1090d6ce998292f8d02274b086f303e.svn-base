package com.yonyou.scf.common.input;

import java.util.List;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class SCF922004Input {

	// 客户ID
	private Long userId;
	// 名称
	@NotBlank(message = "客户名称不能为空")
	@Length(max = 50, message = "客户名称长度超长")
	private String userName;
	// 证件类型
	@NotBlank(message = "证件类型不能为空")
	private String credentialType;
	// 证件号码
	@NotBlank(message = "证件号码不能为空")
	@Length(max = 50, message = "证件号码长度超长")
	private String credentialNum;
	// 手机号
	@NotBlank(message = "手机号码不能为空")
	@Length(min = 9, max = 11, message = "手机号码长度错误")
	private String mobilePhone;
	// 邮箱
	@NotBlank(message = "邮箱不能为空")
	@Length(max = 100, message = "邮箱长度超长")
	private String email;
	// 身份证正面pic
	private String credentialPic;
	// 身份证反面pic
	private String credentialPic2;
	// 手持身份证照
	private String credentialHand;
	// 角色列表
	private List<String> roleList;
	// 操作人ID
	private Long operatorId;

	private String token;

	@NotBlank(message = "省不能为空")
	@Length(max = 6, message = "省长度超长")
	private String province;
	@NotBlank(message = "区/县不能为空")
	@Length(max = 6, message = "区/县长度超长")
	private String city;
	@NotBlank(message = "市不能为空")
	@Length(max = 6, message = "市长度超长")
	private String area;

	@NotBlank(message = "详细住址不能为空")
	@Length(max = 100, message = "详细住址长度超长")
	private String address;//20171102增加

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCredentialType() {
		return credentialType;
	}

	public void setCredentialType(String credentialType) {
		this.credentialType = credentialType;
	}

	public String getCredentialNum() {
		return credentialNum;
	}

	public void setCredentialNum(String credentialNum) {
		this.credentialNum = credentialNum;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<String> roleList) {
		this.roleList = roleList;
	}

	public Long getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the credentialPic
	 */
	public String getCredentialPic() {
		return credentialPic;
	}

	/**
	 * @param credentialPic
	 *            the credentialPic to set
	 */
	public void setCredentialPic(String credentialPic) {
		this.credentialPic = credentialPic;
	}

	/**
	 * @return the credentialPic2
	 */
	public String getCredentialPic2() {
		return credentialPic2;
	}

	/**
	 * @param credentialPic2
	 *            the credentialPic2 to set
	 */
	public void setCredentialPic2(String credentialPic2) {
		this.credentialPic2 = credentialPic2;
	}

	/**
	 * @return the credentialHand
	 */
	public String getCredentialHand() {
		return credentialHand;
	}

	/**
	 * @param credentialHand
	 *            the credentialHand to set
	 */
	public void setCredentialHand(String credentialHand) {
		this.credentialHand = credentialHand;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
