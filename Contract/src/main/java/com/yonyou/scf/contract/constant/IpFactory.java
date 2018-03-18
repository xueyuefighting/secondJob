package com.yonyou.scf.contract.constant;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.yonyou.scf.common.constant.URLConst;

public class IpFactory {
//	public static String IP;
//	public static String PORT = "53002";
	static {
		InputStream in  = IpFactory.class.getClassLoader().getResourceAsStream("application.properties");
		Properties p = new Properties();
		try {
			p.load(in);
//			IP =  p.getProperty("local.server.outSide.ip");
//			PORT = p.getProperty("server.port");
		} catch (IOException e) {
			e.printStackTrace();
//			IP = "";
//			PORT = "";
		}finally{
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
//	public static String viewUrl = "http://"+IpFactory.IP+":"+IpFactory.PORT+"/constract/viewPDF?fileId=";
//	public static String downUrl = "http://"+IpFactory.IP+":"+IpFactory.PORT+"/constract/downPDF?fileId=";
	
	public static String CREDIT_IP = "";//授信请求ip 
	public static String CREDIT_PORT = "";//授信请求端口号
	
	public static String FINANCE_IP = "";//融资申请请求ip 
	public static String FINANCE_PORT = "";//融资申请请求端口号 
	
	public static String COMPANY_USER_IP = "";//获取所有企业id和名字的请求ip 
	public static String COMPANY_USER_PORT = "";//获取所有企业id和名字的请求端口号 
	
	public static String FAA_SIGN = "http://47.93.14.99:58101/Fadada/extsign";//获取所有企业id和名字的请求端口号 
	
//	public static String CALLBACK_CREDIT_URL = IP+PORT+"/fddConstract/FDDCallBackCredit";//授信签署 回调接口
	public static String CALLBACK_FINANCE_URL = URLConst.URL_CONTRACT+ "/FDDCallBackFinance";//融资申请签署 回调接口
	
//	public static String UPFILE_BACK_Url = "http://192.168.16.118:8081/Lightweight";
}
