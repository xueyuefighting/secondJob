package com.yonyou.scf.common.tx.gateway;

import java.io.Serializable;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf1215Request implements Serializable {

	private static final long serialVersionUID = 7496636754775582777L;
		
		//融资申请流水号
		
	    private String financingApplicationNo;

		public String getFinancingApplicationNo() {
			return financingApplicationNo;
		}

		public void setFinancingApplicationNo(String financingApplicationNo) {
			this.financingApplicationNo = financingApplicationNo ;
		}

		@Override
		public String toString() {
			return getClass().getSimpleName() + JsonUtil.toJSONString(this);
		}

}
