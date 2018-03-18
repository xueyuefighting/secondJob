package com.yonyou;


import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@ContextConfiguration(classes = SchedulerProvider.class)
public class RunServer {
	public static void main(String[] args) throws SchedulerException {
		ConfigurableApplicationContext cac = SpringApplication.run(RunServer.class, args);
		
		//启动定时发送通知
		((Scheduler)cac.getBean("sendNotificationScheduler")).start();
	}
	
}
