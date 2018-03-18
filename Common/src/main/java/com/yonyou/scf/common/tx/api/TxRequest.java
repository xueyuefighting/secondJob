package com.yonyou.scf.common.tx.api;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 定义发送API接口的顶层格式Bean，转为Json串后发送。
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu      2017-03-16  Create this file
 * shengsu		2017-06-22  修改构造方法
 * </pre>
 * 
 */

public class TxRequest implements Serializable {

	private static final long serialVersionUID = 4933074464864502779L;

	private String token ;//登录用token，绝大多数场景：无
	private String apiId ;//HTTP://IP:PORT/PROECT/API_ID/API_PARAM 或 PORT/PROECT/API_ID/API_PARAM 
	private String browser ;//IE，Chrome

	/**
	 * 平台ID
	 */
	@NotBlank(message="平台ID不能为空，且不超过8位")
	@Length(max=8,message="平台ID不能为空，且不超过8位")
//	
	private String platformId;
	/**
	 * 接口号
	 */
	@NotBlank(message="接口号不能为空，且不超过8位")
	@Length(max=8,message="接口号不能为空，且不超过8位")
//	
	private String interfaceNo;
	/**
	 * URL参数
	 */
//	@NotBlank(message="URL参数不能为空，且不超过32位")
//	@Length(max=32,message="URL参数不能为空，且不超过32位")
////	
//	private String urlParam;
	/**
	 * 版本号
	 */
	@NotBlank(message="版本号不能为空，且不超过12位")
	@Length(max=12,message="版本号不能为空，且不超过12位")
//	
	private String version;
	/**
	 * 终端类型
	 */
	@NotBlank(message="终端类型不能为空，且不超过2位")
	@Length(max=2,message="终端类型不能为空，且不超过2位")
//	
	private String sourceType;
	/**
	 * 明文，String，Json格式
	 */
	@NotBlank(message="报文明文不能为空，且不超过10240位")
	@Length(max=10240,message="平台ID不能为空，且不超过10240位")
//	
	private String jsonMessage;
	/**
	 * 密文，String，Hex编码
	 */
	@NotBlank(message="报文密文不能为空，且不超过256位")
	@Length(max=256,message="报文密文不能为空，且不超过256位")
//	
	private String jsonSignature;
	
	@NotBlank(message="TokenKey信息不能为空，且不超过32位")
	@Length(max=32,message="TokenKey信息不能为空，且不超过32位")
//	
	private String tokenKey;

	/**
	 * 根据String[]对象，初始化Bean对象。
	 * 
	 * @param String
	 *            []
	 * @throws Exception
	 */
	public TxRequest(String str[]) {
		if (str.length == 2) {
			this.jsonMessage = str[0];
			this.jsonSignature = str[1];	
		}
	}

	/**
	 * 根据Base64的明文和Hex的密文，初始化Bean对象。
	 * 
	 * @param jsonMessage
	 * @param jsonSignature
	 */
	public TxRequest(String m, String s) {
		this.jsonMessage = m;
		this.jsonSignature = s;
	}

	/**
	 * Json转换用，初始化Bean对象。
	 */
	public TxRequest() {
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.getDesensitizationJSON(this);
	}

	public String getPlatformId() {
		return platformId;
	}

	public void setJsonMessage(String jsonMessage) {
		this.jsonMessage = jsonMessage;
	}

	public void setJsonSignature(String jsonSignature) {
		this.jsonSignature = jsonSignature;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getInterfaceNo() {
		return interfaceNo;
	}

	public void setInterfaceNo(String txCode) {
		this.interfaceNo = txCode;
	}

//	public String getUrlParam() {
//		return urlParam;
//	}
//
//	public void setUrlParam(String urlParam) {
//		this.urlParam = urlParam;
//	}

	public String getJsonMessage() {
		return jsonMessage;
	}

	public String getJsonSignature() {
		return jsonSignature;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getTokenKey() {
		return tokenKey;
	}

	public void setTokenKey(String tokenKey) {
		this.tokenKey = tokenKey;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	
}
