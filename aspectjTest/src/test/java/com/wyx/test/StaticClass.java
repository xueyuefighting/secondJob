package com.wyx.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import org.springframework.http.HttpStatus;

public class StaticClass {
		
	public static void main(String[] args) {
		Supplier supplier = ()->"123";
		System.out.println(supplier.get());
		ThreadLocal<Integer> tl = ThreadLocal.withInitial(()->{return new Integer(8);});
	    System.out.println(tl.get());
	    System.out.println(tl.get());

//		try {
//			ServerSocket server = new ServerSocket(10101);
//			System.out.println("服务器启动");
//			while(true) {
//				Socket socket = server.accept();
//				System.out.println("有客户端连接");
//				handle(socket);
//				System.out.println("处理结束");
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	private static void handle(Socket socket) {
			byte[] bytes = new byte[2048];
			try {
				InputStream is = socket.getInputStream();
				while(true) {
					int resultInt = is.read(bytes);
					if(resultInt<0) {
						break;
					}
					System.out.println("接受到客户端请求内容"+new String(bytes)+"..length:"+bytes.length);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
}
