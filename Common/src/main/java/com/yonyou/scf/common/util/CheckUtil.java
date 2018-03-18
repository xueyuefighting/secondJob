package com.yonyou.scf.common.util;

public class CheckUtil {

	/**
	 * 手机号
	 */
	public static final String PHONE = "^1(3[0-9]|4[57]|5[0-35-9]|8[0-9]|7[780])\\d{8}$";
	
	/**
	 * 中文
	 */
	public static final String CHINESE = "^[\u4e00-\u9fa5]{0,}$";
	
	/**
	 * EMail
	 */
	public static final String EMAIL = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
	
	/**
	 * 身份证号码
	 */
	public static final String CERTNO = "^([0-9]){7,18}(x|X)?$";
	
	
	/**
	 * 密码
	 */
	public static final String PASS = "(?!^(\\d+|[a-zA-Z]+|[~!@#$%^&*?]+)$)^[\\w~!@#$%\\^&*?]+$";
	
	/**
	 * 校验给定字符串是否满足给定正则
	 * @param target
	 * @param expression
	 * @return
	 */
	public static boolean matches(String target,String expression){
		if(target.matches(expression))
			return true;
		return false;
	}  
}
