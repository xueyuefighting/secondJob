package com.yonyou.scf.common.system;

import java.io.FileInputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.net.ssl.HttpsURLConnection;

import com.yonyou.scf.common.constant.DefaultConst;
import com.yonyou.scf.common.constant.FrontEndProcessConstant;
import com.yonyou.scf.common.constant.URLConst;
import com.yonyou.scf.common.util.StringUtil;
import com.yonyou.scf.common.util.net.DefaultHttpsConnection;
import com.yonyou.scf.common.util.net.HttpsConnection;
import com.yonyou.scf.common.util.net.IgnoreHostnameVerifier;
import com.yonyou.scf.common.util.net.SecurityContext;

/**
 * 加载System.ini，初始化SSL及Https
 * 
 * @author shengsu
 *
 */
public class ScfEnvironment {

	/**
	 * 统一代理FEP的系统识别码：00
	 */
	public static final String ACTIVE_FEP = "00";
	/**
	 * 终端类型（PC端）
	 */
	public static final int TERMINAL_TYPE_WEB = 10;
	/**
	 * 保存system.ini的数据结构，Map<String, SystemIni>
	 */
	public static Map<String, SystemIni> SYS_INI_MAP = new HashMap<>();
	
	private static int connectTimeoutLimit = 10 * 1000; // 默认5秒钟
	private static int readTimeoutLimit = 10 * 1000; // 默认5秒钟

	private static String method = "POST";

