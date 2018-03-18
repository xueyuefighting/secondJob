package com.yonyou.scf.common.util.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.yonyou.scf.common.system.CodeException;
import com.yonyou.scf.common.util.StringUtil;
import com.yonyou.scf.common.util.codec.Base64;

/**
 * 登录密码校验、变换工具类
 * 
 * <pre>
 * 
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu      2017-03-16  Create this file
 * 
 * </pre>
 * 
 */
public class EncryptPasswordUtil {
    
    private EncryptPasswordUtil(){
        
    }
    
    // 24位掩码：供应链金融事业部
    private static final byte[] maskCode = new byte[] {-28,-66,-101,-27,-70,-108,-23,-109,-66,-23,-121,-111,-24,-98,-115,-28,-70,-117,-28,-72,-102,-23,-125,-88};
    
    /**
     * 密码拼接4位随机数后异或
     * 
     * @param password
     * @return 加密后的结果
     * @throws Exception
     */
    public static String encryptPassword(String password) throws Exception {
        
        //4位随机数的生成
        Random random = new Random();
        String sRand = "";
        for (int i = 0; i < 4; i++) {
            String rand = String.valueOf(random.nextInt(10));
            sRand += rand;
        }
        
        //16进制转byte
        byte[] passwordBT = StringUtil.hex2bytes(password);

        //24bytes
        byte[] tempPasswordBT = StringUtil.byteConcat(sRand.getBytes(), passwordBT);
        
        //异或结果
        String passwordStr = byteXORbyteTo24Hex(tempPasswordBT);
        
        return passwordStr;
    }
    
     /**
     * RSA解密，返回16进制String
     * 
     * @param password
     * @param privateKey
     * @return
     * @throws CodeException
     */
    public static String decryptRSAToString(String password, PrivateKey privateKey) throws CodeException {
        // RSA解密，返回byte[]
        byte[] p = SecurityUtil.decryptRSAToByte(password, privateKey);
        if (null == p) {
            throw new CodeException("2001", "系统内部错误。");
        }
        // Hex:20 bytes --> HexString
        String s = StringUtil.bytes2hex(p);

        return s;
    }

    /**
     * RSA解密，返回byte
     * 
     * @param password
     * @param privateKey
     * @return
     * @throws CodeException
     */
    public static byte[] decryptRSAToByte(String password, PrivateKey privateKey) throws CodeException {
        // RSA解密，返回byte[]
        byte[] p = SecurityUtil.decryptRSAToByte(password, privateKey);
        if (null == p) {
            throw new CodeException("2001", "系统内部错误。");
        }
        return p;
    }
    
    /**
     * 两个24位byte[]的异或运算，返回24位16进制String
     * 
     * @param pwd
     * @return
     * @throws CodeException
     */
    public static String byteXORbyteTo24Hex(byte[] pwd) throws CodeException {
        // 两个24位byte[]的异或运算，返回24位byte[]
        byte[] b = byteXORbyteToByte(pwd, 0);
        // 16进制编码处理
        String s = StringUtil.bytes2hex(b);

        return s;
    }

    /**
     * 两个24位byte[]的异或运算，返回后20位16进制String
     * 
     * @param pwd
     * @return
     * @throws CodeException
     */
    public  static String byteXORbyteTo20Hex(byte[] pwd) throws CodeException {
        // 一个24位byte[]和一个20位byte[]的异或运算，返回20位byte[]
        byte[] b = byteXORbyteToByte(pwd, 4);
        // 16进制编码处理
        String s = StringUtil.bytes2hex(b);

        return s;
    }
    
    /**
     * 两个24位byte[]的异或运算，返回byte[]，长度为24-startPosition
     * 
     * @param pwd
     * @param startPosition
     * @return
     * @throws CodeException
     */
    public static byte[] byteXORbyteToByte(byte[] pwd, int startPosition) throws CodeException {
        if (null == pwd) {
            throw new CodeException("", "密文不能为空");
        }
        int pLen = pwd.length;
        if (pLen != maskCode.length) {
            throw new CodeException("", "密文和掩码长度不匹配");
        }
        if (maskCode.length != 24) {
            throw new CodeException("", "掩码长度不足");
        }

        if (startPosition < 0) {
            throw new CodeException("", "调整长度不能小于0");
        } else if (startPosition > pLen) {
            throw new CodeException("", "调整长度不能大于密文长度");
        }

        byte[] temp = StringUtil.byteXORbyte(pwd, maskCode);
        if (null == temp) {
            throw new CodeException("", "异或计算失败");
        }

        byte[] byteXOR = new byte[temp.length - startPosition];
        for (int i = startPosition; i < temp.length; i++) {
            byteXOR[i - startPosition] = temp[i];
        }

        return byteXOR;
    }
    
