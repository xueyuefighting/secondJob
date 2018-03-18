package com.yonyou.scf.common.tx.base;

import java.io.Serializable;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 内部服务器之间通讯传输Bean。
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu      2017-03-16  Create this file
 * </pre>
 * 
 */
public abstract class BaseRequest implements Serializable {

	private static final long serialVersionUID = 4933074464864502779L;

	private String platformId;
	private String interfaceNo;
	private String urlParam;
	private String version;
	private String apiId;
	private String sourceType;

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.getDesensitizationJSON(this);
	}

	//	@TransparentDesensitization
	//	public LogContextVO logContext;
	//
	//	public LogContextVO getLogContext() {
	//		return logContext;
	//	}
	//
	//	public void setLogContext(LogContextVO logContext) {
	//		this.logContext = logContext;
	//	}

	public String getPlatformId() {
		return platformId;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

	public String getInterfaceNo() {
		return interfaceNo;
	}

	public void setInterfaceNo(String interfaceNo) {
		this.interfaceNo = interfaceNo;
	}

	public String getUrlParam() {
		return urlParam;
	}

	public void setUrlParam(String urlParam) {
		this.urlParam = urlParam;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getApiId() {
		return apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

}
