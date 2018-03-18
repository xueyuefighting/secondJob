package com.yonyou.scf.common.tx.api;

import java.io.Serializable;

import com.yonyou.scf.common.output.ResultBean;
//import com.fasterxml.jackson.annotation.JsonProperty;
import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 定义响应API接口的顶层格式Bean，根据Json串解析。
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
public class TxResponse implements Serializable {

	private static final long serialVersionUID = -7239115879885165140L;
	
	/**
	 * 明文，ResultBean格式
	 */
	// @NotBlank
	// @Length(max=10240)
//	
	private ResultBean jsonMessage;
	/**
	 * 密文，String，Hex编码
	 */
	// @NotBlank
	// @Length(max=256)
//	
	private String jsonSignature;

	public TxResponse() {
	}

	public TxResponse(String jsonStr) {
		TxResponse c = JsonUtil.toBean(jsonStr, this.getClass());

		if (null != c) {
			this.jsonMessage = c.getJsonMessage();
			this.jsonSignature = c.getJsonSignature();
		}
	}

	@Override
	public String toString() {
		//return getClass().getSimpleName() + JsonUtil.getDesensitizationJSON(this);
		return  JsonUtil.getDesensitizationJSON(this);
	}

	public ResultBean getJsonMessage() {
		return jsonMessage;
	}

	public void setJsonMessage(ResultBean jsonMessage) {
		this.jsonMessage = jsonMessage;
	}

	public String getJsonSignature() {
		return jsonSignature;
	}

	public void setJsonSignature(String jsonSignature) {
		this.jsonSignature = jsonSignature;
	}

}
