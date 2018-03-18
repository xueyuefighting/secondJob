package com.yonyou.scf.common.util.json;

import java.util.HashSet;
import java.util.Set;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyPreFilter;

/**
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * liuchao    2016-04-08  Create this file
 * </pre>
 * 
 */
public class ExcludesPropertyPreFilter implements PropertyPreFilter {

	private final Class<?> clazz;
	private final Set<String> includes = new HashSet<String>();
	private final Set<String> excludes = new HashSet<String>();

	public ExcludesPropertyPreFilter(String... properties) {
		this(null, properties);
	}

	public ExcludesPropertyPreFilter(Class<?> clazz, String... properties) {
		super();
		this.clazz = clazz;
		for (String item : properties) {
			if (item != null) {
				this.excludes.add(item);
			}
		}
	}

	public Class<?> getClazz() {
		return clazz;
	}

	public Set<String> getIncludes() {
		return includes;
	}

	public Set<String> getExcludes() {
		return excludes;
	}

	public boolean apply(JSONSerializer serializer, Object source, String name) {
		if (source == null) {
			return true;
		}

		if (clazz != null && !clazz.isInstance(source)) {
			return true;
		}

		if (this.excludes.contains(name)) {
			return false;
		}

		if (includes.size() == 0 || includes.contains(name)) {
			return true;
		}

		return false;
	}

}
