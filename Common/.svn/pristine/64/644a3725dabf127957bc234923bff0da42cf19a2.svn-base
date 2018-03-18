package com.yonyou.scf.common.tx.gateway;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf1115Response implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5232520609556614817L;
	//循环域条数
	
	private Integer dataListCnt;
	//循环域
	
	@Valid
	private List<Scf1115Response_DataList> dataList = new ArrayList<Scf1115Response_DataList>();
	
	
	private String code;
	
	private String message;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	public Integer getDataListCnt() {
		return dataListCnt;
	}

	public void setDataListCnt(Integer dataListCnt) {
		this.dataListCnt = dataListCnt;
	}

	public List<Scf1115Response_DataList> getDataList() {
		return dataList;
	}

	public void setDataList(List<Scf1115Response_DataList> dataList) {
		this.dataList = dataList;
	}
	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
	
}
