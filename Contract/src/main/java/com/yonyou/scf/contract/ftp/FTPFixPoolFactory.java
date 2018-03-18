package com.yonyou.scf.contract.ftp;

import org.apache.commons.net.ftp.FTPClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@ConfigurationProperties("classpath:application.properties")
@Configuration
@Service
public class FTPFixPoolFactory {
	
	@Value("${user.primary.ftp.ip}")
	private String ip;//ip
	
	@Value("${user.primary.ftp.port}")
	private int port;//port
	
	@Value("${user.primary.ftp.account}")
	private String account;//登录名
	
	@Value("${user.primary.ftp.pwd}")
	private String pwd;//登录密码
	
	@Value("${user.primary.ftp.timeout}")
	private int timeout;//登录密码
	
	@Value("${user.primary.fTPClientPool.maxTotal}")
	private int maxTotal;
	
	@Value("${user.primary.fTPClientPool.maxIdlePerKey}")
	private int maxIdlePerKey;
	
	@Value("${user.primary.fTPClientPool.maxTotalPerKey}")
	private int maxTotalPerKey;
	
	@Autowired
	private FTPConnectionFactory fTPConnectionFactory;
	
	@Bean(name="fTPClientConfiguration")
	public FTPClientConfiguration fTPClientConfiguration() {
		FTPClientConfiguration fTPClientConfiguration = new FTPClientConfiguration();
		fTPClientConfiguration.setIp(ip);
		fTPClientConfiguration.setPort(port);
		fTPClientConfiguration.setAccount(account);
		fTPClientConfiguration.setPwd(pwd);
		fTPClientConfiguration.setTimeout(timeout);
		fTPClientConfiguration.setMaxTotal(maxTotal);
		fTPClientConfiguration.setMaxIdlePerKey(maxIdlePerKey);
		fTPClientConfiguration.setMaxTotalPerKey(maxTotalPerKey);
		fTPClientConfiguration.setJmxEnabled(false);
		return fTPClientConfiguration;
	}
	
	@Bean(name="fTPClientPool")
	public FTPClientPool fTPClientPool(@Qualifier("fTPClientConfiguration")FTPClientConfiguration fTPClientConfiguration) {
		FTPClientPool fTPClientPool = new FTPClientPool(fTPConnectionFactory, fTPClientConfiguration);
		return fTPClientPool;
	}
	
}
