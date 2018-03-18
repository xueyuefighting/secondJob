package com.yonyou.scf.common.constant;

/**
 * 枚举值常量定义类
 *
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu      2017-03-16   Create this file
 *
 * </pre>
 *
 */

public class APIConstant {

	/**
	 * RPC 成功响应code默认为 2000
	 */
	public static final String SUCCESS_RESPONSE_CODE = "2000";

	/**
	 * RPC 成功响应message默认为 OK.
	 */
	public static final String SUCCESS_RESPONSE_MESSAGE = "OK.";

	/**
	 * 0001 参数校验失败
	 */
	public static final String ERR_0001_CODE = "0001";

	public static final String ERR_0001_MSG = "参数校验失败";

	/**
	 * 0002 平台ID鉴权失败
	 */
	public static final String ERR_0002_CODE = "0002";

	public static final String ERR_0002_MSG = "平台ID鉴权失败";

	/**
	 * 0003 接口ID鉴权失败
	 */
	public static final String ERR_0003_CODE = "0003";

	public static final String ERR_0003_MSG = "接口ID鉴权失败";

	/**
	 * 2001 系统内部异常
	 */
	public static final String ERR_2001_CODE = "2001";

	public static final String ERR_2001_MSG = "系统内部异常";

	/**
	 * 交易金额最小值
	 */
	public static final long AMOUNT_MIN = 0L;

	/**
	 * 交易金额最大值
	 */
	public static final long AMOUNT_MAX = 9999999999999999L;

	/**
	 * 身份证的证件类型号
	 */
	public static final String ID_CARD_TYPE = "0";

	/**
	 * 身份证校验正则表达式
	 */
	public static final String ID_CARD_REGULAR_EXCEPTION = "(\\d{14}[0-9a-zA-Z])|(\\d{17}[0-9a-zA-Z])";

	/**
	 * 接口Scf1101
	 */
	public static final String API_SCF1101 = "1101";

	/**
	 * 接口Scf1103
	 */
	public static final String API_SCF1103 = "1103";

	/**
	 * 接口Scf1108
	 */
	public static final String API_SCF1108 = "1108";

	/**
	 * 接口Scf1111
	 */
	public static final String API_SCF1111 = "1111";

	/**
	 * 接口Scf1115
	 */
	public static final String API_SCF1115 = "1115";

	/**
	 * 接口Scf1118
	 */
	public static final String API_SCF1118 = "1118";

	/**
	 * 接口Scf1201
	 */
	public static final String API_SCF1201 = "1201";

	/**
	 * 接口Scf1211
	 */
	public static final String API_SCF1211 = "1211";

	/**
	 * 接口Scf1205
	 */
	public static final String API_SCF1205 = "1205";

	/**
	 * 接口Scf1208
	 */
	public static final String API_SCF1208 = "1208";

	/**
	 * 接口Scf1215
	 */
	public static final String API_SCF1215 = "1215";

	/**
	 * 接口Scf1218
	 */
	public static final String API_SCF1218 = "1218";
	
	/**
	 * 接口Scf1301
	 */
	public static final String API_SCF1301 = "1301";

	/**
	 * 接口Scf1305
	 */
	public static final String API_SCF1305 = "1305";

	/**
	 * 接口Scf1308
	 */
	public static final String API_SCF1308 = "1308";

	/**
	 * 接口Scf1501
	 */
	public static final String API_SCF1501 = "1501";

	/**
	 * 接口Scf1503
	 */
	public static final String API_SCF1503 = "1503";

	/**
	 * 接口Scf1401
	 */
	public static final String API_SCF1401 = "1401";

}
