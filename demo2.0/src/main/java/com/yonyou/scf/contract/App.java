package com.yonyou.scf.contract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);
		head();
		
	}
	private static void head() {
		System.out.println("===========================================");
		System.out.println("YonYou Network Technology Co., Ltd.");
		System.out.println("Supply Chain Finance System");
		System.out.println("3002-Gateway startup successfully !");
		System.out.println("===========================================");
	}
}
