package com.bjdreamtech.dmt.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.commons.io.IOUtils;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * @author wp FTP文件上上传和下载
 * 
 */


public class DMTFTPUtil {
	static Logger log = Logger.getLogger(DMTFTPUtil.class); 
	/**
	 * 文件上传
	 * 
	 * @param ftpIp
	 *            地址
	 * @param account
	 *            账号
	 * @param pwd
	 *            密码
	 * @param fis
	 *            上传的文件流
	 * @param Directory
	 *            文件夹
	 * @param name
	 *            存放的文件名称(不能采用中文)
	 */
	public static void uploadFtp(String ftpIp, int port, String account,
			String pwd, FileInputStream fis, String Directory, String name) {
		// FTP对象(
		log.info("上传开始");
		FTPClient ftp = new FTPClient();
		log.info("获取FTP连接");
		// 链接地址和端口
		try {
			ftp.connect(ftpIp, port);
			log.info("连接"+ftpIp+":"+port);
//			ftp.setCharset(Charset.forName("UTF-8"));
			// 登录账号和密码
			ftp.login(account, pwd);
			// 创建远程文件家
			ftp.makeDirectory(Directory);
			log.info("上传的目录"+Directory);
			// 选择远程文件夹
			ftp.changeWorkingDirectory(Directory);
			log.info("转移的目录"+Directory);
			ftp.setBufferSize(1024);
			// 设置文件类型（二进制）w
			ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
			log.info("设置上传类型"+FTPClient.BINARY_FILE_TYPE);
			ftp.storeFile(name, fis); // 上传的文件名称
			log.info("上传的文件名称"+name);
			ftp.logout();
			log.info("FTP登出");
			log.info("上传完成");
		} catch (Exception e) {
			log.error("上传异常信息"+e.getMessage());
		} finally {
			IOUtils.closeQuietly(fis);
			log.error("关闭上传流");
		}
	}

	/**
	 * 文件下载
	 * 
	 * @param ftpIp
	 *            地址
	 * @param account
	 *            账号
	 * @param pwd
	 *            密码
	 * @param Directory
	 *            远程文件目录
	 * @param rometeName
	 *            远程文件名称
	 * @param localPath
	 *            本地地址
	 * @param localFileName
	 *            本地文件名称
	 */
	public static void downFTp(String ftpIp, int port, String account,
			String pwd, String Directory, String rometeName, String localPath,
			String localFileName) {
		log.info("下载开始");
		// FTP对象
		FTPClient ftp = new FTPClient();
		log.info("获取FTP连接");
		// 链接地址和端口
		try {
			ftp.connect(ftpIp, port);
			log.info("连接"+ftpIp+":"+port);
			// 登录账号和密码
			ftp.login(account, pwd);
			// 选择要下载的目录
			ftp.changeWorkingDirectory(Directory);
			log.info("下载的目录"+Directory);
			
			ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
			log.info("设置文件类型"+FTPClient.BINARY_FILE_TYPE);
			ftp.enterLocalPassiveMode();//发起端口申请。linux选择
			log.info("发起端口申请");
			// 下载的文件列表
			FTPFile[] fs = ftp.listFiles();
			log.info("获取目录文件列表"+fs.length);
			for (FTPFile files : fs) {
//				if (files.getName().equals(rometeName)) {
				if(rometeName.contains(files.getName())){
					log.info("下载的文件名称"+files.getName());
					// 本地保存的文件名册
					File temp = new File(localPath + localFileName);
					log.info("本地目文件地址 "+localPath + localFileName);
					OutputStream is = new FileOutputStream(temp);
					ftp.retrieveFile(files.getName(), is);
					log.info("接收的文件名称"+files.getName());
//					ftp.setCharset(Charset.forName("UTF-8"));
					is.close();
					log.info("关闭下载流");
				}
			}
			ftp.logout();
			log.info("FTP登出");
			log.info("下载完成");
		} catch (Exception e) {
			log.error("异常信息"+e.getMessage());
		}
	}

}
