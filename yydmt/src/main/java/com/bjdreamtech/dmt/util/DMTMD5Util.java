package com.bjdreamtech.dmt.util;  
  
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.Map;
  
/** 
 * 采用MD5加密解密 
 * @author duanwu
 */  
public class DMTMD5Util {  
	
	
	MessageDigest alg;

	public DMTMD5Util() {
		try {
			alg = MessageDigest.getInstance( "MD5" );
		} catch( Exception ex ) {
			ex.printStackTrace( );
		}
	}

	/**
	 * 加密 key
	 * wp
	 */
	public byte[] encrypt( String key ) {
		return computeDigest( key.getBytes( ) );
	}

	public byte[] computeDigest( byte[] b ) {
		try {
			alg.reset( );
			alg.update( b );
			byte[] hash = alg.digest( ); // 得到摘要
			return hash;
		} catch( Exception ex ) {
			ex.printStackTrace( );
			return null;
		}
}
  
    /*** 
     * MD5加码 生成32位md5码 
     */  
    public static String string2MD5(String inStr){  
        MessageDigest md5 = null;  
        try{  
            md5 = MessageDigest.getInstance("MD5");  
        }catch (Exception e){  
            e.printStackTrace();  
            return "";  
        }  
        char[] charArray = inStr.toCharArray();  
        byte[] byteArray = new byte[charArray.length];  
  
        for (int i = 0; i < charArray.length; i++)  
            byteArray[i] = (byte) charArray[i];  
        byte[] md5Bytes = md5.digest(byteArray);  
        StringBuffer hexValue = new StringBuffer();  
        for (int i = 0; i < md5Bytes.length; i++){  
            int val = ((int) md5Bytes[i]) & 0xff;  
            if (val < 16)  
                hexValue.append("0");  
            hexValue.append(Integer.toHexString(val));  
        }  
        return hexValue.toString();  
  
    }  
  
    /** 
     * 加密解密算法 执行一次加密，两次解密 
     */   
    public static String convertMD5(String inStr){  
  
        char[] a = inStr.toCharArray();  
        for (int i = 0; i < a.length; i++){  
            a[i] = (char) (a[i] ^ 't');  
        }  
        String s = new String(a);  
        return s;  
    }  
    
    /**
     *计算文件MD5值 
     */
    public static String fileMd5(String filePath){
    String str="";
	try {
		str = org.apache.commons.codec.digest.DigestUtils.md5Hex(new FileInputStream(filePath));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
    return str;  
    }
    

    
    //原始字符串转XML格式
    public static String  fileChgXml(Map<String,Object> mtr){
    	
    	
    	return "";
    }
    
    //XML原始报文，加密传输
    public static String  fileEncrypt(Map<String,Object> mtr ){
    	
    	
    	return "";
    }
    
    
    // 测试主函数  
    public static void main(String args[]) {  
     //   String s = new String("12345678");  
     //   System.out.println("原始：" + s);  
      //  System.out.println("MD5后：" + string2MD5(s));  
      //  System.out.println("加密的：" + convertMD5(s));  
      //  System.out.println("解密的：" + convertMD5(convertMD5(s))); 
    	
    	//
    	
    	
  //String md = fileMd5("C:\\1\\Pact20170425115847641.pdf");
    //	System.out.println(md);
    	
    	try {
			System.out.println(fileMd5("C:\\1\\Pact20170425115847641.pdf"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    	
    	
    }  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}  