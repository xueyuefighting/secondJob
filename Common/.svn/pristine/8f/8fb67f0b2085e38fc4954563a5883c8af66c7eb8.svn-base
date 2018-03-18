package com.yonyou.scf.common.util.net;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.yonyou.scf.common.util.io.IoUtil;
import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 此方法用于API向FEP发消息 <br>
 * 模块间调用请用<h3>HttpClientUtil.post</h3> <br>
 * 
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu      2017-03-16  Create this file
 * 
 * </pre>
 * 
 */
public class HttpConnection {

    private String method = "POST";

    private int connectTimeoutLimit = 10*1000; // 默认5秒钟
    private int readTimeoutLimit = 10*1000; // 默认5秒钟

    private String outputCharset = "UTF-8";
    private String inputCharset = "UTF-8";
    private String contentType = "application/json;charset=UTF-8";

    private HttpURLConnection httpURLConnection;

    public HttpConnection(String spec) throws IOException {
        URL url = new URL(spec);
        httpURLConnection = (HttpURLConnection) url.openConnection();
    }

    /**
     * 此方法有在用
     * 
     * 用途一，给客户端发通知
     * 
     * @param List<NameValuePair> list
     * @return String
     * @throws IOException
     */
    public String send(List<NameValuePair> list) throws IOException {
        // HttpData
        HttpData httpData = new HttpData(list, outputCharset);
        String request = httpData.getData();

        String response = this.send(request);
        return response;
    }

    /**
     * 此方法有在用
     * 
     * @param obj
     * @return
     * @throws Exception
     */
    public String send (Object obj) throws Exception {
    	
//    	DefaultHttpClient httpclient = new DefaultHttpClient();
    	CloseableHttpClient httpclient = HttpClients.createDefault();
    	String body = "{}";
        try {
        	        
            StringEntity entity = new StringEntity(JsonUtil.toJSONString(obj),"utf-8");//解决中文乱码问题    
            entity.setContentEncoding("UTF-8");    
            entity.setContentType("application/json");
            
            HttpPost httpost = new HttpPost(this.httpURLConnection.getURL().toString());
            httpost.setEntity(entity);
            HttpResponse response1 = httpclient.execute(httpost);
            response1.setHeader("Content-type", "application/json;charset=UTF-8");
            
            HttpEntity entityRes = response1.getEntity();
//            System.out.println(response1.getStatusLine().getStatusCode());
            body = EntityUtils.toString(entityRes,"UTF8");
//            System.out.println(body);
        } finally {
        	httpclient.close();
//            httpclient.getConnectionManager().shutdown();
        }
		return body;
    }
    
    public String send (Object obj,CloseableHttpClient httpclient) throws Exception {
//    	DefaultHttpClient httpclient = new DefaultHttpClient();
    	String body = "{}";
        try {
            StringEntity entity = new StringEntity(JsonUtil.toJSONString(obj),"utf-8");//解决中文乱码问题    
            entity.setContentEncoding("UTF-8");    
            entity.setContentType("application/json");
            
            HttpPost httpost = new HttpPost(this.httpURLConnection.getURL().toString());
            httpost.setEntity(entity);
            httpost.setHeader("HEADER", JsonUtil.toJSONString(obj));
            
            HttpResponse response1 = httpclient.execute(httpost);
            response1.setHeader("Content-type", "application/json;charset=UTF-8");
            
            HttpEntity entityRes = response1.getEntity();
//            System.out.println(response1.getStatusLine().getStatusCode());
            body = EntityUtils.toString(entityRes,"UTF8");
//            System.out.println(body);
        } finally {
        	httpclient.close();
//            httpclient.getConnectionManager().shutdown();
        }
		return body;
    }
    
    // 向服务器发送请求信息
    private String send(String request) throws IOException {
        // 默认产生的 User-Agent:Java/1.5.0_22; Content-Type:application/x-www-form-urlencoded
        httpURLConnection.setRequestProperty("Content-Type", contentType);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestMethod(method);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setConnectTimeout(connectTimeoutLimit);
        httpURLConnection.setReadTimeout(readTimeoutLimit);

        // output
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(request.getBytes(outputCharset));
        outputStream.flush();
        outputStream.close();

        InputStream inputStream = httpURLConnection.getInputStream();
        byte[] bytes = IoUtil.read(inputStream, 1024);
        inputStream.close();

        String response = new String(bytes, inputCharset).trim();
        return response;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getConnectTimeoutLimit() {
        return connectTimeoutLimit;
    }

    public void setConnectTimeoutLimit(int connectTimeoutLimit) {
        this.connectTimeoutLimit = connectTimeoutLimit;
    }

    public int getReadTimeoutLimit() {
        return readTimeoutLimit;
    }

    public void setReadTimeoutLimit(int readTimeoutLimit) {
        this.readTimeoutLimit = readTimeoutLimit;
    }

    public String getOutputCharset() {
        return outputCharset;
    }

    public void setOutputCharset(String outputCharset) {
        this.outputCharset = outputCharset;
    }

    public String getInputCharset() {
        return inputCharset;
    }

    public void setInputCharset(String inputCharset) {
        this.inputCharset = inputCharset;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
