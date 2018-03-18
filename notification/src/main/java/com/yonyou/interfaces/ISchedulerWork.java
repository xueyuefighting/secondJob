package com.yonyou.interfaces;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.Trigger;

/**
 * 定时任务类必须实现的接口
 * @author zhangjinliang
 * 2017年4月13日 下午2:18:48
 * 
 */
public interface ISchedulerWork extends Job {
	/*
	 * 须提供JobDetail 任务的相关属性
	 * @return
	 */
	JobDetail obtainJobDetail();
	/*须提供Trigger 任务的启动装置属性
	 * @return
	 */
	Trigger obtainTrigger();
}
