package com.yonyou.scf.common.tx.gateway;


public class AuthenticationVOE {
	
    private String systemid;

	
    private String interfaceNo;

	
    private String platformId;

	
    private String merchantUserId;

	
    private Integer userRole;

	
    private Integer status;

	
    private String createTime;

	
    private String modifyTime;
	
	
	private PhoneSignNo phoneSignNo;
	
	
	
	public class PhoneSignNo{
		private String signNoKey;
		private String signNo;
		public String getSignNoKey() {
			return signNoKey;
		}
		public void setSignNoKey(String signNoKey) {
			this.signNoKey = signNoKey;
		}
		public String getSignNo() {
			return signNo;
		}
		public void setSignNo(String signNo) {
			this.signNo = signNo;
		}
	}

	public PhoneSignNo getPhoneSignNo() {
		return phoneSignNo;
	}

	public void setPhoneSignNo(PhoneSignNo phoneSignNo) {
		this.phoneSignNo = phoneSignNo;
	}

	public String getSystemid() {
        return systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid == null ? null : systemid.trim();
    }

    public String getInterfaceNo() {
        return interfaceNo;
    }

    public void setInterfaceNo(String interfaceNo) {
        this.interfaceNo = interfaceNo == null ? null : interfaceNo.trim();
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId == null ? null : platformId.trim();
    }

    public String getMerchantUserId() {
        return merchantUserId;
    }

    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId == null ? null : merchantUserId.trim();
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime == null ? null : modifyTime.trim();
    }
}