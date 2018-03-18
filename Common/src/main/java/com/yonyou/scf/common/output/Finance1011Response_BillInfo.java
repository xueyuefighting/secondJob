package com.yonyou.scf.common.output;

import java.io.Serializable;

import com.yonyou.scf.common.util.json.JsonUtil;

public class Finance1011Response_BillInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 单据编号
	private String billNo;
	// 订单金额/应收账款金额
	private Long billAmount;
	// 卖方
	private String saler;
	// 单据状态
	private String financing;
	// 单据日期
	private String billDate;
	// 买方
	private String buyer;
	// 起始日
	private String startDate;
	// 到期日
	private String endDate;
	private Long billId;


	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public Long getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Long billAmount) {
		this.billAmount = billAmount;
	}

	
	public String getFinancing() {
		return financing;
	}

	public void setFinancing(String financing) {
		this.financing = financing;
	}

	public String getBillDate() {
		return billDate;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getSaler() {
		return saler;
	}

	public void setSaler(String saler) {
		this.saler = saler;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Long getBillId() {
		return billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
	}

	
	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
