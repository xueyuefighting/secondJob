//package com.yonyou.http;
//
//import org.apache.http.client.config.RequestConfig;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClientBuilder;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.FactoryBean;
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author zhangjinliang
// * 2017年4月7日 下午1:39:14
// * InitializingBean：spring的接口，实现此接口需要实现afterPropertiesSet()，意思是实现这个接口的类，
// * 在被spring初始化的时候，优先执行afterPropertiesSet()，字面意思就是读取完配置文件就执行的方法，然后是指定的init-method
// * FactoryBean：spring接口，需要实现它的三个方法，其中getObject才是返回的真是bean
// * DisposableBean也是spring的接口，其中一个方法，destroy()，在对象执行其他destroy方法前执行此方法
// * 这三个接口，表示着bean的生命周期
// */
//@Configuration
//public class HttpClientServiceTemplate implements FactoryBean<CloseableHttpClient>,InitializingBean,DisposableBean {
//	private Logger logger = Logger.getLogger(HttpClientServiceTemplate.class);
//	 /* 
//     * FactoryBean生成的目标对象 
//     * 
//     * CloseableHttpClient 是httpClient的实现类
//     */  
//	private CloseableHttpClient client;
//
//	/* 
//	 * 返回bean
//	 * 
//	 */
//	@Override
//	public CloseableHttpClient getObject() throws Exception {
//		
//		return null;
//	}
//
//	/* 
//	 * 返回bean类型
//	 * 
//	 */
//	@Override
//	public Class<?> getObjectType() {
//		return null;
//	}
//
//	/* 
//	 * 是否是单例
//	 * 
//	 */
//	@Override
//	public boolean isSingleton() {
//		return true;
//	}
//
//	/* 
//	 * bean的销毁
//	 */
//	@Override
//	public void destroy() throws Exception {
//		if(this.client!=null){
//			this.client.close();
//			logger.info("httpClient Bean has bean destroyed...");
//		}
//	}
//
//	
//        /* 
//         * 建议此处使用HttpClients.custom的方式来创建HttpClientBuilder，而不要使用HttpClientBuilder.create()方法来创建HttpClientBuilder 
//         * 从官方文档可以得出，HttpClientBuilder是非线程安全的，但是HttpClients确实Immutable的，immutable 对象不仅能够保证象对的状态不被改变， 
//         * 而且还可以不使用锁机制就能被其他线程共享 
//         */  
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		HttpClientBuilder httpClientBuilder = HttpClients.custom();
//		System.out.println("初始化");
//		this.client = httpClientBuilder.build();
//		logger.info("httpClient Bean has bean created...");
//	}
//	
//	/**
//	 * 主要用于获取和配置一些外部的网络环境
//	 * @return
//	 */
//	public RequestConfig getHttpClientRequestConfig(){
//		return null;//HttpClientRequestConfigImpl.getConfig();
//	}
//	
//
//}
