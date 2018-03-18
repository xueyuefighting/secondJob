package com.yonyou.scf.common.tx.gateway;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.yonyou.scf.common.entity.FitGroup;
import com.yonyou.scf.common.entity.FitPersionalInformation;

public class FiGroupVOE extends FitGroup implements Serializable {

	private static final long serialVersionUID = -2021659647798411372L;
	// 融资方信息集合
	
	private List<FitPersionalInformation> dataList = new ArrayList<FitPersionalInformation>();

	public List<FitPersionalInformation> getDataList() {
		return Collections.unmodifiableList(dataList);
	}

	public void setDataList(List<FitPersionalInformation> list) {
		this.dataList = list;
	}

	public FitPersionalInformation removeListByIndex(int index) {
		return this.dataList.remove(index);
	}

	public boolean removeListByObject(FitPersionalInformation o) {
		return this.dataList.remove(o);
	}

}