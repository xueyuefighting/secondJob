package com.yonyou.scf.common.util.net;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import com.yonyou.scf.common.util.security.SecurityUtil;

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
public class SecurityContext {

    private static SSLContext sslContext;

    public static SSLSocketFactory sslSocketFactory;

    public static void initSSLSocketFactory(String protocol, String keyStore, String keyStoreType, String keyStorePassword, String trustKeyStore,
            String trustKeyStoreType, String trustKeyStorePassword) throws Exception {

        KeyManager[] kms = SecurityUtil.getKeyManagers(keyStore, keyStoreType, keyStorePassword);
        TrustManager[] tms = SecurityUtil.getTrustManagers(trustKeyStore, trustKeyStoreType, trustKeyStorePassword);

        sslContext = SSLContext.getInstance(protocol);
        sslContext.init(kms, tms, null);

        sslSocketFactory = sslContext.getSocketFactory();
    }

    /**
     * in use
     * @param trustKeyStore
     * @param trustKeyStorePassword
     * @throws Exception
     */
    public static void initSSLSocketFactory(String trustKeyStore, String trustKeyStorePassword) throws Exception {
        TrustManager[] tms = SecurityUtil.getTrustManagers(trustKeyStore, "JKS", trustKeyStorePassword);

        // SSLContext
        sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, tms, null);

        // SSLSocketFactory
        sslSocketFactory = sslContext.getSocketFactory();
    }

    public static void initSSLSocketFactory(String protocol) throws Exception {
        // SSLContext, protocol: TLS, SSL
        sslContext = SSLContext.getInstance(protocol);
        sslContext.init(null, null, null);

        // SSLSocketFactory
        sslSocketFactory = sslContext.getSocketFactory();
    }

    public static void setIgnoreHostname(boolean ignoreHostname) throws Exception {
        if (ignoreHostname) {
            HttpsURLConnection.setDefaultHostnameVerifier(new IgnoreHostnameVerifier());
        }
    }

}
