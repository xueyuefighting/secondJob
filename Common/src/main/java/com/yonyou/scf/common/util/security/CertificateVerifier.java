package com.yonyou.scf.common.util.security;

import java.io.FileInputStream;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateFactory;

import com.yonyou.scf.common.util.StringUtil;

/**
 * 验证签名
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
public class CertificateVerifier implements Verifier {

	private PublicKey publicKey;
	private String algorithm = SecurityUtil.SIGNATURE_ALGORITHM_SHA1_WITH_RSA;

	public CertificateVerifier(String file) throws Exception {
		FileInputStream fis = new FileInputStream(file);
		CertificateFactory cf = CertificateFactory.getInstance("X.509");
		publicKey = cf.generateCertificate(fis).getPublicKey();
	}

	public CertificateVerifier(String file, String algorithm) throws Exception {
		FileInputStream fis = new FileInputStream(file);
		CertificateFactory cf = CertificateFactory.getInstance("X.509");
		publicKey = cf.generateCertificate(fis).getPublicKey();
		this.algorithm = algorithm;
	}

	public boolean verify(String message, String signature) throws Exception {
		byte[] bytes = StringUtil.hex2bytes(signature);
		Signature sig = Signature.getInstance(algorithm);
		sig.initVerify(publicKey);
		sig.update(message.getBytes(StringUtil.DEFAULT_CHARSET));
		return sig.verify(bytes);
	}

	public boolean verify(byte[] data, byte[] signature) throws Exception {
		Signature sig = Signature.getInstance(algorithm);
		sig.initVerify(publicKey);
		sig.update(data);
		return sig.verify(signature);
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

}
