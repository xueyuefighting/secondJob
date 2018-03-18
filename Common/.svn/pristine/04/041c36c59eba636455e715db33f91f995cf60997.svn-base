package com.yonyou.scf.common.util;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.StringCharacterIterator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * String工具类
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu		2017-03-16	Create this file
 * zhangxu      2017-09-14  update toString
 * durui        2017-09-27  create FormatTimeStringFrom17 (length=17 dateStr -> yyyy-MM-dd HH:mm:ss)
 * </pre>
 * 
 */
public class StringUtil {

	public static final String DEFAULT_CHARSET = "UTF-8";

	public static String escape(String src, HashMap<String, String> hashMap) {
		if (src == null || src.trim().length() == 0) {
			return "";
		}

		StringBuffer sb = new StringBuffer();
		StringCharacterIterator sci = new StringCharacterIterator(src);
		for (char c = sci.first(); c != StringCharacterIterator.DONE; c = sci.next()) {
			String ch = String.valueOf(c);
			if (hashMap.containsKey(ch)) {
				ch = hashMap.get(ch);
			}
			sb.append(ch);
		}
		return sb.toString();
	}

	public static String escapeSQL(String input) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("'", "''");
		return escape(input, hashMap);
	}

	public static String escapeXML(String input) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("<", "&lt;");
		hashMap.put(">", "&gt;");
		hashMap.put("'", "&apos;");
		hashMap.put("\"", "&quot;");
		hashMap.put("&", "&amp;");
		return escape(input, hashMap);
	}

	/**
	 * 去掉字符串中的逗号 例如：去掉金额字符串中的逗号
	 */
	public static String removeComma(String string) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < string.length(); i++) {
			if (',' != string.charAt(i)) {
				sb.append(string.charAt(i));
			}
		}
		return sb.toString();
	}

	/**
	 * 将字符串中的非字符转换成字母X
	 * 
	 */
	public static String toLetterOrDigit(String string) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLetterOrDigit(string.charAt(i))) {
				sb.append(string.charAt(i));
			} else {
				sb.append("X");
			}
		}
		return sb.toString();
	}

	/**
	 * 将字符串中的非字母转换成字母
	 * 
	 */
	public static String toLetter(String string) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < string.length(); i++) {
			if (Character.isLetter(string.charAt(i))) {
				sb.append(string.charAt(i));
			} else if (Character.isDigit(string.charAt(i))) {
				switch (string.charAt(i)) {
				case '0': {
					sb.append("A");
					break;
				}
				case '1': {
					sb.append("B");
					break;
				}
				case '2': {
					sb.append("C");
					break;
				}
				case '3': {
					sb.append("D");
					break;
				}
				case '4': {
					sb.append("E");
					break;
				}
				case '5': {
					sb.append("F");
					break;
				}
				case '6': {
					sb.append("G");
					break;
				}
				case '7': {
					sb.append("H");
					break;
				}
				case '8': {
					sb.append("I");
					break;
				}
				case '9': {
					sb.append("J");
					break;
				}
				}
			} else {
				sb.append("M");
			}
		}
		return sb.toString();
	}

	public static String bytes2hex(byte[] bytes) {
		String result = "";
		String b = "";
		if (null == bytes) {
			return null;
		}
		for (int i = 0; i < bytes.length; i++) {
			b = Integer.toHexString(bytes[i] & 0xFF);
			if (b.length() == 1) {
				b = "0" + b;
			}
			result += b;
		}
		return result.toUpperCase();
	}

	public static byte[] hex2bytes(String hexString) {
		// 转换成大写
		hexString = hexString.toUpperCase();

		// 计算字节数组的长度
		char[] chars = hexString.toCharArray();
		byte[] bytes = new byte[chars.length / 2];

		// 数组索引
		int index = 0;

		for (int i = 0; i < chars.length; i += 2) {
			byte newByte = 0x00;

			// 高位
			newByte |= char2byte(chars[i]);
			newByte <<= 4;

			// 低位
			newByte |= char2byte(chars[i + 1]);

			// 赋值
			bytes[index] = newByte;

			index++;
		}
		return bytes;
	}

	public static byte char2byte(char ch) {
		switch (ch) {
		case '0':
			return 0x00;
		case '1':
			return 0x01;
		case '2':
			return 0x02;
		case '3':
			return 0x03;
		case '4':
			return 0x04;
		case '5':
			return 0x05;
		case '6':
			return 0x06;
		case '7':
			return 0x07;
		case '8':
			return 0x08;
		case '9':
			return 0x09;
		case 'A':
			return 0x0A;
		case 'B':
			return 0x0B;
		case 'C':
			return 0x0C;
		case 'D':
			return 0x0D;
		case 'E':
			return 0x0E;
		case 'F':
			return 0x0F;
		default:
			return 0x00;
		}
	}

	/*
	 * Converts a byte to hex digit and writes to the supplied buffer
	 */
	private static void byte2hex(byte b, StringBuffer sb) {
		char[] hexChars = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		int high = ((b & 0xf0) >> 4);
		int low = (b & 0x0f);
		sb.append(hexChars[high]);
		sb.append(hexChars[low]);
	}

	/**
	 * Converts a byte array to hex string
	 * 
	 * @param bytes
	 * @param c
	 *            分隔符
	 * @return 十六进制字符串
	 */
	public static String toHexString(byte[] bytes, char c) {
		StringBuffer sb = new StringBuffer();
		int len = bytes.length;
		for (int i = 0; i < len; i++) {
			byte2hex(bytes[i], sb);
			if (i < len - 1) {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static Object ByteToObject(byte[] bytes) {
		Object obj = null;
		try {
			// bytearray to object
			ByteArrayInputStream bi = new ByteArrayInputStream(bytes);
			ObjectInputStream oi = new ObjectInputStream(bi);

			obj = oi.readObject();
			bi.close();
			oi.close();
		} catch (Exception e) {
			System.out.println("translation" + e.getMessage());
			e.printStackTrace();
		}
		return obj;
	}

	/**
	 * Converts a byte array to hex string
	 * 
	 * @param bytes
	 * @return 十六进制字符串
	 */
	public static String toHexString(byte[] bytes) {
		StringBuffer sb = new StringBuffer();
		int len = bytes.length;
		for (int i = 0; i < len; i++) {
			byte2hex(bytes[i], sb);
		}
		return sb.toString();
	}

	/**
	 * 判断字符串是否为空
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if (null == str || "".equals(str.trim())) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 判断字符串是否不为空
	 * 
	 */
	public static boolean isNotEmpty(String str) {
		if (str != null && !"".equals(str.trim())) {
			return true;
		} else {
			return false;
		}
	}

	public static String replace(String string, String replacement) {
		if (string != null) {
			return string.replaceAll(replacement, "");
		} else {
			return null;
		}
	}

	/**
	 * 单纯trim <br>
	 * 若 string 为 null 或 "" 时，返回 "" <br>
	 * 余 正常trim <br>
	 * 
	 * @param string
	 * @return
	 */
	public static String trim(String string) {
		if (isEmpty(string)) {
			return "";
		} else {
			return string.trim();
		}
	}

	/**
	 * 高级trim <br>
	 * 若 string 为 null 或 "" 时，返回 "" <br>
	 * 若 string 为 "null" 时，返回 "" <br>
	 * 余 正常trim <br>
	 * 
	 * @param string
	 * @return
	 */
	public static String trimNull(String string) {
		if (isEmpty(string)) {
			return "";
		} else if ("null".equalsIgnoreCase(string)) {
			return "";
		} else {
			return string.trim();
		}
	}

	/**
	 * 单纯trim，用于数字形式 <br>
	 * 若 string 为 null 或 "" 时，返回 "0" <br>
	 * 余 正常trim <br>
	 * 
	 * @param string
	 * @return
	 */
	public static String trimNum(String string) {
		if (isEmpty(string)) {
			return "0";
		} else {
			return string.trim();
		}
	}

	/**
	 * 高级trim，用于数字形式 <br>
	 * 若 string 为 null 或 "" 时，返回 "0" <br>
	 * 若 string 为 "null" 时，返回 "0" <br>
	 * 余 正常trim <br>
	 * 
	 * @param string
	 * @return
	 */
	public static String trimNumNull(String string) {
		if (isEmpty(string)) {
			return "0";
		} else if ("null".equalsIgnoreCase(string)) {
			return "0";
		} else {
			return string.trim();
		}
	}

	/**
	 * 判断下拉列表选中项是否有效
	 * 
	 * @param string
	 * @return
	 */
	public static boolean isValidList(String string) {
		if (isEmpty(string) || "-1".equals(string.trim())) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * a-bA-B0-9 +-=?./:· space chinese
	 * 
	 * @param string
	 * @return
	 */
	public static boolean validate(String string) {
		Pattern pattern = Pattern.compile("^[\\\\\\(\\)\\（\\）\\[\\]\\{\\}\\『\\』\\【\\】\\·\\!\\w\\.\\@\\?\\+\\_\\—\\|\\－\\-\\=\\/\\:\\：\\,\\s\u4E00-\u9FBB\u3400-\u4DB5\uF900-\uFA6A\uE815-\uE864\\#]*$");
		Matcher m = pattern.matcher(string);
		return m.matches();
	}

	/**
	 * 两个byte[]按顺序逐位拼接
	 * 
	 * @param b1
	 * @param b2
	 * @return
	 */
	public static byte[] byteConcat(byte[] b1, byte[] b2) {

		if (null == b1 || null == b2) {
			return null;
		}

		int b1Len = b1.length;
		int b2Len = b2.length;
		byte[] b = new byte[b1Len + b2Len];

		for (int i = 0; i < b1Len; i++) {
			b[i] = b1[i];
		}
		for (int i = 0; i < b2Len; i++) {
			b[i + b1Len] = b2[i];
		}

		return b;
	}

	/**
	 * 两个byte[]的异或运算，返回byte[]
	 * 
	 * @param b1
	 * @param b2
	 * @return
	 */
	public static byte[] byteXORbyte(byte[] b1, byte[] b2) {
		if ((null != b1) && (null != b2)) {
			int b1Len = b1.length;
			int b2Len = b2.length;
			if (null == b1 || null == b2) {
				return null;
			}
			if (b1Len != b2Len) {
				return null;
			}

			byte[] byteXOR = new byte[b1Len];
			for (int i = 0; i < b1Len; i++) {
				byteXOR[i] = (byte) (b1[i] ^ b2[i]);
			}
			return byteXOR;
		} else {
			return null;
		}
	}

	/**
	 * 在右侧补充字符stuff，使字符str长度达到size
	 * 
	 * @param str
	 * @param stuff
	 * @param size
	 * @return
	 */
	public static String rightPad(String str, char stuff, int size) {
		if (str == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder(size);
		sb.append(str);
		while (sb.length() < size) {
			sb.append(stuff);
		}
		return sb.toString();
	}

	/**
	 * 在左侧补充字符stuff，使字符str长度达到size
	 * 
	 * @param str
	 * @param stuff
	 * @param size
	 * @return
	 */
	public static String leftPad(String str, char stuff, int size) {
		if (str == null) {
			return null;
		}
		int pads = size - str.length();
		if (pads <= 0) {
			return str; // returns original String when possible
		}
		StringBuilder sb = new StringBuilder(size);
		while (sb.length() < pads) {
			sb.append(stuff);
		}
		sb.append(str);
		return sb.toString();
	}

	/**
	 * 将字符串转换为int类型，转换不成功则返回默认值
	 * 
	 * @param sourceString
	 *            源字符串
	 * @param defaultValue
	 *            默认值
	 * @return
	 */
	public static int parseInt(String sourceString, int defaultValue) {
		int value = defaultValue;
		if (!isEmpty(sourceString)) {
			try {
				value = Integer.parseInt(sourceString);
				;
			} catch (Exception e) {
				value = defaultValue;
			}
		}
		return value;
	}

	/**
	 * 删除ArrayList中重复元素 元素为String
	 * 
	 * @param list
	 */
	public static void removeDuplicate(List<String> list) {
		HashSet<String> h = new HashSet<String>(list);
		list.clear();
		list.addAll(h);
	}

	/**
	 * 将对象类型转换为字符类型
	 * @param obj
	 * @return
	 */
	public static String toString(Object obj) {
		if (null != obj && !"".equals(obj)) {
			return obj.toString();
		}
		return null;
	}

	/**
	 * 17位字符串转时间日期格式
	 * @param string
	 * @return string
	 */
	public static String FormatTimeStringFrom17(String time) {
		if (StringUtil.isEmpty(time)) {
			return "";
		}
		SimpleDateFormat oldFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date;
		try {
			date = oldFormat.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return "";
		}
		return newFormat.format(date);
	}

	public static String getFirstItemOfArray(String strArray[]) {
		if (null == strArray || strArray.length == 0) {
			return "";
		} else {
			return StringUtil.trimNull(strArray[0]);
		}
	}
}