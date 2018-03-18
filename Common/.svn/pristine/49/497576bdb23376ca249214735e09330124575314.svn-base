package com.yonyou.scf.common.tx.gateway;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf1201Request implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 3419489847499261206L;

	//资方ID
	@NotBlank(message="资方ID不能为空")
	@Length(max=32,message="资方ID不超过32位")
	
    private String fundId;
	
	//融资产品类型：10=采购融资 20=信用融资
	@NotNull(message="融资产品类型不能为空")
	@Max(value=20,message="融资产品类型不超过20")
	
    private Integer financeProductionType;
	
	//商户端融资方ID
	@NotBlank(message="商户端融资方ID不能为空")
	@Length(max=32,message="商户端融资方ID不超过32位")
	
    private String fsId;
	
	//商户端核心企业ID
	@NotBlank(message="商户端核心企业ID不能为空")
	@Length(max=32,message="商户端核心企业ID不超过32位")
	
    private String centerCompanyId;
	
	//融资申请流水号
	@NotBlank(message="融资申请流水号不能为空")
	@Length(max=32,message="融资申请流水号不超过32位")
	
    private String financingApplicationNo;
	
	//订单编号
	@NotBlank(message="订单编号不能为空")
	@Length(max=32,message="订单编号不超过32位")
	
    private String billNo;
	
	//订单日期
	@NotBlank(message="订单日期不能为空")
	@Length(max=17,message="订单日期不超过17位")
	@Pattern(regexp="^2[0-9]{16}$",message="日期格式必须为yyyyMMddHHmmssSSS")
	
    private String billDate;
	
	//订单描述
	
    private String billDesc;
	
	//订单金额 单位：分
	@NotNull(message="订单金额 不能为空")
	@Max(value=999999999999L,message="订单金额不超过12位")
	
    private Integer billAmount;
	

	//循环域<DataList>条数
	@NotNull(message="循环域<DataList>条数不能为空")
	@Max(value=1000,message="循环域<DataList>条数不超过1000")
	
    private Integer dataListCnt;  
	
	//返回商户端url
	
    private String returnURL;   
	
	//商品信息集合
	@NotNull(message="商品集合信息不能为空")
	
	@Valid
	private List<Scf1201Request_DataList> dataList = new ArrayList<Scf1201Request_DataList>() ; 


	public List<Scf1201Request_DataList> getDataList() {
		return Collections.unmodifiableList(dataList);
	}


	public void setDataList(List<Scf1201Request_DataList> dataList) {
		this.dataList = dataList;
	}

	  	
	public Scf1201Request_DataList removeListByIndex(int index){
	  		return this.dataList.remove(index);
	  	}
	  	
	public boolean removeListByObject(Scf1201Request_DataList o){
	  		return this.dataList.remove(o);
	  	}
	
	public String getFundId() {
		return fundId;
	}


	public void setFundId(String fundId) {
		this.fundId = fundId == null ? null : fundId.trim();
	
	}


	public Integer getFinanceProductionType() {
		return financeProductionType;
	}


	public void setFinanceProductionType(Integer financeProductionType) {
		this.financeProductionType = financeProductionType ;
	}


	public String getFsId() {
		return fsId;
	}


	public void setFsId(String fsId) {
		this.fsId = fsId  == null ? null : fsId.trim();
	}


	public String getCenterCompanyId() {
		return centerCompanyId;
	}


	public void setCenterCompanyId(String centerCompanyId) {
		this.centerCompanyId = centerCompanyId == null ? null : centerCompanyId.trim();
	}


	public String getFinancingApplicationNo() {
		return financingApplicationNo;
	}


	public void setFinancingApplicationNo(String financingApplicationNo) {
		this.financingApplicationNo = financingApplicationNo == null ? null : financingApplicationNo.trim();
	}


	public String getBillNo() {
		return billNo;
	}


	public void setBillNo(String billNo) {
		this.billNo = billNo == null ? null : billNo.trim();
	}


	public String getBillDate() {
		return billDate;
	}


	public void setBillDate(String billDate) {
		this.billDate = billDate == null ? null : billDate.trim();
	}


	public String getBillDesc() {
		return billDesc;
	}


	public void setBillDesc(String billDesc) {
		this.billDesc = billDesc == null ? null : billDesc.trim();
	}


	public Integer getBillAmount() {
		return billAmount;
	}


	public void setBillAmount(Integer billAmount) {
		this.billAmount = billAmount;
	}


	public Integer getDataListCnt() {
		return dataListCnt;
	}


	public void setDataListCnt(Integer dataListCnt) {
		this.dataListCnt = dataListCnt ;
	}


	public String getReturnURL() {
		return returnURL;
	}


	public void setReturnURL(String returnURL) {
		this.returnURL = returnURL  == null ? null : returnURL.trim();
	}


	 @Override
		public String toString() {
			return getClass().getSimpleName() + JsonUtil.toJSONString(this);
		}
	
	
	
	
}
