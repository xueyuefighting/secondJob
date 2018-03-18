package com.wyx.aspectjTest.service;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.wyx.aspectjTest.template.AspectjAnno;

@Service
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode=ScopedProxyMode.TARGET_CLASS)
public class Proto {
	private AtomicInteger i;
	@AspectjAnno
	public void say(String name) throws Exception {
		System.out.println("SCOPE_PROTOTYPE is configured successfully!"+i.incrementAndGet()+"....name:"+name);
		throw new Exception("我已经被拦截");
	}
	
	public Proto() {
		 i = new AtomicInteger(0);
		System.out.println("init....");
	}

}
