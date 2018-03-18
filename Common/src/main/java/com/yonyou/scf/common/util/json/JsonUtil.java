package com.yonyou.scf.common.util.json;

import java.util.List;

/**
 * Java Object和Json String/Object之间的互相转换。
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu		2017-03-16	Create this file
 * </pre>
 * 
 */
public class JsonUtil {

	public static final String Jackson = "jackson";
	public static final String FastJson = "fastJson";

	public static String DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

	public static String DEFAULT_JSON = FastJson;

	/**
	 * getJsonable
	 * 
	 * @return
	 */
	private static Jsonable getJsonable() {
		Jsonable jsonable = null;
		if (DEFAULT_JSON.equals(FastJson)) {
			jsonable = new FastJson();
		} else {
			jsonable = new FastJson();
		}
		jsonable.setDatePattern(DEFFAULT_DATE_FORMAT);
		return jsonable;
	}

	/**
	 * <pre>
	 * 将对象转化成json字符串 
	 * 将数组转化为json字符串 
	 * 对象里面的数组也会被转换
	 * </pre>
	 * 
	 * @param bean
	 * @return
	 */
	public static String toJSONString(Object bean) {
		return getJsonable().toJSONString(bean);

	}

	/**
	 * <pre>
	 * 将对象转化成json字符串 
	 * 将数组转化为json字符串 
	 * 对象里面的数组也会被转换
	 * </pre>
	 * 
	 * @param bean
	 * @param excludes
	 * @return
	 */
	public static String toJSONString(Object bean, String... excludes) {
		Jsonable jsonable = getJsonable();
		jsonable.setExcludes(excludes);
		return jsonable.toJSONString(bean);
	}

	/**
	 * Json String转Java Object
	 * 
	 * @param json
	 * @param beanClass
	 * @return
	 * @author
	 * @date 2015年7月6日
	 */
	public static <T> T toBean(String json, Class<T> beanClass) {
		return getJsonable().toBean(json, beanClass);
	}

	/**
	 * Json String转Java List
	 * 
	 * @param json
	 * @param beanClass
	 * @return
	 */
	public static <T> List<T> toList(String json, Class<T> beanClass) {
		return getJsonable().toList(json, beanClass);
	}

	//TODO
	/**
	 * 待实现：脱敏用：Java Object转Json String
	 * 
	 * @param Object
	 * @return Json String
	 */
	public static String getDesensitizationJSON(Object obj) {
		return JsonUtil.toJSONString(obj);
	}


	/**
	 * <pre>
	 * 将对象转化成json字符串 
	 * 将数组转化为json字符串 
	 * 对象里面的数组也会被转换
	 * </pre>
	 * 
	 * @param bean
	 * @return
	 */
	public static String toPrintJSONString(Object bean) {
		return getJsonable().toPrintJSONString(bean);

	}
}
