package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 66210012接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class WorkflowVO_6621012_I implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1337653586203274130L;

	@NotNull(message = "token不能为空")
	@Length(max = 20, message = "token不超过36位")
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
