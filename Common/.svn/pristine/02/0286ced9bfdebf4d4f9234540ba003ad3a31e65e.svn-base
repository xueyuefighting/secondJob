package com.yonyou.scf.common.input;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance1007Request implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Finance1007Request_Data> f1007List = new ArrayList<Finance1007Request_Data>();
	
	public List<Finance1007Request_Data> getF1007List() {
		return f1007List;
	}

	public void setF1007List(List<Finance1007Request_Data> f1007List) {
		this.f1007List = f1007List;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}