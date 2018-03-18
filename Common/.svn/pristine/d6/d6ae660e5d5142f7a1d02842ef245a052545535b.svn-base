package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 6602020接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class CreditVO_6602020_I implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3782947857264666450L;

	@NotNull(message = "token不能为空")
	@Length(max = 20, message = "token不超过20位")
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
