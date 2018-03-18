package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 6601016接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class ProductVO_6601016_I implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6179020144502578548L;

	@NotNull(message = "产品ID不能为空")
	@Length(max = 20, message = "产品ID不超过20位")
	private Long productId;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
