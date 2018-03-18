package com.yonyou.scf.common.entity;

public class PlatformLanding {
    private Long id;

    private String interfaceNo;

    private String platformId;

    private String fundId;

    private String merchantUserId;

    private Integer userRole;

    private Integer controllerType;

    private String loginCurrentIp;

    private String loginCurrentAddress;

    private String loginCurrentTime;

    private String loginLastIp;

    private String loginLastAddress;

    private String loginLastTime;

    private Integer loginNum;

    private Integer loginLimitType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getFundId() {
        return fundId;
    }

    public void setFundId(String fundId) {
        this.fundId = fundId == null ? null : fundId.trim();
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

    public Integer getControllerType() {
        return controllerType;
    }

    public void setControllerType(Integer controllerType) {
        this.controllerType = controllerType;
    }

    public String getLoginCurrentIp() {
        return loginCurrentIp;
    }

    public void setLoginCurrentIp(String loginCurrentIp) {
        this.loginCurrentIp = loginCurrentIp == null ? null : loginCurrentIp.trim();
    }

    public String getLoginCurrentAddress() {
        return loginCurrentAddress;
    }

    public void setLoginCurrentAddress(String loginCurrentAddress) {
        this.loginCurrentAddress = loginCurrentAddress == null ? null : loginCurrentAddress.trim();
    }

    public String getLoginCurrentTime() {
        return loginCurrentTime;
    }

    public void setLoginCurrentTime(String loginCurrentTime) {
        this.loginCurrentTime = loginCurrentTime == null ? null : loginCurrentTime.trim();
    }

    public String getLoginLastIp() {
        return loginLastIp;
    }

    public void setLoginLastIp(String loginLastIp) {
        this.loginLastIp = loginLastIp == null ? null : loginLastIp.trim();
    }

    public String getLoginLastAddress() {
        return loginLastAddress;
    }

    public void setLoginLastAddress(String loginLastAddress) {
        this.loginLastAddress = loginLastAddress == null ? null : loginLastAddress.trim();
    }

    public String getLoginLastTime() {
        return loginLastTime;
    }

    public void setLoginLastTime(String loginLastTime) {
        this.loginLastTime = loginLastTime == null ? null : loginLastTime.trim();
    }

    public Integer getLoginNum() {
        return loginNum;
    }

    public void setLoginNum(Integer loginNum) {
        this.loginNum = loginNum;
    }

    public Integer getLoginLimitType() {
        return loginLimitType;
    }

    public void setLoginLimitType(Integer loginLimitType) {
        this.loginLimitType = loginLimitType;
    }
}