package com.yonyou.scf.contract.utilEntity;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/*
 * CommonPostListSOs = CommonPostListSearchOptions
 * CommonPostListSContent = CommonPostListSearchContent
 * @author zhangjlm
 *
 */
/*
 * 包装列表页面 所有元素
 * @author wyx
 *
 */
@NoArgsConstructor
@AllArgsConstructor
public class CommonPostListSContent_bak  implements Serializable{
	
	private static final long serialVersionUID = 7170374716624248937L;
	
	private List<CommonPostListSOs> args;

	public List<CommonPostListSOs> getArgs() {
		return args;
	}

	public void setArgs(List<CommonPostListSOs> args) {
		this.args = args;
	}
	
}
