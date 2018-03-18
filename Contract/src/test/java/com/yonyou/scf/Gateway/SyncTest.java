package com.yonyou.scf.Gateway;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

public class SyncTest extends AbstractQueuedSynchronizer implements ApplicationContextAware,BeanNameAware{
	public static void main(String[] args) {
		
		//redis的消息队列--start
		RedisMessageListenerContainer a = new RedisMessageListenerContainer();
		MessageListenerAdapter m = new MessageListenerAdapter();
		//redis的消息队列--end
		
		List<String> list = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		Set<String> hashSet = new HashSet<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		Map hashMap = new HashMap();
		Map linkedhashMap = new LinkedHashMap();
		
		String aa = new String("aa");
		String bb = new String("bb");
		String cc = new String("cc");
		String cc1 = new String("123");
		String cc2 = new String("234");
		String cc3 = new String("345");
		Set<String> set = new LinkedHashSet<>();
		set.add(bb);
		set.add(aa);
		set.add(cc);
		set.add(cc1);
		set.add(cc2);
		set.add(cc3);
		for (String string : set) {
			System.out.println(string);
		}
		System.out.println("--------------");
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		
	}
}
