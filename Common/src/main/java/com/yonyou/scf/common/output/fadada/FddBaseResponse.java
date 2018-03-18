package com.yonyou.scf.common.output.fadada;

import java.io.Serializable;
import java.util.List;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.yonyou.scf.common.constant.DefaultConst;
import com.yonyou.scf.common.constant.FddConst;
import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 法大大返回报文的共通字段Bean。
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu      2017-08-09  Create this file
 * </pre>
 * 
 */
public abstract class FddBaseResponse implements Serializable {

	private static final long serialVersionUID = -8659512506680957154L;

	private String result = FddConst.Fdd_interface_Result_Error;
	private String code = FddConst.Fdd_interface_Code_Error_2001;
	private String msg = FddConst.Fdd_interface_Code_Error_2001_Msg;

	public FddBaseResponse() {
	}

	public void initBindingResult(BindingResult result) {
		if (result.hasErrors()) {

			this.code = DefaultConst.ERR_0001_CODE;
			this.result = DefaultConst.ERR_0001_MSG;

			StringBuffer sb = new StringBuffer();
			List<ObjectError> list = result.getAllErrors();
			for (ObjectError error : list) {
				sb.append(error.getDefaultMessage());
				sb.append(", ");
			}
			this.msg = sb.substring(0, sb.length() - 2).toString();
		}
	}

	public void initSuccess() {
		this.result=FddConst.Fdd_interface_Result_Success;
		this.code=FddConst.Fdd_interface_Code_Success_1000;
		this.msg=FddConst.Fdd_interface_Code_Success_1000_Msg;
	}
	
	public boolean checkResult() {
		if (FddConst.Fdd_interface_Result_Error.equalsIgnoreCase(this.result)) {
			return false;
		} else if (FddConst.Fdd_interface_Result_Success.equalsIgnoreCase(this.result)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.getDesensitizationJSON(this);
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getCodeMsg() {
		return code + " : " + msg;
	}
	
	public String getResultMsg() {
		return result + " : " + msg;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
