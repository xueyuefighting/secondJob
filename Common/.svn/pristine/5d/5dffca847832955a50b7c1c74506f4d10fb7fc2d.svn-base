package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class BatchProcessingVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5201294883157086938L;

	@NotNull(message = "操作用户ID不能为空")
	@Length(max = 20, message = "操作用户ID不超过20位")
	private Long userId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
