package com.bjdreamtech.dmt.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间转换工具
 * @author duanwu
 *
 */
public class DMTDateUtil {
	
	/**
	 * 将当前时间转换成yyyyMMddHHmmss格式，方便存储数据库
	 * @param date
	 * @return
	 */
	public static String parseDate(){
		return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
	}
	
	/**
	 * 将当前时间转换成yyyyMMddHHmmssfff格式，流水号使用
	 * @param date
	 * @return
	 */
	public static String parseDateDetail(){
		return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
	}
	
	/**
	 * 将给定时间转换成yyyyMMddHHmmss格式，方便存储数据库
	 * @param date
	 * @return
	 */
	public static String parseDate(Date date){
		return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(date);
	}
	
	/**
	 * 将不带格式的时间字符串转换成带格式的字符串
	 * yyyyMMddHHmmss to yyyy-MM-dd HH:mm:ss
	 * @param dateStr
	 * @return
	 */
	public static String packDate(String dateStr){
		if(dateStr!=null&&!dateStr.equals(""))
			return new String(dateStr.substring(0,4)+"-"+dateStr.substring(4,6)+"-"+dateStr.substring(6,8)+" "+dateStr.substring(8,10)+":"+dateStr.substring(10,12)+":"+dateStr.substring(12,14));
		else
			return "";
	}

	/**
	 * 将不带格式的时间字符串转换成带格式的字符串
	 * yyyyMMddHHmmss to yyyy-MM-dd HH:mm:ss
	 * @param dateStr
	 * @return
	 */
	public static String packDateChina(String dateStr){
		if(!dateStr.equals(""))
			return new String(dateStr.substring(0,4)+"年"+dateStr.substring(4,6)+"月"+dateStr.substring(6,8)+"日");
		else
			return "";
	}
	
	/**传入YYYYMMddhhmmssS
	 * 改为时间yyyy-MM-dd
	 * @param str
	 * @return
	 */
	public static String packDay(String dateStr){
		if(!dateStr.equals(""))
	  return	dateStr.substring(0,4)+"-"+dateStr.substring(4,6)+"-"+dateStr.substring(6,8);
	  else
		  return "";
	}
	
	/**
	 * YMMddhhmmssS
	 * @param 传入17位的数字
	 * @return YYYY-MM-dd hh:mm:ss
	 */
	public static String pacKSecondFormat(String dateStr){
		if(!dateStr.equals(""))
	  return	dateStr.substring(0,4)+"-"+dateStr.substring(4,6)+"-"+dateStr.substring(6,8)+" "+dateStr.substring(8,10)+":"+dateStr.substring(10,12)+":"+dateStr.substring(12,14)   ;
	  else
		  return "";
	}
	
//	public static void main(String [] args ){
//		
//		System.out.println(pacKSecondFormat("20170114122109876"));
//	}
	
	/**
	 * @param dt
	 * @param day
	 * @return
	 * @throws ParseException
	 * 日期计算
	 */
	public static String parseDay(String dt,int day) throws ParseException{
		Date date = (new SimpleDateFormat("yyyyMMdd")).parse(dt);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, day);
		String  rest = new SimpleDateFormat("yyyyMMdd").format(cal.getTime());
		return rest;
	}
	
	//日期增加
	public static String chgDate(String dt,int day) throws Exception{
		Date date = (new SimpleDateFormat("yyyy-MM-dd")).parse(dt);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, day);
		String  rest = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
		return rest;
	}
	
	
	/**
	 * 获取当前天数
	 */
	public static String parseNowDateDay(){
		return new SimpleDateFormat("yyyyMMdd").format(new Date());
	}
	
	
	/**
	 * YMMddhhmmssS
	 * @param 传入14位的数字
	 * @return YYYYMMddhh:mm:ss,廊坊银行用
	 */
	public static String pacKSecondLCCBFormat(){
		String dateStr = new SimpleDateFormat("yyyyMMddHH:mm:ss").format(new Date());
		return dateStr;
		
	}
	
	public static void main(String [] args ){
		System.out.println(packDateChina("20170424105848085"));
	}
}
