package com.yonyou.scf.common.util.io;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
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
public class IoUtil {

	/**
	 * 读入bufferSize大小的inputstream流
	 * 
	 * @param inputStream
	 * @param bufferSize
	 * @return
	 * @throws IOException
	 */
	public static byte[] read(InputStream inputStream, int bufferSize) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] buffer = new byte[bufferSize];
		int num = inputStream.read(buffer);
		while (num != -1) {
			baos.write(buffer, 0, num);
			num = inputStream.read(buffer);
		}
		baos.flush();
		return baos.toByteArray();
	}

	/**
	 * 以bufferSize 大小为单位向 outputStream发送数据
	 */
	public static void write(OutputStream outputStream, byte[] contentBytes, int bufferSize) throws IOException {
		int length = contentBytes.length;
		int count = length / bufferSize;

		byte[] buffer = new byte[bufferSize];
		for (int index = 0; index < count; index++) {
			System.arraycopy(contentBytes, index * bufferSize, buffer, 0, bufferSize);
			outputStream.write(buffer);
		}

		if (length % bufferSize != 0) {
			int remaining = length - count * bufferSize;
			System.arraycopy(contentBytes, count * bufferSize, buffer, 0, remaining);
			outputStream.write(buffer, 0, remaining);
		}
		outputStream.flush();
	}

	/**
	 * 按LV格式向outputstream发送数据
	 * 
	 * @param outputStream
	 * @param sendBytes
	 * @throws IOException
	 */
	public static void sendLengthValue(OutputStream outputStream, byte[] sendBytes) throws IOException {
		outputStream.write(addLength(sendBytes));
		outputStream.flush();
	}

	/**
	 * 按LV格式从inputstream读取数据
	 * 
	 * @param inputStream
	 * @return
	 * @throws IOException
	 */
	public static byte[] readLengthValue(InputStream inputStream) throws IOException {
		int receiveLength = readInt(inputStream);
		int bufferSize = receiveLength < 4096 ? receiveLength : 4096;
		byte[] read = read(inputStream, receiveLength, bufferSize);
		return read;
	}

	/**
	 * 计算LV格式的报文长，并添加到报文头，返回带LV格式的新报文
	 * 
	 * @param bytes
	 * @return
	 */
	private static byte[] addLength(byte[] bytes) {
		int totalLength = bytes.length + 4;

		byte[] lengthedArray = new byte[totalLength];

		System.arraycopy(intToByteArray(bytes.length), 0, lengthedArray, 0, 4);
		System.arraycopy(bytes, 0, lengthedArray, 4, bytes.length);

		return lengthedArray;
	}

	/**
	 * int格式转byte[]
	 * 
	 * @param i
	 * @return
	 */
	private static byte[] intToByteArray(int i) {
		byte[] intBytes = new byte[4];
		intBytes[0] = (byte) ((i >> 24) & 0xFF);
		intBytes[1] = (byte) ((i >> 16) & 0xFF);
		intBytes[2] = (byte) ((i >> 8) & 0xFF);
		intBytes[3] = (byte) (i & 0xFF);
		return intBytes;
	}

	/**
	 * 从inputstream读取数据
	 * 
	 * @param inputStream
	 * @return
	 * @throws IOException
	 */
	private static int readInt(InputStream inputStream) throws IOException {
		int ch1 = inputStream.read();
		int ch2 = inputStream.read();
		int ch3 = inputStream.read();
		int ch4 = inputStream.read();
		if ((ch1 | ch2 | ch3 | ch4) < 0)
			throw new EOFException();
		return ((ch1 << 24) + (ch2 << 16) + (ch3 << 8) + (ch4 << 0));
	}

	/**
	 * 从inputstream读取数据，每次读入buffersize长度，
	 * 读取总长度为 buffersize * (N-1) <= length <= buffersize * N
	 * 
	 * @param inputStream
	 * @param length
	 * @param bufferSize
	 * @return
	 * @throws IOException
	 */
	private static byte[] read(InputStream inputStream, int length, int bufferSize) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] buffer = new byte[bufferSize];
		int totalNum = 0;
		int num = 0;
		// totalNum += num;
		while ((num = inputStream.read(buffer)) > 0 && ((totalNum += num) <= length)) {
			baos.write(buffer, 0, num);
			if (totalNum >= length) {
				break;
			}
		}
		baos.flush();
		return baos.toByteArray();
	}
}