    public static boolean comparePassword(String password, String pwdFromDB, PrivateKey privateKey) throws CodeException{
        // a.获取密码控件解密后的20位byte，已转成HexString
        String pwdFromIE = decryptRSAToString(password, privateKey);
        // c.获取b与掩码的异或值，取后20byte，已转成HexString
        String pwdFromDBXor = byteXORbyteTo20Hex(StringUtil.hex2bytes(pwdFromDB));
        
        return pwdFromIE.equals(pwdFromDBXor);
    }
//    /**
//     * 新密码控件校验
//     * @param password
//     * @param pwdFromDB
//     * @param privateKey
//     * @param serverRandomString
//     * @param clientRandomString
//     * @return
//     * @throws CodeException
//     */
//    public static boolean compareDESPassword(String password, String pwdFromDB, PrivateKey privateKey) throws CodeException {
//        try {
//            String pwdFromIE = decryptPasswordWithH5EdtionHex(password, privateKey);
//
//            // 获取b与掩码的异或值，取后20byte，已转成HexString
//            String pwdFromDBXor = byteXORbyteTo20Hex(StringUtil.hex2bytes(pwdFromDB));
//            return pwdFromIE.equals(pwdFromDBXor);
//        } catch (Exception e) {
//        }
//
//        return false;
//    }
    
//    /**
//     * H5控件解析哈希值
//     * @param password
//     * @param privateKey
//     * @return
//     * @throws CodeException
//     */
//    public static String decryptPasswordWithH5EdtionHex(String password, PrivateKey privateKey ) throws CodeException{
//        JSONObject json = JSONObject.fromObject(password);
//        String passwordFromMap = json.getString("password");
//        String clientRandomString = json.getString("clientRandomString");
//        String serverRandomString = json.getString("serverRandomString");
//        
//        //获取服务端随机数
//        byte[] rsData = Base64.decode(serverRandomString);
//        
//        //客户端随机数
//        byte[] rcData = decryptRSAToByte(clientRandomString,privateKey);
//        
//        //按规则将前12位拼接成对称密钥，并将后四位拼接成初始向量
//        byte[] keyData = new byte[24];
//        byte[] ivData = new byte[8];
//        System.arraycopy(rsData, 0, keyData, 0, 12);
//        System.arraycopy(rcData, 0, keyData, 12, 12);
//        System.arraycopy(rsData, 12, ivData, 0, 4);
//        System.arraycopy(rcData, 12, ivData, 4, 4);
//        
//        //以DES使用密钥及初始向量对密码进行解密
//        byte[] plainPWDBinary = SecurityUtil.DES3_CBC_Decrypt(ivData, keyData, Base64.decode(passwordFromMap));
//        
//        String plainPWD = new String(plainPWDBinary);
//        
//        String pwdFromIE = StringUtil.trim(bytes2Hex(Base64.decode(plainPWD)).toUpperCase());
//        
//        return pwdFromIE;
//    }
    
    /**
     * H5控件解析原文
     * @param password
     * @param privateKey
     * @return
     * @throws CodeException
     */
    public static String decryptPasswordWithH5EdtionOri(String password, PrivateKey privateKey ) throws CodeException{
        Map<String, String> map = new HashMap<String, String>();
        String array[] = password.substring(1, password.length()-1).split(",");
        for(int i=0;i<array.length;i++){
            map.put(array[i].split(":")[0], array[i].split(":")[1]);
        }
        String passwordFromMap = map.get("password");
        String clientRandomString = map.get("clientRandomString");
        String serverRandomString = map.get("serverRandomString");
        
        //获取服务端随机数
        byte[] rsData = Base64.decode(serverRandomString);
        
        //客户端随机数
        byte[] rcData = decryptRSAToByte(clientRandomString,privateKey);
        
        //按规则将前12位拼接成对称密钥，并将后四位拼接成初始向量
        byte[] keyData = new byte[24];
        byte[] ivData = new byte[8];
        System.arraycopy(rsData, 0, keyData, 0, 12);
        System.arraycopy(rcData, 0, keyData, 12, 12);
        System.arraycopy(rsData, 12, ivData, 0, 4);
        System.arraycopy(rcData, 12, ivData, 4, 4);
        
        //以DES使用密钥及初始向量对密码进行解密
        byte[] plainPWDBinary = SecurityUtil.DES3_CBC_Decrypt(ivData, keyData, Base64.decode(passwordFromMap));
        
        String plainPWD = new String(plainPWDBinary);
        
        String pwdFromIE = StringUtil.trim(Encrypt(plainPWD).toUpperCase());
        
        return pwdFromIE;
    }
    
    public static String Encrypt(String strSrc) {
        MessageDigest md = null;
        String strDes = null;
        byte[] bt = strSrc.getBytes();
        try {
            md = MessageDigest.getInstance("SHA-1");
            md.update(bt);
            strDes = bytes2Hex(md.digest()); // to HexString
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        return strDes;
    }

    public static String bytes2Hex(byte[] bts) {
        String des = "";
        String tmp = null;
        for (int i = 0; i < bts.length; i++) {
            tmp = (Integer.toHexString(bts[i] & 0xFF));
            if (tmp.length() == 1) {
                des += "0";
            }
            des += tmp;
        }
        return des;
    }
}
