package com.yonyou.scf.common.output;

public class SCF91ComIdAndRoleInfo {
	/** ID */
	private Long companyId;
	/** 名称 */
	private String companyName;
	/** 证件号码 */
	private String number;
	/** 法定代表人 */
	private String userName;
	/** url1 */
	private String url1;
		
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUrl1() {
		return url1;
	}
	public void setUrl1(String url1) {
		this.url1 = url1;
	}
}
