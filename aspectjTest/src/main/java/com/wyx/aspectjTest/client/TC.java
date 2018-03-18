package com.wyx.aspectjTest.client;

import java.nio.ByteBuffer;
import java.nio.channels.Channel;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import com.wyx.aspectjTest.service.HelloWorldService;
import com.wyx.aspectjTest.service.HelloWorldService.Client;

import io.netty.buffer.ByteBuf;

public class TC{
	
public static void main(String[] args) {
	ByteBuf
	Channel
	try {
        TTransport transport = new TFramedTransport(new TSocket("127.0.0.1", 8379, 5000));
        // 协议要和服务端一致
        TProtocol protocol = new TBinaryProtocol(transport);

        Client client = new HelloWorldService.Client(protocol);
        
        transport.open();
        System.out.println("向服务器发送neo");
        String string = client.sayHello("Neo");
        System.out.println("接到服务器返回的："+string);

        transport.close();

    } catch (TTransportException e) {
        e.printStackTrace();
    } catch (TException e) {
        e.printStackTrace();
    }

}
}
