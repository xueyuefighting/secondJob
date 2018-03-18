package com.bjdreamtech.dmt.util;
/**
 * 校验证件号码的输入
 * @author zhanglei
 *
 */
public class DMTCertUtil {
	
	/**
	 * 校验社会统一信用代码的输入
	 * @param str
	 * @return 错误信息
	 */
	public static String  valSocialUniformCode(String str){
		
		if(null== str ||  "".equals(str)){
			return "社会统一信用代码不能为空!";
		}
		
		int len = str.length();
		if(len!=18){
			return "社会统一信用代码长度不正确!";
		}
		return "suc";
	}
	
	/**
	 *  校验省份证的输入
	 * @param str
	 * @return 错误信息
	 */
	public static String valIdentCard(String str){
		
		if(null== str || "".equals(str)){
			return "省份证号码不能为空!";
		}
		
		int len = str.length();
		if(len != 15 && len != 18){
			return "省份证号码长度不正确!";
		}
		return "suc";
	}
	
}
