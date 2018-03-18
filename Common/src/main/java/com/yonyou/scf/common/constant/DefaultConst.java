package com.yonyou.scf.common.constant;

/**
 * 用于存放系统模块共用的难识别数字
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu		2017-03-16	Create this file
 * </pre>
 * 
 */

public interface DefaultConst {
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
	 * 2001 系统内部异常
	 */
	public static final String ERR_2001_CODE = "2001";

	public static final String ERR_2001_MSG = "系统内部异常";

	/**
	 * 2002 数据库操作异常
	 */
	public static final String ERR_2002_CODE = "2002";

	public static final String ERR_2002_MSG = "数据库操作异常";
	
	/**
	 * 2003 文件操作异常
	 */
	public static final String ERR_2003_CODE = "2003";

	public static final String ERR_2003_MSG = "文件操作异常";
	
	/**
	 * 2004 Redis操作异常
	 */
	public static final String ERR_2004_CODE = "2004";

	public static final String ERR_2004_MSG = "Redis操作异常";
	
	/**
	 * 调试Debug模式
	 */
	public static final String DEBUG_MODE = "DEBUG";

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
	 * 供应链金融自身的平台ID，固定00000000
	 */
	public static final String SCF_PLATFORM_ID = "00000000";

	/**
	 * 供应链金融自身的IP白名单，
	 */
//	public static final String SCF_PLATFORM_IP_LIST = "";
	
	/**
	 * 接口Scf1101
	 */
	public static final String API_SCF1101 = "1101";
	
	public static final String DB_PROPERTIES="db.properties";
	public static final String REDIS_PROPERTIES="redis.properties";
	public static final String FTP_PROPERTIES="ftp.properties";
	public static final String URL_INI="url.ini";
	public static final String APP_INI="app.ini";
	public static final String APPLICATION_PROPERTIES="application.properties";
	public static final String DB_PROMO_PROPERTIES="db_promo.properties";
	public static final String SYSTEM_INI="system.ini";
	
	public static final String PREFIX_FILE="file:";
	public static final String CONFIG_PATH="/SCF/config/";
	public static final String DB_PROPERTIES_PATHNAME=CONFIG_PATH + DB_PROPERTIES;
	public static final String REDIS_PROPERTIES_PATHNAME=CONFIG_PATH + REDIS_PROPERTIES;
	public static final String FTP_PROPERTIES_PATHNAME=CONFIG_PATH + FTP_PROPERTIES;
	public static final String URL_INI_PATHNAME=CONFIG_PATH + URL_INI;
	public static final String DB_PROMO_PROPERTIES_PATHNAME=CONFIG_PATH + DB_PROMO_PROPERTIES;
	public static final String SYSTEM_INI_PATHNAME=CONFIG_PATH + SYSTEM_INI;
	
	public static final String APP_INI_PATHNAME="./config/" + APP_INI;
	public static final String APPLICATION_PROPERTIES_PATHNAME="classpath:./" + APPLICATION_PROPERTIES;
}
