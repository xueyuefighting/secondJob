package com.yonyou.scf.contract.utilEntity;

import java.util.List;
import java.util.Map;

/**
 * 列表模板帮助类
 * @author wyx
 *
 */
public interface IListTemplateHelper {
	
	//查询项
	public abstract List<? extends PostSi> getSearchInput();
	
	//列表标题
	public abstract String getDatatitle();
	
	//查询标题
	public abstract String getInputtitle();
	
	//列表数据中字段名
	public abstract List<TitleAttribute> getTitleAttribute();
	
	//表数据中字段值
	public abstract List<Map<Integer,Object>> getTitleContent();
	
}
