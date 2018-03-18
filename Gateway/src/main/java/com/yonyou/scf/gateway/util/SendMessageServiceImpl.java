package com.yonyou.scf.gateway.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.codec.binary.Hex;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import com.yonyou.scf.gateway.bean.CHIFMtSmsSubmit;

import sun.misc.BASE64Encoder;

@Service
@ConfigurationProperties(locations="classpath:application.properties")
public class SendMessageServiceImpl {
	
	@Value("${spring.phoneMsg.config.url}")
	private String url;
	
	@Value("${spring.phoneMsg.config.sendAccount}")
	private String sendAccount;
	
	@Value("${spring.phoneMsg.config.password}")
	private String password;
	
	public String send(String content, String phone){
		return this.sendPhoneMessage(content, url.trim(), sendAccount.trim(), password.trim(), phone);
	}
	
	/* wp
	 * 易云平台
	 * 
	 */
	public String sendPhoneMessage(String content, String url, String sendAccount, String pwd, String phone) {

		PrintWriter printWriter = null;
		BufferedReader bufferedReader = null;
		String responseResult = "";
		HttpURLConnection httpURLConnection = null; // 创建HttpURLConnection
		String[] DestTerminalId = { phone };
		// Post数据类
		CHIFMtSmsSubmit submit = new CHIFMtSmsSubmit(); // 手机号码（最大 21 位），集合表示。
		submit.setDest_terminal_Id(DestTerminalId);
		// 需要状态报告
		submit.setRegistered_Delivery(1);
		submit.setMsg_level(9);
		// 手机号码（最大 21 位），集合表示。
		submit.setMsg_Fmt(15);
		String MsgContent = content;
		byte[] msg_content = null;
		try {
			msg_content = MsgContent.getBytes("GBK");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} // GBK编码转化
		submit.setMsg_Content(msg_content); // 短信内容，使用 Msg_Fmt 编码编码为 Byte[]。
		String json = submit.toJson(); // 对象转化为Json

		try {
			String time = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()); // 时间戳yyyyMMddHHmmss
			
			String token = Hex.encodeHexString(new Md5().encrypt(sendAccount + time + pwd)); // 拼接Token
			URL realUrl = new URL(url + sendAccount + "/" + token); // 拼接URL
			// 打开和URL之间的连接
			httpURLConnection = (HttpURLConnection) realUrl.openConnection();
			String str = sendAccount + ":" + time;
			byte[] datas = str.getBytes("GBK");
			BASE64Encoder Base64 = new BASE64Encoder();
			String authorization = new String(Base64.encode(datas));// Base64加密
			// 设置通用的请求属性
			httpURLConnection.setRequestProperty("accept", "application/json");
			httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=utf-8");
			httpURLConnection.setRequestProperty("Authorization", authorization);
			httpURLConnection.setDoOutput(true);
			httpURLConnection.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			printWriter = new PrintWriter(httpURLConnection.getOutputStream());
			// 发送请求参数
			printWriter.write(json);
			// flush输出流的缓冲
			printWriter.flush();
			// 根据ResponseCode判断连接是否成功
			int responseCode = httpURLConnection.getResponseCode();
			if (responseCode != 200) {
				responseResult = " Error===" + responseCode;
			}
			// 定义BufferedReader输入流来读取URL的ResponseData
			bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				responseResult += line;
			}
		} catch (Exception e) {
			responseResult = "send post request error!" + e;
		} finally {
			httpURLConnection.disconnect();
			try {
				if (printWriter != null) {
					printWriter.close();
				}
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}
		return responseResult;
	}
}
