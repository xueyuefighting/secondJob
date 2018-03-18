package com.yonyou.scf.gateway.cfcaTools;

/**
 * 统一exception处理
 * 
 * @author Administrator
 * 
 */
@SuppressWarnings("serial")
public class FcsException extends Exception {

	private String errorCode;
	private String errorMessage;

	public FcsException(String message) {
		super(message);
	}

	public FcsException(String errorCode, String errorMessage) {
		super(errorMessage);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public FcsException(String s, String values[]) {
		super(addExceptionMessage(s, values));
	}

	public FcsException(String msg, Throwable cause) {
		super((new StringBuilder(String.valueOf(msg))).append("||").append(cause.getMessage()).toString(), cause);
	}

	public FcsException(Throwable throwable) {
		super(throwable);
	}

	public static String addExceptionMessage(String s, String values[]) {
		for (int i = 0; i < values.length; i++)
			if (s.contains((new StringBuilder("{")).append(i).append("}").toString()))
				s = s.replace((new StringBuilder("{")).append(i).append("}").toString(), values[i]);

		return s;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode
	 *            the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage
	 *            the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
