package com.yonyou.timerTask;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.DisallowConcurrentExecution;

import static org.quartz.JobBuilder.*;
import static org.quartz.TriggerBuilder.*;

import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.Trigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.yonyou.dbProvider.ScanningCreditDBSourceProviderImpl;
import com.yonyou.interfaces.IDBSourceProvider;
import com.yonyou.interfaces.ISchedulerWork;

/**
 * @author gdx
 * 资方授信状态扫描
 */
@Service
@PropertySource("classpath:application.properties")
@DisallowConcurrentExecution
public class ScanningCreditTask implements ISchedulerWork {
		
	Logger logger=Logger.getLogger(ScanningCreditTask.class);
	
	@Value("${scanningCredit.scheduler.job.name}")
	private String jobName;
	
	@Value("${scanningCredit.scheduler.job.groupName}")
	private String jobGroup;

	@Value("${scanningCredit.scheduler.trigger.name}")
	private String triggerName;
	
	@Value("${scanningCredit.scheduler.trigger.groupName}")
	private String triggerGroup;
	
	@Autowired  @Qualifier("scanningCreditDBSourceProviderImpl") 
	IDBSourceProvider scanningCredirDBSourceProvider;
	
	
	public ScanningCreditTask() {
		
	}
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		String sql="select distinct CREDIT_AGENCY_ID as creditAgencyId from credit c left join agency a "
				+ "on a.AGENCY_ID=c.CREDIT_AGENCY_ID where a.AGENCY_CREATEUSER=?";
		//此处改为platformId
		Object[] obj=new Object[]{"PT20170410185725165"};
		List<String> Agencylist=scanningCredirDBSourceProvider.obtainSpecifyData(sql, obj);
		logger.info("需要通知的融资方id列表"+Agencylist);
		
	}

	@Override
	public JobDetail obtainJobDetail() {
		JobDetail job=newJob(ScanningCreditTask.class).withIdentity(jobName, jobGroup).requestRecovery().build();
		return job;
	}

	@Override
	public Trigger obtainTrigger() {
		//每个工作日上午9点到下午7点五分钟扫描一次
		 CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0 0/1 9-19 ? * MON-FRI");
		 CronTrigger trigger =newTrigger()
				   .withIdentity(triggerName, triggerGroup)
				   .startNow()
				   .withSchedule(cronScheduleBuilder).build();  
        return trigger;

	}
	


}

