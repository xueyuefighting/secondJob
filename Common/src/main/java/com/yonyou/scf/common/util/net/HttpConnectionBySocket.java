package com.yonyou.scf.common.util.net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;

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
public class HttpConnectionBySocket {

    public static final int DEFAULT_HTTP_PORT = 80;

    public static final int DEFAULT_HTTPS_PORT = 443;

    private String outputCharset = "UTF-8";
    private String inputCharset = "UTF-8";

    private String spec;

    public HttpConnectionBySocket(String url) {
        this.spec = url;
    }

    public String send(HttpData httpData) throws Exception {

        String response;

        URL url = new URL(spec);

        // host
        String host = url.getHost();

        // port
        int port = url.getPort();

        // protocol
        String protocol = url.getProtocol();

        if (port == -1) {
            if ("https".equals(protocol)) {
                port = DEFAULT_HTTPS_PORT;
            } else if ("http".equals(protocol)) {
                port = DEFAULT_HTTP_PORT;
            } else {
                throw new Exception("Protocol error, protocol must be https or http.");
            }
        }

        // Content
        String content = httpData.getData();

        StringBuffer sb = new StringBuffer();
        sb.append("POST ").append(spec).append(" HTTP/1.1\r\n");
        sb.append("Content-Type: text/html; charset=UTF-8\r\n");
        sb.append("Content-Length: ").append(content.length()).append("\r\n");
        sb.append("\r\n");
        sb.append(content);
        sb.append("\r\n");

        String request = sb.toString();

        // debug
        System.out.println(request);

        if ("https".equals(protocol)) {
            Socket socket = SecurityContext.sslSocketFactory.createSocket(host, port);

            // output
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(request.getBytes(outputCharset));
            outputStream.flush();
            // socket.shutdownOutput();

            // input
            InputStream inputStream = socket.getInputStream();

            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;

            for (int i = 0; i < 10; i++) {
                line = bufferedReader.readLine();
                System.out.println(line);
                if ("".equals(line)) {
                    System.out.println("k");
                    break;
                }
            }
            byte[] bytes = new byte[525];
            inputStream.read(bytes);
            response = new String(bytes);
            System.out.println(response);

            // close
            outputStream.close();
            inputStream.close();
            socket.close();
        } else {
            Socket socket = new Socket(host, port);

            // output
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(request.getBytes(outputCharset));
            outputStream.flush();
            socket.shutdownOutput();

            // input
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = IoUtil.read(inputStream, 1024);
            response = new String(bytes, inputCharset).trim();

            // close
            outputStream.close();
            inputStream.close();
            socket.close();
        }

        return response;
    }

    public void setOutputCharset(String outputCharset) {
        this.outputCharset = outputCharset;
    }

    public void setInputCharset(String inputCharset) {
        this.inputCharset = inputCharset;
    }

}
