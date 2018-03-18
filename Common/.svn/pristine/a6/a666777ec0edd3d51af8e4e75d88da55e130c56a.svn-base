package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;


import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance1014Request  implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull(message = "产品ID不能为空")
	private Long productId;
	@NotNull(message = "授信ID不能为空")
	private Long creditId;
	@NotNull(message = "借款企业ID不能为空")
	private Long agencyId;
	
	private String token ;
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getCreditId() {
		return creditId;
	}

	public void setCreditId(Long creditId) {
		this.creditId = creditId;
	}

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
