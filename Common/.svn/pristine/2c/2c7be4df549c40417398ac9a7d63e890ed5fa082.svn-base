package com.yonyou.scf.common.util.security;

import java.util.HashMap;

/**
 * 签名服务
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
public class SignatureFactory {

	private static HashMap<String, Signer> signerMap = new HashMap<String, Signer>();
	private static HashMap<String, Verifier> verifierMap = new HashMap<String, Verifier>();

	private static String defaultSigner;
	private static String defaultVerifier;

	private SignatureFactory() {
	}

	public static void addSigner(String signerID, Signer signer) {
		signerMap.put(signerID, signer);
		defaultSigner = signerID;
	}

	public static void addVerifier(String verifierID, Verifier verifier) {
		verifierMap.put(verifierID, verifier);
		defaultVerifier = verifierID;
	}

	public static Signer getSigner() {
		return signerMap.get(defaultSigner);
	}

	public static Signer getSigner(String signerID) {
		return signerMap.get(signerID);
	}

	public static Verifier getVerifier() {
		return verifierMap.get(defaultVerifier);
	}

	public static Verifier getVerifier(String verifierID) {
		return verifierMap.get(verifierID);
	}

	public static void clearVerifier() {
		verifierMap.clear();
	}

}
