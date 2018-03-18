//package com.yonyou.scf.Gateway;
//
//import java.io.IOException;
//import java.util.stream.Stream;
//
//import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
//import org.apache.commons.httpclient.HttpClient;
//import org.apache.commons.httpclient.methods.GetMethod;
//import org.apache.commons.httpclient.params.HttpMethodParams;
//import org.apache.commons.net.ftp.FTPClient;
//import org.apache.commons.net.ftp.FTPFile;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.yonyou.scf.contract.ftp.FTPClientPool;
//import com.yonyou.scf.contract.ftp.FTPConnectionFactory;
//import com.yonyou.scf.contract.ftp.FTPFixPoolFactory;
//import com.yonyou.scf.contract.ftp.FTPfixPool;
//import com.yonyou.scf.contract.service.TestService;
//
//@SpringBootApplication
//@RunWith(SpringJUnit4ClassRunner.class)
////@SpringApplicationConfiguration(classes= {TestService.class,
////		FTPfixPool.class,FTPFixPoolFactory.class,FTPConnectionFactory.class},locations="classpath:application.properties")
//public class FTPtest {
////	@Autowired
////	private TestService TestService;
//	
//	@Test
//	public void test() {
//		
//	}
//	
//	public static void main(String[] args) {
//		HttpClient client = new HttpClient();
//		GetMethod getMethod = new GetMethod("http://127.0.0.1:53201/userLogin/genrateVerifyNo?w=200&h=100");
//		try {
//			
//			//开始恢复策略自动试着重新执行 这种原因的前提是IOException 是网络波动引起的
//			//下面是默认策略
//			//重试三次
////			getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, 
////			        new DefaultHttpMethodRetryHandler()); 
//			int status = client.executeMethod(getMethod);
//			String str = new String(getMethod.getResponseBody(),"utf-8");
////			HttpStatus
//			System.out.println(str);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			getMethod.releaseConnection();
//		}
//	}
//}
