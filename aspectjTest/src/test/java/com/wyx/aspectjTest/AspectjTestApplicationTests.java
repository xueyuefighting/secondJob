package com.wyx.aspectjTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wyx.aspectjTest.template.Advise;
import com.wyx.aspectjTest.template.Person;
import com.wyx.aspectjTest.template.TemplateFactory;

@SpringBootApplication
@SpringApplicationConfiguration({AspectjTestApplication.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class AspectjTestApplicationTests {

	@Autowired
	private TemplateFactory templateFactory;
	
	@Test
	public void contextLoads() {
		Thread t1 =new Thread(()-> {
			Person p = templateFactory.buildResponseTemplate();
			p.setName("tom");
			p.setAge("12");
			System.out.println("线程1执行完成");
		});
		Thread t2 = new Thread(()-> {
			Person p = templateFactory.buildResponseTemplate();
			p.setName("john");
			p.setAge("17");
			System.out.println("线程2执行完成");
		});
		try {
			t1.start();
			t2.start();
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("执行完成");
	}

}
