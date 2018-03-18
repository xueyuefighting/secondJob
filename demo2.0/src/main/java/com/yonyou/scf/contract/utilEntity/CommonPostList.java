package com.yonyou.scf.contract.utilEntity;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/*
 * 最后构造的实体，直接返回前端
 * 
 * @author wyx
 *
 */
@AllArgsConstructor
@NoArgsConstructor
public class CommonPostList  implements Serializable{

	private static final long serialVersionUID = -2578852069075854714L;
	
	private String code;// 请求/返回状态码
	private String msg;// 请求/返回响应信息
	private List<CommonPostListSOs> data;//数据内容
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<CommonPostListSOs> getData() {
		return data;
	}
	public void setData(List<CommonPostListSOs> data) {
		this.data = data;
	}
	
}
