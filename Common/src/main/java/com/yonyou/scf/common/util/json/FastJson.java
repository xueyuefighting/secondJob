package com.yonyou.scf.common.util.json;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * 基于fastJson封装
 * https://github.com/alibaba/fastjson/
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * liuchao    2016-04-08  Create this file
 * </pre>
 * 
 */
public class FastJson implements Jsonable {
	
	/**
	 * 过滤字段
	 */
	private String[] excludes;

	@Override
	public String toJSONString(Object bean) {
		if(excludes != null){
			ExcludesPropertyPreFilter filter = new ExcludesPropertyPreFilter(bean.getClass(), excludes);
			return JSON.toJSONString(bean,filter,SerializerFeature.WriteDateUseDateFormat);
		}		
		return JSON.toJSONString(bean,SerializerFeature.WriteDateUseDateFormat);
	}

	@Override
	public <T> T toBean(String json, Class<T> beanClass) {
		return JSON.parseObject(json,beanClass);
	}

	@Override
	public <T> List<T> toList(String json, Class<T> beanClass) {
		return JSON.parseArray(json, beanClass);
	}
	
	/**
	 * 日期格式
	 * @param datePattern
	 */
	public void setDatePattern(String datePattern) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setExcludes(String[] excludes) {
		this.excludes = excludes;
	}

	@Override
	public String toPrintJSONString(Object bean) {
		// TODO Auto-generated method stub
		return null;
	}

}
