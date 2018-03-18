package com.wyx.aspectjTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeanFactory {
	@Autowired
	private Proto proto;
	
	public Proto build() {
		return proto;
	}
}
