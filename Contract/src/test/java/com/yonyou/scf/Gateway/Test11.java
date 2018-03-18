package com.yonyou.scf.Gateway;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class Test11 {
	
	public static void main(String[] args) {
		Map map = new HashMap();
		String a = "abc";
//		String b = "abc";
//		System.out.println(a==b);
//		ReentrantReadWriteLock rrw = new ReentrantReadWriteLock();
//		ReadLock readLock = rrw.readLock();
//		WriteLock writeLock = rrw.writeLock();
//		
//		readLock.newCondition();
//		writeLock.newCondition();
//		MethodInter2 methodInter2 = new MethodInter2();
//		InvocationImpl invocationImpl = (InvocationImpl)methodInter2.getProxy(InvocationImpl.class);
//		invocationImpl.say();
//		InvocationImpl invocationImpl = new InvocationImpl();
//		InvoTest invoTest = new InvoTest(invocationImpl);
//		InvocationH test = 
//				(InvocationH)Proxy.newProxyInstance(InvocationImpl.class.getClassLoader(),
//						InvocationImpl.class.getInterfaces(), invoTest);
//		test.say();
//		int[] a = {3,8,2,4,1,7,5,9};
//		int[] a = {1,2,3,4,5,6,7,8,9};
//		bb(a);
//		qb(a,0,a.length-1);
//		selection(a);
//		minp(a);
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]);
//		}
//		insertion(a);
//		System.out.println(bS(a,10));
//		ConcurrentHashMap cm = new ConcurrentHashMap<>();
//		cm.put("", "");
//		cm.remove(key)
//		System.out.println(cm.mappingCount());
//		LinkedList t = new LinkedList();
//		t.iterator().hasNext();
//		MyLinked my = new MyLinked();
//		my.setHeader(1);
//		my.setLast(2);
//		my.selectAll();
//		System.out.println(my.select(2));
//		Stack<Integer> st = new Stack<>();
//		st.push(4);
//		st.push(7);
//		st.push(3);
//		st.push(1);
//		st.push(6);
//		stackSort(st);
	}
	
	/**
	 * 栈排序
	 * @param s
	 */
	public static void stackSort(Stack<Integer> s) {
		
		Stack<Integer> empty = new Stack<>();
		//将第一个压入
		empty.push(s.pop());
		
		while(!s.empty()) {
			int source = s.pop();//返回并移除
			while(!empty.empty() && empty.peek()<source) {
				s.push(empty.pop());
			}
			empty.push(source);
		}
		
		while(!empty.empty()) {
			System.out.println(empty.pop());
		}
	}
	
	/**
	 * i*2 左节点   i*2+1 右节点
	 * @param arg
	 */
	public static void minp(int[] arg) {
		int i=1,n=arg.length,t;
		boolean flag = true;//为true  需要继续排序
		while(i*2<n && flag) {
			if(arg[i-1]<arg[i*2-1]) {//跟左节点比较
				t=i*2;
			}else {
				t=i;
			}
			if(i*2+1<n) {
				if(arg[t-1]>arg[i*2+1]) {//跟左节点比较
					t=i*2;
				}else {
					t=i;
				}
			}
			if(t!=i) {
				swap(arg,t,i);
				i=t;
			}else {
				flag=false;
			}
		}
	}
	
	private static void swap(int[] arg, int t, int i) {
			int temp = arg[t-1];
			arg[t-1] = arg[i-1];
			arg[i-1] = temp;
	}

	/**
	 * 选择排序  平均时间复杂度 o(n^2)
	 * @param arg
	 */
	public static void selection(int[] arg) {
		int n,m;
		for (int i = 0; i < arg.length; i++) {
			n = arg[i];
			m=i;
			for (int j = i+1; j < arg.length; j++) {
				if(arg[m]>arg[j]) {
					m = j;
				}
			}
			
			if(m!=i) {//找到最小的值了
				arg[i] = arg[m];
				arg[m] = n;
			}
		}
	}
	
	public static void qb(int[] resource, int left, int hight) {
		
		if(left>hight) {
			return;
		}
		
		int t = resource[left];
		int i = left;
		int j = hight;
		
		int temp;
		
		while(i!=j) {
			while(resource[j]>=t && i<j) {
				j--;
			}
			while(resource[i]<=t && i<j) {
				i++;
			}
			if(i<j) {
				temp = resource[j];
				resource[j] = resource[i];
				resource[i] = temp;
			}
		}
		
		resource[left] = resource[i];
		resource[i] = t;
		
		qb(resource,0,i-1);
		qb(resource,i+1,hight);
		
	}
	public static <E> boolean isEquals(final E[] src,final E[] dst) {
  		for(int i=0;i<src.length;i++){
          if(src[i]!=dst[i]){
            return false;
          }
        }
 		return true;
}
	
	/**
	 * 冒泡排序
	 * @param resource
	 * @return
	 */
	public static void bb(int[] resource) {
		
		if(resource==null || resource.length==0) {
			System.out.println("没有元素");
			return;
		}
		
		if(resource.length==1) {
			System.out.println(resource[0]);
			return;
		}
		
		int temp;
		for (int i = resource.length-1; i >0 ; i--) {
			for (int j = 0; j < i; j++) {
				if(resource[j]<resource[j+1]) {
					temp = resource[j];
					resource[j] = resource[j+1];
					resource[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < resource.length; i++) {
			System.out.print(resource[i]);
		}
	}
	
	/**
	 * 二分查找
	 * @param resource
	 * @return
	 */
	public static int bS(int[] resource, int target) {
		if(resource==null || resource.length==0) {
			System.out.println("没有元素");
			return -1;
		}
		
		if(resource.length==1) {
			System.out.println(resource[0]);
			return 0;
		}
		if(target<resource[0] || target>resource[resource.length-1]) {
			return -1;
		}
		int low = 0;
		int hight = resource.length;
		int mid;
		while(low<hight) {
			mid = (low+hight)>>1;
			if(resource[mid]==target) {
				return mid;
			}
			if(resource[mid]>target) {
				hight = mid;
			}
			if(resource[mid]<target) {
				low = mid;
			}
		}
		return -1;
	}
	
	/**
	 * 插入排序
	 * @param resource
	 */
	public static void insertion(int[] resource) {
		if(resource==null || resource.length==0) {
			System.out.println("没有元素");
			return;
		}
		
		if(resource.length==1) {
			System.out.println(resource[0]);
			return;
		}
		
		int target,j;
		for (int i = 1; i < resource.length; i++) {
			target = resource[i];
			j = i;
			while(j>0 && target < resource[j-1]) {
				resource[j] = resource[j-1];
				j--;
			}
			resource[j] = target;
		}
		
		for (int i = 0; i < resource.length; i++) {
			System.out.print(resource[i]);
		}
	}
}
