package com.bjdreamtech.dmt.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * 配置文件工具，加载特定的配置文件数据
 * @author duanwu
 *
 */
public class DMTConfigUtil {
	
	static Logger log = Logger.getLogger(DMTConfigUtil.class); 
	
	//是否连接redis 数据库
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
	//廊坊银行访问地址
	public static String LCCB_URL;
	
	/**
	 * 初始化方法，系统启动的时候加载config.xml配置文件中的内容
	 * 
	 */
	public static void initMethod(String str){
		try {
			Properties prop = new Properties(); 
			log.info(str);
			FileInputStream in = new FileInputStream(str); 
			log.info("加载配置文件");
			prop.load(in);
			log.info("加载配置完成");
			Properties prop = new Properties();
			InputStream in = DMTConfigUtil.class.getResourceAsStream("/config.properties");
			prop.load(in);
			log.info("配置文件加载完成");
			REDIS_OPEN = prop.getProperty("redis.open");
			REDIS_ADDRESS = prop.getProperty("redis.address");
			REDIS_PORT = prop.getProperty("redis.port");
			CONFIG_DATABASE = prop.getProperty("config.database");
			CONFIG_SINGLESIGNON = prop.getProperty("config.singleSignOn");
			CONFIG_FILEPATH = prop.getProperty("config.filePath");
			SYSTEM_PATH = prop.getProperty("config.systemPath");
			LCCB_URL =prop.getProperty("config.lccb_url");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
