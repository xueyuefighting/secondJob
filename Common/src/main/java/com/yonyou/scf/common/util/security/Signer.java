package com.yonyou.scf.common.util.security;

/**
 * 签名接口
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu      2017-03-16  Create this file
 * 
 * </pre>
 * 
 */
public interface Signer {

    public String sign(String message) throws Exception;

    public byte[] sign(byte[] data) throws Exception;

}