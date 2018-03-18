package com.yonyou.scf.common.util;

import java.math.BigDecimal;

/**
 * Long工具类
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * zhangxu		2017-09-04	Create this file
 * zhangxu      2017-09-12  add multiply100
 * zhangxu      2017-09-14  update toLong
 * zhangxu      2017-09-14  add multiply10000
 * </pre>
 * 
 */
public class LongUtil {
	/**
	 * 非空判断
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean isNotEmpty(Long obj) {
		if (obj != null && obj > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 空判断
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean isEmpty(Long obj) {
		if (obj == null || 0 == obj) {
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
	public static Long toLong(Object obj) {
		Long l = null;
		if (null != obj && !"".equals(obj)) {
			try {
				l = Long.decode(obj.toString());
			} catch (Exception e) {
				System.out.println("LongUtil.toLong" + e.getMessage());
				e.printStackTrace();
			}
		}
		return l;
	}

	/**
	 * 求和
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static Long sum(Long a, Long b) {
		if (isNotEmpty(a) && isNotEmpty(b)) {
			return Long.sum(a, b);
		} else if (isEmpty(a) && isNotEmpty(b)) {
			return b;
		} else if (isNotEmpty(a) && isEmpty(b)) {
			return a;
		}
		return new Long(0);
	}

	public static Long multiply100(Long longObj) {
		Long l = null;
		try {
			BigDecimal a = new BigDecimal(longObj);
			BigDecimal b = new BigDecimal(100);
			BigDecimal c = a.multiply(b);
			l = Long.decode(c.toString());
		} catch (Exception e) {
			System.out.println("LongUtil.multiply100" + e.getMessage());
			e.printStackTrace();
		}
		return l;
	}

	/**
	 * 获取金额
	 * 
	 * @param Obj
	 * @return
	 */
	public static Long multiply100(String Obj) {
		Long l = null;
		BigDecimal b = new BigDecimal(Obj);
		BigDecimal c = new BigDecimal("100");
		BigDecimal d = b.multiply(c);
		try {
			l = d.longValue();
		} catch (Exception e) {
			System.out.println("LongUtil.multiply100" + e.getMessage());
			e.printStackTrace();
		}
		return l;
	}

	/**
	 * 获取利率
	 * 
	 * @param Obj
	 * @return
	 */
	public static Long multiply10000(String Obj) {
		Long l = null;
		BigDecimal b = new BigDecimal(Obj);
		BigDecimal c = new BigDecimal("10000");
		BigDecimal d = b.multiply(c);
		try {
			l = d.longValue();
		} catch (Exception e) {
			System.out.println("LongUtil.multiply10000" + e.getMessage());
			e.printStackTrace();
		}
		return l;
	}

	public static Long multiply10000(Long longObj) {
		Long l = null;
		try {
			BigDecimal a = new BigDecimal(longObj);
			BigDecimal b = new BigDecimal(10000);
			BigDecimal c = a.multiply(b);
			l = Long.decode(c.toString());
		} catch (Exception e) {
			System.out.println("LongUtil.multiply10000" + e.getMessage());
			e.printStackTrace();
		}
		return l;
	}

	public static void main(String[] args) {
		Long obj = Long.MAX_VALUE;
		System.out.println(isNotEmpty(obj));
		System.out.println(isEmpty(obj));

		Object o = new Object();
		System.out.println(toLong(o));

		Long a = Long.decode("12");
		Long b = Long.decode("3");
		System.out.println(sum(a, b));

		System.out.println(multiply100(sum(a, b)));
	}

}
