package com.yonyou.timerTask;

import java.util.Date;
import java.util.List;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.yonyou.dbProvider.NotificationDBSourceProviderImpl;
import com.yonyou.interfaces.ISchedulerWork;
import com.yonyou.pojo.Notification;
/**
 * 定时任务的内容，提供任务的相关属性和启动装置属性
 * @author zhangjinliang
 * 2017年4月13日 下午2:13:06
 * 
 */
//由于是根据接口类在spring中获取 所以必须将当前类注入到spring容器中，  也可以换位其他注解 比如@Configuration
@Service
@PropertySource("classpath:application.properties")
@DisallowConcurrentExecution//该注解：告诉Quartz不要并发地执行同一个JobDetail定义（这里指特定的job类）的多个实例，但是可以并发执行其他JobDetail
public class SendNotificationJobImpl implements ISchedulerWork {
	
	/*
	 * 获取application.properties属性及值
	 */
    @Value("${notification.scheduler.job.name}")
    private String jobName;
    @Value("${notification.scheduler.job.groupName}")
    private String jobGroup;
    @Value("${notification.scheduler.trigger.name}")
    private String triggerName;
    @Value("${notification.scheduler.trigger.groupName}")
    private String triggerGroupName;
    @Value("${notification.scheduler.config.intervalTime}")
    private int intervalTime;
	
	@Autowired(required=true)
	private NotificationDBSourceProviderImpl notificationDBSourceProvider;
	
	public SendNotificationJobImpl() {
	}
	
	/* 定时任务的内容
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		
		/*
		 * 每次调度任务，执行job中的本方法，都会实例化当前对象，执行后弃用实力并垃圾回收
		 * 一，由于要垃圾回收，所以必须有一个无参公共的构造方法
		 * 二。每次实例化  脱离spring的管理，所以 如果依赖其他bean  需要在创建任务时，利用JobDataMap  然后通过以下方法 获取。
		 * 三  还有一种方法，是让脱离spring管理的实例  加入spring容器中  并加载实例以来，eg：SchedulerProvider scheduler.setJobFactory(persionJobFactory);
		 */
		
		String sql = "select SYSTEMID as systemid,"
				+ "COMMUNICATION_TYPE as communicationType,"
				+ "URL as url,"
				+ "MESSAGE as message,"
				+ "NOTICE_TYPE as noticeType,"
				+ "LAST_SEND_TIME as lastSendTime,"
				+ "NOTICE_STATUS as noticeStatus,"
				+ "SEND_COUNT as sendCount"
				+ " from NOTIFICATION where NOTICE_STATUS=? ";
		Object[] args = {20};
		List<Notification> list = notificationDBSourceProvider.obtainSpecifyData(sql, args);
		for (Notification notification : list) {
			System.out.println(notification.toString());
		}
	}

	/* 定时任务的属性
	 * @see com.yonyou.interfaces.ISchedulerWork#obtainJobDetail()
	 */
	@Override
	public JobDetail obtainJobDetail() {
		JobDetail job = JobBuilder.newJob(this.getClass())//重要，括号内需要填入执行的任务class 如果重复，只会覆盖
				.withIdentity(jobName, jobGroup)//定时任务在调度器重的key和分组
				.requestRecovery()//scheduler发生硬关闭（hard shutdown)（比如运行的进程崩溃了，或者关机了），则当scheduler重新启动的时候，该job会被重新执行
				.build();
		
		return job;
	}

	/* 提供定时任务的启动装置
	 * @see com.yonyou.interfaces.ISchedulerWork#obtainTrigger()
	 */
	@Override
	public Trigger obtainTrigger() {
		Trigger trigger = TriggerBuilder.newTrigger()
				.withIdentity(triggerName, triggerGroupName)//任务的启动装置属性在调度器中的key和分组
				.startAt(new Date())//开始调度的时间
				.withSchedule(SimpleScheduleBuilder.simpleSchedule()
				.withIntervalInSeconds(5)//间隔时间  单位秒  还有其他间隔比如分钟，小时等
				.repeatForever())//重复次数  当前为一直重复
				.build();
		return trigger;
	}

}
