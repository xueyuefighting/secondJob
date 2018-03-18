package com.yonyou.scf.Gateway;

import org.mockito.cglib.proxy.Callback;
import org.mockito.cglib.proxy.CallbackFilter;
import org.mockito.cglib.proxy.Enhancer;
import org.mockito.cglib.proxy.NoOp;

public class Enhancertest {
	
	public Object getProxy(Class cls,Callback[] cb,CallbackFilter cf) {
		Enhancer enhancher = new Enhancer();
		enhancher.setSuperclass(cls);
		enhancher.setCallbacks(cb);
		enhancher.setCallbackFilter(cf);
		return enhancher.create();
	}
	public static void main(String[] args) {
		Enhancertest enhancertest = new Enhancertest();
		CallbackFilterTest callbackFilterTest = new CallbackFilterTest();
		InvocationImpl invocationImpl = (InvocationImpl)enhancertest
					.getProxy(InvocationImpl.class, new Callback[] {
							new MethodInter2(),
							new MethodInter()
//							NoOp.INSTANCE
							},
							callbackFilterTest);
		invocationImpl.say();
	}

}
