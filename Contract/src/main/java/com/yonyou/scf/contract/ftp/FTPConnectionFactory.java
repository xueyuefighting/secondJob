package com.yonyou.scf.contract.ftp;

import java.io.IOException;
import java.util.Optional;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.pool2.KeyedPooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.yonyou.scf.common.system.CodeException;

/**
 * ftp连接工厂类
 * @author zhangjinliang
 * 2017年5月26日 下午4:24:01
 * 
 */
@Service
public class FTPConnectionFactory implements KeyedPooledObjectFactory<FTPClientConfiguration,FTPClient> {
	
	private static final Logger log = LoggerFactory.getLogger(FTPConnectionFactory.class);

	
	public FTPConnectionFactory() {
	}
	

	@Override
	public PooledObject<FTPClient> makeObject(FTPClientConfiguration fTPClientConfiguration) throws Exception {
		FTPClient ftp = new FTPClient();
		
		ftp.setConnectTimeout(fTPClientConfiguration.getTimeout());//超时
		ftp.connect(fTPClientConfiguration.getIp(), fTPClientConfiguration.getPort());//连接
		
		boolean result = ftp.login(fTPClientConfiguration.getAccount(), fTPClientConfiguration.getPwd());//登录
		
        if (!result) {
             throw new CodeException("ftpClient登陆失败! userName:" + fTPClientConfiguration.getAccount() + " ; password:" + fTPClientConfiguration.getPwd());
        }else {
        		log.info("ftp登陆成功");
        }
        ftp.setFileType(FTPClient.BINARY_FILE_TYPE);//文件类型
        ftp.enterLocalPassiveMode();//发起端口申请。linux选择
        log.info("成功创建一个ftpclient对象");
		return new DefaultPooledObject<FTPClient>(ftp);
	}

	/*
	 * 销毁当前对象 先登出再断开连接
	 *  (non-Javadoc)
	 * @see org.apache.commons.pool2.PooledObjectFactory#destroyObject(org.apache.commons.pool2.PooledObject)
	 */
	@Override
	public void destroyObject(FTPClientConfiguration fTPClientConfiguration,PooledObject<FTPClient> p) throws Exception {
		
		if(p==null) return;
		
			Optional<FTPClient> option = Optional.ofNullable(p.getObject());
			
			if(!option.isPresent()) return;
			
			if(option.get()==null) return;
			
			FTPClient f = option.get();
			
			if(f.isConnected()){
				boolean flag = f.logout();
				f.disconnect(); //断开连接
				if(!flag){
					log.warn("ftp登出失败");
				}
				 log.info("摧毁一个ftpclient对象");
			}else{
				log.warn("无有效ftpClient对象");
			}
			
	}

	/* 
	 * 验证一个对象是否有效，发送noop指令 是为了验证当前连接是否有效
	 * (non-Javadoc)
	 * @see org.apache.commons.pool2.PooledObjectFactory#validateObject(org.apache.commons.pool2.PooledObject)
	 */
	private String SYS_COMM = "system";
	
	@Override
	public boolean validateObject(FTPClientConfiguration fTPClientConfiguration, PooledObject<FTPClient> p) {
//		System.out.println("ftpClient对象，验证开始");
		
		boolean flag = true;
		FTPClient f = p.getObject();
		
		if(!f.isAvailable() || !f.isConnected()) {
			log.warn("连接失效 : " + fTPClientConfiguration.toString() + ", 连接状态: " + f.isAvailable() + ", 可用状态 : " + f.isConnected());
//			System.out.println("连接失效 : " + fTPClientConfiguration.toString() + ", 连接状态: " + f.isAvailable() + ", 可用状态 : " + f.isConnected());
			return false;
		}
		
		try {
			f.sendCommand(SYS_COMM);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public void activateObject(FTPClientConfiguration fTP,PooledObject<FTPClient> p) throws Exception {
		
	}

	@Override
	public void passivateObject(FTPClientConfiguration fTP,PooledObject<FTPClient> p) throws Exception {
		
	}

}
