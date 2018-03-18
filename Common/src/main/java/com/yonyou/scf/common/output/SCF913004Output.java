package com.yonyou.scf.common.output;

public class SCF913004Output {

	// 数字证书ID
	private Long id;
	// 申请时间
	private String createTime;
	// 企业ID
	private Long userId;
	// 企业ID2
	private String userId2;
	// 企业名称
	private String userName;
	// 证件号
	private String companyCredentialNum;
	// 法人姓名
	private String corporationName;
	// 法人证件号
	private String corporationCredentialNum;
	// 状态
	private String status;
	// 响应消息
	private String response;

	// 法人手机
	private String corporationPhone;
	// 法人邮箱
	private String corporationEmail;

	// 当前操作人
	private Long operatorId;
	// 操作员名称
	private String operatorName;
	// 操作员证件号码
	private String operatorCredentialNum;
	// 操作员证件号码
	private String operatorCredentialType;
	// 操作员邮箱
	private String operatorEmail;
	// 操作员手机
	private String operatorPhone;

	// // 营业执照副本
	// private Long credential_pic;
	// // 组织机构代码副本/证件执照副本
	// private Long credential_pic2;
	// // 法人身份证
	// private Long credential_hand;
	// // 授权书
	// private Long fileId;

	// 三证合一 02-是 03-否
	private String threeExaminationsToOne;

	// 营业执照副本是否已经上传
	private Long business_licence_pic;

	// 统一社会信用代码/组织机构代码扫描件
	private Long unified_social_credit_code_pic;

	// 法人身份证
	private Long credential_hand;

	// 授权书
	private Long fileId;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the createTime
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the companyCredentialNum
	 */
	public String getCompanyCredentialNum() {
		return companyCredentialNum;
	}

	/**
	 * @param companyCredentialNum
	 *            the companyCredentialNum to set
	 */
	public void setCompanyCredentialNum(String companyCredentialNum) {
		this.companyCredentialNum = companyCredentialNum;
	}

	/**
	 * @return the corporationName
	 */
	public String getCorporationName() {
		return corporationName;
	}

	/**
	 * @param corporationName
	 *            the corporationName to set
	 */
	public void setCorporationName(String corporationName) {
		this.corporationName = corporationName;
	}

	/**
	 * @return the corporationCredentialNum
	 */
	public String getCorporationCredentialNum() {
		return corporationCredentialNum;
	}

	/**
	 * @param corporationCredentialNum
	 *            the corporationCredentialNum to set
	 */
	public void setCorporationCredentialNum(String corporationCredentialNum) {
		this.corporationCredentialNum = corporationCredentialNum;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the response
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * @param response
	 *            the response to set
	 */
	public void setResponse(String response) {
		this.response = response;
	}

	/**
	 * @return the corporationPhone
	 */
	public String getCorporationPhone() {
		return corporationPhone;
	}

	/**
	 * @param corporationPhone
	 *            the corporationPhone to set
	 */
	public void setCorporationPhone(String corporationPhone) {
		this.corporationPhone = corporationPhone;
	}

	/**
	 * @return the corporationEmail
	 */
	public String getCorporationEmail() {
		return corporationEmail;
	}

	/**
	 * @param corporationEmail
	 *            the corporationEmail to set
	 */
	public void setCorporationEmail(String corporationEmail) {
		this.corporationEmail = corporationEmail;
	}

	/**
	 * @return the operatorId
	 */
	public Long getOperatorId() {
		return operatorId;
	}

	/**
	 * @param operatorId
	 *            the operatorId to set
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 * @return the operatorName
	 */
	public String getOperatorName() {
		return operatorName;
	}

	/**
	 * @param operatorName
	 *            the operatorName to set
	 */
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	/**
	 * @return the operatorCredentialNum
	 */
	public String getOperatorCredentialNum() {
		return operatorCredentialNum;
	}

	/**
	 * @param operatorCredentialNum
	 *            the operatorCredentialNum to set
	 */
	public void setOperatorCredentialNum(String operatorCredentialNum) {
		this.operatorCredentialNum = operatorCredentialNum;
	}

	/**
	 * @return the operatorEmail
	 */
	public String getOperatorEmail() {
		return operatorEmail;
	}

	/**
	 * @param operatorEmail
	 *            the operatorEmail to set
	 */
	public void setOperatorEmail(String operatorEmail) {
		this.operatorEmail = operatorEmail;
	}

	/**
	 * @return the operatorPhone
	 */
	public String getOperatorPhone() {
		return operatorPhone;
	}

	/**
	 * @param operatorPhone
	 *            the operatorPhone to set
	 */
	public void setOperatorPhone(String operatorPhone) {
		this.operatorPhone = operatorPhone;
	}

	/**
	 * @return the threeExaminationsToOne
	 */
	public String getThreeExaminationsToOne() {
		return threeExaminationsToOne;
	}

	/**
	 * @param threeExaminationsToOne
	 *            the threeExaminationsToOne to set
	 */
	public void setThreeExaminationsToOne(String threeExaminationsToOne) {
		this.threeExaminationsToOne = threeExaminationsToOne;
	}

	/**
	 * @return the business_licence_pic
	 */
	public Long getBusiness_licence_pic() {
		return business_licence_pic;
	}

	/**
	 * @param business_licence_pic
	 *            the business_licence_pic to set
	 */
	public void setBusiness_licence_pic(Long business_licence_pic) {
		this.business_licence_pic = business_licence_pic;
	}

	/**
	 * @return the unified_social_credit_code_pic
	 */
	public Long getUnified_social_credit_code_pic() {
		return unified_social_credit_code_pic;
	}

	/**
	 * @param unified_social_credit_code_pic
	 *            the unified_social_credit_code_pic to set
	 */
	public void setUnified_social_credit_code_pic(
			Long unified_social_credit_code_pic) {
		this.unified_social_credit_code_pic = unified_social_credit_code_pic;
	}

	/**
	 * @return the credential_hand
	 */
	public Long getCredential_hand() {
		return credential_hand;
	}

	/**
	 * @param credential_hand
	 *            the credential_hand to set
	 */
	public void setCredential_hand(Long credential_hand) {
		this.credential_hand = credential_hand;
	}

	/**
	 * @return the fileId
	 */
	public Long getFileId() {
		return fileId;
	}

	/**
	 * @param fileId
	 *            the fileId to set
	 */
	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}

	public String getOperatorCredentialType() {
		return operatorCredentialType;
	}

	public void setOperatorCredentialType(String operatorCredentialType) {
		this.operatorCredentialType = operatorCredentialType;
	}

	public String getUserId2() {
		return userId2;
	}

	public void setUserId2(String userId2) {
		this.userId2 = userId2;
	}
}
