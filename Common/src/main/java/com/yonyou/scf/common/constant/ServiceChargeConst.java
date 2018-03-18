package com.yonyou.scf.common.constant;

public class ServiceChargeConst {

	/** 服务费收费规则 */
	// 按产品收费
	public static final String service_charge_rule_product = "01";
	// 按融资单收费
	public static final String service_charge_rule_apply = "02";

	/** 服务费收费模式 */
	// 固定金额
	public static final String service_charge_mode_money = "01";
	// 固定比例
	public static final String service_charge_mode_rate = "02";

	/** 审核模式 */
	// 审核通过
	public static final String service_charge_operate_flag_00 = "00";
	// 等待审核
	public static final String service_charge_operate_flag_01 = "01";
	// 审核失败
	public static final String service_charge_operate_flag_02 = "02";

	/** 缴费状态 */
	// 未缴费
	public static final String services_charge_info_operate_flag_00 = "00";
	// 已缴费
	public static final String services_charge_info_operate_flag_01 = "01";
	// 已退费
	public static final String services_charge_info_operate_flag_02 = "02";
	// 退费申请中
	public static final String services_charge_info_operate_flag_03 = "03";
	// TODO 需要增加跑批，每天晚上判断是否收费满一年初始化缴费状态

	/** 按钮文字 */
	// 服务费配置
	public static final String CONFIG = "服务费配置";
	// 详情
	public static final String DETAIL = "详情";
	// 缴费
	public static final String PAY = "缴费";
	// 退费
	public static final String REBATE = "退费";
	// 审核
	public static final String AUDITING = "审核";
}
