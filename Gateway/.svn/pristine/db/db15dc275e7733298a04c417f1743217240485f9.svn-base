package com.yonyou.scf.gateway.ftp;

import java.io.IOException;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yonyou.scf.tools.middleware.log.LogType;
import com.yonyou.scf.tools.system.CodeException;

/**
 * ftp连接工厂类
 * @author zhangjinliang
 * 2017年5月26日 下午4:24:01
 * 
 */
public class FTPConnectionFactory implements PooledObjectFactory<FTPClient> {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private FTPClientConfiguration fTPClientConfiguration;
	
	public void setfTPClientConfiguration(
			FTPClientConfiguration fTPClientConfiguration) {
		this.fTPClientConfiguration = fTPClientConfiguration;
	}

	public FTPConnectionFactory() {
	}
	
	public FTPConnectionFactory(FTPClientConfiguration fTPClientConfiguration) {
		this.fTPClientConfiguration = fTPClientConfiguration;
	}

	@Override
	public PooledObject<FTPClient> makeObject() throws Exception {
		logger.info( "ftpClient登录开始");
		FTPClient ftp = new FTPClient();
		
		ftp.setConnectTimeout(fTPClientConfiguration.getTimeout());//超时
		ftp.connect(fTPClientConfiguration.getIp(), fTPClientConfiguration.getPort());//连接
		boolean result = ftp.login(fTPClientConfiguration.getAccount(), fTPClientConfiguration.getPwd());//登录
        if (!result) {
        	logger.error( "ftpClient登陆失败! userName:" + fTPClientConfiguration.getAccount() + " ; password:" + fTPClientConfiguration.getPwd());
             throw new CodeException("ftpClient登陆失败! userName:" + fTPClientConfiguration.getAccount() + " ; password:" + fTPClientConfiguration.getPwd());
        }
        logger.info( "ftpClient登录成功");
        ftp.setFileType(FTPClient.BINARY_FILE_TYPE);//文件类型
        ftp.enterLocalPassiveMode();//发起端口申请。linux选择
        
		return new DefaultPooledObject<FTPClient>(ftp);
	}

	@Override
	public void destroyObject(PooledObject<FTPClient> p) throws Exception {
		logger.info( "ftpClient登出开始");
		if(p!=null && p.getObject()!=null && p.getObject().isConnected()){
			boolean flag = p.getObject().logout();
			if(!flag){
				logger.error( "ftpClient登出失败");
				throw new CodeException("ftpClient登出失败");
			}
		}else{
			logger.error( "销毁ftpClient对象开始");
			throw new CodeException("ftpClient登出失败");
		}
	}

	@Override
	public boolean validateObject(PooledObject<FTPClient> p) {
		logger.info( "ftpClient对象，验证开始");
		boolean flag = false;
		if(p!=null && p.getObject()!=null){
			try {
				flag = p.getObject().sendNoOp();
				if(!flag){
					destroyObject(p);//注销连接
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			try {
				throw new CodeException("ftp对象验证失败");
			} catch (CodeException e) {
				e.printStackTrace();
			}
		}
		logger.info( "ftpClient对象，验证结束");
		return flag;
	}

	@Override
	public void activateObject(PooledObject<FTPClient> p) throws Exception {
		
	}

	@Override
	public void passivateObject(PooledObject<FTPClient> p) throws Exception {
		
	}

}
