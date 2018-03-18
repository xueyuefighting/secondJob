package com.yonyou.scf.contract.template;

import java.util.ArrayList;
import java.util.List;

import com.yonyou.scf.contract.utilEntity.CommonPostListSOs;
import com.yonyou.scf.tools.system.CodeException;

public interface IResponseTemplate {
	
	//整个列表 所有元素详情需要封在这个元素内部，返回给客户
	List<CommonPostListSOs> args = new ArrayList<CommonPostListSOs>();
	
	//当前模版类返回的最终结果
	List<CommonPostListSOs> create() throws CodeException; 
}
