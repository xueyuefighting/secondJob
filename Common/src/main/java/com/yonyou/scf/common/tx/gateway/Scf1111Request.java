package com.yonyou.scf.common.tx.gateway;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yonyou.scf.common.tx.base.BaseRequest;
import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf1111Request extends BaseRequest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2840460510283832631L;

	//资方ID
	
	private String fundId;
	
    //商户端用户ID
	@NotBlank(message="商户端用户ID不能为空")
	@Length(max=32,message="商户端用户ID不超过32位")
	
	private String merchantUserId;
	
	//用户角色
	@NotNull(message="用户角色不能为空")
	@Max(value=20,message="用户角色不超过20")
	
	private Integer userRole;
	
	//返回商户端url
	
	private String returnUrl;

	public String getFundId() {
		return fundId;
	}

	public String getMerchantUserId() {
		return merchantUserId;
	}

	public Integer getUserRole() {
		return userRole;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setFundId(String fundId) {
		this.fundId = fundId ==null ? null :fundId.trim();
	}

	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId == null?null:merchantUserId.trim();
	}

	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl == null ? null:returnUrl.trim();
	}
	 @Override
		public String toString() {
			return getClass().getSimpleName() + JsonUtil.toJSONString(this);
		}
}
