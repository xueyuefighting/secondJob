package com.test.intefaces;

import org.springframework.stereotype.Service;

@Service
public class Cat implements Animal {

	@Override
	public void run() {
		System.out.println("猫实例跑的方法");
	}

}
