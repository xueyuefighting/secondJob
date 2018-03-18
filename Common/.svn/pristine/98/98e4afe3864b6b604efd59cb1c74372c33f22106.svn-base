package com.yonyou.scf.common.tx.gateway;

import java.util.ArrayList;
import java.util.List;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf1215Response {
	
	
	private String code;
	
	
	private String message;

	
	private Integer dataListCnt;
	
	
	private List<Scf1215Response_DataList> dataList=new ArrayList<Scf1215Response_DataList>();
	
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

	public List<Scf1215Response_DataList> getDataList() {
		return dataList;
	}

	public void setDataListCnt(Integer dataListCnt) {
		this.dataListCnt = dataListCnt;
	}

	public void setDataList(List<Scf1215Response_DataList> dataList) {
		this.dataList = dataList;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
