package com.yonyou.scf.common.util.codec;

import java.io.UnsupportedEncodingException;

/**
 * 非推荐Base64工具类，继承了apache.commons.Base64的所有功能
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu		2017-03-16	Create this file
 * </pre>
 * 
 */
public class Base64Util extends org.apache.commons.codec.binary.Base64 {

	public static String decodeBase64String(String base64String) throws UnsupportedEncodingException {
		byte[] decodeBase64 = decodeBase64(base64String);
		return new String(decodeBase64, Charsets.UTF_8);
	}

}
