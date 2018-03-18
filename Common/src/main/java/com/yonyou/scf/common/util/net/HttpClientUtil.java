package com.yonyou.scf.common.util.net;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

import com.yonyou.scf.common.gateway.entity.FileRedisEntity;
import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * HTTPS/HTTP 通讯工具类，支持池连接模式
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
public class HttpClientUtil {

	static final int timeOut = 200 * 1000;

	private static CloseableHttpClient httpClient = null;

	private final static Object syncLock = new Object();

	private static void config(HttpRequestBase httpRequestBase) {
		// 设置Header等
		// httpRequestBase.setHeader("User-Agent", "Mozilla/5.0");
		// httpRequestBase
		// .setHeader("Accept",
		// "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		// httpRequestBase.setHeader("Accept-Language",
		// "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3");// "en-US,en;q=0.5");
		// httpRequestBase.setHeader("Accept-Charset",
		// "ISO-8859-1,utf-8,gbk,gb2312;q=0.7,*;q=0.7");

		// 配置请求的超时设置
		RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(timeOut).setConnectTimeout(timeOut).setSocketTimeout(timeOut).build();
		httpRequestBase.setConfig(requestConfig);
	}

	/**
	 * 获取HttpClient对象 URL格式为HTTPS://hostname:port/location/param *
	 * 
	 * @return
	 */
	public static CloseableHttpClient getHttpClient(String url) {
		String hostname = url.split("/")[2];
		int port = 80;
		if (hostname.contains(":")) {
			String[] arr = hostname.split(":");
			hostname = arr[0];
			port = Integer.parseInt(arr[1]);
		}
		if (httpClient == null) {
			synchronized (syncLock) {
				if (httpClient == null) {
					// maxTotal, maxPerRoute, maxRoute, hostname, port
					httpClient = createHttpClient(1000, 100, 20, hostname, port);
				}
			}
		}
		return httpClient;
	}

	/**
	 * 创建HttpClient对象
	 * 
	 * @return
	 */
	public static CloseableHttpClient createHttpClient(int maxTotal, int maxPerRoute, int maxRoute, String hostname, int port) {
		ConnectionSocketFactory plainsf = PlainConnectionSocketFactory.getSocketFactory();
		LayeredConnectionSocketFactory sslsf = SSLConnectionSocketFactory.getSocketFactory();

		Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory>create().register("http", plainsf).register("https", sslsf).build();
		PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager(registry);
		// 将最大连接数增加
		cm.setMaxTotal(maxTotal);
		// 将每个路由基础的连接增加
		cm.setDefaultMaxPerRoute(maxPerRoute);
		HttpHost httpHost = new HttpHost(hostname, port);
		// 将目标主机的最大连接数增加
		cm.setMaxPerRoute(new HttpRoute(httpHost), maxRoute);

		// 请求重试处理
		HttpRequestRetryHandler httpRequestRetryHandler = new HttpRequestRetryHandler() {

			public boolean retryRequest(IOException exception, int executionCount, HttpContext context) {
				if (executionCount >= 5) {// 如果已经重试了5次，就放弃
					return false;
				}
				if (exception instanceof NoHttpResponseException) {// 如果服务器丢掉了连接，那么就重试
					return true;
				}
				if (exception instanceof SSLHandshakeException) {// 不要重试SSL握手异常
					return false;
				}
				if (exception instanceof InterruptedIOException) {// 超时
					return false;
				}
				if (exception instanceof UnknownHostException) {// 目标服务器不可达
					return false;
				}
				if (exception instanceof ConnectTimeoutException) {// 连接被拒绝
					return false;
				}
				if (exception instanceof SSLException) {// SSL握手异常
					return false;
				}

				HttpClientContext clientContext = HttpClientContext.adapt(context);
				HttpRequest request = clientContext.getRequest();
				// 如果请求是幂等的，就再次尝试
				if (!(request instanceof HttpEntityEnclosingRequest)) {
					return true;
				}
				return false;
			}
		};

		CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(cm).setRetryHandler(httpRequestRetryHandler).build();

		return httpClient;
	}

