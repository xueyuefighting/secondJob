package com.yonyou.scf.Gateway;

import java.lang.reflect.Method;

import org.mockito.cglib.proxy.Enhancer;
import org.mockito.cglib.proxy.MethodInterceptor;
import org.mockito.cglib.proxy.MethodProxy;


public class MethodInter2 implements MethodInterceptor {

	private Enhancer enhancher = new Enhancer();
	
	public Object getProxy(Class cls) {
		enhancher.setSuperclass(cls);
		enhancher.setCallback(this);
		return enhancher.create();
	}
	
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("cglib-2拦截前");
		Object obj = arg3.invokeSuper(arg0, arg2);
		System.out.println("cglib-2拦截后");
		return obj;
	}

}
