package com.bjdreamtech.dmt.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

public class HttpClientLCCB {
	
	/**
	 * @param str
	 * @param m1
	 * @param m2
	 * @param url
	 * @return
	 * @throws Exception
	 * 多参数方法
	 */
	@SuppressWarnings("deprecation")
	public static Map<String, Map<String, Object>> sendPostMessage(String str ,Map<String,Object> m1,List<Map<String,Object>> m2,String url ) throws Exception{
		Map<String, Map<String, Object>> resMap = new HashMap<String, Map<String, Object>>();
		Map<Object,Object> chgMap = new HashMap<Object,Object>();
		chgMap.put("k1", str);
		chgMap.put("k2", m1);
		chgMap.put("k3", m2);
        int retcood = 0;
		String status = "";
		HttpClient httpClient = new HttpClient();
		PostMethod post = new PostMethod(url);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try
		  {
		   ObjectOutputStream oos = new ObjectOutputStream(baos);
		   oos.writeObject(chgMap);
		  }
		  catch (Throwable e)
		  {
		   e.printStackTrace();
		  }
		  byte[] data = baos.toByteArray();
		  ByteArrayInputStream bis = new ByteArrayInputStream(data);
		  post.setRequestBody(bis);
		
		
		post.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "utf-8");
		try {
			retcood = httpClient.executeMethod(post);
			System.out.println(retcood);
				if(retcood == HttpStatus.SC_OK){
					//获取返回状态
					status = new String(post.getResponseBody(), "utf-8");
				}
				
			try {
				InputStream resStream = post.getResponseBodyAsStream(); 
				
				ObjectInputStream ois = new ObjectInputStream(resStream);
			    resMap = (HashMap) ois.readObject();
			    System.out.println(resMap.size());
				
			} catch (Exception e) {
			}
		} catch (HttpException e) {
		} catch (IOException e) {
		}
		
		return resMap;
}
	
	/**
	 * @param str
	 * @param m1
	 * @param url
	 * @return
	 * @throws Exception
	 * 两个参数方法
	 */
	@SuppressWarnings("deprecation")
	public static   Map<String, Map<String, Object>>  sendPostMessage(String str ,Map<String,Object> m1,String url ) throws Exception{
		Map<String, Map<String, Object>> resMap = new HashMap<String, Map<String, Object>>();
		Map<Object,Object> chgMap = new HashMap<Object,Object>();
		chgMap.put("k1", str);
		chgMap.put("k2", m1);
         int retcood = 0;
		String status = "";
		HttpClient httpClient = new HttpClient();
		PostMethod post = new PostMethod(url);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try
		  {
		   ObjectOutputStream oos = new ObjectOutputStream(baos);
		   oos.writeObject(chgMap);
		  }
		  catch (Throwable e)
		  {
		   e.printStackTrace();
		  }
		  byte[] data = baos.toByteArray();
		  ByteArrayInputStream bis = new ByteArrayInputStream(data);
		  post.setRequestBody(bis);
		
		
		post.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "utf-8");
		try {
			retcood = httpClient.executeMethod(post);
			System.out.println(retcood);
				if(retcood == HttpStatus.SC_OK){
					//获取返回状态
					status = new String(post.getResponseBody(), "utf-8");
				}
			try {
				InputStream resStream = post.getResponseBodyAsStream(); 
				ObjectInputStream ois = new ObjectInputStream(resStream);
				resMap = (HashMap) ois.readObject();
			    System.out.println(resMap.size());
				
			} catch (Exception e) {
			}
		} catch (HttpException e) {
		} catch (IOException e) {
		}
		
		return resMap;
}
	
	
	public static void main(String [] args) throws Exception{

		Map<String,Object> m1= new HashMap<String,Object>();
		m1.put("lccb_dt","20170405143702064");
		m1.put("trmSeqNumLccb", "201704051437020647781004836047");
		m1.put("hyBusiNum", "0431");
		sendPostMessage("f644" ,m1,"http://localhost:9101/Demo/lccbService.do");
	}
	
}
