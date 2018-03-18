package com.yonyou.scf.common.tx.base;

import java.io.Serializable;
import java.util.List;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.yonyou.scf.common.constant.DefaultConst;
import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 内部服务器之间通讯传输Bean。
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu      2017-03-17  Create this file
 * </pre>
 * 
 */
public abstract class BaseResponse implements Serializable {

	private static final long serialVersionUID = -8659512506680957154L;

	private String responseCode = DefaultConst.SUCCESS_RESPONSE_CODE;
	private String responseMessage = DefaultConst.SUCCESS_RESPONSE_MESSAGE;
	private String context = "";

	public BaseResponse() {
	}

	public void initBindingResult(BindingResult result) {
		if (result.hasErrors()) {
			
			this.responseCode = DefaultConst.ERR_0001_CODE;
			this.responseMessage = DefaultConst.ERR_0001_MSG;
			
			StringBuffer sb = new StringBuffer();
			List<ObjectError> list = result.getAllErrors();
			for (ObjectError error : list) {
				sb.append(error.getDefaultMessage());
			}
			this.context = sb.toString();
		}
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.getDesensitizationJSON(this);
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
