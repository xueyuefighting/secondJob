package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 6601018接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class ProductVO_6601018_I implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7714774857072240752L;

	@NotNull(message = "授信ID不能为空")
	@Length(max = 20, message = "授信ID不超过20位")
	private Long creditId;

	public Long getCreditId() {
		return creditId;
	}

	public void setCreditId(Long creditId) {
		this.creditId = creditId;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
