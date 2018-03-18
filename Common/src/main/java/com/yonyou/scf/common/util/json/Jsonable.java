package com.yonyou.scf.common.util.json;

import java.util.List;

/**
 * json接口
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu		2017-03-16	Create this file
 * </pre>
 * 
 */
public interface Jsonable {

	String DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 将对象转化成json字符串 将数组转化为json字符串 对象里面的数组也会被转换
	 * 
	 * @param bean
	 * @return
	 */
	String toJSONString(Object bean);

	/**
	 * json转对象
	 * 
	 * @param json
	 * @param beanClass
	 * @return
	 */
	<T> T toBean(String json, Class<T> beanClass);

	/**
	 * json转list
	 * 
	 * @param json
	 * @param beanClass
	 * @return
	 */
	<T> List<T> toList(String json, Class<T> beanClass);

	/**
	 * 日期格式
	 * 
	 * @param datePattern
	 */
	void setDatePattern(String datePattern);

	/**
	 * 过滤字段
	 * 
	 * @param excludes
	 */
	void setExcludes(String[] excludes);

	/**
	 * 打印输出用：JSON OBJECT转为STRING
	 * 
	 * @param bean
	 * @return
	 */
	String toPrintJSONString(Object bean);
}
