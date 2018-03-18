package com.bjdreamtech.dmt.util;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

public class Mail {
	
public static void main(String [] args){
	
	String username ="100098";
	String pwd = "hVI4F4G6";
	String extnum ="C000001";
	String url1="http://api.app2e.com/smsBigSend.api.php";
	String url2 ="http://118.178.117.163/chif10/mtsms";
	//方法调用
	HttpClient httpClient = new HttpClient();
	
	//方法地址
	PostMethod post = new PostMethod(url2);
	//编码转换
	post.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET,"UTF-8");
	//添加密码
	post.addParameter("pwd", pwd);
	//添加账号
	post.addParameter("username",username);
	//行业号码
//	post.addParameter("extnum", extnum);
	//
	post.addParameter("p","13240713626");
	post.addParameter("msg","[用友供应链],test,[用友供应链]");
	
	int retcode=0;
	//发送短信
	try {
		//发送短信
	       retcode =	httpClient.executeMethod(post);
	       System.out.println(retcode);
		//状态
			if(retcode==HttpStatus.SC_OK){
				//获取返回状态
			String	status = new String(post.getResponseBody(),"UTF-8");
			System.out.println(status);
			}
	} catch (HttpException e) {
	} catch (IOException e) {
	}finally {
		//关闭连接
		post.releaseConnection();
	}
	
	
	
	
}
	
	

}



