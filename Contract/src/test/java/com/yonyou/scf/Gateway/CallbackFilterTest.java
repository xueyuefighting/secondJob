package com.yonyou.scf.Gateway;

import java.lang.reflect.Method;

import org.mockito.cglib.proxy.CallbackFilter;

public class CallbackFilterTest implements CallbackFilter {

	@Override
	public int accept(Method method) {
		
		return 0;
	}

}
