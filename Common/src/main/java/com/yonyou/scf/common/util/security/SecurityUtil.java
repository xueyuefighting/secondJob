package com.yonyou.scf.common.util.security;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Enumeration;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

import com.yonyou.scf.common.system.CodeException;
import com.yonyou.scf.common.util.StringUtil;
import com.yonyou.scf.common.util.codec.Base64;

/**
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
public class SecurityUtil {

	public static final String DIGEST_ALGORITHM_MD5 = "MD5";

	public static final String DIGEST_ALGORITHM_SHA1 = "SHA-1";

	public static final String SIGNATURE_ALGORITHM_MD5_WITH_RSA = "MD5withRSA";

	public static final String SIGNATURE_ALGORITHM_SHA1_WITH_RSA = "SHA1withRSA";

	public static final String SIGNATURE_ALGORITHM_SHA256_WITH_RSA = "SHA256withRSA";

	// 数据脱敏用，胜苏，2016-05-03
	// 24位，供应链金融事业部
	static byte[] KEY_DATA = new byte[] { -28, -66, -101, -27, -70, -108, -23, -109, -66, -23, -121, -111, -24, -98, -115, -28, -70, -117, -28, -72, -102, -23,
			-125, -88 };

	// 8位，scf@1234
	static byte[] IV_DATA = new byte[] {115,99,102,64,49,50,51,52};

	// 目前支持SHA1withRSA和SHA256withRSA两种签名方式
	public static String[] SIGNATURE_ALGORITHMS_IN_USE = new String[] { SecurityUtil.SIGNATURE_ALGORITHM_SHA1_WITH_RSA,
			SecurityUtil.SIGNATURE_ALGORITHM_SHA256_WITH_RSA };

	/**
	 * Get PrivateKey from PFX.
	 */
	public static PrivateKey getPrivateKeyFromPFX(String pfxfilename, String password) throws Exception {
		// pfx格式的KeyStore的类型是pkcs#12
		KeyStore keyStore = KeyStore.getInstance("PKCS12");

		FileInputStream fis = new FileInputStream(pfxfilename);
		keyStore.load(fis, password.toCharArray());
		fis.close();

		Enumeration<String> aliases = keyStore.aliases();

		// 从pfx文件获得私钥和证书，BC jce和SUN不同，在SUN JCE中，公钥和私钥对应一个别名；而在BC中则对应不同的别名。
		String alias = (String) aliases.nextElement();

		// 获得用户证书私钥
		return (PrivateKey) keyStore.getKey(alias, password.toCharArray());
	}

	/**
	 * 加载安全控件需要的私钥，用于RSA算法的解密
	 * 
	 * @param pfxFileName
	 * @param pfxPassword
	 * @return
	 * @throws Exception
	 */
	public static PrivateKey getPrivateKeyFromPFXForRSA(String pfxFileName, String pfxPassword) throws Exception {

		FileInputStream file_inputstream = new FileInputStream(pfxFileName);
		KeyStore keyStore = KeyStore.getInstance("PKCS12");

		keyStore.load(file_inputstream, pfxPassword.toCharArray());

		String alias = null;
		Enumeration<String> aliases = keyStore.aliases();
		if (aliases.hasMoreElements()) {
			alias = aliases.nextElement().toString();
		}

		Key key = keyStore.getKey(alias, pfxPassword.toCharArray());
		PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(key.getEncoded());
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");

		return keyFactory.generatePrivate(keySpec);
	}

	/**
	 * Hash the message with algorithm.
	 */
	public static byte[] digest(String message, String algorithm) throws Exception {
		MessageDigest md = MessageDigest.getInstance(algorithm);
		md.update(message.getBytes(StringUtil.DEFAULT_CHARSET));
		return md.digest();
	}

	/**
	 * Hash the message with default algorithm "MD5".
	 */
	public static byte[] digest(String message) throws Exception {
		return digest(message, DIGEST_ALGORITHM_MD5);
	}

	/**
	 * Create a X509Certificate from a string encoded with base64.
	 * 
	 * @throws UnsupportedEncodingException
	 */
	public static X509Certificate generateCertificate(String base64string) throws CertificateException, UnsupportedEncodingException {
		if (!base64string.startsWith("--")) {
			base64string = "-----BEGIN CERTIFICATE-----\n" + base64string + "\n-----END CERTIFICATE-----\n";
		}
		ByteArrayInputStream bais = new ByteArrayInputStream(base64string.getBytes("UTF-8"));
		CertificateFactory cf = CertificateFactory.getInstance("X.509");
		return (X509Certificate) cf.generateCertificate(bais);
	}

	public static X509Certificate generateCertificate(String base64string, String charset) throws CertificateException, UnsupportedEncodingException {
		if (!base64string.startsWith("--")) {
			base64string = "-----BEGIN CERTIFICATE-----\n" + base64string + "\n-----END CERTIFICATE-----\n";
		}
		ByteArrayInputStream bais = new ByteArrayInputStream(base64string.getBytes(charset));
		CertificateFactory cf = CertificateFactory.getInstance("X.509");
		return (X509Certificate) cf.generateCertificate(bais);
	}

	/**
	 * Create a X509Certificate from a file.
	 */
	public static X509Certificate generateCertificate(FileInputStream fis) throws CertificateException {
		CertificateFactory cf = CertificateFactory.getInstance("X.509");
		return (X509Certificate) cf.generateCertificate(fis);
	}

	public static KeyManager[] getKeyManagers(String keyStore, String keyStoreType, String keyStorePassword) throws Exception {
		String algorithm = KeyManagerFactory.getDefaultAlgorithm();
		KeyManagerFactory kmf = KeyManagerFactory.getInstance(algorithm);
		KeyStore ks = KeyStore.getInstance(keyStoreType);

		FileInputStream fis = new FileInputStream(keyStore);
		ks.load(fis, keyStorePassword.toCharArray());
		fis.close();
		kmf.init(ks, keyStorePassword.toCharArray());

		KeyManager[] kms = kmf.getKeyManagers();
		return kms;
	}

	public static TrustManager[] getTrustManagers(String trustStore, String trustStoreType, String trustStorePassword) throws Exception {
		String algorithm = TrustManagerFactory.getDefaultAlgorithm();
		TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(algorithm);
		KeyStore keyStore = KeyStore.getInstance(trustStoreType);

		FileInputStream fileInputStream = new FileInputStream(trustStore);
		keyStore.load(fileInputStream, trustStorePassword.toCharArray());
		fileInputStream.close();
		trustManagerFactory.init(keyStore);
		TrustManager[] tms = trustManagerFactory.getTrustManagers();
		return tms;
	}

	/**
	 * RSA解密，返回byte[]
	 * 
	 * @param encryptedDataBase64
	 * @param privateKey
	 * @return
	 * @throws CodeException
	 */
	public static byte[] decryptRSAToByte(String encryptedDataBase64, PrivateKey privateKey) throws CodeException {
		if (StringUtil.isEmpty(encryptedDataBase64)) {
			throw new CodeException("", "密文不能为空");
		}
		if (null == privateKey) {
			throw new CodeException("", "私钥不能为空");
		}

		// 解密结果
		byte[] plainBinary = null;
		try {
			Cipher rsaCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
			rsaCipher.init(Cipher.DECRYPT_MODE, privateKey);

			byte[] encodedBytes = Base64.decode(encryptedDataBase64);
			plainBinary = rsaCipher.doFinal(encodedBytes);
		} catch (Exception e) {
			System.err.println("RSADecrypt Exception:- " + e);
		}

		return plainBinary;
	}

	/**
	 * 将配置的签名算法转换为可实例化的签名算法字符串
	 * 
	 * @param algorithm
	 * @return
	 */
	public static String convertSignatureAlgorithm(String algorithm) {
		String result = null;
		algorithm = StringUtil.trim(algorithm);
		for (String algorithmInUse : SIGNATURE_ALGORITHMS_IN_USE) {
			if (algorithmInUse.equalsIgnoreCase(algorithm)) {
				result = algorithmInUse;
				break;
			}
		}
		return result;
	}

	/**
	 * DES解密，返回byte[]
	 * 
	 * @param ivData
	 * @param keyData
	 * @param cipherText
	 * @return
	 */
	public static byte[] DES3_CBC_Decrypt(byte[] ivData, byte[] keyData, byte[] cipherText) {
		SecretKeySpec key3Des = new SecretKeySpec(keyData, "DESede");
		IvParameterSpec IvSpec = new IvParameterSpec(ivData);
		byte[] plainText = null;
		try {
			Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE, key3Des, IvSpec);
			plainText = cipher.doFinal(cipherText);
		} catch (Exception e) {
			System.err.println("DecryptCipher Exception:- " + e);
		}
		return plainText;
	}

	/**
	 * DES加密，输入byte[]偏移量，byte[]密钥，byte[]明文，返回byte[]密文
	 * 
	 * @author shengsu
	 * @param ivData
	 * @param keyData
	 * @param cipherText
	 * @return
	 */
	public static byte[] DES3_CBC_Encrypt(byte[] ivData, byte[] keyData, byte[] plainText) {
		SecretKeySpec key3Des = new SecretKeySpec(keyData, "DESede");
		IvParameterSpec IvSpec = new IvParameterSpec(ivData);
		byte[] cipherText = null;
		try {
			Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, key3Des, IvSpec);
			cipherText = cipher.doFinal(plainText);
		} catch (Exception e) {
			System.err.println("EncryptCipher Exception:- " + e);
		}
		return cipherText;
	}

	/**
	 * 脱敏存储用解密，固定密钥和偏移量，输入十六进制密文串，返回明文串
	 * 
	 * @author shengsu
	 * @param cipherText
	 * @return
	 */
	public static String DES3_CBC_Decrypt(String cipherText) {
		String plainText = null;
		try {
			if (null != cipherText) {
				plainText = new String(DES3_CBC_Decrypt(IV_DATA, KEY_DATA, StringUtil.hex2bytes(cipherText)));
			}
		} catch (Exception e) {
			System.err.println("DecryptCipher Exception:- " + e);
		}
		return plainText;
	}

	/**
	 * 脱敏存储用加密，固定密钥和偏移量，输入明文串，返回十六进制密文串
	 * 
	 * @author shengsu
	 * @param plainText
	 * @return
	 */
	public static String DES3_CBC_Encrypt(String plainText) {
		String cipherText = null;
		try {
			if (null != plainText) {
				cipherText = StringUtil.bytes2hex(DES3_CBC_Encrypt(IV_DATA, KEY_DATA, plainText.getBytes(StringUtil.DEFAULT_CHARSET)));
			}
		} catch (Exception e) {
			System.err.println("EncryptCipher Exception:- " + e);
		}
		return cipherText;
	}
}
