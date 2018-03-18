package com.yonyou.scf.contract.utilEntity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/*
 * @author wyx
 *
 */
/*
 * @author wyx
 *
 */
@AllArgsConstructor
@NoArgsConstructor
public class CommonListRq implements Serializable{
	
	private static final long serialVersionUID = 2236149171827698115L;
	
	private String totalPage;//总共页数
	private String currentInt;//当前页数
	private String currentPages;//每页条数
	public String getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(String totalPage) {
		this.totalPage = totalPage;
	}
	public String getCurrentInt() {
		return currentInt;
	}
	public void setCurrentInt(String currentInt) {
		this.currentInt = currentInt;
	}
	public String getCurrentPages() {
		return currentPages;
	}
	public void setCurrentPages(String currentPages) {
		this.currentPages = currentPages;
	}
	
}
