package com.yonyou.scf.contract.template;

public class TemplateFactory {
	
 //每一个线程一个实例
 static  ThreadLocal<ResponseTemplate> response = new ThreadLocal<ResponseTemplate>() {
	 @Override
	 protected ResponseTemplate initialValue() {
		 return new ResponseTemplate();
	 };
 };
 
 //列表响应实体类模版
 public static ResponseTemplate buildResponseTemplate() {
	 return response.get();
 }

 public static void removeCurrentResponseTemplate() {
	 response.remove();
 }
 
private TemplateFactory() {
}
 
}
