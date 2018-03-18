package com.yonyou.scf.contract;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.yonyou.scf.common.constant.DefaultConst;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = { "com.yonyou.scf.common.mapper.auto","com.yonyou.scf.contract.mapper" })
@PropertySources(value = { @PropertySource(name = DefaultConst.APPLICATION_PROPERTIES, value = { "classpath:" + DefaultConst.APPLICATION_PROPERTIES }, ignoreResourceNotFound = false), // SpringBoot参数
		@PropertySource(name = DefaultConst.DB_PROPERTIES_PATHNAME, value = { "file:" + DefaultConst.DB_PROPERTIES_PATHNAME }, ignoreResourceNotFound = false), // 数据库配置
		@PropertySource(name = DefaultConst.REDIS_PROPERTIES_PATHNAME, value = { "file:" + DefaultConst.REDIS_PROPERTIES_PATHNAME }, ignoreResourceNotFound = false), // Redis配置
		@PropertySource(name = DefaultConst.FTP_PROPERTIES_PATHNAME, value = { "file:" + DefaultConst.FTP_PROPERTIES_PATHNAME }, ignoreResourceNotFound = false), // FTP配置
		@PropertySource(name = DefaultConst.URL_INI, value = { "file:" + DefaultConst.URL_INI_PATHNAME }, ignoreResourceNotFound = false), // 模块间通讯配置
})
public class App {

	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);
		head();
		
	}
	private static void head() {
		System.out.println("===========================================");
		System.out.println("YonYou Network Technology Co., Ltd.");
		System.out.println("Supply Chain Finance System");
		System.out.println("contract startup successfully !");
		System.out.println("===========================================");
	}
}
