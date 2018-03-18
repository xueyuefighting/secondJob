package com.yonyou.scf.common.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期时间共用类
 * 
 * @author zhangxu
 * 
 *         2017-10-03 zhangjlm add method 'transferDateWithStr'
 *
 */
public class Timer {
	/**
	 * yyyy-MM-dd HH:mm:ss.SSS
	 */
	public static String Role1 = "yyyy-MM-dd HH:mm:ss.SSS";
	/**
	 * yyyyMMddHHmmssSSS
	 */
	public static String Role2 = "yyyyMMddHHmmssSSS";
	/**
	 * yyyy-MM-dd
	 */
	public static String Role3 = "yyyy-MM-dd";
	/**
	 * HH:mm:ss
	 */
	public static String Role4 = "HH:mm:ss";
	/**
	 * HH:mm:ss.SSS
	 */
	public static String Role5 = "HH:mm:ss.SSS";
	/**
	 * yyyyMMdd
	 */
	public static String Role6 = "yyyyMMdd";

	/**
	 * yyyyMMddHHmmssSSS
	 */
	public static String Role7 = "yyyyMMddHH:mm:ss";
	/**
	 * yyyy-MM-dd HH:mm:ss.SSS
	 */
	public static String Role8 = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 获取当前时间
	 * 
	 * @return
	 */
	public static String getTimeNow() {
		return LocalTime.now().toString();
	}

	/**
	 * 获取当前日期
	 * 
	 * @return
	 */
	public static String getDateNow() {
		return LocalDate.now().toString();
	}

	/**
	 * Returns this Calendar's time value in milliseconds.
	 *
	 * @return the current time as UTC milliseconds from the epoch.
	 */
	public static long getNowTimeInMillis() {
		return Calendar.getInstance().getTimeInMillis();
	}

	/**
	 * 获取参数形式的日期时间
	 * 
	 * @param role
	 * @return
	 */
	public static String getDateTimeNow(String role) {
		// 获得当前日期时间
		LocalDateTime now = LocalDateTime.now();
		// 格式化日期时间
		DateTimeFormatter dateToStrFormatter = DateTimeFormatter
				.ofPattern(role);
		return dateToStrFormatter.format(now);
	}

	/**
	 * 获取时间戳
	 * 
	 * @return
	 */
	public static String getTimestamp() {
		return Long.toString(System.currentTimeMillis());
	}

	/**
	 * 制定格式字符型日期转为yyyy-mm-dd日期字符串
	 * 
	 * @param strDate
	 * @return
	 */
	public static String strToDate(String strDate, String tempRele,
			String toRole) {
		SimpleDateFormat sdf = new SimpleDateFormat(tempRele);
		ParsePosition pos = new ParsePosition(0);
		Date strtodate = null;
		strtodate = sdf.parse(strDate, pos);
		SimpleDateFormat sdf1 = new SimpleDateFormat(toRole);

		return sdf1.format(strtodate);
	}

	/**
	 * 日期加减天数
	 * 
	 * @param strDate
	 * @param day
	 * @return
	 */
	public static String addDateStr(String strDate, int day, String role) {
		SimpleDateFormat sdf = new SimpleDateFormat(role);
		ParsePosition pos = new ParsePosition(0);
		Date strtodate = null;
		strtodate = sdf.parse(strDate, pos);
		Calendar cal = Calendar.getInstance();
		cal.setTime(strtodate);
		cal.add(Calendar.DATE, day);
		String aa = sdf.format(cal.getTime());
		return aa;
	}

	/**
	 * 日期比较
	 * 
	 * @param businessDate
	 *            比较日期
	 * @return -2:异常/-1:比较日期小于系统日期/0:比较日期等于系统日期/1:比较日期大于系统日期
	 */
	public static int compareTo(String businessDate) {
		String dateTimeNow = getDateNow();
		int n = -2;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date now = sdf.parse(businessDate);
			Date date = sdf.parse(dateTimeNow);
			n = now.compareTo(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return n;
	}

	/**
	 * 日期比较
	 * 
	 * @param beginDate
	 *            开始日期
	 * @param endDate
	 *            结束日期
	 * @return -2:异常/-1:开始日期小于结束日期/0:开始日期等于结束日期/1:开始日期大于结束日期
	 */
	public static int compareTo(String beginDate, String endDate) {
		int n = -2;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date begin = sdf.parse(beginDate);
			Date end = sdf.parse(endDate);
			n = begin.compareTo(end);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return n;
	}

	public static int betweenDays(String begin, String end, String tempRole) {

		LocalDate beginDate = LocalDate
				.parse(strToDate(begin, tempRole, Role3));
		LocalDate endDate = LocalDate.parse(strToDate(end, tempRole, Role3));
		Long days = endDate.toEpochDay() - beginDate.toEpochDay();

		return days.intValue();
	}

	/**
	 * 日期相差月份数-合同模块专用
	 * 
	 * @param begin
	 * @param end
	 * @param tempRole
	 * @return
	 */
	public static int betweenMonthsForContract(String begin, String end,
			String tempRole) {
		LocalDate beginDate = LocalDate
				.parse(strToDate(begin, tempRole, Role3));
		LocalDate endDate = LocalDate.parse(strToDate(end, tempRole, Role3));

		int beginYear = beginDate.getYear();
		int beginMonth = beginDate.getMonthValue();

		int endYear = endDate.getYear();
		int endMonth = endDate.getMonthValue();

		return (endYear - beginYear) * 12 + endMonth - beginMonth;
	}

	/**
	 * yyyy-MM-dd HH:mm:ss.SSS
	 * 
	 * @return
	 */
	public static String getReadableDateTimeFormat() {
		return getDateTimeNow(Role1);
	}

	/**
	 * yyyyMMddHHmmssSSS
	 * 
	 * @return
	 */
	public static String getDateTimeFormat() {
		return getDateTimeNow(Role2);
	}

	/**
	 * yyyy-MM-dd
	 * 
	 * @return
	 */
	public static String getReadableDateFormat() {
		return getDateTimeNow(Role3);
	}

	/**
	 * yyyyMMdd
	 * 
	 * @return
	 */
	public static String getDateFormat() {
		return getDateTimeNow(Role6);
	}

	/**
	 * input yyyyMMdd output LocalDate
	 * 
	 * @return
	 */
	public static LocalDate transferDateWithStr(String str) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDate localDate = LocalDate.parse(str, dtf);
		return localDate;
	}
}
