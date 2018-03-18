package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 6602021接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class CreditVO_6602021_I implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7313777717155809347L;

	@NotNull(message = "授信主键不能为空")
	@Length(max = 20, message = "授信主键不超过20位")
	private Long creditId;
	@NotNull(message = "授信状态不能为空")
	@Length(max = 2, message = "授信状态不超过位")
	private String status;
	@NotNull(message = "修改人ID不能为空")
	@Length(max = 20, message = "修改人ID不超过位")
	private Long updateUser;

	public Long getCreditId() {
		return creditId;
	}

	public void setCreditId(Long creditId) {
		this.creditId = creditId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
