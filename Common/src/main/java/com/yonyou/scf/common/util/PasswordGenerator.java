package com.yonyou.scf.common.util;

import java.util.Random;

/**
 * 
 * @author durui
 * @version 1.1 增加生成4位手机验证码的方法
 */

public class PasswordGenerator {
	
	public static String getFixLenthString() {

		int temp = 10000000 + new Random().nextInt(90000000);
		return String.valueOf(temp);
	}
	
	public static String get4LenthString() {

		int temp = 1000 + new Random().nextInt(9000);
		return String.valueOf(temp);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(getFixLenthString());
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(getFixLenthString());
		}
	}
}
