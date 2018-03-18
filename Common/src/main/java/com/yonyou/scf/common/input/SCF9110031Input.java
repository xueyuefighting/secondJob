package com.yonyou.scf.common.input;

public class SCF9110031Input {

	// 借款方ID
	private Long companyId;

	// 资方ID
	private Long signBankId;

	// 操作者ID
	private Long operatorId;

	// 三证合一 02-是 03-否
	private String threeExaminationsToOne;

	// 营业执照副本是否已经上传
	private String business_licence_pic;

	// 统一社会信用代码/组织机构代码扫描件
	private String unified_social_credit_code_pic;

	// 法人身份证
	private String credential_hand;

	// 企业信息登记及CA证书申请书
	private String caApply;

	// token
	private String token;

	/**
	 * @return the companyId
	 */
	public Long getCompanyId() {
		return companyId;
	}

	/**
	 * @param companyId
	 *            the companyId to set
	 */
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	/**
	 * @return the signBankId
	 */
	public Long getSignBankId() {
		return signBankId;
	}

	/**
	 * @param signBankId
	 *            the signBankId to set
	 */
	public void setSignBankId(Long signBankId) {
		this.signBankId = signBankId;
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
	public String getBusiness_licence_pic() {
		return business_licence_pic;
	}

	/**
	 * @param business_licence_pic
	 *            the business_licence_pic to set
	 */
	public void setBusiness_licence_pic(String business_licence_pic) {
		this.business_licence_pic = business_licence_pic;
	}

	/**
	 * @return the unified_social_credit_code_pic
	 */
	public String getUnified_social_credit_code_pic() {
		return unified_social_credit_code_pic;
	}

	/**
	 * @param unified_social_credit_code_pic
	 *            the unified_social_credit_code_pic to set
	 */
	public void setUnified_social_credit_code_pic(
			String unified_social_credit_code_pic) {
		this.unified_social_credit_code_pic = unified_social_credit_code_pic;
	}

	/**
	 * @return the credential_hand
	 */
	public String getCredential_hand() {
		return credential_hand;
	}

	/**
	 * @param credential_hand
	 *            the credential_hand to set
	 */
	public void setCredential_hand(String credential_hand) {
		this.credential_hand = credential_hand;
	}

	/**
	 * @return the caApply
	 */
	public String getCaApply() {
		return caApply;
	}

	/**
	 * @param caApply
	 *            the caApply to set
	 */
	public void setCaApply(String caApply) {
		this.caApply = caApply;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token
	 *            the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

}
