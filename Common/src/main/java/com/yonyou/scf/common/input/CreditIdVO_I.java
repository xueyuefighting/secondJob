package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 授信主键接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class CreditIdVO_I implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1360469794472018042L;

	@NotNull(message = "授信主键不能为空")
	@Length(max = 20, message = "授信主键不超过20位")
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
