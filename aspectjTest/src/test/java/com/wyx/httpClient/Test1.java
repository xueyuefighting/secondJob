package com.wyx.httpClient;

import java.io.IOException;
import java.io.InputStream;

//import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
//import org.apache.commons.httpclient.HttpClient;
//import org.apache.commons.httpclient.HttpStatus;
//import org.apache.commons.httpclient.NameValuePair;
//import org.apache.commons.httpclient.methods.GetMethod;
//import org.apache.commons.httpclient.methods.PostMethod;
//import org.apache.commons.httpclient.params.HttpMethodParams;

public class Test1 {

	public static void main(String[] args) {
			String name = "IsSetName";
			System.out.println(name.substring("IsSet".length()));
		//post();
	}
	
//	public static void post() {
//		HttpClient client = new HttpClient();
//		PostMethod postMethod = new PostMethod("http://localhost:53007/m-cms/logAction/say.htm");
//		NameValuePair[] data = { new NameValuePair("id", "youUserName"),
//				new NameValuePair("passwd", "yourPwd") };
//		try {
//			postMethod.setRequestBody(data);
//			int status = client.executeMethod(postMethod);
//			System.out.println(status);
//			byte[] by = postMethod.getResponseBody();
//			String str  = new String(by,"utf-8");
//			System.out.println(str);
//		}catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			postMethod.releaseConnection();
//		}
//	}
//	
//	public void get() {
//		HttpClient client = new HttpClient();
//		GetMethod getMethod = new GetMethod("http://www.baidu.com/");
//		try {
//			
//			//开始恢复策略自动试着重新执行 这种原因的前提是IOException 是网络波动引起的
//			//下面是默认策略
//			//重试三次
//			getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, 
//			        new DefaultHttpMethodRetryHandler()); 
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
}
