package com.yonyou.scf.common.constant;

public class FinanceConst {

	/**
	 * 融资单状态：录入完成
	 */
	public static String finance_status_00="00";
	/**
	 * 融资单状态：融资申请审核中
	 */
	public static String finance_status_01="01";
	/**
	 * 融资单状态：融资申请审核未通过
	 */
	public static String finance_status_02="02";
	/**
	 * 融资单状态：融资申请审核通过
	 */
	public static String finance_status_03="03";
	/**
	 *融资单状态：待放款
	 */
	public static String finance_status_04="04";
	/**
	 * 融资单状态：放款成功
	 */
	public static String finance_status_05="05";
	/**
	 * 融资单状态：还清
	 */
	public static String finance_status_06="06";
	/**
	 * 还款状态：未结清
	 */
	public static String repay_status_0="0";
	
	/**
	 * 还款状态：已结清
	 */
	public static String repay_status_1="1";
	/**
	 * 是否展期：否
	 */
	public static String is_extension_0="0";
	/**
	 * 是否展期：是
	 */
	public static String is_extension_1="1";
	/**
	 * 是否逾期：否
	 */
	public static String is_overdue_0="0";
	/**
	 * 是否逾期：是
	 */
	public static String is_overdue_1="1";
	
	/**
	 * F637还款方式：2-按期付息，到期还本
	 */
	public static String lf_repayment_model_2="2";
	/**
	 * F637还款方式：3-等额本息
	 */
	public static String lf_repayment_model_3="3";
	/**
	 * F637还款方式：4-等额本金
	 */
	public static String lf_repayment_model_4="4";
	
	/**
	 * 融资用途：日常经营类费用
	 */
	public static String finance_purpose_00="00";
	/**
	 * 融资用途：采购
	 */
	public static String finance_purpose_01="01";
	/**
	 * 融资用途：银行还款
	 */
	public static String finance_purpose_02="02";
	/**
	 * 融资用途：其他
	 */
	public static String finance_purpose_03="03";
	
	/**
	 * 资金方简称：保理
	 */
	public static String capital_No_01="01";
	/**
	 * 资金方简称：廊坊
	 */
	public static String capital_No_02="02";
	
	/**
	 * 资金方简称：中心小贷
	 */
	public static String capital_No_03="03";
	/**
	 * 资金方简称：青金中心
	 */
	public static String capital_No_04="04";
	
	public static String fuwufei="fuwufei";
	/**
	 * 是否是共借人或者担保人 1-是
	 */
	public static String isCoOwnAndGuarantee_1="1";
	public static String repay_time_start="repay_time_start";
	public static String repay_time_end="repay_time_end";
	/**
	 * 08:30
	 */
	public static String repay_time_start_value="08:30";
	/**
	 * 22:00
	 */
	public static String repay_time_end_value="22:00";
	
	public static String repay_time_message="本系统在每天08:30到20:00可以还款，其他时间不能进行还款操作！";
	/**
	 * 月费率百分号
	 */
	public static String month_rate_precent="%";
	
	/**
	 * 有在途融资
	 */
	public static String isFinance_1="1";
	/**
	 * 无在途融资
	 */
	public static String isFinance_0="0";

}
