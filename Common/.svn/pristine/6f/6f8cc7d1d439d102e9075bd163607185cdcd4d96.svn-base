package com.yonyou.scf.common.util.codec;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.yonyou.scf.common.util.StringUtil;

/**
 * Base64和String之间的互转操作。
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu		2017-03-16	Create this file
 * 
 * </pre>
 * 
 */
public class Base64 {

	private static final Base64Encoder encoder = new Base64Encoder();

	/**
	 * 按Base64格式编码，输入byte[]，返回byte[]。
	 * 
	 * @param byte[]
	 * @return byte[]
	 */
	public static byte[] encode(byte[] data) {
		int len = (data.length + 2) / 3 * 4;
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(len);

		try {
			encoder.encode(data, 0, data.length, outputStream);
		} catch (IOException e) {
			throw new RuntimeException("exception encoding base64 string: " + e);
		}

		return outputStream.toByteArray();
	}

	/**
	 * Encode the byte data to base 64 writing it to the given output stream.
	 * 
	 * @return the number of bytes produced.
	 */
	public static int encode(byte[] data, OutputStream out) throws IOException {
		return encoder.encode(data, 0, data.length, out);
	}

	/**
	 * Encode the byte data to base 64 writing it to the given output stream.
	 * 
	 * @return the number of bytes produced.
	 */
	public static int encode(byte[] data, int off, int length, OutputStream out) throws IOException {
		return encoder.encode(data, off, length, out);
	}

	/**
	 * 按Base64格式解码，输入byte[]，返回byte[]。
	 * 
	 * @param data
	 * @return byte[]
	 */
	public static byte[] decode(byte[] data) {
		int len = data.length / 4 * 3;
		ByteArrayOutputStream bOut = new ByteArrayOutputStream(len);

		try {
			encoder.decode(data, 0, data.length, bOut);
		} catch (IOException e) {
			throw new RuntimeException("exception decoding base64 string: " + e);
		}

		return bOut.toByteArray();
	}

	/**
	 * 按Base64格式解码，输入String，返回byte[]。
	 * 
	 * @param data
	 * @return byte[]
	 */
	public static byte[] decode(String data) {
		int len = data.length() / 4 * 3;
		ByteArrayOutputStream bOut = new ByteArrayOutputStream(len);

		try {
			encoder.decode(data, bOut);
		} catch (IOException e) {
			throw new RuntimeException("exception decoding base64 string: " + e);
		}

		return bOut.toByteArray();
	}

	/**
	 * decode the base 64 encoded String data writing it to the given output
	 * stream, whitespace characters will be ignored.
	 * 
	 * @return the number of bytes produced.
	 */
	public static int decode(String data, OutputStream out) throws IOException {
		return encoder.decode(data, out);
	}

	/**
	 * 按Base64格式编码，输入String和字符集，返回String。
	 * 
	 * @param data
	 * @param charSet
	 * @return String
	 * @throws UnsupportedEncodingException
	 */
	public static String encode(String data, String charSet) throws UnsupportedEncodingException {
		if (StringUtil.isEmpty(data)) {
			return "";
		} else {
			return new String(encode(data.getBytes(charSet)), charSet);
		}
	}

	/**
	 * 按Base64格式解码，输入String和字符集，返回String。
	 * 
	 * @param data
	 * @param charSet
	 * @return String
	 * @throws UnsupportedEncodingException
	 */
	public static String decode(String data, String charSet) throws UnsupportedEncodingException {
		if (StringUtil.isEmpty(data)) {
			return "";
		} else {
			return new String(decode(data.getBytes(charSet)), charSet);
		}
	}

	/**
	 * 判断字符串是否在base64编码范围内
	 * 
	 * @param plaintext
	 * @return
	 */
	public static boolean matchBase64(String plaintext) {
		String regex = "[A-Za-z0-9,/,=,+]+";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(plaintext);
		if (m.matches())
			return true;
		return false;
	}
}
