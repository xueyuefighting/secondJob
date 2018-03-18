package com.yonyou.scf.common.util.security;
//package com.yonyou.scf.tools.security;
//
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.security.PrivateKey;
//import java.security.PublicKey;
//import java.security.Signature;
//
//import javax.security.auth.x500.X500Principal;
//
//import org.bouncycastle.asn1.ASN1InputStream;
//import org.bouncycastle.asn1.ASN1Sequence;
//import org.bouncycastle.asn1.DERBitString;
//import org.bouncycastle.asn1.DERObjectIdentifier;
//import org.bouncycastle.asn1.DEROutputStream;
//import org.bouncycastle.asn1.pkcs.CertificationRequest;
//import org.bouncycastle.asn1.pkcs.CertificationRequestInfo;
//import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
//import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
//import org.bouncycastle.jce.X509Principal;
//
///**
// * 
// * <pre>
// * Modify Information:
// * Author       Date        Description
// * ============ =========== ============================
// * shengsu      2017-03-16  Create this file
// * 
// * </pre>
// * 
// * PKCS#10
// * 
// */
//class PKCS10CertificationRequest extends CertificationRequest {
//
//	private final String algorithm = "SHA1withRSA"; // 签名算法
//	private final String identifier = "1.2.840.113549.1.1.5";// 签名算法标识符
//
//	public PKCS10CertificationRequest(X500Principal subject, PublicKey publicKey, PrivateKey privateKey) throws Exception {
//		// AlgorithmIdentifier using sha1RSA
//		DERObjectIdentifier sigOID = new DERObjectIdentifier(identifier);
//
//		if (subject == null) {
//			throw new IllegalArgumentException("Subject must not be null");
//		}
//
//		if (publicKey == null) {
//			throw new IllegalArgumentException("Public key must not be null");
//		}
//
//		// AlgorithmIdentifier
//		this.sigAlgId = new AlgorithmIdentifier(sigOID, null);
//
//		// SubjectPublicKeyInfo
//		byte[] bytes = publicKey.getEncoded();
//
//		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
//		ASN1InputStream asn1InputStream = new ASN1InputStream(byteArrayInputStream);
//
//		SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo((ASN1Sequence) asn1InputStream.readObject());
//
//		// CertificationRequestInfo
//		X509Principal dn = new X509Principal(subject.getEncoded());
//		this.reqInfo = new CertificationRequestInfo(dn, subjectPublicKeyInfo, null);
//
//		// Sign the CertificationRequestInfo
//		Signature sig = Signature.getInstance(algorithm);
//		sig.initSign(privateKey);
//
//		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//		DEROutputStream derOutputStream = new DEROutputStream(byteArrayOutputStream);
//
//		derOutputStream.writeObject(reqInfo);
//		sig.update(byteArrayOutputStream.toByteArray());
//
//		// DERBitString
//		this.sigBits = new DERBitString(sig.sign());
//	}
//}
