package com.yonyou.scf.gateway.ftp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringApplicationConfiguration
@Configuration
public class FTPFixPool {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Value("${user.primary.ftp.ip}")
	private String ip;
	@Value("${user.primary.ftp.port}")
	private int port;
	@Value("${user.primary.ftp.account}")
	private String account;
	@Value("${user.primary.ftp.pwd}")
	private String pwd;
	@Value("${user.primary.ftp.timeout}")
	private int timeout;
	
	
	@Bean(name="fTPClientPool")
	public FTPClientPool fTPClientPool(@Qualifier("fTPConnectionFactory") FTPConnectionFactory fTPConnectionFactory){
		return new FTPClientPool(6, fTPConnectionFactory);
	}

	@Bean(name="fTPConnectionFactory")
	public FTPConnectionFactory createFactory(@Qualifier("fTPClientConfiguration") FTPClientConfiguration fTPClientConfiguration) {
		
		FTPConnectionFactory factory = new FTPConnectionFactory(fTPClientConfiguration);
		
		return factory;
	}
	
	@Bean(name="fTPClientConfiguration")
	public FTPClientConfiguration createConfig() {
		FTPClientConfiguration config = new FTPClientConfiguration();
			config.setIp(ip);
			config.setPort(port);
			config.setAccount(account);
			config.setPwd(pwd);
			config.setTimeout(timeout);
		return config;
	}
	
}
