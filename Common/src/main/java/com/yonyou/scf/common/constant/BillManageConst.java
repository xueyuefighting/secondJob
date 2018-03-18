package com.yonyou.scf.common.constant;

public class BillManageConst {
	/**
	 * 单据管理：失效 ：否：0
	 */
	public static String invalid_0="0";
	
	/**
	 * 单据管理：失效 ：是：1
	 */
	public static String invalid_1="1";
	
	
	/**
	 * 应收账款池核销用：有效 ：否：0
	 */
	public static String effective_0="0";
	
	/**
	 * 应收账款池核销用：有效 ：：是1
	 */
	public static String effective_1="1";
	
	/**
	 * 单据管理 ：是否已融资：未融资：0
	 */
	public static String financing_0="0";
	
	/**
	 * 单据管理 ：是否已融资：已融资：1
	 */
	public static String financing_1="1";
	/**
	 * 单据状态：00：已审核
	 */
	public static String billStatus_0="00";
	public static String billStatus_0_Msg="已审核";
	/**
	 * 单据状态：01：已复核
	 */
	public static String billStatus_1="01";
	public static String billStatus_1_Msg="已复核";
	/**
	 * 转让：0：否
	 */
	public static String transfer_0="0";
	/**
	 * 转让：1：是
	 */
	public static String transfer_1="1";
	
	/**
	 * {id: '01', name: '企业'},
            {id: '02', name: '个人'}
	 * 订单导入：买方类型（个人企业），0-个人
	 */
	public static String BorrowingBusinessType_01="01";
	public static String BorrowingBusinessType_01_Msg="个人";
	
	/**
	 * {id: '01', name: '企业'},
            {id: '02', name: '个人'}
	 * 订单导入：买方类型（个人企业），1-企业
	 */
	public static String BorrowingBusinessType_02="02";
	public static String BorrowingBusinessType_02_Msg="企业";
	
}
