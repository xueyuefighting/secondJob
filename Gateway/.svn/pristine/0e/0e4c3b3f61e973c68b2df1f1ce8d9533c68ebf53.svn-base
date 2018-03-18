package com.yonyou.scf.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yonyou.scf.gateway.config.InitConfiguration;

/**
 * 核心启动器 可以设置mapper要扫描的包
 */

// 其中@SpringBootApplication申明让spring boot自动给程序进行必要的配置
// 等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan
@SpringBootApplication
//@MapperScan("com.yonyou.scf.common.schema1.mapper")
public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		head();
		
		
		logger.info("Gateway startup successfully! Version : " + InitConfiguration.VERSION);
	}
	
	private static void head() {
		System.out.println("===========================================");
		System.out.println("YonYou Network Technology Co., Ltd.");
		System.out.println("Supply Chain Finance System");
		System.out.println("Gateway startup successfully !");
		System.out.println("Version : " + InitConfiguration.VERSION);
		System.out.println("===========================================");
	}
}