package com.yonyou.scf.contract.utilEntity;

import java.io.Serializable;

import com.yonyou.scf.common.gateway.entity.TokenBean;

import lombok.ToString;

@ToString
public class SerialNumValue implements Serializable{
	
	private static final long serialVersionUID = -5784130213856907824L;
	
	private TokenBean token;
	private String time;
	private int placeHolder;//签署时点 10-贷前 20-融资申请
	
	public TokenBean getToken() {
		return token;
	}
	public void setToken(TokenBean token) {
		this.token = token;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public SerialNumValue() {
	}
	public int getPlaceHolder() {
		return placeHolder;
	}
	public void setPlaceHolder(int placeHolder) {
		this.placeHolder = placeHolder;
	}
	public SerialNumValue(TokenBean token, String time, int placeHolder) {
		super();
		this.token = token;
		this.time = time;
		this.placeHolder = placeHolder;
	}
	
}
