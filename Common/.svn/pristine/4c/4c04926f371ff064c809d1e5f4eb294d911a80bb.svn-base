package com.yonyou.scf.common.input;

import java.io.Serializable;
import java.util.List;

import com.yonyou.scf.common.util.json.JsonUtil;

public class SCF12029Request implements Serializable   {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//主键 
	private List<Long> ids;

	private String Financing;
	private String token;
	
	public List<Long> getIds() {
		return ids;
	}


	public void setIds(List<Long> ids) {
		this.ids = ids;
	}


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}


	public String getFinancing() {
		return Financing;
	}


	public void setFinancing(String financing) {
		Financing = financing;
	}


	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
