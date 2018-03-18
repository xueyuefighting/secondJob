package com.test.intefaces;

import org.springframework.stereotype.Service;

@Service
public class Dog implements Animal {

	@Override
	public void run() {
		System.out.println("狗的实例，跑的方法");
	}

}
