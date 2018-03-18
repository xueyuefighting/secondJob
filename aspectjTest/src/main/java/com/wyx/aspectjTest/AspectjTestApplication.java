package com.wyx.aspectjTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication//(scanBasePackages= {"com.wyx.aspectjTest.service","com.wyx.aspectjTest.config"})
@EnableAspectJAutoProxy
public class AspectjTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AspectjTestApplication.class, args);
		System.out.println("启动成功");
	}
}
