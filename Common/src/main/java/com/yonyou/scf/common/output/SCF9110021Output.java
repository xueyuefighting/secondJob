package com.yonyou.scf.common.output;

/**
 * 用友保理企业
 * 
 * @author durui 2017-09-19
 * @version 1.0
 * */
public class SCF9110021Output {

	// 绑定状态(0- 未绑定 1-已绑定 2-审核中)
	private String bindStatus;

	// 三证合一 02-是 03-否
	private String threeExaminationsToOne;

	// 营业执照副本是否已经上传
	private Long business_licence_pic;

	// 统一社会信用代码/组织机构代码扫描件
	private Long unified_social_credit_code_pic;

	// 法人身份证
	// private Long unified_social_credit_code_pic;

	// 企业信息登记及CA证书申请书
	private Long caApply;
	
	// 数字证书开通授权书
	private Long dcApply;

	/**
	 * @return the bindStatus
	 */
	public String getBindStatus() {
		return bindStatus;
	}

	/**
	 * @param bindStatus the bindStatus to set
	 */
	public void setBindStatus(String bindStatus) {
		this.bindStatus = bindStatus;
	}

	/**
	 * @return the threeExaminationsToOne
	 */
	public String getThreeExaminationsToOne() {
		return threeExaminationsToOne;
	}

	/**
	 * @param threeExaminationsToOne the threeExaminationsToOne to set
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
	 * @param business_licence_pic the business_licence_pic to set
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
	 * @param unified_social_credit_code_pic the unified_social_credit_code_pic to set
	 */
	public void setUnified_social_credit_code_pic(
			Long unified_social_credit_code_pic) {
		this.unified_social_credit_code_pic = unified_social_credit_code_pic;
	}

	/**
	 * @return the caApply
	 */
	public Long getCaApply() {
		return caApply;
	}

	/**
	 * @param caApply the caApply to set
	 */
	public void setCaApply(Long caApply) {
		this.caApply = caApply;
	}

	/**
	 * @return the dcApply
	 */
	public Long getDcApply() {
		return dcApply;
	}

	/**
	 * @param dcApply the dcApply to set
	 */
	public void setDcApply(Long dcApply) {
		this.dcApply = dcApply;
	}
}
