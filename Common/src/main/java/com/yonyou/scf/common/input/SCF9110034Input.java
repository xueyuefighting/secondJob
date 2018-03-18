package com.yonyou.scf.common.input;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class SCF9110034Input {

	@NotNull(message = "借款方ID取得失败")
	// 借款方ID
	private Long companyId;

	@NotNull(message = "资方ID取得失败")
	// 资方ID
	private Long signBankId;

	@NotNull(message = "操作者ID取得失败")
	// 操作者ID
	private Long operatorId;

	@NotBlank(message = "U盾SN取得失败")
	// SN
	private String sn;

	@NotBlank(message = "U盾DN取得失败")
	// DN
	private String dn;

	@NotBlank(message = "U盾CA取得失败")
	// CA
	private String ca;

	@NotBlank(message = "U盾有效期取得失败")
	// PK7SIGN
	private String pk7Sign;

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
	 * @return the sn
	 */
	public String getSn() {
		return sn;
	}

	/**
	 * @param sn
	 *            the sn to set
	 */
	public void setSn(String sn) {
		this.sn = sn;
	}

	/**
	 * @return the dn
	 */
	public String getDn() {
		return dn;
	}

	/**
	 * @param dn
	 *            the dn to set
	 */
	public void setDn(String dn) {
		this.dn = dn;
	}

	/**
	 * @return the ca
	 */
	public String getCa() {
		return ca;
	}

	/**
	 * @param ca
	 *            the ca to set
	 */
	public void setCa(String ca) {
		this.ca = ca;
	}

	/**
	 * @return the pk7Sign
	 */
	public String getPk7Sign() {
		return pk7Sign;
	}

	/**
	 * @param pk7Sign
	 *            the pk7Sign to set
	 */
	public void setPk7Sign(String pk7Sign) {
		this.pk7Sign = pk7Sign;
	}
}
