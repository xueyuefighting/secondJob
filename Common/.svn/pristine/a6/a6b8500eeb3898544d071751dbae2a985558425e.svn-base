package com.yonyou.scf.common.tx.gateway;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf1503Request  implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5340063468195455198L;

	//资方ID
	@Length(max=32,message="资方ID不超过32位")
	
	private String fundId;
	
	//商户端用户ID
	@NotBlank(message="商户端用户ID不能为空")
	@Length(max=32,message="商户端用户ID不超过32位")
	
	private String merchantUserId;
	
	//系统流水号
	@NotBlank(message="系统流水号不能为空")
	@Length(max=32,message="系统流水号不超过32位")
	
	private String txNo;
	
	//操作类型
	@NotNull(message="操作类型不能为空,且不超过2位")
	@Max(value =40,message="操作类型不超过40")
	
	private Integer controllerType;
	
	public String getFundId() {
		return fundId;
	}

	public String getMerchantUserId() {
		return merchantUserId;
	}

	public String getTxNo() {
		return txNo;
	}

	public Integer getControllerType() {
		return controllerType;
	}

	public void setFundId(String fundId) {
		this.fundId = fundId;
	}

	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
	}

	public void setTxNo(String txNo) {
		this.txNo = txNo == null ? null : txNo.trim();
	}

	public void setControllerType(Integer controllerType) {
		this.controllerType = controllerType;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
