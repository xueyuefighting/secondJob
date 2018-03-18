package com.yonyou.scf.common.util.net;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
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
public class HttpData {
    private List<NameValuePair> list;

    private String charset;

    public HttpData(List<NameValuePair> list, String charset) {
        this.list = list;
        this.charset = charset;
    }

    public String getData() throws UnsupportedEncodingException {
        StringBuffer sb = new StringBuffer();
        // sb.append("version=2.0");
        int size = list.size();
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                NameValuePair pair = (NameValuePair) list.get(i);
                sb.append(pair.getName()).append('=').append(URLEncoder.encode(pair.getValue(), this.charset)).append('&');
            }
            return sb.substring(0, sb.length() - 1);
        }
        return "";
    }

}
