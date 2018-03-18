package com.yonyou.scf.common.tx.gateway;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Scf1205Request implements Serializable {
	  /**
	 * 
	 */
	private static final long serialVersionUID = 6169937091114873780L;
		
		//融资申请流水号
		@NotBlank(message="融资申请流水号不能为空,且不超过32位")
		@Length(max=32,message="融资申请流水号不超过32位")
		
	    private String financingApplicationNo;

		public String getFinancingApplicationNo() {
			return financingApplicationNo;
		}

		public void setFinancingApplicationNo(String financingApplicationNo) {
			this.financingApplicationNo = financingApplicationNo == null ? null : financingApplicationNo.trim();
		}

		@Override
		public String toString() {
			return getClass().getSimpleName() + JsonUtil.toJSONString(this);
		}

}
