package com.java.designPatterns.builder;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * @author wyx
 *
 */
@AllArgsConstructor
@ToString
public class ContractTemplateA  implements Cloneable{
	private String name;
	private String address;
	private String deptName;
	private String concatter;
	private String conncaterTel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getConcatter() {
		return concatter;
	}
	public void setConcatter(String concatter) {
		this.concatter = concatter;
	}
	public String getConncaterTel() {
		return conncaterTel;
	}
	public void setConncaterTel(String conncaterTel) {
		this.conncaterTel = conncaterTel;
	}
	public ContractTemplateA() {
	}
	
	
}
