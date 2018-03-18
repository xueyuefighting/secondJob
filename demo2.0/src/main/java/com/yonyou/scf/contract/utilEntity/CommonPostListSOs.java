package com.yonyou.scf.contract.utilEntity;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/*
 * @author zhangjlm
 *
 */
/*
 * 整个列表 所有元素详情
 * @author wyx
 *
 */
@NoArgsConstructor
@AllArgsConstructor
public class CommonPostListSOs  implements Serializable{
	
	private static final long serialVersionUID = -1069178613772591938L;
	
	private String inputtitle;//查询区域标题
	private List<? extends PostSi> input;//查询输入项
	private List<CommonPostListSBs> button;//查询区域按钮
	private String datatitle;//查询区域标题
	private CommonPostListMContent data;//列表数据 包含列表字段
	public List<? extends PostSi> getInput() {
		return input;
	}
	public void setInput(List<? extends PostSi> input) {
		this.input = input;
	}
	public List<CommonPostListSBs> getButton() {
		return button;
	}
	public void setButton(List<CommonPostListSBs> button) {
		this.button = button;
	}
	
	public String getInputtitle() {
		return inputtitle;
	}
	public void setInputtitle(String inputtitle) {
		this.inputtitle = inputtitle;
	}
	public String getDatatitle() {
		return datatitle;
	}
	public void setDatatitle(String datatitle) {
		this.datatitle = datatitle;
	}
	public CommonPostListMContent getData() {
		return data;
	}
	public void setData(CommonPostListMContent data) {
		this.data = data;
	}
	
	
}
