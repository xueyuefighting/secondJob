package com.java.designPatterns.builder;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.jdbc.support.nativejdbc.C3P0NativeJdbcExtractor;

@ConditionalOnClass
public class Test {

	public static void main(String[] args) {
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
