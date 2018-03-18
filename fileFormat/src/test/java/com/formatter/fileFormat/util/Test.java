package com.formatter.fileFormat.util;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class Test implements Cloneable{
	private String name;
	private String age;
	
	public Test() {
	}

	public Test(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Test [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
//		Test moneyChange = new Test();
//		Car car = moneyChange.new Car("奔驰","120000");
//		
//		ReferenceQueue<Car> referenceQueue = new ReferenceQueue();
//		
//		WeakReference<Car> wrf = new WeakReference<>(car,referenceQueue);
//		
//		int i= 0;
//		
//		while(true) {
//			if(wrf.get()!=null) {
//				System.out.println("对象还存在 当前loop数："+(i++));
//			}else {
//				System.out.println("对象不存在 当前loop数："+(i++));
//				break;
//			}
//		}
//		
//		Reference reference = referenceQueue.poll();
//		System.out.println(reference.get());
//		int a = 127;
		Integer b = -129;
		Integer c = -129;
//		System.out.println(a==b);
		System.out.println(c==b);
//		Test test = new Test("123","123");
//		try {
//			Test test1 = (Test) test.clone();
//			test1.setAge("234");
//			System.out.println(test1);
//			System.out.println(test);
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
	}

}
