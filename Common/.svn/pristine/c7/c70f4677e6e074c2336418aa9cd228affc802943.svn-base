package com.yonyou.scf.common.util;

import javax.servlet.http.HttpServletRequest;

/**
 * IP地址工具类
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu		2017-03-16	Create this file
 * 
 * </pre>
 * 
 */
public class IPUtil {

	/**
	 * 获取客户端真实IP地址，支持多级反向代理
	 * 
	 * @param request
	 * @return ip
	 */
	public static String getRemoteIP(HttpServletRequest request) {
		String ip = request.getHeader("X-Real-IP");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("X-Forwarded-For");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		
		if (StringUtil.isEmpty(ip)) {
			return null;
		} else {
			if (ip.indexOf(",") > 0) {
				return ip.split(",")[0];
			}
			return ip;
		}
	}

	/**
	 * 
	 * @usedFor:获取顶层服务器(如F5)IP地址
	 * @date:Jun 14, 2012
	 * @author:Dimmacro
	 * 
	 */
	public static String getUpServerIP(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-host");
		if (StringUtil.isNotEmpty(ip) && !"unknown".equalsIgnoreCase(ip)) {
			return ip.split(",")[0];
		}
		ip = request.getHeader("x-forwarded-for");
		if (StringUtil.isNotEmpty(ip) && !"unknown".equalsIgnoreCase(ip)) {
			String[] ipArrays = ip.split(",");
			return ipArrays[ipArrays.length - 1];
		}
		ip = request.getHeader("x-forwarded-server");
		if (StringUtil.isNotEmpty(ip) && !"unknown".equalsIgnoreCase(ip)) {
			return ip.split(",")[0];
		}
		return request.getHeader("host");
	}

}