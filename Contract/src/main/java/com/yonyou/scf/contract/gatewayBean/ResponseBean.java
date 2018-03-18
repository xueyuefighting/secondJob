package com.yonyou.scf.contract.gatewayBean;

import java.util.List;

import lombok.ToString;

@ToString
public class ResponseBean {
	private String code;
	private String msg;
	private int ListCnt;
	private List<?> list;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getListCnt() {
		return ListCnt;
	}
	public void setListCnt(int listCnt) {
		ListCnt = listCnt;
	}
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
	
	public ResponseBean(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	public ResponseBean() {
	}
	
	public ResponseBean(String code, String msg, int listCnt, List<?> list) {
		this.code = code;
		this.msg = msg;
		ListCnt = listCnt;
		this.list = list;
	}
	
}
