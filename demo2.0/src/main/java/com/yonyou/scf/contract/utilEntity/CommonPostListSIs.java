package com.yonyou.scf.contract.utilEntity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/*
 * 构造查询输入项 complex
 * @author wyx
 *
 */
@NoArgsConstructor
@AllArgsConstructor
public class CommonPostListSIs extends PostSi implements Serializable{
	
	private static final long serialVersionUID = -4863880795028155008L;
	
	
		private String title;
		private String id;
		private String type;
		private String check;
		private String value = "";
		private boolean readonly;
		private String url;
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
		public String getCheck() {
			return check;
		}
		public void setCheck(String check) {
			this.check = check;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public boolean isReadonly() {
			return readonly;
		}
		public void setReadonly(boolean readonly) {
			this.readonly = readonly;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	
	
}
