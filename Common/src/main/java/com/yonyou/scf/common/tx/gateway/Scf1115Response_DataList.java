package com.yonyou.scf.common.tx.gateway;

import java.io.Serializable;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf1115Response_DataList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5139872497246751836L;
	
	//平台ID
    
    private String platformId; 
    
	//商户端融资方ID
	
    private String fundId;

	//商品id
	
	private String productId;
	
	//商品名称
	
	private String productName;
	
    //商户端用户ID
	
	private String merchantUserId;
	
	//用户角色
	
	private Integer userRole;
	
	//贷前准备状态
	
	private Integer userBeforeLoadStatus;

	public String getPlatformId() {
		return platformId;
	}

	public String getFundId() {
		return fundId;
	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public String getMerchantUserId() {
		return merchantUserId;
	}

	public Integer getUserRole() {
		return userRole;
	}

	public Integer getUserBeforeLoadStatus() {
		return userBeforeLoadStatus;
	}

	public void setPlatformId(String platformId) {
		this.platformId = platformId == null? null : platformId.trim();
	}

	public void setFundId(String fundId) {
		this.fundId = fundId == null ?null:fundId.trim();
	}

	public void setProductId(String productId) {
		this.productId = productId == null ? null : productId.trim();
	}

	public void setProductName(String productName) {
		this.productName = productName == null ? null :productName.trim() ;
	}

	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim() ;
	}

	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}

	public void setUserBeforeLoadStatus(Integer userBeforeLoadStatus) {
		this.userBeforeLoadStatus = userBeforeLoadStatus;
	}
	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
