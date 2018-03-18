package com.yonyou.scf.common.util.net;

import java.util.ArrayList;

import com.yonyou.scf.common.constant.DefaultConst;
import com.yonyou.scf.common.system.CodeException;
import com.yonyou.scf.common.system.ScfEnvironment;
import com.yonyou.scf.common.system.SystemIni;
import com.yonyou.scf.common.tx.api.TxRequest;
import com.yonyou.scf.common.tx.api.TxResponse;
import com.yonyou.scf.common.util.StringUtil;
import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 此方法用于Message模块给前端业务平台发送消息报文
 * 
 * HTTPS/HTTP 通讯工具类，向客户端发消息
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu      2017-03-16  Create this file
 * shengsu		2017-11-21  针对System.ini进行了拓展
 * 
 * </pre>
 * 
 */
public class TxMessenger {

	/**
	 * 向客户端发消息
	 * 
	 * @param ArrayList<NameValuePair> list
	 * @param String sendUrl
	 * @param String connectionMode
	 * @return String
	 * @throws Exception
	 */
	public static String send2Client(ArrayList<NameValuePair> list, String sendUrl, String connectionMode) throws Exception {

		String responseText = "";

		// https
		if (sendUrl.toLowerCase().startsWith("https")) {

			DefaultHttpsConnection httpsConnection = new DefaultHttpsConnection(sendUrl);
			httpsConnection.setIgnoreHostname(true);
			if ("2".equals(connectionMode)) {
				httpsConnection.setUseDefaultSSLSocketFactory(true);
			} else {
				httpsConnection.setUseDefaultSSLSocketFactory(false);
			}
			responseText = httpsConnection.send(list);

		} else { // http

			HttpConnection httpConnection = new HttpConnection(sendUrl);
			responseText = httpConnection.send(list);
		}

		return responseText;
	}

	/**
	 * 此方法有在用
	 * 
	 * 向客户端发消息
	 * 
	 * @param ArrayList<NameValuePair> list
	 * @param String sendUrl
	 * @param String connectionMode
	 * @return String
	 * @throws Exception
	 */
	public static String send2Client(Object obj, String sendUrl, String connectionMode) throws Exception {

		String responseText = "";

		// https
		if (sendUrl.toLowerCase().startsWith("https")) {

			DefaultHttpsConnection httpsConnection = new DefaultHttpsConnection(sendUrl);
			httpsConnection.setIgnoreHostname(true);
			if ("2".equals(connectionMode)) {
				httpsConnection.setUseDefaultSSLSocketFactory(true);
			} else {
				httpsConnection.setUseDefaultSSLSocketFactory(false);
			}
			responseText = httpsConnection.send(obj);

		} else { // http

			HttpConnection httpConnection = new HttpConnection(sendUrl);
			responseText = httpConnection.send(obj);
		}

		return responseText;
	}

	/**
	 * 向统一代理的FEP 发送消息，支持HTTPS和HTTP。<br>
	 * SSL信息已初始化。
	 * 
	 * @param TxRequest
	 * @return TxResponse
	 * @throws Exception
	 */
	public static TxResponse send2FEP(TxRequest txReq, String system_ini_key) throws CodeException {

		SystemIni bean = ScfEnvironment.SYS_INI_MAP.get(system_ini_key);
		if (null == bean) {
			throw new CodeException(DefaultConst.ERR_2001_CODE, DefaultConst.ERR_2001_MSG+"，系统识别码有误");
		}
		String sendUrl = bean.getUrl();
		//URLConst.ACTIVE_FEP + "/" + txReq.getUrlParam();

		String responseText = "";
		TxResponse txRes = null;
		try {
			if (sendUrl.startsWith("https")) {
				// https
				HttpsConnection4FEP httpsConnection;
				httpsConnection = new HttpsConnection4FEP(ScfEnvironment.SYS_INI_MAP.get(system_ini_key).getHttpsURLConnection());
				responseText = httpsConnection.send(JsonUtil.toJSONString(txReq));

			} else {
				// http
				HttpConnection httpConnection = new HttpConnection(sendUrl);
				responseText = httpConnection.send(txReq);
			}
		} catch (Exception e) {
			//System.out.println("通讯失败:" + e.getMessage());
			e.printStackTrace();
			throw new CodeException(DefaultConst.ERR_2001_CODE, "通讯失败:" + e.getMessage());
		}

		if (StringUtil.isNotEmpty(responseText)) {
			txRes = JsonUtil.toBean(responseText, TxResponse.class);
		} else {
			throw new CodeException(DefaultConst.ERR_2001_CODE, DefaultConst.ERR_2001_MSG);
		}

		return txRes;
	}

	/**
	 * 向统一代理的FEP 发送消息，支持HTTPS和HTTP。<br>
	 * SSL信息已初始化。
	 * 
	 * @param TxRequest
	 * @return TxResponse
	 * @throws Exception
	 */
	public static TxResponse send2FEP2(TxRequest txReq, String system_ini_key) throws CodeException {

		SystemIni bean = ScfEnvironment.SYS_INI_MAP.get(system_ini_key);
		if (null == bean) {
			throw new CodeException(DefaultConst.ERR_2001_CODE, DefaultConst.ERR_2001_MSG+"，系统识别码有误");
		}
		String sendUrl = bean.getUrl();
		//URLConst.ACTIVE_FEP + "/" + txReq.getUrlParam();

		String responseText = "";
		TxResponse txRes = null;
		try {
			if (sendUrl.startsWith("https")) {
				// https
				//HttpsConnection4FEP httpsConnection;
				//httpsConnection = new HttpsConnection4FEP(ScfEnvironment.SYS_INI_MAP.get(system_ini_key).getHttpsURLConnection());
				//responseText = httpsConnection.send(JsonUtil.toJSONString(txReq));

				HttpsConnection4FEP2 httpsConnection = new HttpsConnection4FEP2(ScfEnvironment.SYS_INI_MAP.get(system_ini_key).getUrl());
				httpsConnection.setIgnoreHostname(true);
				httpsConnection.setUseDefaultSSLSocketFactory(false);
				responseText = httpsConnection.send(JsonUtil.toJSONString(txReq), system_ini_key);

			} else {
				// http
				HttpConnection httpConnection = new HttpConnection(sendUrl);
				responseText = httpConnection.send(txReq);
			}
		} catch (Exception e) {
			//System.out.println("通讯失败:" + e.getMessage());
			e.printStackTrace();
			throw new CodeException(DefaultConst.ERR_2001_CODE, "通讯失败:" + e.getMessage());
		}

		if (StringUtil.isNotEmpty(responseText)) {
			txRes = JsonUtil.toBean(responseText, TxResponse.class);
		} else {
			throw new CodeException(DefaultConst.ERR_2001_CODE, DefaultConst.ERR_2001_MSG);
		}

		return txRes;
	}
}
