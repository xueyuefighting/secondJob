package com.yonyou.scf.common.util;

import java.util.Random;

/**
 * 自动生成ID共用类
 * 
 * @author zhangxu
 *
 */
public class CreateID {

	/**
	 * 生成表主键，15位
	 * 
	 * @return
	 */	
	public static Long createId(){
		String dateStr = Timer.getTimestamp();
		// 获取两位随机数
		int r = (int) (Math.random() * 90 + 10);
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Long.parseLong(dateStr + String.valueOf(r));
	}

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
//		Long tt = createId();
//		String str = "qwertyuiopasdfghjklzxcvbnm1234567890QWERTYUIOPASDFGHJKLZXCVBNM";
//		for (int i = 0; i < 100000; i++) {
//			System.out.println(str.charAt((int)(Math.random()*(str.length()))));
//		}
	}
	
    
    private static Random random = new Random();
    
    private static final char[] CHARACTER_TABLE = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
		'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    

    /**
     * 获取数字的随机字符串
     * 
     * @param length
     * @return
     */
    public static String getRandomNumber(int length) {
        StringBuilder sb = new StringBuilder();
        
        do {
            sb.append(Math.abs(random.nextLong()));
        } while (sb.length() < length);
        
        return sb.substring(0, length);
    }
    
    /**
     * 获取数字加字母随机组合的字符串
     * 
     * @param length 字符串长度
     * @param upperCaseSupported 字符串中是否支持大写字母     true:包含大小写字母     false:只有小写字母
     * @return
     */
    public static String getRandomCharAndNumber(int length, boolean upperCaseSupported) {  
    	StringBuilder rsb = new StringBuilder();  
    	if(upperCaseSupported){
    		for (int i = 0; i < length; i++) {  
                rsb.append(CHARACTER_TABLE[random.nextInt(62)]);  
    		}
    	} else {
    		for (int i = 0; i < length; i++) {
                rsb.append(CHARACTER_TABLE[random.nextInt(36)]); 
    		}
    	}
        return rsb.toString();
    } 
}
