package com.yonyou.scf.Gateway;

public class ThreadTest {
	private static volatile int race = 10;
	
	private static int count = 20;
	
	public void say() {
		System.out.println("say without args");
	}
	public void say(String name) {
		System.out.println("say with args:"+name);
	}
	
	public static void increase() {
		race++;
	}
	public static void main(String[] args) {
		RelectTest rt = new RelectTest();
		try {
			RelectEntity relectEntity = rt.returnType(RelectEntity.class, "heihei");
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
//		Thread[] threads = new Thread[count];
//		
//		for (int i = 0; i < threads.length; i++) {
//			threads[i] = new Thread(new Runnable() {
//				
//				@Override
//				public void run() {
//						for (int j = 0; j < 10000; j++) {
//							increase();
//						}
//				}
//			});
//			threads[i].start();
//		}
//		while(Thread.activeCount()>1)
//			Thread.yield();
//		System.out.println(race);
	}

}
