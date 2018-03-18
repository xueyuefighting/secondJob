package com.java.designPatterns.builder;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.jdbc.support.nativejdbc.C3P0NativeJdbcExtractor;

@ConditionalOnClass
public class Test {

	AtomicLong a = new AtomicLong();
	
	public static void main(String[] args) {
		
		
		Map<String, String> map = new Hashtable<String,String>();
		map.put("a", "123");
		map.put("b", "456");
		map.put("c", "789");
		Set<Entry<String, String>> set = map.entrySet();
		
		for (Entry<String, String> entry : set) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		map.forEach((x,y)->{
			System.out.println(x+":"+y);
		});
		
//		ContractTemplateA ca = new ContractTemplateA();
//		
//		returna(ca);
//		
//		if(ca instanceof ContractTemplateA) {
//			ContractTemplateA caa = (ContractTemplateA)ca;
//			caa.getAddress();
//		}
//		
	}
	
	public static Cloneable returna(Cloneable a) {
		return a;
	}

}
