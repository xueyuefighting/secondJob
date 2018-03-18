package com.yonyou.scf.contract.utilEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/*
 * 列表字段名和字段值
 * @author wyx
 *
 */
@NoArgsConstructor
@AllArgsConstructor
public class CommonPostListMContent implements Serializable{
	
	private static final long serialVersionUID = -6533218510302348724L;
	
	private List<TitleEntity> args;
	
	
	public List<TitleEntity> getArgs() {
		return args;
	}

	public void setArgs(List<TitleEntity> args) {
		this.args = args;
	}
	
	public TitleEntity createTitleEntity() {
		return new TitleEntity();
	}
	public TitleAttribute createTitleAttribute() {
		return new TitleAttribute();
	}
	public TitleContent createTitleContent() {
		return new TitleContent();
	}
	
	/*
	 * 字段名和字段值的总实体
	 * @author wyx
	 *
	 */
	@NoArgsConstructor
	@AllArgsConstructor
	public class TitleEntity  implements Serializable{
		
		private static final long serialVersionUID = 1144502503270431297L;
		
		private List<TitleAttribute> title;//字段名实体封装
		private List<Map<Integer,Object>> data;//字段值实体封装
		public List<TitleAttribute> getTitle() {
			return title;
		}
		public void setTitle(List<TitleAttribute> title) {
			this.title = title;
		}
		public List<Map<Integer,Object>> getData() {
			return data;
		}
		public void setData(List<Map<Integer,Object>> data) {
			this.data = data;
		}
		
	}
	
		
}
