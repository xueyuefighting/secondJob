package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * 6602016接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class CreditVO_6602016_I implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -896037572582673367L;

	@NotNull(message = "授信ID不能为空")
	@Length(max = 20, message = "授信ID不超过20位")
	private Long creditId;
	@NotNull(message = "已用授信额度不能为空")
	@Length(max = 2, message = "已用授信额度不超过位")
	private Long useAmount;
	@NotNull(message = "修改人ID不能为空")
	@Length(max = 20, message = "修改人ID不超过位")
	private Long updateUser;

	public Long getCreditId() {
		return creditId;
	}

	public void setCreditId(Long creditId) {
		this.creditId = creditId;
	}

	public Long getUseAmount() {
		return useAmount;
	}

	public void setUseAmount(Long useAmount) {
		this.useAmount = useAmount;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	// @Override
	// public String toString() {
	// return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	// }
}
