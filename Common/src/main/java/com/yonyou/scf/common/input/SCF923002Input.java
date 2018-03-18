package com.yonyou.scf.common.input;

import java.util.List;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class SCF923002Input {

	// 客户ID
	private Long userId;
	// 名称
	@NotBlank(message = "客户名称不能为空")
	@Length(max = 50, message = "客户名称长度超长")
	private String userName;
	// 三证合一
	@NotBlank(message = "是否三证合一不能为空")
	private String threeExaminationsToOne;
	// 统一社会信用代码 三证未合一时存储组织机构代码
	@NotBlank(message = "统一社会信用代码/组织机构代码不能为空")
	@Length(max = 50, message = "统一社会信用代码/组织机构代码长度超长")
	private String unifiedSocialCreditCode;
	// 营业执照号
	@Length(max = 50, message = "营业执照号长度超长")
	private String businessLicence;
	// 税务登记号
	@Length(max = 50, message = "税务登记号长度超长")
	private String taxId;
	// 所属行业
	@NotBlank(message = "所属行业不能为空")
	private String industryWhichBelongsTo;
	// //所属地区省
	// @NotBlank(message="所属地区省不能为空")
	// private String areaP;
	// //所属地区市
	// @NotBlank(message="所属地区市不能为空")
	// private String areaC;
	// //所属地区区
	// @NotBlank(message="所属地区区不能为空")
	// private String areaQ;
	// 法定代表人ID
	private Long corporationId;
	// 法定代表人名
	@NotBlank(message = "法定代表人名不能为空")
	@Length(max = 50, message = "法定代表人名长度超长")
	private String corporationName;
	// 法定代表人证件类型
	@NotBlank(message = "法定代表人证件类型不能为空")
	private String corporationCredentialType;
	// 法定代表人证件号码
	@Length(max = 50, message = "法定代表人证件号码长度超长")
	@NotBlank(message = "法定代表人证件号码不能为空")
	private String corporationCredentialNum;
	// 法定代表人手机号
	@Length(max = 50, message = "法定代表人手机号码长度超长")
	private String corporationMobilePhone;
	// 法定代表人邮箱
	@Length(max = 100, message = "法定代表人邮箱长度超长")
	private String corporationEmail;
	// 法定代表人身份证照
	// @NotNull(message="法定代表人身份证照不能为空")
	private String credentialPic;
	// 联系人ID
	private Long contactsId;
	// 联系人名
	@Length(max = 50, message = "联系人名长度超长")
	@NotBlank(message = "联系人名不能为空")
	private String contactsName;
	// 联系人证件类型
	@NotBlank(message = "联系人证件类型不能为空")
	private String contactsCredentialType;
	// 联系人证件号码
	@Length(max = 50, message = "联系人证件号码长度超长")
	@NotBlank(message = "联系人证件号码不能为空")
	private String contactsCredentialNum;
	// 联系人手机号
	@Length(max = 50, message = "联系人手机号长度超长")
	@NotBlank(message = "联系人手机号不能为空")
	private String contactsMobilePhone;
	// 联系人邮箱
	@Length(max = 100, message = "联系人邮箱长度超长")
	@NotBlank(message = "联系人邮箱不能为空")
	private String contactsEmail;
	// 统一社会信用代码pic
	private String unifiedSocialCreditCodePic;
	// 组织机构代码pic
	private String organizationCodePic;
	// 营业执照pic
	private String businessLicencePic;
	// 税务登记证pic
	private String taxIdPic;
	// 放款账户户名
	@Length(max = 200, message = "放款账户户名长度超长")
	private String loanName;
	// 放款账号
	@Length(max = 200, message = "放款账号长度超长")
	private String loanAccount;
	// 放款开户行
	@Length(max = 200, message = "放款开户行长度超长")
	private String loanDepositBank;
	// 回款账户户名
	@Length(max = 200, message = "回款账户户名长度超长")
	private String receivedPaymentsName;
	// 回款账号
	@Length(max = 200, message = "回款账号长度超长")
	private String receivedPaymentsAccount;
	// 回款开户行
	@Length(max = 200, message = "回款开户行长度超长")
	private String receivedPaymentsDepositBank;

	@NotBlank(message = "省不能为空")
	@Length(max = 6, message = "省长度超长")
	private String province;
	@NotBlank(message = "区/县不能为空")
	@Length(max = 6, message = "区/县长度超长")
	private String city;
	@NotBlank(message = "市不能为空")
	@Length(max = 6, message = "市长度超长")
	private String area;
	@NotBlank(message = "详细地址不能为空")
	@Length(max = 200, message = "详细地址长度超长")
	private String address;

	private String token;

	// 角色列表
	private List<String> roleList;
	// 操作人ID
	private Long operatorId;

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

	public String getThreeExaminationsToOne() {
		return threeExaminationsToOne;
	}

	public void setThreeExaminationsToOne(String threeExaminationsToOne) {
		this.threeExaminationsToOne = threeExaminationsToOne;
	}

	public String getUnifiedSocialCreditCode() {
		return unifiedSocialCreditCode;
	}

	public void setUnifiedSocialCreditCode(String unifiedSocialCreditCode) {
		this.unifiedSocialCreditCode = unifiedSocialCreditCode;
	}

	public String getBusinessLicence() {
		return businessLicence;
	}

	public void setBusinessLicence(String businessLicence) {
		this.businessLicence = businessLicence;
	}

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public String getIndustryWhichBelongsTo() {
		return industryWhichBelongsTo;
	}

	public void setIndustryWhichBelongsTo(String industryWhichBelongsTo) {
		this.industryWhichBelongsTo = industryWhichBelongsTo;
	}

	// public String getAreaP() {
	// return areaP;
	// }
	// public void setAreaP(String areaP) {
	// this.areaP = areaP;
	// }
	// public String getAreaC() {
	// return areaC;
	// }
	// public void setAreaC(String areaC) {
	// this.areaC = areaC;
	// }
	// public String getAreaQ() {
	// return areaQ;
	// }
	// public void setAreaQ(String areaQ) {
	// this.areaQ = areaQ;
	// }
	public Long getCorporationId() {
		return corporationId;
	}

	public void setCorporationId(Long corporationId) {
		this.corporationId = corporationId;
	}

	public String getCorporationName() {
		return corporationName;
	}

	public void setCorporationName(String corporationName) {
		this.corporationName = corporationName;
	}

	public String getCorporationCredentialType() {
		return corporationCredentialType;
	}

	public void setCorporationCredentialType(String corporationCredentialType) {
		this.corporationCredentialType = corporationCredentialType;
	}

	public String getCorporationCredentialNum() {
		return corporationCredentialNum;
	}

	public void setCorporationCredentialNum(String corporationCredentialNum) {
		this.corporationCredentialNum = corporationCredentialNum;
	}

	public String getCorporationMobilePhone() {
		return corporationMobilePhone;
	}

	public void setCorporationMobilePhone(String corporationMobilePhone) {
		this.corporationMobilePhone = corporationMobilePhone;
	}

	public String getCorporationEmail() {
		return corporationEmail;
	}

	public void setCorporationEmail(String corporationEmail) {
		this.corporationEmail = corporationEmail;
	}

	public String getCredentialPic() {
		return credentialPic;
	}

	public void setCredentialPic(String credentialPic) {
		this.credentialPic = credentialPic;
	}

	public Long getContactsId() {
		return contactsId;
	}

	public void setContactsId(Long contactsId) {
		this.contactsId = contactsId;
	}

	public String getContactsName() {
		return contactsName;
	}

	public void setContactsName(String contactsName) {
		this.contactsName = contactsName;
	}

	public String getContactsCredentialType() {
		return contactsCredentialType;
	}

	public void setContactsCredentialType(String contactsCredentialType) {
		this.contactsCredentialType = contactsCredentialType;
	}

	public String getContactsCredentialNum() {
		return contactsCredentialNum;
	}

	public void setContactsCredentialNum(String contactsCredentialNum) {
		this.contactsCredentialNum = contactsCredentialNum;
	}

	public String getContactsMobilePhone() {
		return contactsMobilePhone;
	}

	public void setContactsMobilePhone(String contactsMobilePhone) {
		this.contactsMobilePhone = contactsMobilePhone;
	}

	public String getContactsEmail() {
		return contactsEmail;
	}

	public void setContactsEmail(String contactsEmail) {
		this.contactsEmail = contactsEmail;
	}

	public String getUnifiedSocialCreditCodePic() {
		return unifiedSocialCreditCodePic;
	}

	public void setUnifiedSocialCreditCodePic(String unifiedSocialCreditCodePic) {
		this.unifiedSocialCreditCodePic = unifiedSocialCreditCodePic;
	}

	public String getOrganizationCodePic() {
		return organizationCodePic;
	}

	public void setOrganizationCodePic(String organizationCodePic) {
		this.organizationCodePic = organizationCodePic;
	}

	public String getBusinessLicencePic() {
		return businessLicencePic;
	}

	public void setBusinessLicencePic(String businessLicencePic) {
		this.businessLicencePic = businessLicencePic;
	}

	public String getTaxIdPic() {
		return taxIdPic;
	}

	public void setTaxIdPic(String taxIdPic) {
		this.taxIdPic = taxIdPic;
	}

	public String getLoanName() {
		return loanName;
	}

	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}

	public String getLoanAccount() {
		return loanAccount;
	}

	public void setLoanAccount(String loanAccount) {
		this.loanAccount = loanAccount;
	}

	public String getLoanDepositBank() {
		return loanDepositBank;
	}

	public void setLoanDepositBank(String loanDepositBank) {
		this.loanDepositBank = loanDepositBank;
	}

	public String getReceivedPaymentsName() {
		return receivedPaymentsName;
	}

	public void setReceivedPaymentsName(String receivedPaymentsName) {
		this.receivedPaymentsName = receivedPaymentsName;
	}

	public String getReceivedPaymentsAccount() {
		return receivedPaymentsAccount;
	}

	public void setReceivedPaymentsAccount(String receivedPaymentsAccount) {
		this.receivedPaymentsAccount = receivedPaymentsAccount;
	}

	public String getReceivedPaymentsDepositBank() {
		return receivedPaymentsDepositBank;
	}

	public void setReceivedPaymentsDepositBank(
			String receivedPaymentsDepositBank) {
		this.receivedPaymentsDepositBank = receivedPaymentsDepositBank;
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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
