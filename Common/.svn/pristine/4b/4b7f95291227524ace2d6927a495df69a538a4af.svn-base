package com.yonyou.scf.common.util.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

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
 * 使用Socket或SSLSOcket与服务器通讯
 * 
 */
public class SocketConnection {

    private String host;

    private int port;

    private boolean ssl = false;

    private int bufferSize = 1024;

    private int connectTimeout = 25000; // 默认25秒钟
    private int soTimeout = 25000; // 默认25秒钟

    public SocketConnection(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public byte[] send(byte[] request) throws Exception {
        byte[] response;
        if (ssl) {
            Socket socket = SecurityContext.sslSocketFactory.createSocket(host, port);
            try {
                // Output
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write(request);
                outputStream.flush();
                // socket.shutdownOutput();

                // Input
                InputStream inputStream = socket.getInputStream();
                response = IoUtil.read(inputStream, bufferSize);

                // Close
                outputStream.close();
                inputStream.close();

            } catch (Exception e) {
                throw e;
            } finally {
                socket.close();
            }

        } else {
            Socket socket = new Socket();
            try {
                InetAddress inetAddress = InetAddress.getByName(host);
                InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, port);
                socket.connect(inetSocketAddress, connectTimeout);
                socket.setSoTimeout(soTimeout);

                // Output
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write(request);
                outputStream.flush();
                socket.shutdownOutput();

                // Input
                InputStream inputStream = socket.getInputStream();
                response = IoUtil.read(inputStream, bufferSize);

                // Close
                outputStream.close();
                inputStream.close();

            } catch (Exception e) {
                throw e;
            } finally {
                socket.close();
            }
        }

        return response;
    }

    public byte[] sendLengthValue(byte[] request) throws Exception {
        byte[] response;

        Socket socket = new Socket();
        try {
            InetAddress inetAddress = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, port);
            socket.connect(inetSocketAddress, connectTimeout);
            socket.setSoTimeout(soTimeout);

            // Output
            OutputStream outputStream = socket.getOutputStream();
            IoUtil.sendLengthValue(outputStream, request);
            socket.shutdownOutput();

            // Input
            InputStream inputStream = socket.getInputStream();
            response = IoUtil.readLengthValue(inputStream);

            // Close
            outputStream.close();
            inputStream.close();

        } catch (Exception e) {
            throw e;
        } finally {
            socket.close();
        }
        return response;
    }

    public boolean isSSL() {
        return ssl;
    }

    public void setSSL(boolean ssl) {
        this.ssl = ssl;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public int getSoTimeout() {
        return soTimeout;
    }

    public void setSoTimeout(int soTimeout) {
        this.soTimeout = soTimeout;
    }

    public int getBufferSize() {
        return bufferSize;
    }

    public void setBufferSize(int bufferSize) {
        this.bufferSize = bufferSize;
    }

}
