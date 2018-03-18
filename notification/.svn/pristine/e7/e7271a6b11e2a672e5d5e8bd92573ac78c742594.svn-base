package com.yonyou.jobFactory;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.stereotype.Service;

@Service
public class PersionJobFactory extends AdaptableJobFactory {
	/*
	 * 这个对象Spring会帮我们自动注入进来
	 * 将spring管理范畴之外的bean 注入进来
	 */
    @Autowired
    private AutowireCapableBeanFactory capableBeanFactory;
    
	@Override
	protected Object createJobInstance(TriggerFiredBundle bundle)
			throws Exception {
		//调用父类的方法
        Object jobInstance = super.createJobInstance(bundle);
        /*
         * 进行注入
         * 让spring加载当前实力，并自动装配该实例需要依赖的bean
         */
        capableBeanFactory.autowireBean(jobInstance);
        return jobInstance;
	}
	
}
