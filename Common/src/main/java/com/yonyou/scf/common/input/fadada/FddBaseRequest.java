package com.yonyou.scf.common.input.fadada;

import java.io.Serializable;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 法大大发送报文的共通字段Bean。
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu      2017-08-09  Create this file
 * </pre>
 * 
 */
public abstract class FddBaseRequest implements Serializable {

	private static final long serialVersionUID = 4933074464864502779L;

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.getDesensitizationJSON(this);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
