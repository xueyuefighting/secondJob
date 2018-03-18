package com.yonyou.scf.gateway.config;
//package com.yonyou.scf.config;
//
//import java.io.IOException;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.Properties;
//
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.github.pagehelper.PageHelper;
//import com.yonyou.scf.Controller.UserBeforeLoanController;
//
///**
// * 注册MyBatis分页插件PageHelper
// * 
// * @version v.0.1
// */
//@Configuration
//public class MyBatisConfiguration {
//
//	Logger logger = Logger.getLogger(UserBeforeLoanController.class);
//
//	@Value("${server.listeningPort}")
//	private int port;
//
//	@Bean
//	public PageHelper pageHelper() {
//		System.out.println("MyBatisConfiguration.pageHelper.init()");
//		PageHelper pageHelper = new PageHelper();
//		Properties p = new Properties();
//		p.setProperty("offsetAsPageNum", "true");
//		p.setProperty("rowBoundsWithCount", "true");
//		p.setProperty("reasonable", "false");
//		pageHelper.setProperties(p);
//
//		//心跳监控线程启动
//		new Thread(new Runnable() {
//			public void run() {
//				Socket socket = null;
//				try {
//					// 创建一个监听8000端口的服务器Socket
//					ServerSocket s = new ServerSocket(port, 5);
//					logger.info("心跳监控已开启\n");
//					while (true) {
//						socket = s.accept();
//						logger.info("心跳连接已建立。端口号：" + socket.getPort());
//						new ServerThread(socket).start();
//					}
//				} catch (IOException e) {
//					logger.info("心跳监控时出现异常", e);
//				}
//			}
//		}).start();
//
//		return pageHelper;
//	}
//
//}