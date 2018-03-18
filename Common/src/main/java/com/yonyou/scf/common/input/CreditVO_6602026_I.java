package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 6602026接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class CreditVO_6602026_I implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9161082133614479407L;

	@NotNull(message = "授信ID不能为空")
	@Length(max = 20, message = "授信ID不超过20位")
	private Long creditId;
	@NotNull(message = "已归还额度不能为空")
	@Length(max = 2, message = "已归还额度不超过20位")
	private Long rebackAmount;
	@NotNull(message = "修改人ID不能为空")
	@Length(max = 20, message = "修改人ID不超过20位")
	private Long updateUser;

	public Long getCreditId() {
		return creditId;
	}

	public void setCreditId(Long creditId) {
		this.creditId = creditId;
	}

	public Long getRebackAmount() {
		return rebackAmount;
	}

	public void setRebackAmount(Long rebackAmount) {
		this.rebackAmount = rebackAmount;
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
