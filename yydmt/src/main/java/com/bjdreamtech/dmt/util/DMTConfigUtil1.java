package com.bjdreamtech.dmt.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DMTConfigUtil1 {
	//是否连接redis数据库
	public static String REDIS_OPEN;
	//redis数据库IP地址
	public static String REDIS_ADDRESS;
	//redis数据端口
	public static String REDIS_PORT; 
	//系统所使用数据库（oracle/mysql）
	public static String CONFIG_DATABASE;
	//是否开启单点登录
	public static String CONFIG_SINGLESIGNON;
	//系统图片存储路径
	public static String CONFIG_FILEPATH;
	//系统访问路径
	public static String SYSTEM_PATH;
	
	/**
	 * 初始化方法，系统启动的时候加载config.xml配置文件中的内容
	 */
	public static void initMethod(){
		try {
			Properties prop = new Properties();
			InputStream in = DMTConfigUtil.class.getResourceAsStream("/config.properties");
			prop.load(in);
			REDIS_OPEN = prop.getProperty("redis.open");
			REDIS_ADDRESS = prop.getProperty("redis.address");
			REDIS_PORT = prop.getProperty("redis.port");
			CONFIG_DATABASE = prop.getProperty("config.database");
			CONFIG_SINGLESIGNON = prop.getProperty("config.singlesignon");
			CONFIG_FILEPATH = prop.getProperty("config.filePath");
			SYSTEM_PATH = prop.getProperty("config.systemPath");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
