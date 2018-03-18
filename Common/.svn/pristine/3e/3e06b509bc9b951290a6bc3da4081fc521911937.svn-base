package com.yonyou.scf.common.util.security;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.springframework.util.StringUtils;

import com.yonyou.scf.common.util.security.common.XSSFilterConstant;


/**
 * 请求攻击脚本拦截
 * 可替换和续加原过滤map
 * 继承request装饰类
 * 装饰request之后  重写父类后期调用的方法   
 * eg： 过滤header里的内容   那么  重写getHeader()
 * 继承HttpServletRequestWrapper意义在于 重写 规范api
 * @author zhangjinliang
 * 2017年3月10日 下午3:46:52
 * 
 */
public class XSSConstantTool extends HttpServletRequestWrapper {
	
	/**
	 * 初始化
	 * @param request
	 */
	public XSSConstantTool(HttpServletRequest request) {
		super(request);
	}



	//获取源过滤map
	private Map<String,String> sourceMap = XSSFilterConstant.xssMap;
	
	
	
	/**
	 * 替换过滤map为sourceMap
	 * @param sourceMap
	 */
	public void setSourceMap(Map<String, String> sourceMap) {
		this.sourceMap = sourceMap;
	}
	
	/**
	 * 向当前过滤map 续加 过滤元素
	 * @param key
	 * @param value
	 */
	public void addParamToMap(String key,String value){
		sourceMap.put(key, value);
	}
	
	/* 
	 * 复写  清理请求头
	 */
	@Override
	public String getHeader(String name) {
		 String value = super.getHeader(name);
	        if (value == null)
	            return null;
	        return cleanXSS(value);

	}
	
	
	
	@Override
	public String getParameter(String name) {
		String value = super.getParameter(name);
        if (value == null) {
            return null;
        }
        return cleanXSS(value);

	}

	@Override
	public String[] getParameterValues(String name) {
		String[] values = super.getParameterValues(name);
        if (values == null) {
            return null;
        }
        int count = values.length;
        String[] encodedValues = new String[count];
        for (int i = 0; i < count; i++) {
            encodedValues[i] = cleanXSS(values[i]);
        }
        return encodedValues;

	}
	
	/**
     * 清除恶意的XSS脚本
     * 
     * @param value
     * @return
     */
	public String cleanXSS(String value) {
		
        
        Set<Entry<String, String>> set = sourceMap.entrySet();
        Iterator<Entry<String, String>> iterator = set.iterator();
        while(iterator.hasNext()){
        	Entry<String, String>  entry = iterator.next();
        	 String key	= entry.getKey();
        	String keyValue = entry.getValue();
        	if(value.contains(key)){
        		System.out.println(getUserRealIp()+"请求："+super.getRequestURI()+"的请求中含带有攻击性字符"+key+"，已将其转为"+keyValue);
        		value = value.replaceAll(key,keyValue);
        	}
        }
        
        return value;
    }
	
	/**
	 * 判断当前请求 相关字符串的合法性
	 * @param targetString
	 * @return
	 */
	public boolean contentTypeFilter(String targetString){
		
		if(StringUtils.isEmpty(targetString)) return true;
		
		String regEx="[`~!@#$%^&*()+|{}':',\\[\\].<>?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]"; 
		
		for (int i = 0; i < targetString.length(); i++) {
			String array_element = targetString.charAt(i)+"";
			if(Pattern.matches(regEx, array_element)){
				System.out.println(getUserRealIp()+"请求："+super.getRequestURI()+"的请求中content-type 带有非法字符，已进行拦截...");
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 获取用户真实ip
	 * @param request
	 * @return
	 */
	public String getUserRealIp(){
		String ip = super.getHeader("x-forwarded-for"); 
	    
		if(!StringUtils.isEmpty(ip) && !"unknown".equalsIgnoreCase(ip)){
			//在header中  取x-forwarded-for 的绑定值  可能还有多个值 以“,”分割  而只有第一个是真正的请求者ip
			ip = ip.split(",")[0];
		}
		
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	      ip = super.getHeader("Proxy-Client-IP"); 
	    }
		
	    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	      ip = super.getHeader("WL-Proxy-Client-IP"); 
	    }
	    
	    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	      ip = super.getHeader("HTTP_CLIENT_IP"); 
	    }
	    
	    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	      ip = super.getHeader("HTTP_X_FORWARDED_FOR"); 
	    }
	    
	    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	      ip = super.getRemoteAddr(); 
	    }
	    
		return ip;
	}
	
}
