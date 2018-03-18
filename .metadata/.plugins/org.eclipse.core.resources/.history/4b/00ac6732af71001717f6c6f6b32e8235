package com.bjdreamtech.dmt.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/**
 * 初始化Mapper工具监听器
 * 原理：通过加载spring的bean得到spring管理的sqlSessionFactory
 * 将sqlSessionFactory赋值给DMTMapperUtil工具
 * @author duanwu
 *
 */
public class DMTMapperListener implements ServletContextListener{

	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	public void contextInitialized(ServletContextEvent arg0) {
//		//加载spring-mybatis.xml中配置的bean
//		BeanFactory factory = (BeanFactory)new ClassPathXmlApplicationContext("spring-mybatis.xml");  
//		//获取spring管理的sqlSessionFactory
//		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) factory.getBean("sqlSessionFactory");
//		//将获取的sqlSessionFactory赋值给DMTMapperUtil类属性
//		DMTMapperUtil.sqlSessionFactory = sqlSessionFactory;
//		//利用获取的sqlSessionFactory获取sqlSession赋值给DMTMapperUtil类属性
//		DMTMapperUtil.sqlSession = sqlSessionFactory.openSession();
	}

}
