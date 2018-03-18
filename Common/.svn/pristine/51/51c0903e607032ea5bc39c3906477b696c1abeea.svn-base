package com.yonyou.scf.common.tx.gateway;

import java.io.Serializable;

import javax.validation.constraints.Max;

import org.hibernate.validator.constraints.Length;

public class Scf1211Request_DataList implements Serializable {

	private static final long serialVersionUID = -6620032541599748148L;
	
	@Length(max=200,message="商品名称不超过200位")
	
	private String productName;

	@Length(max=100,message="规格不超过100位")
	
	private String proSpecifications;
	
	@Length(max =50,message="单位不超过50位")
	
	private String productUnit;
	
	@Max(value=99999999,message="数量不超过8位")
	
	private int productSum;
	
	@Max(value =999999999999L,message="无税单位不超过12位" )
	
	private Long noTaxUnitPrice;
	
	@Max( value=999999999999L,message="无税金额不超过12位")
	
	private Long noTaxAmount;
	
	@Max(value =999999,message="税率不超过6位")
	
	private int taxRate;
	
	@Max(value =999999999999L,message="税额不超过12位")
	
	private Long taxAmount;
	
	
	private Long allAmout;
	
	
	private Long procStocks;
	public String getProductName() {
		return productName;
	}
	public String getProSpecifications() {
		return proSpecifications;
	}
	public String getProductUnit() {
		return productUnit;
	}
	public int getProductSum() {
		return productSum;
	}
	public Long getNoTaxUnitPrice() {
		return noTaxUnitPrice;
	}
	public Long getNoTaxAmount() {
		return noTaxAmount;
	}
	public int getTaxRate() {
		return taxRate;
	}
	public Long getTaxAmount() {
		return taxAmount;
	}
	public Long getAllAmout() {
		return allAmout;
	}
	public Long getProcStocks() {
		return procStocks;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProSpecifications(String proSpecifications) {
		this.proSpecifications = proSpecifications;
	}
	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}
	public void setProductSum(int productSum) {
		this.productSum = productSum;
	}
	public void setNoTaxUnitPrice(Long noTaxUnitPrice) {
		this.noTaxUnitPrice = noTaxUnitPrice;
	}
	public void setNoTaxAmount(Long noTaxAmount) {
		this.noTaxAmount = noTaxAmount;
	}
	public void setTaxRate(int taxRate) {
		this.taxRate = taxRate;
	}
	public void setTaxAmount(Long taxAmount) {
		this.taxAmount = taxAmount;
	}
	public void setAllAmout(Long allAmout) {
		this.allAmout = allAmout;
	}
	public void setProcStocks(Long procStocks) {
		this.procStocks = procStocks;
	}

	
}
