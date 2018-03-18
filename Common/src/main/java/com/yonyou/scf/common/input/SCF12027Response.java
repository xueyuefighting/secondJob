package com.yonyou.scf.common.input;

import java.io.Serializable;
import java.util.List;

import com.yonyou.scf.common.entity.OrderInfo;
import com.yonyou.scf.common.util.json.JsonUtil;

public class SCF12027Response implements Serializable   {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//主键 
	private List<OrderInfo> ids;

	private Long orderAmount;

	public List<OrderInfo> getIds() {
		return ids;
	}

	public void setIds(List<OrderInfo> ids) {
		this.ids = ids;
	}

	public Long getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + JsonUtil.toJSONString(this);
	}
}
