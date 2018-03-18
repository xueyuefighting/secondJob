package com.yonyou.scf.common.input;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class SCF9110032Input {

	// 借款方ID
	@NotNull(message="读取参数失败")
	private Long companyId;

	// 资方ID
	private Long signBankId;

	// 操作者ID
	private Long operatorId;
	
	// 验证码
	@NotBlank(message="验证码未不能为空")
	private String code;

	// 身份证照正面
	private Long credential_pic;

	// 身份证照反面
	private Long credential_pic2;

	// 手持身份证
	private Long credential_hand;

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
	 * @return the credential_pic
	 */
	public Long getCredential_pic() {
		return credential_pic;
	}

	/**
	 * @param credential_pic
	 *            the credential_pic to set
	 */
	public void setCredential_pic(Long credential_pic) {
		this.credential_pic = credential_pic;
	}

	/**
	 * @return the credential_pic2
	 */
	public Long getCredential_pic2() {
		return credential_pic2;
	}

	/**
	 * @param credential_pic2
	 *            the credential_pic2 to set
	 */
	public void setCredential_pic2(Long credential_pic2) {
		this.credential_pic2 = credential_pic2;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
