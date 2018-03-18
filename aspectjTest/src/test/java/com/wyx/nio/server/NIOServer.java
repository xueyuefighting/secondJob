package com.wyx.nio.server;

import javax.management.RuntimeErrorException;

public class NIOServer {
	
	public void initServer(int port) {
		
	}
	public static void main(String[] args) {
		try {
			bad();
			System.out.println("A");
		} catch(RuntimeException e) {
			System.out.println("B");
		} catch (Exception e) {
			System.out.println("C");
		}finally {
			System.out.println("D");
		}
		System.out.println("E");
	}
	public static void bad() {
		throw new RuntimeException();
	}
}
