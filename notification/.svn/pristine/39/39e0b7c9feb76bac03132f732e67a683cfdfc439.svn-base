package com.yonyou.batch;

import org.apache.log4j.Logger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import com.yonyou.interfaces.ISchedulerProvider;
import com.yonyou.jobFactory.PersionJobFactory;

/**
 * 发送通知的调度器
 * @author zhangjinliang
 * 2017年4月13日 下午1:56:21
 * 
 */
@SpringBootApplication
@PropertySource("classpath:application.properties")
public class SchedulerProviderImpl implements ISchedulerProvider{
	
	Logger logger = Logger.getLogger(SchedulerProviderImpl.class);
	
	@Autowired
	private PersionJobFactory persionJobFactory;
	
	@Value("${notification.scheduler.config.start}")
	private boolean isStartUp;
	
	private Scheduler scheduler;
	
	public void setIsStartUp(boolean isStartUp){
		this.isStartUp = isStartUp;
	}
	public boolean getIsStartUp(){
		return this.isStartUp;
	}
	
	/* 向外提供将注册的定时任务和启动任务
	 * @see com.yonyou.interfaces.ISchedulerProvider#register(org.quartz.JobDetail, org.quartz.Trigger)
	 */
	public void register(JobDetail job,Trigger trigger) throws SchedulerException{
		
		logger.info("任务："+job.getKey()+"。启动装置："+trigger.getKey()+"注入到调度器SchedulerProvider中");
		
		prepareScheduler().scheduleJob(job, trigger);
		
	}
	
	/* 提供单例调度器
	 * @see com.yonyou.interfaces.ISchedulerProvider#prepareScheduler()
	 */
	@Bean(value="sendNotificationScheduler")
	public Scheduler prepareScheduler() throws SchedulerException{
		
		scheduler = StdSchedulerFactory.getDefaultScheduler();
		//Scheduler默认的时候是每次都实例化job  不利于springIoc 所以自定义JobFactory
		scheduler.setJobFactory(persionJobFactory);
		
		return scheduler;
	}
	
	/* 执行调度器
	 * @see com.yonyou.interfaces.ISchedulerProvider#doSendNotice()
	 */
	public void doSendNotice(){
		
		if(!returnStartFlag()) return;
		try {
			Scheduler prepareScheduler = prepareScheduler();
			prepareScheduler.start();
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}
	
	/* 
	 * 钩子方法
	 * @see com.yonyou.interfaces.ISchedulerProvider#returnStartFlag()
	 */
	public boolean returnStartFlag(){
		return isStartUp;
	}

}
