package com.yonyou.dbProvider;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.yonyou.interfaces.IDBSourceProvider;

/**
 * 暂时没有用到
 * 代理IDBSourceProvider接口
 * @author zhangjinliang
 * 2017年4月13日 下午2:32:53
 * 
 */
public abstract class AbstractDBSourceProviderBuilder{
	
	private InvocationHandler h;
	
	
	
	public InvocationHandler getH() {
		return h;
	}



	public void setH(InvocationHandler h) {
		this.h = h;
	}
	
	
	
	public AbstractDBSourceProviderBuilder() {
	}



	public AbstractDBSourceProviderBuilder(InvocationHandler h) {
		this.h = h;
	}



	public IDBSourceProvider<?> getObject(){
		
		return (IDBSourceProvider<?>)Proxy.newProxyInstance(IDBSourceProvider.class.getClassLoader(), IDBSourceProvider.class.getInterfaces(), h);
	}
}
