package com.yonyou.scf.common.util.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Collections;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import com.yonyou.scf.common.system.ScfEnvironment;
import com.yonyou.scf.common.util.io.IoUtil;
import com.yonyou.scf.common.util.json.JsonUtil;

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
public class HttpsConnection4FEP2 extends HttpsConnection {

	private int connectTimeoutLimit = 10 * 1000; // 默认5秒钟
	private int readTimeoutLimit = 10 * 1000; // 默认5秒钟

	private HttpsURLConnection httpsURLConnection;

	public HttpsConnection4FEP2(String spec) throws IOException {
		URL url = new URL(spec);
		httpsURLConnection = (HttpsURLConnection) url.openConnection();
	}

	// 向服务器发送请求信息
	public String send(String request, String system_ini_key) throws IOException {
		httpsURLConnection.setSSLSocketFactory(ScfEnvironment.SYS_INI_MAP.get(system_ini_key).getSslSocketFactory());
		httpsURLConnection.setHostnameVerifier(new IgnoreHostnameVerifier());

		// 默认产生的 User-Agent:Java/1.5.0_22; Content-Type:application/x-www-form-urlencoded
		httpsURLConnection.setRequestProperty("Content-Type", contentType);
		httpsURLConnection.setDoOutput(true);
		httpsURLConnection.setRequestMethod(method);
		httpsURLConnection.setConnectTimeout(connectTimeoutLimit);
		httpsURLConnection.setReadTimeout(readTimeoutLimit);

		// output
		OutputStream outputStream = httpsURLConnection.getOutputStream();
		outputStream.write(request.getBytes(outputCharset));
		outputStream.flush();
		outputStream.close();

		// input
		InputStream inputStream = httpsURLConnection.getInputStream();
		byte[] bytes = IoUtil.read(inputStream, 10240000);
		inputStream.close();

		String response = new String(bytes, inputCharset).trim();
		return response;
	}

	// 向服务器发送请求信息
	public String send(Object obj) throws IOException {

		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		requestHeaders.add("CertyficationCode", "SHA256result");
		requestHeaders.setContentType(MediaType.APPLICATION_JSON);

		String res = this.send(JsonUtil.toJSONString(obj));

		// request
		return res;
	}

	/**
	 * SCF使用
	 * 用途一，给客户端发通知
	 * 
	 * @param List<NameValuePair> list
	 * @return String
	 * @throws IOException
	 */
	public String send(List<NameValuePair> list) throws IOException {
		// request
		HttpData httpData = new HttpData(list, outputCharset);
		String request = httpData.getData();

		String response = this.send(request);
		return response;
	}

	// 向服务器发送请求信息
	public String send(String request) throws IOException {
		if (!useDefaultSSLSocketFactory) {
			httpsURLConnection.setSSLSocketFactory(SecurityContext.sslSocketFactory);
			httpsURLConnection.setSSLSocketFactory(ScfEnvironment.SYS_INI_MAP.get(ScfEnvironment.ACTIVE_FEP).getSslSocketFactory());
		}

		if (ignoreHostname) {
			httpsURLConnection.setHostnameVerifier(new IgnoreHostnameVerifier());
		}

		// 默认产生的 User-Agent:Java/1.5.0_22; Content-Type:application/x-www-form-urlencoded
		httpsURLConnection.setRequestProperty("Content-Type", contentType);
		httpsURLConnection.setDoOutput(true);
		httpsURLConnection.setRequestMethod(method);
		httpsURLConnection.setConnectTimeout(connectTimeoutLimit);
		httpsURLConnection.setReadTimeout(readTimeoutLimit);

		// output
		OutputStream outputStream = httpsURLConnection.getOutputStream();
		outputStream.write(request.getBytes(outputCharset));
		outputStream.flush();
		outputStream.close();

		// input
		InputStream inputStream = httpsURLConnection.getInputStream();
		byte[] bytes = IoUtil.read(inputStream, 10240000);
		inputStream.close();

		String response = new String(bytes, inputCharset).trim();
		return response;
	}

	public void setConnectTimeoutLimit(int connectTimeoutLimit) {
		this.connectTimeoutLimit = connectTimeoutLimit;
	}

	public void setReadTimeoutLimit(int readTimeoutLimit) {
		this.readTimeoutLimit = readTimeoutLimit;
	}

	/**
	 * 根据入参，执行发送 <br>
	 * URL、SSL等配置均在入参中初始化完成。
	 * 
	 * @param httpsURLConnection
	 * @param request
	 * @return
	 * @throws IOException
	 */
	public String send(HttpsURLConnection httpsURLConnection, String request) throws IOException {
		//        if (!useDefaultSSLSocketFactory) {
		//            httpsURLConnection.setSSLSocketFactory(SecurityContext.sslSocketFactory);
		//        }
		//
		//        if (ignoreHostname) {
		//            httpsURLConnection.setHostnameVerifier(new IgnoreHostnameVerifier());
		//        }
		//
		//        // 默认产生的 User-Agent:Java/1.5.0_22; Content-Type:application/x-www-form-urlencoded
		//        httpsURLConnection.setRequestProperty("Content-Type", contentType);
		//        httpsURLConnection.setDoOutput(true);
		//        httpsURLConnection.setRequestMethod(method);
		//        httpsURLConnection.setConnectTimeout(connectTimeoutLimit);
		//        httpsURLConnection.setReadTimeout(readTimeoutLimit);

		// output
		OutputStream outputStream = httpsURLConnection.getOutputStream();
		outputStream.write(request.getBytes(outputCharset));
		outputStream.flush();
		outputStream.close();

		// input
		InputStream inputStream = httpsURLConnection.getInputStream();
		byte[] bytes = IoUtil.read(inputStream, 10240000);
		inputStream.close();

		String response = new String(bytes, inputCharset).trim();
		return response;
	}

}
