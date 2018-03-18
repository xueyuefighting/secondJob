package com.yonyou.scf.contract.utilEntity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/*
 * 字段值实体
 * @author wyx
 *
 */
@NoArgsConstructor
@AllArgsConstructor
public class TitleContent implements Serializable{
	
	private static final long serialVersionUID = 193544451923012503L;
	
	private int index;//字段名 对应字段名的索引
	private String value;//字段值
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