	//	private static void setPostParams(HttpPost httpost, Map<String, Object> params) {
	//		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
	//		Set<String> keySet = params.keySet();
	//		for (String key : keySet) {
	//			nvps.add(new BasicNameValuePair(key, params.get(key).toString()));
	//		}
	//		try {
	//			httpost.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));
	//		} catch (UnsupportedEncodingException e) {
	//			e.printStackTrace();
	//		}
	//	}

	/**
	 * POST请求URL获取内容，用友产融用
	 * 
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public static String post(String url, Object obj) throws IOException {
		HttpPost httppost = new HttpPost(url);
		config(httppost);
		// setPostParams(httppost, params);
		CloseableHttpResponse response = null;

		StringEntity entity = new StringEntity(JsonUtil.toJSONString(obj), "utf-8");// 解决中文乱码问题
		entity.setContentEncoding("utf-8");
		entity.setContentType("application/json;charset=UTF-8");

		// HttpPost httpost = new
		// HttpPost(this.httpURLConnection.getURL().toString());
		httppost.setEntity(entity);

		try {
			response = getHttpClient(url).execute(httppost, HttpClientContext.create());
			HttpEntity entityRes = response.getEntity();

			String result = EntityUtils.toString(entityRes, "utf-8");
			EntityUtils.consume(entityRes);

			return result;
		} catch (Exception e) {
			System.out.println("url:"+url);
			System.out.println("obj:"+JsonUtil.toJSONString(obj));
			// e.printStackTrace();
			throw e;
		} finally {
			try {
				if (response != null)
					response.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * POST请求URL获取内容，用友产融用，FEP转发通知类接口专用
	 * 
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public static String post4JsonStr(String url, String jsonStr) throws IOException {
		HttpPost httppost = new HttpPost(url);
		config(httppost);
		// setPostParams(httppost, params);
		CloseableHttpResponse response = null;

		StringEntity entity = new StringEntity(jsonStr, "utf-8");// 解决中文乱码问题
		entity.setContentEncoding("utf-8");
		entity.setContentType("application/json;charset=UTF-8");

		// HttpPost httpost = new
		// HttpPost(this.httpURLConnection.getURL().toString());
		httppost.setEntity(entity);

		try {
			response = getHttpClient(url).execute(httppost, HttpClientContext.create());
			HttpEntity entityRes = response.getEntity();

			String result = EntityUtils.toString(entityRes, "utf-8");
			EntityUtils.consume(entityRes);

			return result;
		} catch (Exception e) {
			// e.printStackTrace();
			throw e;
		} finally {
			try {
				if (response != null)
					response.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * POST请求URL获取内容
	 * 
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public static String post(String url, HttpPost httppost) throws IOException {
		CloseableHttpResponse response = null;
		try {
			response = getHttpClient(url).execute(httppost, HttpClientContext.create());
			response.setHeader("Content-type", "application/json;charset=UTF-8");

			HttpEntity entity = response.getEntity();

			String result = EntityUtils.toString(entity, "utf-8");
			EntityUtils.consume(entity);
			return result;
		} catch (Exception e) {
			// e.printStackTrace();
			throw e;
		} finally {
			try {
				if (response != null)
					response.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * GET请求URL获取内容
	 * 
	 * @param url
	 * @return
	 */
	public static String get(String url) {
		HttpGet httpget = new HttpGet(url);
		config(httpget);
		CloseableHttpResponse response = null;
		try {
			response = getHttpClient(url).execute(httpget, HttpClientContext.create());
			HttpEntity entity = response.getEntity();
			String result = EntityUtils.toString(entity, "utf-8");
			EntityUtils.consume(entity);
			return result;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (response != null)
					response.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * 用于图形验证码、图片预览等
	 * 
	 * @param url
	 * @return  byte[] 
	 */
	public static byte[] get2byte(String url) {
		HttpGet httpget = new HttpGet(url);
		config(httpget);
		CloseableHttpResponse response = null;
		try {

			response = getHttpClient(url).execute(httpget, HttpClientContext.create());

			HttpEntity entity = response.getEntity();
			byte[] result = EntityUtils.toByteArray(entity);

			EntityUtils.consume(entity);

			return result;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (response != null)
					response.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * 兼容文件下载（自动保存）、及图形验证码、图片预览
	 * 
	 * @param url
	 * @return String[] ： finalName, byte[] of Stream , contentType, contentDisposition, transferEncoding
	 */
	public static String[] get2StringArray(String url) {
		HttpGet httpget = new HttpGet(url);
		config(httpget);
		CloseableHttpResponse response = null;
		try {

			response = getHttpClient(url).execute(httpget, HttpClientContext.create());

			String originalFilename = "";
			String contentType = "";
			String contentDisposition = "";
			String transferEncoding = "";
			for (Header h : response.getAllHeaders()) {
				//System.out.println("Healder : " + h.getName() + ":" + h.getValue());

				if ("OriginalFilename".equals(h.getName())) {
					originalFilename = new String(h.getValue().getBytes("ISO8859-1"), "UTF-8");
					//System.out.println("OriginalFilename：" + originalFilename);
				} else if ("Content-Type".equals(h.getName())) {
					contentType = h.getValue();
					//System.out.println("Content-Type：" + contentType);
				} else if ("Content-Disposition".equals(h.getName())) {
					contentDisposition = new String(h.getValue().getBytes("ISO8859-1"), "UTF-8");
					//System.out.println("Content-Disposition：" + contentDisposition);
					//contentDisposition="attachment;fileName="+originalFilename;
					//System.out.println("Content-Disposition：" + contentDisposition);
				} else if ("Transfer-Encoding".equals(h.getName())) {
					transferEncoding = h.getValue();
					//System.out.println("Transfer-Encoding：" + transferEncoding);
				}
			}

			HttpEntity entity = response.getEntity();
			byte[] result = EntityUtils.toByteArray(entity);
			//System.out.println("byte size:"+result.length);
			EntityUtils.consume(entity);
			FileRedisEntity fes = new FileRedisEntity();
			fes.setFile(result);
			//return new String[] { originalFilename, new String(result, "UTF-8"), contentType, contentDisposition, transferEncoding };
			return new String[] { originalFilename, JsonUtil.toJSONString(fes), contentType, contentDisposition, transferEncoding };
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (response != null)
					response.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

//	public static void main(String[] args) {
//		// URL列表数组
//		String[] urisToGet = {};
//
//		long start = System.currentTimeMillis();
//		try {
//			int pagecount = urisToGet.length;
//			ExecutorService executors = Executors.newFixedThreadPool(pagecount);
//			CountDownLatch countDownLatch = new CountDownLatch(pagecount);
//			for (int i = 0; i < pagecount; i++) {
//				HttpGet httpget = new HttpGet(urisToGet[i]);
//				config(httpget);
//				// 启动线程抓取
//				executors.execute(new GetRunnable(urisToGet[i], countDownLatch));
//			}
//			countDownLatch.await();
//			executors.shutdown();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("线程" + Thread.currentThread().getName() + "," + System.currentTimeMillis() + ", 所有线程已完成，开始进入下一步！");
//		}
//
//		long end = System.currentTimeMillis();
//		System.out.println("consume -> " + (end - start));
//	}

	static class GetRunnable implements Runnable {

		private CountDownLatch countDownLatch;
		private String url;

		public GetRunnable(String url, CountDownLatch countDownLatch) {
			this.url = url;
			this.countDownLatch = countDownLatch;
		}

		@Override
		public void run() {
			try {
				System.out.println(HttpClientUtil.get(url));
			} finally {
				countDownLatch.countDown();
			}
		}
	}
}
