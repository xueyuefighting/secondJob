package com.yonyou.scf.common.util.security;

import java.util.Map.Entry;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * <pre>
 * 类说明：数据库配置解密方法
 * 
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu      2017-03-16  Create this file
 * 
 * </pre>
 * 
 */
public class DecryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

	@Override
	protected void processProperties(ConfigurableListableBeanFactory beanFactory, Properties props) throws BeansException {
		// 遍历配置
		for (Entry<Object, Object> property : props.entrySet()) {
			String key = (String) property.getKey();
			// 修改解密后缀为“.encrypt”，或者含有username、password的配置
			if (key.endsWith(".encrypt") || key.indexOf("username") >= 0 || key.indexOf("password") >= 0) {
				props.setProperty(key, SecurityUtil.DES3_CBC_Decrypt((String) property.getValue()));
			}
		}
		super.processProperties(beanFactory, props);
	}
}
