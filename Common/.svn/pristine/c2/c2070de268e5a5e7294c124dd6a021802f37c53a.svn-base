package com.yonyou.scf.common.util.net;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;

import com.yonyou.scf.common.util.io.IoUtil;

/**
 * 
 * 此方法不应被使用！！
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
@Deprecated
public class HttpsConnectionByHttpClient extends HttpsConnection {

    private String uri;

//    private String hostname;
//    private int port;
//
//    private String userName;
//    private String password;

    public HttpsConnectionByHttpClient(String uri) {
        this.uri = uri;
    }

    public HttpsConnectionByHttpClient(String uri, String hostname, int port, String userName, String password) {
//        this.uri = uri;
//        this.hostname = hostname;
//        this.port = port;
//        this.userName = userName;
//        this.password = password;
    }

    // 向服务器发送请求信息
    public String send(List<NameValuePair> list) throws IOException {
        // request
        HttpData httpData = new HttpData(list, outputCharset);
        String request = httpData.getData();

        String response = this.send(request);
        return response;
    }
    
    /**
     * 
     */
    public String send(Object obj) throws IOException {
        // request
        String response = this.send("");
        return response;
    }
    
    // 向服务器发送请求信息
    public String send(String request) throws IOException {
        //DefaultHttpClient httpClient = new DefaultHttpClient();
        CloseableHttpClient httpClient = HttpClients.createDefault();
//        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();

        // TODO
        if (useHttpProxy) {
//            // 使用代理
//            HttpHost httpProxy = new HttpHost(hostname, port);
//            CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
//            credentialsProvider.setCredentials(new AuthScope(hostname, port), new UsernamePasswordCredentials(userName, password));
//
//            httpClient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, httpProxy);
//            httpClient.setCredentialsProvider(credentialsProvider);
        }

        //X509HostnameVerifier x509HostnameVerifier;
//        HostnameVerifier x509HostnameVerifier = null;
//        if (ignoreHostname) {
//            //x509HostnameVerifier = SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER;
//            x509HostnameVerifier = new NoopHostnameVerifier();
//        } else {
//            //x509HostnameVerifier = SSLSocketFactory.STRICT_HOSTNAME_VERIFIER;
//            x509HostnameVerifier = new DefaultHostnameVerifier();
//        }

        // TODO
        if (!useDefaultSSLSocketFactory) {
//            //SSLSocketFactory sslSocketFactory = new SSLSocketFactory(SecurityContext.sslContext, x509HostnameVerifier);
//            SSLConnectionSocketFactory sslSocketFactory = new SSLConnectionSocketFactory(SecurityContext.sslContext, x509HostnameVerifier);
//
//            URL url = new URL(uri);
//            int port = url.getPort();
//            if (port == -1) {
//                port = 443;
//            }
//
//            Scheme scheme = new Scheme("https", port, sslSocketFactory);
//            DefaultSchemePortResolver scheme1 = new DefaultSchemePortResolver();
//            //Registry scheme2 = new Registry();
//            HttpClientConnectionManager connManager = new BasicHttpClientConnectionManager(scheme1, sslSocketFactory); 
//            httpClientBuilder.setConnectionManager(connManager);
//            //getConnectionManager().getSchemeRegistry().register(scheme);
        }

        HttpPost httpPost = new HttpPost(uri);

        Header header = new BasicHeader("Content-Type", "application/x-www-form-urlencoded");
        httpPost.addHeader(header);

        //StringEntity stringEntity = new StringEntity(request, "application/x-www-form-urlencoded", outputCharset);
        
		StringEntity stringEntity = new StringEntity(request, "utf-8");// 解决中文乱码问题
		stringEntity.setContentEncoding("UTF-8");
		stringEntity.setContentType("application/x-www-form-urlencoded");
		
        httpPost.setEntity(stringEntity);

        // execute request
        HttpResponse httpResponse = httpClient.execute(httpPost);

        HttpEntity httpEntity = httpResponse.getEntity();

        InputStream inputStream = httpEntity.getContent();

        String response = new String(IoUtil.read(inputStream, 1024), inputCharset).trim();

        inputStream.close();

        return response;
    }

}
