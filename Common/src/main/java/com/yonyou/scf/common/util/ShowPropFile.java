package com.yonyou.scf.common.util;

import java.util.Iterator;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.support.StandardServletEnvironment;

import com.yonyou.scf.common.constant.DefaultConst;

public class ShowPropFile {

	private static StandardServletEnvironment sse;
	private static final Logger logger = LoggerFactory.getLogger(ShowPropFile.class);

	public static void show4Startup() {

		Iterator<org.springframework.core.env.PropertySource<?>> it = sse.getPropertySources().iterator();
		while (it.hasNext()) {
			org.springframework.core.env.PropertySource<?> ps = it.next();
			Object obj = ps.getSource();
			//logger.info("加载[" + ps.getName() + "]" + "，" + obj.getClass().getName());

			if (obj instanceof java.util.Map) {

				if (ps.getName().endsWith(".ini") || "systemProperties".equalsIgnoreCase(ps.getName()) || "systemEnvironment".equalsIgnoreCase(ps.getName())) {
					continue;
				}

				Map<?, ?> m = (Map<?, ?>) obj;
				logger.info("加载启动文件[" + ps.getName() + "]，共" + m.keySet().size() + "项");

				//返回属性key的集合  
				for (Object key : m.keySet()) {
					logger.info("            " + key.toString() + "=" + m.get(key));
				}
			}

		}

	}

	public static void show4Reload(String prop_name) {

		Iterator<org.springframework.core.env.PropertySource<?>> it = sse.getPropertySources().iterator();
		while (it.hasNext()) {
			org.springframework.core.env.PropertySource<?> ps = it.next();
			Object obj = ps.getSource();
			//logger.info("加载2[" + ps.getName() + "]" + "，" + obj.getClass().getName());

			if (obj instanceof java.util.Map) {

				if (!prop_name.equalsIgnoreCase(ps.getName())) {
					continue;
				}

				Map<?, ?> m = (Map<?, ?>) obj;
				logger.info("加载配置文件[" + ps.getName() + "]，共" + m.keySet().size() + "项");

				//返回属性key的集合  
				for (Object key : m.keySet()) {
					logger.info("            " + key.toString() + "=" + m.get(key));
				}
			}

		}

	}

	public static void showAll(StandardServletEnvironment sse) {
		ShowPropFile.sse = sse;
		show4Startup();
		show4Reload(DefaultConst.URL_INI);
		show4Reload(DefaultConst.SYSTEM_INI);
	}
}
