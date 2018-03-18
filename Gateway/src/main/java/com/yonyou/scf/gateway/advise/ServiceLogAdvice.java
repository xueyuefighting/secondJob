//package com.yonyou.scf.gateway.advise;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class ServiceLogAdvice {
//	
//	@Pointcut("execution(* com.yonyou.scf.gateway.service.*Service(..)) || execution(* com.yonyou.scf.gateway.controller.*Controller(..))")
//	public void logPointCut() {
//	}
//	
//
//    @Around(value = "logPointCut()")
//    public void around(ProceedingJoinPoint pjp) throws Throwable{
//        System.out.println("[Aspect2] around advise 1");
//        pjp.proceed();
//        System.out.println("[Aspect2] around advise2");
//    }
//    @AfterThrowing(value = "logPointCut()")
//    public void afterThrowing(JoinPoint joinPoint) {
//        System.out.println("[Aspect2] afterThrowing advise");
//    }
//}
