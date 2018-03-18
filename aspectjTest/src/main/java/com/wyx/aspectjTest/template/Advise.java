package com.wyx.aspectjTest.template;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
@Configuration
@Aspect
public class Advise {
	
	//@After("execution(* com.wyx.aspectjTest.template.TemplateFactory.buildResponseTemplate(..))")
	//@After("execution(* com.wyx.aspectjTest.service.Proto.say(..))")
	@AfterThrowing(value="@annotation(com.wyx.aspectjTest.template.AspectjAnno)",throwing="error")//这个是全局扫描，只要标注这个注解的，就会被拦截。优点方便，缺点，全包扫描
	public void afterHello(JoinPoint jp, Throwable error) {
		System.out.println("interrupt successfully!，say hello...");
		System.out.println("参数比较"+jp.getArgs()[0] instanceof String);
		System.out.println("归属类:"+jp.getTarget().getClass().getName());
		System.out.println("method类:"+jp.getSignature().getName());
		System.out.println("getDeclaringTypeName类:"+jp.getSignature().getDeclaringTypeName());
		System.out.println("getDeclaringType类:"+jp.getSignature().getDeclaringType());
	}
	
}
