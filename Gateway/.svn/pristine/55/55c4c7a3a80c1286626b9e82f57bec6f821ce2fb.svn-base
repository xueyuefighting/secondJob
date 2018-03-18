package com.yonyou.scf.gateway.cfcaTools;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.util.StringUtils;

import cfca.sadk.algorithm.common.PKIException;
import cfca.sadk.lib.crypto.JCrypto;
import cfca.sadk.lib.crypto.Session;
import cfca.sadk.util.Signature;
import cfca.sadk.x509.certificate.X509Cert;

/**
 * 验签工具
 * 
 * @author Administrator
 * 
 */
public class SecurityTools {

	private static Session session = null;

	static {
		try {
			JCrypto jcrypto = JCrypto.getInstance();
			jcrypto.initialize("JSOFT_LIB", null);
			session = jcrypto.openSession("JSOFT_LIB");
		} catch (Throwable e) {

		}
	}

	/**
	 * certVerify
	 * 
	 * @Title: certVerify
	 * @Description: 验证用户证书和签名数据是否合法
	 * @param signsrc
	 *            签名原文
	 * @param signature
	 *            签名密文
	 * @param userSn
	 *            用户绑定SN 从session中获取
	 * @throws Exception
	 * @return void 返回类型
	 * @throws
	 */
	public static X509Cert certVerify(String signsrc, String signature, String userSn) throws ApplicationException, Exception {

		Signature signUtil = new Signature();

		// 验证消息签名
		boolean verify = false;
		try {
			verify = signUtil.p7VerifyMessageAttach(signature.getBytes(), session);
		} catch (PKIException e) {
			throw new FcsAppException(e.getErrDesc());
		}
		if (!verify) {
			throw new FcsAppException("验证消息签名非法");
		}

		// 验证消息签名原文
		if (!Arrays.equals(signsrc.getBytes("UTF-8"), signUtil.getSourceData())) {
			throw new FcsAppException("消息签名原文不匹配");
		}

		// 证书信息
		X509Cert cert = signUtil.getSignerCert();

		// 验证证书是否失效
		// 证书失效日期
		Date notAfter = cert.getNotAfter();
		SimpleDateFormat formatTime = new SimpleDateFormat("yyyy-MM-dd");
		String notAft_str = formatTime.format(notAfter);
		// 当前系统日期
		String curTim_str = formatTime.format(new Date());
		// 当前系统时间大于证书失效日期
		if (curTim_str.compareTo(notAft_str) > 0) {
			throw new FcsAppException("您使用的证书已经失效，失效日期是: " + notAft_str);
		}

		// 验证当前证书序列号是否与数据库中存储的序列号一致
		if (!StringUtils.isEmpty(userSn)) {

			// 十进制的序列号
			String serialNumber = cert.getSerialNumber().toString();
			// 十六进制的序列号
			// String serialNumber = cert.getStringSerialNumber().toString();

			if (!serialNumber.equals(userSn)) {
				throw new FcsAppException("所用证书与绑定证书不匹配");
			}
		}

		return cert;
	}
}
