package com.yonyou.scf.gateway.cfcaTools;

/**
 * 应用程序异常
 * 
 * @author Administrator
 * 
 */
@SuppressWarnings("serial")
public class FcsAppException extends FcsException {

	public FcsAppException(String message) {
		super(message);
	}

	public FcsAppException(String errorCode, String errorMessage) {
		super(errorCode, errorMessage);
	}

	public FcsAppException(Throwable cause) {
		super(cause);
	}

	public FcsAppException(String message, Throwable cause) {
		super(message, cause);
	}
}
