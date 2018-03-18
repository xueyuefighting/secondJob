package com.yonyou.scf.gateway.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu      2017-03-16  Create this file
 * 
 * </pre>
 * 
 */
@SpringBootApplication
public class InitConfiguration {

	@Value("${server.version}")
	private String server_version;
	public static String VERSION = "";

	private final Logger logger = LoggerFactory.getLogger(InitConfiguration.class);

	@Bean
	public boolean init() {
		VERSION = server_version;
		// TODO : 其他加载项？
		
		logger.info("Initialize Done !");

		return true;
	}
}
