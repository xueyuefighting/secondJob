package com.yonyou.scf.common.tx.gateway;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf1205Response {
	
	
	private Integer dataListCnt;
	
	
	@Valid
	private List<Scf1205Response_DataList> dataList = new ArrayList<Scf1205Response_DataList>() ;
	
	
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
	
	public List<Scf1205Response_DataList> getDataList() {
		return dataList;
	}

	public void setDataList(List<Scf1205Response_DataList> dataList) {
		this.dataList = dataList;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
