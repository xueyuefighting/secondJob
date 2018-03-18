package com.yonyou.scf.common.system;

/**
 * 带错误码和错误消息的基本异常类
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
public class CodeException extends Exception {

	private static final long serialVersionUID = 7724252889850188629L;

	private String code;

	public CodeException(String code) {
		super();
		this.code = code;
	}

	public CodeException(String code, String message) {
		super(message);
		this.code = code;
	}

	public CodeException(String code, Throwable cause) {
		super(cause);
		this.code = code;
	}

	public CodeException(String errorCode, String message, Throwable cause) {
		super(message, cause);
		this.code = errorCode;
	}

	public String getCode() {
		return code;
	}

}
