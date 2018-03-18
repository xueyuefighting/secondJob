package com.yonyou.scf.Gateway;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvoTest implements InvocationHandler {

	private Object target;
	
	public InvoTest(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("拦截方法前");
		Object obj =  method.invoke(target, args);
		System.out.println("拦截方法后");
		return obj;
	}

}
