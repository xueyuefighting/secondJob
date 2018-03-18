/**
 * <pre>
 * Copyright Notice:
 *    Copyright (c) 2005-2009 China Financial Certification Authority(CFCA)
 *    20-3, Pingyuanli, Caishikou South Street, Xuanwu District, Beijing ,100054, China
 *    All rights reserved.
 * 
 *    This software is the confidential and proprietary information of
 *    China Financial Certification Authority (&quot;Confidential Information&quot;).
 *    You shall not disclose such Confidential Information and shall use 
 *    it only in accordance with the terms of the license agreement you 
 *    entered into with CFCA.
 * </pre>
 */
package com.yonyou.scf.common.util.net;

import java.net.URLConnection;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

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
 * 不检查服务器证书DN的HostnameVerifier<br>
 * 如果服务器证书的CN不是自己的域名，使用HttpsURLConnection会出现异常<br>
 * 注意：服务器证书的CN不能用IP表示，否则出现异常：NO subject alternative names present<br>
 * 
 * @see URLConnection
 * 
 */
public class IgnoreHostnameVerifier implements HostnameVerifier {

    public boolean verify(String arg0, SSLSession arg1) {
        return true;
    }

}
