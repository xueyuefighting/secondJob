package com.yonyou.scf.common.tx.gateway;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yonyou.scf.common.tx.base.BaseRequest;
import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf1103Request extends BaseRequest implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7623784584834884458L;

    //批次号
	@NotBlank(message="批次号不能为空")
	@Length(max=32,message="批次号不超过32位")
    
    private String batchNo;
    
	
    //商户端核心企业ID
	@NotBlank(message="商户端核心企业ID不能为空")
	@Length(max=32,message="商户端核心企业ID不超过32位")
    
    private String centerCompanyId;
    
    //核心企业名称
	@NotBlank(message="核心企业名称不能为空，且不超过200位")
	@Length(max=200,message="核心企业名称不超过200位")
    
    private String centerCompanyName;

    //核心企业组织代码
	@NotBlank(message="核心企业组织代码不能为空")
	@Length(max=20,message="核心企业组织代码不超过20位")
    
    private String centerCompanyGroupNo;
    
    //循环域<DataList>条数
	@NotNull(message="循环域<DataList>条数不能为空，且不超过1000")
	@Max(value=1000,message="循环域<DataList>条数不超过1000")
    
    private Integer dataListCnt;

    //融资方信息集合
  	
  	@Valid
     private List<Scf1103Request_DataList> dataList = new ArrayList<Scf1103Request_DataList>();
      
     public List<Scf1103Request_DataList> getDataList() {
  		return Collections.unmodifiableList(dataList);
  	}

  	public void setDataList(List<Scf1103Request_DataList> list) {
  		this.dataList = list;
  	}
  	
  	public Scf1103Request_DataList removeListByIndex(int index){
  		return this.dataList.remove(index);
  	}
  	
  	public boolean removeListByObject(Scf1103Request_DataList o){
  		return this.dataList.remove(o);
  	}

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    public String getCenterCompanyId() {
        return centerCompanyId;
    }

    public void setCenterCompanyId(String centerCompanyId) {
        this.centerCompanyId = centerCompanyId;
    }

    public String getCenterCompanyName() {
        return centerCompanyName;
    }

    public void setCenterCompanyName(String centerCompanyName) {
        this.centerCompanyName = centerCompanyName == null ? null : centerCompanyName.trim();
    }

    public String getCenterCompanyGroupNo() {
        return centerCompanyGroupNo;
    }

    public void setCenterCompanyGroupNo(String centerCompanyGroupNo) {
        this.centerCompanyGroupNo = centerCompanyGroupNo;
    }

    public Integer getDataListCnt() {
        return dataListCnt;
    }

    public void setDataListCnt(Integer dataListCnt) {
        this.dataListCnt = dataListCnt;
    }
    
    @Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}