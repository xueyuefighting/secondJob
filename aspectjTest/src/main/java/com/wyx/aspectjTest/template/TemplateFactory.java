package com.wyx.aspectjTest.template;

import org.springframework.stereotype.Service;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class TemplateFactory {
	
 //每一个线程一个实例
 ThreadLocal<Person> response = new ThreadLocal<Person>() {
	 @Override
	 protected Person initialValue() {
		 return new Person();
	 };
 };
 
 //列表响应实体类模版
 @AspectjAnno
 public Person buildResponseTemplate() {
	 return response.get();
 }

 public void removeCurrentResponseTemplate() {
	 response.remove();
 }
 
//public TemplateFactory() {
//}
 
}
