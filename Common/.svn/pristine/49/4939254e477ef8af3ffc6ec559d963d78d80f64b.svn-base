package com.yonyou.scf.common.util.net;

import java.util.List;

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
public abstract class HttpsConnection {

    protected String method = "POST";

    protected String outputCharset = "UTF-8";

    protected String inputCharset = "UTF-8";

    // 是否使用默认的SSLSocketFactory
    protected boolean useDefaultSSLSocketFactory = true;

    // 是否忽略服务器证书名字（Subject, DN）
    protected boolean ignoreHostname = false;

    // 是否使用代理
    protected boolean useHttpProxy = false;
    
    protected String contentType = "application/json";

    // 向服务器发送请求信息
    public abstract String send(List<NameValuePair> list) throws Exception;
    
    public abstract String send(Object obj) throws Exception;
    
    // 向服务器发送请求信息
    public abstract String send(String request) throws Exception;

    public void setMethod(String method) {
        this.method = method;
    }

    public void setUseDefaultSSLSocketFactory(boolean useDefaultSSLSocketFactory) {
        this.useDefaultSSLSocketFactory = useDefaultSSLSocketFactory;
    }

    public void setIgnoreHostname(boolean ignoreHostname) {
        this.ignoreHostname = ignoreHostname;
    }

    public void setUseHttpProxy(boolean useHttpProxy) {
        this.useHttpProxy = useHttpProxy;
    }

    public void setOutputCharset(String outputCharset) {
        this.outputCharset = outputCharset;
    }

    public void setInputCharset(String inputCharset) {
        this.inputCharset = inputCharset;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
