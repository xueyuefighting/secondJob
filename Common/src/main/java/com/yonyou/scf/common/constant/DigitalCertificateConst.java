package com.yonyou.scf.common.constant;

public class DigitalCertificateConst {

	/** 数字证书状态 主页显示数字证书绑定状态用，未绑定和审核中都是灰色=1，可用未0*/
	// 可用
	public static final String digital_certificate_bind_status_enable = "0";
	// 禁用
	public static final String digital_certificate_bind_status_disable = "1";

	/** 绑定状态(0- 未绑定 1-已绑定 2-审核中) */
	public static final String bind_status_0 = "0";
	/** 绑定状态(0- 未绑定 1-已绑定 2-审核中) */
	public static final String bind_status_1 = "1";
	/** 绑定状态(0- 未绑定 1-已绑定 2-审核中) */
	public static final String bind_status_2 = "2";
	
	/** 审核状态 0-待审核 */
	public static final String auditing_status_0 = "0";
	/** 审核状态 1-通过 */
	public static final String auditing_status_1 = "1";
	/** 审核状态 2-拒绝 */
	public static final String auditing_status_2 = "2";

	// 已绑定
	public static final String BINDED = "已绑定";
	// 审核中
	public static final String WAITING = "审核中";
	// 预览
	public static final String VIEW = "预览";
	// 审核
	public static final String AUDIT = "审核";
	// 下载
	public static final String DOWN = "下载";
	
	//账户安全-密码修改 密码重置 邮箱修改 前台验证码重发间隔
	//DigitalCertificateConst.RETRY_INTERVAL
	public static final long RETRY_INTERVAL = 120L;

	////账户安全-密码修改 密码重置 邮箱修改 验证码有效期
	//DigitalCertificateConst.VERIFICATION_CODE_EXPIRE_TIME
	public static final long VERIFICATION_CODE_EXPIRE_TIME = 600L;
	
}
