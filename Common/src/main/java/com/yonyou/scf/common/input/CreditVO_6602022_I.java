package com.yonyou.scf.common.input;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.yonyou.scf.common.util.json.JsonUtil;

/**
 * 6602022接口Bean_输入
 * 
 * @author zhangxu
 *
 */
public class CreditVO_6602022_I implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2736821582347609878L;

	@NotNull(message = "授信主键不能为空")
	@Length(max = 20, message = "授信主键不超过20位")
	private Long creditId;
	@NotNull(message = "担保方主键不能为空")
	@Length(max = 20, message = "担保方主键不超过20位")
	private Long warrantorId;

	public Long getCreditId() {
		return creditId;
	}

	public void setCreditId(Long creditId) {
		this.creditId = creditId;
	}

	public Long getWarrantorId() {
		return warrantorId;
	}

	public void setWarrantorId(Long warrantorId) {
		this.warrantorId = warrantorId;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
