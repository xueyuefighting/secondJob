package com.yonyou.scf.contract.ftp;

import java.io.IOException;

import org.apache.commons.net.ftp.FTPClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 向外提供的ftp操作方法
 * @author zhangjlm
 *
 */
@Service
public class FTPfixPool {

	private static final Logger logger = LoggerFactory.getLogger(FTPfixPool.class);

	@Autowired(required = true)
	@Qualifier("fTPClientPool")
	private FTPClientPool fTPClientPool;

	@Autowired(required = true)
	@Qualifier("fTPClientConfiguration")
	private FTPClientConfiguration fTPClientConfiguration;

	/**
	 * 提供一个ftp对象，
	 * pool内部使用的是linkedBlockingDeque 双向链表，支持FIFO，LIFO
	 * @return
	 * @throws Exception 异常一定会有的，因为当前方法内部是调用带时间的borrow方法，会有两种异常一种是找不到对象，一种是InterruptedException
	 */
	public FTPClient borrowFTP() throws Exception {
		FTPClient ftp = new FTPClient();
		ftp.connect(fTPClientConfiguration.getIp(), fTPClientConfiguration.getPort());
		if (ftp.login(fTPClientConfiguration.getAccount(), fTPClientConfiguration.getPwd())) {
			logger.info("FTP Connect Successfully !");
		} else {
			logger.error("FTP Connect ERROR !");
			logger.info("FTP IP:" + fTPClientConfiguration.getIp());
			logger.info("FTP PORT:" + fTPClientConfiguration.getPort());
			logger.info("FTP USER:" + fTPClientConfiguration.getAccount());
			logger.info("FTP PASSWORD:" + fTPClientConfiguration.getPwd());
		}
		ftp.enterLocalPassiveMode();//客户端被动模式
		ftp.setFileType(FTPClient.BINARY_FILE_TYPE);//二进制编码
		ftp.setFileTransferMode(FTPClient.STREAM_TRANSFER_MODE);//流格式
		ftp.setBufferSize(1024*1024);
		
		logger.info("获取一个ftpclient对象");
		return ftp;
		//		return fTPClientPool.borrowObject(fTPClientConfiguration);

	}

	/**
	 * 从当前池中获取对象，操作time时间直接返回空
	 * @param time  poll操作的时间
	 * @return
	 * @throws Exception
	 */
	public FTPClient borrowFTP(Long time) throws Exception {
		logger.info("获取一个ftpclient对象");
		return fTPClientPool.borrowObject(fTPClientConfiguration, time);

	}

	/**
	 * 将ftp返回池中
	 * @param ftp
	 */
	public void returnFTP(FTPClient ftp) {
		logger.info("归还一个ftpclient对象");
		if (ftp != null) {
			try {
				ftp.logout();
				ftp.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		//		fTPClientPool.returnObject(fTPClientConfiguration, ftp);
	}

}
