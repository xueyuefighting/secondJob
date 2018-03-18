package com.yonyou.dbProvider;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;










import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yonyou.interfaces.IDBSourceProvider;
import com.yonyou.pojo.Notification;

/**
 * 读取数据库数据
 * @author zhangjinliang
 * 2017年4月11日 上午9:17:29
 * 
 */
@Service
@Configuration
public class NotificationDBSourceProviderImpl implements IDBSourceProvider<Notification>{
	
	@Autowired  @Qualifier("primaryJdbcTemplate") 
	private JdbcTemplate notificationJdbcTemplate;
	
	
	//廊坊银行，批处理时间间隔  单位小时
	@Value("${LBbank.batch.time.interval}")
	private String timeInterval; 
	
	/* 根据指定sql 获取结果集  Object[] object 为sql入参
	 * @see com.yonyou.interfaces.IDBSourceProvider#obtainSpecifyData(java.lang.String, java.lang.Object[])
	 */
	@Transactional(value="primaryTransactionManager")//,readOnly=true
	public List<Notification> obtainSpecifyData(String sql,Object[] object) {
		
		//spring JdbcTemplate 查询中 可以将结果集映射为 指定实体类  
		//RowMapper 相当于 结果集和实体类的映射关系工具
		RowMapper<Notification> rowMapper = new BeanPropertyRowMapper<Notification>(Notification.class);
		
		//执行sql查询操作
		List<Notification> notificationList = notificationJdbcTemplate.query(sql, object, rowMapper);
		
		//过滤结果集
		List<Notification> havefiltratedList = filtrationList(notificationList);
		
		return havefiltratedList;
	}

	/*
	 * sql 过滤
	 * @param notificationList
	 * @return
	 */
	private List<Notification> filtrationList(List<Notification> notificationList) {
		boolean logicStatus = true;
		for (Notification notification : notificationList) {
			
			//验证每个实体类中的参数  是否符合法。eg:某一阶段，将某些ip拉入了黑名单
			volidateLegalData(notification);
			
			//验证每个实体类中的参数  是否符合业务逻辑。eg:第三次补发 ， 间隔是多少，现在是否需要补发
			logicStatus = volidateLogicData(notification);
			
			if(!logicStatus) notificationList.remove(notification);
			
		}
		return notificationList;
	}

	/*
	 *  验证每个实体类中的参数  是否符合业务逻辑。eg:第三次补发 ， 间隔是多少，现在是否需要补发
	 * @param notification
	 */
	private boolean volidateLogicData(Notification notification) {

		boolean logicStatus = true;

		if(notification==null) return logicStatus; 
		
		Date nowDate = new Date();
		
		Integer sendCount = notification.getSendCount();
		
		String timeIntervalforuser = timeIntervalHandler(sendCount);
		
		String lastSendTime = notification.getLastSendTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		
//		try {
//			Date lastSendDate =  sdf.parse(lastSendTime);
//			
//			long willSendtime =  lastSendDate.getTime()+(Integer.parseInt(timeIntervalforuser)*60*60*1000);
//			
//			//发送的时间与现在的时间进行对比
//			if(willSendtime>nowDate.getTime()){
//				logicStatus = false;
//			}
//			
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		
		return logicStatus;
	}

	/*
	 *  验证每个实体类中的参数  是否符合法。eg:某一阶段，将某些ip拉入了黑名单
	 * @param notification
	 */
	private void volidateLegalData(Notification notification) {
		/*
		 *待补充逻辑 
		 */
		
	}
	
	/*
	 *取sendCount-1 次时间间隔规则      只试用于批处理时间间隔规则 
	 * @return
	 */
	private String timeIntervalHandler(int sendCount){
		
		return timeInterval.split(",")[sendCount-1];
	}

}
