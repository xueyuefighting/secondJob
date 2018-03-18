package com.yonyou.util;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * proeprties配置文件工具类
 * @author zhangjinliang
 * 2017年4月12日 下午11:05:52
 * 
 */
public class ReadProperties {
	
	private static final String applicationPropertiesAdress = "/application.properties";
	private static final String prefixString = "springBatch.notification.";
	private static final String urlFixString = "springBatch.notification.";
	
	/**
	 * 读取properties文件 返回Properties对象
	 * @param propertiesFile
	 * @return
	 */
	public static Properties returnProperties(String propertiesFile){
		
		Properties p = new Properties();
		InputStream in = null;
		
		try {
			in = new BufferedInputStream(ReadProperties.class.getResourceAsStream(propertiesFile));
			p.load(in);
		
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return p;
	}
	
	/*
	 * 读取类根目录下的/application.properties
	 * 返回key-value
	 * eg：springBatch.notification.jin.sendContent =sendContent
	 * springBatch.notification为指定前缀
	 * jin组下的 sendContent1 =sendContent2  value=sendContent2，key=sendContent1
	 */
	public static Map<String,Map<String,Object>> read(){
		
		Map<Object, Object> m = new HashMap<Object, Object>();
		Map<String,Map<String,Object>> map = new HashMap<String,Map<String,Object>>();
		
		Properties p = new Properties();
		InputStream in = null;
		
		
		m = returnProperties(applicationPropertiesAdress);
		
		Set<Entry<Object, Object>> set = m.entrySet();
		Set<String> setKey = new HashSet<String>();
		Map<String,Object> mo = null;
		for (Entry<Object, Object> entry : set) {
			mo = new HashMap<String,Object>();
			if(((String) entry.getKey()).startsWith(prefixString)){
				String keyString = entry.getKey().toString();
				Object value = entry.getValue();
				int keylength = keyString.indexOf(".", prefixString.length());
				String key = keyString.substring(prefixString.length(),keylength);
				String keynote = keyString.substring(keylength+1, keyString.length());
				
				if(map.containsKey(key)){
					map.get(key).put(keynote, value);
				}else{
					mo.put(keynote, value);
					map.put(key, mo);
				}
				
				setKey.add(key);
			}
		}
		
		System.out.println(map);
		System.out.println(map.size());
		
		return map;
	}
	
	/**
	 * 根据给的keyword取properties中的value
	 * @param propertiesFile  properties文件路径
	 * @param keyword 
	 * @return
	 */
	public static String[] getNotificationUrl(String propertiesFile,String keyword){
		
		Properties p = returnProperties(propertiesFile);
		
		Object objString = p.get(urlFixString+keyword);
		
		String[] string = objString.toString().split(",");
		
		return string;
	}
	
}
