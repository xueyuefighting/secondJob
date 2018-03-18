package com.yonyou.config;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yonyou.interfaces.ISchedulerWork;


/**
 * 调度任务注册器
 * @author zhangjinliang
 * 2017年4月13日 上午11:52:27
 * 
 */
@Configuration
public class SchedulerWorkRegister {
	
	Logger logger = Logger.getLogger(SchedulerWorkRegister.class);
	
	/*
	 * 获取容器中的调度器
	 */
	@Autowired
	private Scheduler sendNotificationScheduler;
	
	/*
	 * 获取spring的上下文
	 */
	@Autowired  
    private ApplicationContext context;
	
	/**
	 * 注册已经创建并实现ISchedulerWork接口的所有类，并将他们注册到定时调度器重
	 * @return 返回所有实现ISchedulerWork的实现类
	 */
	@Bean(name="ISchedulerWorkMap")
	public Map<String, ISchedulerWork> register(){
		//根据接口取实现类
		Map<String, ISchedulerWork> map = context.getBeansOfType(ISchedulerWork.class);
		//Entry遍历  高效
		Set<Entry<String, ISchedulerWork>> sets = map.entrySet();
		for (Entry<String, ISchedulerWork> en : sets) {
			//取spring容器中的 job bean
			ISchedulerWork bean = en.getValue();
			try {
				//取任务和任务的起动装置
				sendNotificationScheduler.scheduleJob(bean.obtainJobDetail(), bean.obtainTrigger());
			} catch (SchedulerException e) {
				logger.error("注入任务和启动装置出错，resource class is SchedulerWorkRegister");
				e.printStackTrace();
			}
		}
		return map;
	}
}
