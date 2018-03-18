package com.yonyou.scf.contract.ftp;

import org.apache.commons.pool2.impl.GenericKeyedObjectPoolConfig;

/**
 * 为连接ftp服务器提供配置，spring负责实例化。可修改参数
 * @author zhangjinliang
 * 2017年5月26日 下午3:08:56
 * 
 */
public class FTPClientConfiguration extends GenericKeyedObjectPoolConfig {
	
	private String ip;//ip
	
	private int port;//port
	
	private String account;//登录名
	
	private String pwd;//登录密码

	private int timeout;//登录密码
	
	private String directory;
	
	
	
	public String getDirectory() {
		return directory;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
	public FTPClientConfiguration() {
		
	}
	public FTPClientConfiguration(String ip, int port, String account,
			String pwd, int timeout) {
		this.ip = ip;
		this.port = port;
		this.account = account;
		this.pwd = pwd;
		this.timeout = timeout;
	}
	
}
