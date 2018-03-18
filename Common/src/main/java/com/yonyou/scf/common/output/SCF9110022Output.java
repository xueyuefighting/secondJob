package com.yonyou.scf.common.output;

/**
 * 用友保理个人
 * 
 * @author durui 2017-09-20
 * @version 1.0
 * */
public class SCF9110022Output {

	// 绑定状态(0- 未绑定 1-已绑定 2-审核中)
	private String bindStatus;

	// 姓名
	private String name;

	// 手机号
	private String phone;

	// 身份证正面扫描件
	private Long credential_pic;

	// 身份证反面扫描件
	private Long credential_pic2;

	// 手持身份证照
	private Long credential_hand;

	// 数字证书开通授权书
	private Long dcApply;

	/**
	 * @return the bindStatus
	 */
	public String getBindStatus() {
		return bindStatus;
	}

	/**
	 * @param bindStatus
	 *            the bindStatus to set
	 */
	public void setBindStatus(String bindStatus) {
		this.bindStatus = bindStatus;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
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

	/**
	 * @return the dcApply
	 */
	public Long getDcApply() {
		return dcApply;
	}

	/**
	 * @param dcApply
	 *            the dcApply to set
	 */
	public void setDcApply(Long dcApply) {
		this.dcApply = dcApply;
	}

}
