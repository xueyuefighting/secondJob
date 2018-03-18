package com.yonyou.scf.common.util.security;

import java.security.PrivateKey;
import java.security.Signature;

import com.yonyou.scf.common.util.StringUtil;

/**
 * 软签名
 * 
 * <pre>
 * 
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu      2017-03-16  Create this file
 * 
 * </pre>
 */
public class PfxSigner implements Signer {

    private PrivateKey privateKey;

    private String algorithm = SecurityUtil.SIGNATURE_ALGORITHM_SHA1_WITH_RSA;

    public PfxSigner(String pfxFile, String password) throws Exception {
        privateKey = SecurityUtil.getPrivateKeyFromPFX(pfxFile, password);
    }
    
    public PfxSigner(String pfxFile, String password, String algorithm) throws Exception {
        privateKey = SecurityUtil.getPrivateKeyFromPFX(pfxFile, password);
        this.algorithm = algorithm;
    }

    public String sign(String message) throws Exception {
        Signature signature = Signature.getInstance(algorithm);
        signature.initSign(privateKey);
        signature.update(message.getBytes(StringUtil.DEFAULT_CHARSET));
        return StringUtil.bytes2hex(signature.sign());
    }

    public byte[] sign(byte[] bytes) throws Exception {
        Signature signature = Signature.getInstance(algorithm);
        signature.initSign(privateKey);
        signature.update(bytes);
        return signature.sign();
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

}
