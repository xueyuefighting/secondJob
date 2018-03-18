package com.yonyou.scf.gateway.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertiesUtil {
	/*
	 * 返回配置配件
	 * @return
	 */
	public static Properties getPropertiesInfo() {
		InputStream in  = PropertiesUtil.class.getClassLoader().getResourceAsStream("application.properties");
		Properties p = new Properties();
		try {
			p.load(in);
			return p;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}finally{
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
					return null;
				}
			}
		}
	}
}
