package com.yonyou.scf.contract.utilEntity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/*
 * 字段名实体
 * @author wyx
 *
 */
@NoArgsConstructor
@AllArgsConstructor
public class TitleAttribute implements Serializable{
	
	private static final long serialVersionUID = -462370293192914939L;
	
	private String column;//字段名
	private String type;//类型
	private String width;//字段宽度
	public String getColumn() {
		return column;
	}
	public void setColumn(String column) {
		this.column = column;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	
}
