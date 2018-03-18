package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 6601008接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class ProductVO_6601008_I implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -398287229670215891L;

	@NotNull(message = "产品ID不能为空")
	@Length(max = 20, message = "产品ID不超过20位")
	private Long productId;
	@NotNull(message = "产品状态不能为空")
	@Length(max = 2, message = "产品状态不超过2位")
	private String status;
	@NotNull(message = "token不能为空")
	@Length(max = 36, message = "token不超过36位")
	private String token;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
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
