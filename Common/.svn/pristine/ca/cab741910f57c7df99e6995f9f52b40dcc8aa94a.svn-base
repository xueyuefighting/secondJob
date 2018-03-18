package com.yonyou.scf.common.util;

import java.math.BigDecimal;

/**
 * 金额共用类
 * 
 * @author zhangxu
 * 
 */
public class BigDecimalUtil {

	/**
	 * 1000000
	 */
	public static final BigDecimal oneMillion = new BigDecimal(1000000);

	public static final String amount_1 = "0.00";
	public static final String format_1 = "#.00";

	/**
	 * 获取金额单位万的数据
	 * 
	 * @param allAmount
	 * @return
	 */
	public static String getAmount(Long allAmount) {
		String allAmountStr = amount_1;
		if (LongUtil.isNotEmpty(allAmount)) {
			BigDecimal allAmountBD = new BigDecimal(allAmount);
			allAmountStr = new java.text.DecimalFormat(format_1)
					.format(allAmountBD.divide(oneMillion));
			if (allAmountStr.indexOf(".") == 0) {
				allAmountStr = "0" + allAmountStr;
			}
		}
		return allAmountStr;
	}

	public static void main(String[] args) {
		Long amount = new Long(1000000);
		System.out.println(getAmount(amount));
	}

}
