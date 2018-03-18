package com.yonyou.scf.user.config;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.yonyou.scf.user.service.ParamService;

@Component
public class MyStartupRunner implements CommandLineRunner {

	@Autowired
	private ParamService paramService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作<<<<<<<<<<<<<");
		paramService.initAll();
	}
}
