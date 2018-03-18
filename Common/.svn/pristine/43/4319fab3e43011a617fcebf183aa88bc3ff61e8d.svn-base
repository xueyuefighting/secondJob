package com.yonyou.scf.common.input;

import java.io.Serializable;
import java.util.List;

/*
 * 取当前融资申请单，当前签署方，合同签署情况等信息
 * @author zhangjlm
 *
 */
public class FDDFinanceConListBAS implements Serializable {
	
	
	private static final long serialVersionUID = 3146595675263817334L;
	
		private String financeId;
		private String signerNo;
		private String creditId;
		private List<String> serialNums;
		private String isSave;//0- 没有保存签署记录（确认页面传） 1-已保存签署记录（待办）-----静态变量在 ContractConstant类中
		private String tokenKey;
		public String getFinanceId() {
			return financeId;
		}
		public void setFinanceId(String financeId) {
			this.financeId = financeId;
		}
		public String getSignerNo() {
			return signerNo;
		}
		public void setSignerNo(String signerNo) {
			this.signerNo = signerNo;
		}
		public String getCreditId() {
			return creditId;
		}
		public void setCreditId(String creditId) {
			this.creditId = creditId;
		}
		public List<String> getSerialNums() {
			return serialNums;
		}
		public void setSerialNums(List<String> serialNums) {
			this.serialNums = serialNums;
		}
		
		public String getIsSave() {
			return isSave;
		}
		public void setIsNotSave(String isSave) {
			this.isSave = isSave;
		}
		
		public String getTokenKey() {
			return tokenKey;
		}
		public void setTokenKey(String tokenKey) {
			this.tokenKey = tokenKey;
		}
		public void setIsSave(String isSave) {
			this.isSave = isSave;
		}
		public FDDFinanceConListBAS() {
			super();
		}
		public FDDFinanceConListBAS(String financeId, String signerNo, String creditId, List<String> serialNums,
				String isSave, String tokenKey) {
			super();
			this.financeId = financeId;
			this.signerNo = signerNo;
			this.creditId = creditId;
			this.serialNums = serialNums;
			this.isSave = isSave;
			this.tokenKey = tokenKey;
		}
		@Override
		public String toString() {
			return "FDDFinanceConListBAS [financeId=" + financeId + ", signerNo=" + signerNo + ", creditId=" + creditId
					+ ", serialNums=" + serialNums + ", isSave=" + isSave + ", tokenKey=" + tokenKey + "]";
		}
		
}
