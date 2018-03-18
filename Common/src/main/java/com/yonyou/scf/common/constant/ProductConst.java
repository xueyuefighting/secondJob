package com.yonyou.scf.common.constant;

public class ProductConst {
	/**
	 * 融资模式-单笔订单融资
	 */
	public static String mode_01 = "01";
	/**
	 * 融资模式-单笔应收账款融资
	 */
	public static String mode_02 = "02";
	/**
	 * 融资模式-应收账款池融资
	 */
	public static String mode_03 = "03";

	/**
	 * 还款方式-随借随还
	 */
	public static String repay_type_01 = "01";
	/**
	 * 还款方式-按月付息，到期还本
	 */
	public static String repay_type_02 = "02";
	/**
	 * 还款方式-按季付息，到期还本
	 */
	public static String repay_type_03 = "03";

	/**
	 * 是否遇节假日顺延-否
	 */
	public static String isdelay_no = "0";
	/**
	 * 是否遇节假日顺延-是
	 */
	public static String isdelay_yes = "1";

	/**
	 * 产品状态-禁用
	 */
	public static String status_no = "0";
	/**
	 * 产品状态-启用(初始状态)
	 */
	public static String status_yes = "1";
	/**
	 * 产品状态-工作流配置完成
	 */
	public static String status_wk = "2";

	/**
	 * 是否冻结自有资金-否
	 */
	public static String is_frozen_own_funds_no = "0";
	/**
	 * 是否冻结自有资金-是
	 */
	public static String is_frozen_own_funds_yes = "1";

	/**
	 * 产品总授信额度-最大值
	 */
	public static Long creditamount_max = Long.decode("99999999999999900");

	/**
	 * 返回结果集-成功
	 */
	public static String result_ok = "200";

	/**
	 * 金额默认值
	 */
	public static Long long_zero = Long.decode("0");

	/**
	 * 数值默认值
	 */
	public static Integer integer_zero = 0;

	/**
	 * 添加成功。
	 */
	public static final String SUCCESS_INSERT_MESSAGE = "添加成功。";
	/**
	 * 修改成功。
	 */
	public static final String SUCCESS_UPDATE_MESSAGE = "修改成功。";
	/**
	 * 添加失败。
	 */
	public static final String FAILURE_INSERT_MESSAGE = "添加失败。";
	/**
	 * 修改失败。
	 */
	public static final String FAILURE_UPDATE_MESSAGE = "修改失败。";
	/**
	 * 唯一性验证不通过，产品已存在。
	 */
	public static final String FAILURE_MESSAGE_01 = "唯一性验证不通过，产品已存在。";
	/**
	 * 产品不存在，请联系管理员
	 */
	public static final String FAILURE_MESSAGE_02 = "产品不存在，请联系管理员";

	/* 担保方式(中新小贷) */
	/**
	 * 担保方式(中新小贷)：01 保证
	 */
	public static final String way_of_guaranteeList_01 = "01";
	/**
	 * 担保方式(中新小贷)：01 保证
	 */
	public static final String way_of_guaranteeList_01_name = "保证";
	/**
	 * 担保方式(中新小贷)：02 抵押
	 */
	public static final String way_of_guaranteeList_02 = "02";
	/**
	 * 担保方式(中新小贷)：02 抵押
	 */
	public static final String way_of_guaranteeList_02_name = "抵押";
	/**
	 * 担保方式(中新小贷)：03 质押
	 */
	public static final String way_of_guaranteeList_03 = "03";
	/**
	 * 担保方式(中新小贷)：03 质押
	 */
	public static final String way_of_guaranteeList_03_name = "质押";
	/**
	 * 担保方式(中新小贷)：04 留置
	 */
	public static final String way_of_guaranteeList_04 = "04";
	/**
	 * 担保方式(中新小贷)：04 留置
	 */
	public static final String way_of_guaranteeList_04_name = "留置";
	/**
	 * 担保方式(中新小贷)：05 定金
	 */
	public static final String way_of_guaranteeList_05 = "05";
	/**
	 * 担保方式(中新小贷)：05 定金
	 */
	public static final String way_of_guaranteeList_05_name = "定金";

	/**
	 * 是否平台计费：1是
	 */
	public static final String run_batch_yes = "1";
	/**
	 * 是否平台计费：0否
	 */
	public static final String run_batch_no = "0";

}
