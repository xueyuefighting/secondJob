package com.wyx.aspectjTest.server;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TBinaryProtocol.Factory;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.AbstractServerArgs;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;
import org.apache.thrift.transport.TTransportFactory;

import com.wyx.aspectjTest.iml.HelloWorldServiceIml;
import com.wyx.aspectjTest.service.HelloWorldService;

public class TS {
	
	public static TServer initServer(Class<?> cs) throws TTransportException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println("初始化服务器....");
		TProcessor processor = 
				new HelloWorldService.Processor<HelloWorldService.Iface>(new HelloWorldServiceIml());
		
		TServerSocket transport = new TServerSocket(8379);
		
		TTransportFactory transportFactory = new TFramedTransport.Factory();
		
		Factory factory = new TBinaryProtocol.Factory();
		
		TServer.Args tArgs = new TServer.Args(transport);
		
		tArgs.protocolFactory(factory);
		tArgs.transportFactory(transportFactory);
		tArgs.processor(processor);
		Constructor<TServer> cons = (Constructor<TServer>) cs.getConstructor(AbstractServerArgs.class);
		System.out.println("获取构造函数："+cons.getName());
		return cons.newInstance(tArgs);
	}
	
	public void startServer() throws TTransportException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println("开始加载服务器....");
		TServer server = initServer(TSimpleServer.class);
		System.out.println("加载结束...");
		System.out.println("开始启动...");
		 server.serve();
		 System.out.println("启动成功...");
	}
	
	public static void main(String[] args) {
		TS ts = new TS();
		try {
			
			ts.startServer();
		} catch (TTransportException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
