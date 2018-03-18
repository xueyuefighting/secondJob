package com.yonyou.scf.common.tx.gateway;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SingleLogin implements Serializable {

	private static final long serialVersionUID = 3559098207109432300L;

	
	@Size(max=32,message="资方唯一编号最多为32位且不能为空")
    private String fundID;
	
	@NotNull(message="商户端用户ID编号最多为32位且不能为空")
	@Size(max=32,message="商户端用户ID编号最多为32位且不能为空")
	
    private String merchantUserID;

	@NotNull(message="系统流水号最多为32位且不能为空")
	@Size(max=32,message="系统流水号最多为32位且不能为空")
	
	private String txNo;
	
//	@NotNull(message="用户角色不能为空")
//	
//	private int userRole;
	
	@NotNull(message="操作类型不能为空")
	
	private int controllerType;
	
	public String getFundID() {
		return fundID;
	}

	public void setFundID(String fundID) {
		this.fundID = fundID;
	}

	public String getMerchantUserID() {
		return merchantUserID;
	}

	public void setMerchantUserID(String merchantUserID) {
		this.merchantUserID = merchantUserID;
	}

	public String getTxNo() {
		return txNo;
	}

	public void setTxNo(String txNo) {
		this.txNo = txNo;
	}

//	public int getUserRole() {
//		return userRole;
//	}
//
//	public void setUserRole(int userRole) {
//		this.userRole = userRole;
//	}

	public int getControllerType() {
		return controllerType;
	}

	public void setControllerType(int controllerType) {
		this.controllerType = controllerType;
	}
}

