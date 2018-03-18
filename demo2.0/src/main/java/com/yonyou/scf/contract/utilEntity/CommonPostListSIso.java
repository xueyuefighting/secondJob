package com.yonyou.scf.contract.utilEntity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/*
 * 构造查询输入项 optimize
 * @author wyx
 *
 */
@NoArgsConstructor
@AllArgsConstructor
public class CommonPostListSIso extends PostSi implements Serializable{
	
	private static final long serialVersionUID = -1416094378276310671L;
	
		private String title;
		private String id;
		private String type;
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
}
