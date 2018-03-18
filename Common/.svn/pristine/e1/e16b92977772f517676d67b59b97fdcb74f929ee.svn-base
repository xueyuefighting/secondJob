package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 6601017接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class ProductVO_6601017_I implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6617914421847791836L;

	//@NotNull(message = "融资方ID不能为空")
	//@Length(max = 20, message = "融资方ID不超过20位")
	private Long agencyId;

	private String token;
	
	public Long getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(Long agencyId) {
		this.agencyId = agencyId;
	}

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
