package com.bjdreamtech.dmt.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * 两个List集合取交并集
 * @author zhanglei
 *
 */
public class DMTListChg {
	
	/**
	 * 集合交集
	 * @param ls1
	 * @param ls2
	 * @return 两个交集的集合
	 */
	public static List<String> retainAll(List<String> ls1,List<String> ls2 ){
		List<String> tempLs = new ArrayList<String>();
		ls1.retainAll(ls2);
		Iterator<String> it = ls1.iterator();
		while(it.hasNext()){
			tempLs.add(it.next());
		}
		return tempLs;
	}
	
	/**
	 * 集合差集
	 * @param ls1
	 * @param ls2
	 * @return 元素存在ls1中,不在ls2中
	 */
	public static List<String> removeAll(List<String> ls1,List<String> ls2 ){
		List<String> tempLs = new ArrayList<String>();
		ls1.removeAll(ls2);
		Iterator<String> it = ls1.iterator();
		while(it.hasNext()){
			tempLs.add(it.next());
		}
		return tempLs;
	}
	
}
