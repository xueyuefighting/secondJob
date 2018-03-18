//package com.wyx.test;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.wyx.aspectjTest.AspectjTestApplication;
//import com.wyx.aspectjTest.service.BeanFactory;
//import com.wyx.aspectjTest.service.Proto;
//import com.wyx.aspectjTest.template.Advise;
//import com.wyx.aspectjTest.template.AspectjAnno;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootApplication
//@SpringApplicationConfiguration({AspectjTestApplication.class,Advise.class})
//public class Test {
//	
//	@Autowired
//	private Proto proto;
//	
//	@org.junit.Test
//	public void say() throws InterruptedException, IOException {
//		Thread t1 = new Thread(()->{ 
//			try {
//				proto.say("t1");
//			} catch (Exception e) {
//			}
//		}) ;
//		Thread t2 = new Thread(()->{ 
//			try {
//				proto.say("t2");
//			} catch (Exception e) {
//			}
//		}) ;
//		Thread t3 = new Thread(()->{ 
//			try {
//				proto.say("t3");
//			} catch (Exception e) {
//			}
//		}) ;
//		t1.start();
//		t2.start();
//		t3.start();
//		t1.join();
//		t2.join();
//		t3.join();
//		ClassPathResource classPathResource = new ClassPathResource("imgError.png");
//		
//		
//		System.out.println(classPathResource.getFile().exists());
////		beanFactory.build().say();
////		beanFactory.build().say();
////		beanFactory.build().say();
//	}
//}
