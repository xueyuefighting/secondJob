package com.yonyou.scf.common.tx.gateway;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf1201Request_DataList implements Serializable {

	private static final long serialVersionUID = -5127944908183160710L;
	
	 //商品名称
	@NotBlank(message="商品名称不能为空")
	@Length(max=200,message="商品名称不超过200位")
	
	private String produtName;   
	
	//商品规格
	@NotBlank(message="商品规格不能为空")
	@Length(max=100,message="商品规格不超过100位")
	
	private String ProductStandard;   
	
	//商品单位
	@NotBlank(message="商品单位不能为空")
	@Length(max=50,message="商品单位不超过50位")
	
	private String ProductUnit;    
	
	//商品数量
	@NotNull(message="商品数量 不能为空")
	@Max(value=99999999L,message="商品数量不超过8位")
	
	private Integer   ProductSum; 
	
	 //商品货值
	@NotNull(message="商品货值不能为空")
	@Max(value=999999999999L,message="商品数量不超过12位")
	
	private Integer ProductAmount;
	
	// 存货仓库名称
	@NotBlank(message="存货仓库不能为空")
	@Length(max=100,message="存货仓库不超过100位")
	
	private String ProductStorageName ; 

	public String getProdutName() {
		return produtName;
	}

	public void setProdutName(String produtName) {
		this.produtName = produtName == null ? null : produtName.trim();
	}

	public String getProductStandard() {
		return ProductStandard ;
	}

	public void setProductStandard(String productStandard) {
		ProductStandard = productStandard == null ? null : productStandard.trim();
	}

	public String getProductUnit() {
		return ProductUnit;
	}

	public void setProductUnit(String productUnit) {
		ProductUnit = productUnit == null ? null : productUnit.trim();
	}

	public Integer getProductSum() {
		return ProductSum;
	}

	public void setProductSum(Integer productSum) {
		ProductSum = productSum;
	}

	public Integer getProductAmount() {
		return ProductAmount;
	}

	public void setProductAmount(Integer productAmount) {
		ProductAmount = productAmount;
	}

	public String getProductStorageName() {
		return ProductStorageName;
	}

	public void setProductStorageName(String productStorageName) {
		ProductStorageName = productStorageName  == null ? null : productStorageName.trim();
	}


    @Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
	
	
	
	
	
	
	
	
	
	

}
