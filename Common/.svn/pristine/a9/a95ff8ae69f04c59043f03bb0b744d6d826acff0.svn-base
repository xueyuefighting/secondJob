package com.yonyou.scf.common.tx.gateway;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import com.yonyou.scf.common.util.json.JsonUtil;

public class UserBeforeLoanVOE  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2840460510283832631L;

	//资方ID
	
	@Length(max=32)
	private String fundId;
	
    //商户端用户ID
	
	@Length(max=32)
	@NotBlank
	private String merchantUserId;
	
	//用户角色
	
	@Range(min=10,max=100)
	@NotNull
	private Integer userRole;
	
	//返回商户端url
	
	@Length(max=500)
	private String returnUrl;
	
	
	private String directStatus;
	

	public String getDirectStatus() {
		return directStatus;
	}

	public void setDirectStatus(String directStatus) {
		this.directStatus = directStatus;
	}

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
