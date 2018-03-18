package com.yonyou.scf.common.util.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.net.ssl.HttpsURLConnection;

import com.yonyou.scf.common.util.io.IoUtil;

/**
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
public class HttpsConnection4FEP {

	private int connectTimeoutLimit = 10 * 1000; // 默认5秒钟
	private int readTimeoutLimit = 10 * 1000; // 默认5秒钟

	private String method = "POST";
	private String outputCharset = "UTF-8";
	private String inputCharset = "UTF-8";

	private HttpsURLConnection httpsURLConnection;

	public HttpsConnection4FEP(HttpsURLConnection conn) throws IOException {
		httpsURLConnection = conn;
	}

	/**
	 * 对外发送消息的主方法
	 */
	public String send(String request) throws IOException {

		httpsURLConnection.connect();
		
		// output
		OutputStream outputStream = httpsURLConnection.getOutputStream();
		outputStream.write(request.getBytes(outputCharset));
		outputStream.flush();
		outputStream.close();

		// input
		InputStream inputStream = httpsURLConnection.getInputStream();
		byte[] bytes = IoUtil.read(inputStream, 10240000);
		inputStream.close();
		
		httpsURLConnection.disconnect();
		httpsURLConnection=null;

		String response = new String(bytes, inputCharset).trim();
		return response;
	}

}
