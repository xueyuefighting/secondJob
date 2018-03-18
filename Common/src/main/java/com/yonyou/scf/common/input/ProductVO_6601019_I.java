package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 6601019接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class ProductVO_6601019_I implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6179020144502578548L;

	@NotNull(message = "产品ID不能为空")
	@Length(max = 20, message = "产品ID不超过20位")
	private Long productId;
	@NotNull(message = "总授信额度不能为空")
	@Length(max = 20, message = "总授信额度不超过20位")
	private Long allAmount;
	@NotNull(message = "token不能为空")
	@Length(max = 36, message = "token不超过36位")
	private String token;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getAllAmount() {
		return allAmount;
	}

	public void setAllAmount(Long allAmount) {
		this.allAmount = allAmount;
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
