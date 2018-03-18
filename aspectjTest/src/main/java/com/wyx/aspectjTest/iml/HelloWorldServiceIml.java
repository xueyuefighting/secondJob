package com.wyx.aspectjTest.iml;

import org.apache.thrift.TException;

import com.wyx.aspectjTest.service.HelloWorldService.Iface;

public class HelloWorldServiceIml implements Iface {

	@Override
	public String sayHello(String username) throws TException {
		
		return "hello! my first thrift.";
	}

}
