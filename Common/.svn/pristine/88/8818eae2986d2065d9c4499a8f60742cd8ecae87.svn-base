package com.yonyou.scf.common.util.security;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import com.yonyou.scf.common.util.StringUtil;
import com.yonyou.scf.common.util.io.IoUtil;

/**
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu      2017-03-16  Create this file
 * 
 * 
 * </pre>
 * 
 * 使用Socket与Signature Service通讯进行字符串签名
 * 
 */
public class SocketSigner implements Signer {
    private String host;
    private int port;

    public SocketSigner(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public String sign(String message) throws Exception {
        Socket socket = new Socket(host, port);

        // output
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(message.getBytes(StringUtil.DEFAULT_CHARSET));
        outputStream.flush();
        socket.shutdownOutput();

        // input
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = IoUtil.read(inputStream, 1024);

        // close
        outputStream.close();
        inputStream.close();
        socket.close();

        return new String(bytes, StringUtil.DEFAULT_CHARSET).trim();
    }

    public byte[] sign(byte[] bytes) throws Exception {
        Socket socket = new Socket(host, port);

        // output
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(bytes);
        outputStream.flush();
        socket.shutdownOutput();

        // input
        InputStream inputStream = socket.getInputStream();
        byte[] signature = IoUtil.read(inputStream, 1024);

        // close
        outputStream.close();
        inputStream.close();
        socket.close();

        return signature;
    }

}
