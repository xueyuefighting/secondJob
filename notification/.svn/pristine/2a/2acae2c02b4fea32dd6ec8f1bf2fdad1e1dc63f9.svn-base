package com.yonyou.interfaces;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;

/**
 * 定时调度器接口
 * @author zhangjinliang
 * 2017年4月13日 下午1:49:41
 * 
 */
public interface ISchedulerProvider {
	/*
	 * 提供调度器Scheduler
	 * @return
	 * @throws SchedulerException
	 */
	public Scheduler prepareScheduler() throws SchedulerException;
	/*
	 *执行调度器 
	 */
	public void doSendNotice();
	/*
	 * 钩子方法
	 * @return
	 */
	public boolean returnStartFlag();
	/*
	 * 向调度器中注册定时任务和任务的启动装置
	 * @param job  定时任务
	 * @param trigger 任务的启动装置
	 * @throws SchedulerException
	 */
	void register(JobDetail job,Trigger trigger) throws SchedulerException;
}
