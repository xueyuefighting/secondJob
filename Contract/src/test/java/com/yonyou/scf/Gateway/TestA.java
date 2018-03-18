package com.yonyou.scf.Gateway;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author zhangjlm
 *BeanNameAware 接口是 实现动态设置bean的id setBeanName
 *BeanFactoryAware 接口是  动态设置 beanFactory
 *InitializingBean 初始化bean的时候  TODO afterPropertiesSet
 *
 */
public class TestA implements
	BeanNameAware,BeanFactoryAware,
	InitializingBean,DisposableBean,
	InstantiationAwareBeanPostProcessor,BeanPostProcessor,ApplicationContextAware{
   
	 abstract class BB{
		 abstract void say();
	}
	
	@Override
	public void setBeanName(String name) {
			
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean,
			String beanName) throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	}
  
}