	/**
	 * 初始化，针对FEP_ACTIVE
	 * 
	 * @param scfConfigPath
	 * @throws Exception
	 */
	public static void init4ActiveFEP() throws Exception {

		try {

			loadUrlIni();
			loadSysIniActive();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * 初始化，针对各个环境，适用于Notice
	 * 
	 * @param scfConfigPath
	 * @throws Exception
	 */
	public static void init4SelectFEP() throws Exception {

		try {
			if (StringUtil.isEmpty(URLConst.ACTIVE_FEP) || StringUtil.isEmpty(URLConst.ACTIVE_SYS)) {
				loadSysIniActive();
			}

			loadSysIniAll();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * 读取url.ini
	 */
	private static void loadUrlIni() throws Exception {
		Properties properties = new Properties();
		properties.load(new FileInputStream(DefaultConst.URL_INI_PATHNAME));

		URLConst.URL_SIMULATOR = properties.getProperty("url.simulator");
		URLConst.URL_FRONTENDPROCESS = properties.getProperty("url.frontendprocess");
		URLConst.URL_WEBSITE = properties.getProperty("url.website");
		URLConst.URL_NOTICE = properties.getProperty("url.notice");
		URLConst.URL_LOGINAUTH = properties.getProperty("url.loginauth");
		URLConst.URL_SIGNATURE = properties.getProperty("url.signature");
		URLConst.URL_GATEWAY = properties.getProperty("url.gateway");
		URLConst.URL_OAUTH = properties.getProperty("url.oauth");
		URLConst.URL_PRODUCT = properties.getProperty("url.product");
		URLConst.URL_CREDIT = properties.getProperty("url.credit");
		URLConst.URL_BILL = properties.getProperty("url.bill");
		URLConst.URL_CUSTOMER = properties.getProperty("url.customer");
		URLConst.URL_ROLE = properties.getProperty("url.role");
		URLConst.URL_CERTIFICATION = properties.getProperty("url.certification");
		URLConst.URL_FINANCING = properties.getProperty("url.financing");
		URLConst.URL_LENDING = properties.getProperty("url.lending");
		URLConst.URL_REPAYMENT = properties.getProperty("url.repayment");
		URLConst.URL_ACCOUNTS = properties.getProperty("url.accounts");
		URLConst.URL_CONTRACT = properties.getProperty("url.contract");
		URLConst.URL_INTERESTS = properties.getProperty("url.interests");
		URLConst.URL_SERVICECHARGE = properties.getProperty("url.servicecharge");
		URLConst.URL_WORKFLOW = properties.getProperty("url.workflow");
		URLConst.URL_PARAMETERS = properties.getProperty("url.parameters");
		URLConst.URL_MSGTEMPLATE = properties.getProperty("url.msgtemplate");
		URLConst.URL_MAIL = properties.getProperty("url.mail");
		URLConst.URL_SMS = properties.getProperty("url.sms");
		URLConst.URL_MESSAGE = properties.getProperty("url.message");
		URLConst.URL_WECHAT = properties.getProperty("url.wechat");
		URLConst.URL_FADADA = properties.getProperty("url.fadada");
		URLConst.URL_BANK472 = properties.getProperty("url.bank472");
	}

	/**
	 * 读取system.ini，加载统一代理FEP
	 * 此场景下仅支持通过统一代理前置机对外发送消息，是否放开？
	 */
	private static void loadSysIniActive() throws Exception {
		Properties properties = new Properties();
		properties.load(new FileInputStream(DefaultConst.SYSTEM_INI_PATHNAME));

		URLConst.ACTIVE_SYS = properties.getProperty("sys.active");
		URLConst.ACTIVE_URL = properties.getProperty("url.active");
		URLConst.ACTIVE_FEP = properties.getProperty("fep.active");
		URLConst.ACTIVE_FEP_SSL = properties.getProperty("fep.active.ssl");
		URLConst.ACTIVE_FEP_PLATFORMID = properties.getProperty("fep.active.platformId");

		if (URLConst.ACTIVE_FEP == null) {
			throw new Exception("Missing the property: fep.active");
		}

		SystemIni bean = new SystemIni();
		Map<String, SystemIni> map = new HashMap<>();

		if (URLConst.ACTIVE_FEP.startsWith("https://")) {
			bean = initBean(ACTIVE_FEP, URLConst.ACTIVE_FEP + "/" + FrontEndProcessConstant.URL_SEND, URLConst.ACTIVE_FEP_SSL);
			map.put(ACTIVE_FEP, bean);

			SYS_INI_MAP.putAll(map);
		} else {
			System.out.println("Property scf.url[" + URLConst.ACTIVE_FEP + "] should starts with https://");
		}
	}

	/**
	 * 读取system.ini，加载环境一览
	 */
	private static void loadSysIniAll() throws Exception {
		Properties properties = new Properties();
		properties.load(new FileInputStream(DefaultConst.SYSTEM_INI_PATHNAME));

		SystemIni bean = new SystemIni();
		Map<String, SystemIni> map = new HashMap<>();

		for (Object key : properties.keySet()) {
			if (properties.get(key).toString().contains(",")) {
				String str[] = properties.get(key).toString().split(",");
				bean = initBean(key.toString(), str[0] + "/" + FrontEndProcessConstant.URL_NOTICE, str[1]);
				map.put(key.toString(), bean);
			}
		}

		if (null != map && map.size() > 0) {
			SYS_INI_MAP.putAll(map);
		} else {
			System.out.println("System.ini IS EMPTY !");
		}
	}

	/**
	 * 初始化SystemIni Object
	 * 
	 * @param key
	 * @param values
	 * @return
	 * @throws Exception
	 */
	private static SystemIni initBean(String key, String fullUrl, String sslFilename) throws Exception {
		SystemIni bean = new SystemIni();

		bean.setId(key);
		bean.setUrl(fullUrl);
		bean.setSsl(sslFilename);

		if (bean.getUrl().startsWith("https://")) {

			SecurityContext.initSSLSocketFactory(bean.getSsl(), bean.getSsl().substring(bean.getSsl().lastIndexOf("/") + 1));
			bean.setSslSocketFactory(SecurityContext.sslSocketFactory);

			HttpsConnection httpsConnection = new DefaultHttpsConnection(bean.getUrl());
			httpsConnection.setUseDefaultSSLSocketFactory(false);
			httpsConnection.setIgnoreHostname(true);

			URL url = new URL(bean.getUrl());
			HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
			httpsURLConnection.setSSLSocketFactory(SecurityContext.sslSocketFactory);
			httpsURLConnection.setHostnameVerifier(new IgnoreHostnameVerifier());

			// 默认产生的 User-Agent:Java/1.5.0_22; Content-Type:application/x-www-form-urlencoded
			httpsURLConnection.setRequestProperty("Content-Type", "application/json");
			httpsURLConnection.setDoOutput(true);
			httpsURLConnection.setRequestMethod(method);//POST
			httpsURLConnection.setConnectTimeout(connectTimeoutLimit);//10*1000
			httpsURLConnection.setReadTimeout(readTimeoutLimit);//10*1000

			bean.setHttpsConnection(httpsConnection);//貌似没用
			bean.setHttpsURLConnection(httpsURLConnection);//用于TxMessenger.send(TxRequest txReq)
		} else {
			System.out.println("Property scf.url[" + bean.getUrl() + "] should starts with https://");
		}
		return bean;
	}

}