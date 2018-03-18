package com.yonyou.scf.common.util;

import java.math.BigDecimal;

/**
 * Integer工具类
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * zhangxu		2017-09-04	Create this file
 * </pre>
 * 
 */
public class IntegerUtil {

	/**
	 * 非空判断
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean isNotEmpty(Integer obj) {
		if (obj != null && obj > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 对象类型转换
	 * 
	 * @param obj
	 * @return
	 */
	public static Integer toInteger(Object obj) {
		Integer i = null;
		if (null != obj && !"".equals(obj)) {
			i = Integer.decode(obj.toString());
		}
		return i;
	}

	/**
	 * 获取利率
	 * 
	 * @param longObj
	 * @return
	 */
	public static Integer multiply10000(Integer longObj) {
		return longObj * 10000;
	}

	/**
	 * 获取金额
	 * 
	 * @param Obj
	 * @return
	 */
	public static Integer multiply100(String Obj) {
		Integer i = null;
		if (!Obj.isEmpty()) {
			BigDecimal b = new BigDecimal(Obj);
			BigDecimal c = new BigDecimal("100");
			BigDecimal d = b.multiply(c);
			try {
				i = d.intValue();
			} catch (Exception e) {
				System.out
						.println("IntegerUtil.multiply100" + e.getMessage());
				e.printStackTrace();
			}
		}
		return i;
	}

	/**
	 * 获取利率
	 * 
	 * @param Obj
	 * @return
	 */
	public static Integer multiply10000(String Obj) {
		Integer i = null;
		if (!Obj.isEmpty()) {
			BigDecimal b = new BigDecimal(Obj);
			BigDecimal c = new BigDecimal("10000");
			BigDecimal d = b.multiply(c);
			try {
				i = d.intValue();
			} catch (Exception e) {
				System.out
						.println("IntegerUtil.multiply10000" + e.getMessage());
				e.printStackTrace();
			}
		}
		return i;
	}

	public static void main(String[] args) {
		Integer obj = Integer.MAX_VALUE;
		System.out.println(isNotEmpty(obj));
		Object obj2 = new Object();
		obj2 = "11";
		System.out.println(toInteger(obj2));
		String str = "1.000001";
		System.out.println(multiply10000(str));

	}

}
