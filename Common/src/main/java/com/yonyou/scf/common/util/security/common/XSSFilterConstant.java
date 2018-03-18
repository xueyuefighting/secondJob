package com.yonyou.scf.common.util.security.common;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * XSS防护 过滤元素维护
 * 2017年3月10日 下午1:58:56
 * 
 */
public class XSSFilterConstant {
	
	//LinkedHashMap 迭代保持插入顺序
	public static Map<String,String> xssMap = new LinkedHashMap<String,String>();
	/**
	 * 初始化map
	 * 被过滤元素为key  转换成的元素为value
	 * eg： 将 '<' 转换为 转义字符   
	 * xssMap.put("<", "&lt;");
	 */
    static{
            // 含有脚本： script
            xssMap.put("[s|S][c|C][r|R][i|I][p|P][t|T]", "");//script
            // 含有脚本 ：javascript
            xssMap.put("[\\\"\\\'][\\s]*[j|J][a|A][v|V][a|A][s|S][c|C][r|R][i|I][p|P][t|T]:(.*)[\\\"\\\']", "\"\"");//。。。？
            // 含有函数： eval
            xssMap.put("[e|E][v|V][a|A][l|L]\\((.*)\\)", "");//eval
            // 含有符号 <
            xssMap.put("<", "&lt;");
            // 含有符号 【>】 eg: 
            xssMap.put(">", "&gt;");
            // 含有符号 (
            xssMap.put("\\(", "（");
            // 含有符号 )
            xssMap.put("\\)", "）");
            // 含有符号 '
            xssMap.put("'", "‘");
            // 含有符号 "
            xssMap.put("\"", "“");
            // ’;‘
            //xssMap.put(";", "；");   如果有';'符号  他将会把&gt;中的 ; 换掉
            // ’-‘
            xssMap.put("-", " ");
    }
}
