package com.yonyou.scf.gateway.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class IDHandler {
	//SimpleDateFormat是一个线程不安全的类
	private static final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>(){
		@Override
		protected DateFormat initialValue() {
			return new SimpleDateFormat("yyyyMMddHHmmssSSS");
		}
		
	};
	/**
	 * 生成32位UUID
	 * @return
	 */
	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	/**
	 * 返回17时间字符串
	 * @return
	 */
	public static String getSeventeenTime(){
		return df.get().format(new Date());
	}
}
