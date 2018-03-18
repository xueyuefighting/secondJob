package com.example;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yonyou.config.PrimaryDataSourceConfiguration;
import com.yonyou.dbProvider.NotificationDBSourceProviderImpl;
import com.yonyou.pojo.Notification;
import com.yonyou.util.ReadProperties;
@RunWith(SpringJUnit4ClassRunner.class)
@Configuration
@ContextConfiguration(classes = {PrimaryDataSourceConfiguration.class,NotificationDBSourceProviderImpl.class})
public class TimerTaskControl {
	@Autowired
	private NotificationDBSourceProviderImpl notificationDBSourceProvider;
	@Autowired
	private Scheduler scheduler;
//	@Test
	public void sendNotice(){
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
	@Test
	public void speak(){
		SimpleTriggerFactoryBean stfb = new SimpleTriggerFactoryBean();
		
	}
	
}
