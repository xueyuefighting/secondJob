package com.yonyou.scf.Gateway;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mockito.cglib.proxy.Enhancer;
import org.mockito.cglib.proxy.MethodInterceptor;
import org.mockito.cglib.proxy.MethodProxy;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;

import com.alibaba.fastjson.JSON;
import com.yonyou.scf.common.constant.ContractConstant;
import com.yonyou.scf.common.constant.URLConst;
import com.yonyou.scf.common.input.BLContractBean;
import com.yonyou.scf.common.input.BZContractBean;
import com.yonyou.scf.common.input.FWFContractBean;
import com.yonyou.scf.common.input.JJContractBean;
import com.yonyou.scf.common.input.JKContractBean;
import com.yonyou.scf.common.util.AmountFormat;
import com.yonyou.scf.common.util.BigDecimalUtil;
import com.yonyou.scf.common.util.net.HttpClientUtil;
import com.yonyou.scf.contract.util.ConstractTools;

public class RelectTest{
	static {
		System.out.println("当前类已被初始化");
		AGE = "21";
	}
	  public static final String AGE;
	  
	  public <T>T returnType(Class<T> t,String str) throws InstantiationException, IllegalAccessException{
		  return t.newInstance();
	  }
	  
	  
	  public static String baseString(int num,int base){  
	        if(base > 16){  
	            throw new RuntimeException("进制数超出范围，base<=16");  
	        }  
	        StringBuffer str = new StringBuffer("");  
	        String digths = "0123456789ABCDEF";  
	        Stack<Character> s = new Stack<Character>();  
	        while(num != 0){  
	            s.push(digths.charAt(num%base));  
	            num/=base;  
	        }  
	        while(!s.isEmpty()){  
	        		Character c = s.pop();
	        		System.out.println(c);
	            str.append(c);  
	        }  
	        return str.toString();  
	    } 
	  
	public static String transfer(int mun, int base) {
		Stack<Integer> stack = new Stack<Integer>();
		while(mun!=0) {
			int result = mun%base;
			stack.push(result);
			mun=mun/base;
		}
		StringBuffer sb = new StringBuffer();
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		return sb.toString();
	}
	public static void noo(int num,int fromInt, int toInt) {
		char[] cha = String.valueOf(num).toCharArray();
		int sum = 0;
		for (int i = cha.length-1; i >-1 ; i--) {
			if(cha[i]!='0') {
				sum+=Integer.parseInt( String.valueOf(cha[i]) )*Math.pow(Double.parseDouble(String.valueOf(fromInt)), cha.length-i-1); 
			}
		}
		System.out.println("十进制的结果："+sum);
		if(toInt==10) {
			System.out.println("转换"+toInt+"进制之后的结果："+sum);
		}else {
			System.out.println("转换"+toInt+"进制之后的结果："+transfer(sum,toInt));
		}
	}
	
	public static String[] insertion(String[] num, int left, int right) {
		if(left>right) {
			return num;
		}
		
		int end = num.length-1>right?right:num.length-1;
		int start = left+1;
		
		String o = "";
		
		for (int i = start,j=i; i <= end; i++,j++) {
			int m = i;
			int n = j-1;
			while(n>-1 && (num[n].compareTo(o = num[m])>0)) {
				num[m] = num[n];
				num[n] = o;
				if(n--<start) {
					break;
				}
				m--;
			}
		}
		return num;
	}
	
	public static int searchStr(String[] resouces, String key) {
		
		int start = 0;
		int end = resouces.length-1;
		
		while(start<=end) {
			int mid = (start+end)>>>1;
			
			if(resouces[mid].compareTo(key)==0) {
				return mid;
			}else if(resouces[mid].compareTo(key)<0){
				//start++;
				start = mid;
			}if(resouces[mid].compareTo(key)>0) {
				//end--;
				end = mid;
			}
			
		}
		
		
		return -1;
	}
	
	private static volatile int race = 10;
	
	private static int count = 20;
	
	public static void increase() {
		race++;
	}
	
	public <T>T returnObject(T t, MethodInterceptor m){
		
		Enhancer en = new Enhancer();
		en.setSuperclass(t.getClass());
		en.setCallback(m);
		
		T create = (T)en.create();
		return create;
	}
	
	class MyInterceptor implements MethodInterceptor{

		@Override
		public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
			System.out.println("我已开始拦截...");
			Object ob = proxy.invokeSuper(obj, args);
			System.out.println("我已拦截结束...");
			return ob;
		}
		
	}
	
	public static void main(String[] args) {
		String[] i = {"2","3","4","6","7","8"};
		System.out.println(searchStr(i,"7"));
//		String a = "34567890";
//		a.compareTo(anotherString)
//		int hash = a.hashCode()^(a.hashCode()>>>16);
//		System.out.println((64-1)&hash);
//		Map map = new Hashtable<>();
//		ThreadTest threadTest = new ThreadTest();
//		RelectTest relectTest = new RelectTest();
//		MyInterceptor myInterceptor = relectTest.new MyInterceptor();
//		ThreadTest tt = relectTest.returnObject(threadTest, myInterceptor);
//		tt.say();
//		tt.say("hello");
//		System.out.println(System.currentTimeMillis());
//		HashMap m = BeanUtils.instantiateClass(HashMap.class);
//		System.out.println(System.currentTimeMillis());
//		m.put("1", "sss");
//		System.out.println(System.currentTimeMillis());
//		System.out.println(m);
//		System.out.println(System.currentTimeMillis());
//		Map map = new HashMap();
//		Long[] a = null;
//		Long[] b = null;
//		System.out.println(Arrays.equals(a, b));
//		Pattern p = Pattern.compile("\\s+");   
//        Matcher m = p.matcher(" 123的");   
//		System.out.println(m.find());
//		System.out.println(m.matches());
//		JJContractBean re = new JJContractBean();
		try {
//			Map map = new HashMap();
//			map.put("1", "2");
//			
//			Map map1 = map;
//			map.put("2", "3");
//					Map map2 = map;
//					map2.put("3", "4");
//					System.out.println(map1==map2);
//					System.out.println(map1);
//					System.out.println(map2);
//			String str = RelectTest.AGE;
//			String resultString = HttpClientUtil.post("http://192.168.16.241:55100/Customer/SCF921002/"+ 1 + "/" + 2 + "/" + 1, "");
//			
//			Map<String,String> resultMap = JSON.parseObject(resultString, HashMap.class);
//			
//			Iterator<Entry<String, String>> it = resultMap.entrySet().iterator();
//			
//			List<Map<String,String>> list = new ArrayList<>();
//			Map<String,String> map = null;
//			while(it.hasNext()) {
//				map = new HashMap<>();
//				Entry<String, String> entyr = it.next();
//				map.put("id", entyr.getKey());
//				map.put("name", entyr.getValue());
//				System.out.println(map);
//				list.add(map);
//			}
//			int i = 432;
//			System.out.println(i%100);
//			InputStream is = RelectTest.class.getClassLoader().getResourceAsStream("imgError.png");
//			File file = new File("src/main/java/imgError.png");
//			ClassPathResource cp = new ClassPathResource("classpath:/imgError.png");
//			System.out.println(file.exists());
//			Thread[] threads = new Thread[count];
//			
//			for (int i = 0; i < threads.length; i++) {
//				threads[i] = new Thread(new Runnable() {
//					
//					@Override
//					public void run() {
//							for (int j = 0; j < 10000; j++) {
//								increase();
//							}
//					}
//				});
//				threads[i].start();
//			}
//			while(Thread.activeCount()>1)
//				Thread.yield();
//			System.out.println(race);
//			String a = "2";
//			String b = "2";
//			System.out.println(a.compareTo(b));
//			String[] a = {"11","33","23","45","21","33","22","33"};
//			insertion(a, 0, a.length);
//			for (int i = 0; i < ContractConstant.REGISTER_COMMON_STR.length; i++) {
//				System.out.println(ContractConstant.REGISTER_COMMON_STR[i]);
//			}
//			System.out.println(insertion(a,0,7));
//			for (int i = 0,j = i; i < a.length; ++i) {
//				System.out.println(j);
//			}
//			Collections.binarySearch(list, key)
//			System.out.println(-3>>1);
//			System.out.println(Integer.toBinaryString(8));
//			System.out.println(baseString(8,2));
//			noo(11,7,10);
//			BZContractBean bZContractBean = new BZContractBean();
//			bZContractBean.setCreditAmount("123123123123.12");
//			System.out.println(bZContractBean);
			
//			String money = "123123123.03";
//			money = AmountFormat.formatMoneyString(money);
//	        System.out.println(money);
//			String str = "4";
//			String str1 = "asdasldkjslkd";
//			System.out.println(fo(str, str1));
//			JKContractBean jkcBean = new JKContractBean();
//			Long a = 2100000L;
//			jkcBean.setCreditAmount(BigDecimalUtil.getAmount(a));
//			System.out.println(jkcBean);
//			System.out.println(AmountFormat.moneyNumberTransferToChinese_wanyuan("10000.00"));
			
//			InvocationImpl impl = new InvocationImpl();
//			
//			InvoTest it = new InvoTest(impl);
//			
//			InvocationH invocationH = (InvocationH) Proxy.newProxyInstance(it.getClass().getClassLoader(), impl.getClass().getInterfaces(), it);
//			
//			invocationH.say();
//			MethodInter methodInter = new MethodInter();
//			InvocationH invocationH = (InvocationH)methodInter.getProxy(InvocationImpl.class);
//			invocationH.say();
//			String i = "10";
//			String j = "10";
//			System.out.println(i.equals(j));
//			Integer i = 2000;
//			Integer j = 2000;
//			System.out.println(i==j);
//			AtomicInteger ai = new AtomicInteger(0);
//			System.out.println(ai.incrementAndGet());
//			System.out.println(ai.incrementAndGet());
//			String money = AmountFormat.moneyNumberTransferToChinese("321.00");
//			System.out.println(money);
//			String str = "123123";
//			System.out.println(str.substring(0,str.length()-2));
//			System.out.println(str.substring(str.length()-2));
//			re.setLoanAmount("123400");
//			System.out.println(re);
//			String str = "123";
//			System.out.println(str.charAt(str.length()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int fo(String target, String sources) {
		char[] source = sources.toCharArray();
		char[] targetSource = target.toCharArray();
		
		char first = targetSource[0];
		label1: for (int i = 0; i < source.length; i++) {
			if(first==source[i]) {
				
				if(targetSource.length==1) {
					return i;
				}
				
				int m=i+1;
				label2: for (int j = 1; j < targetSource.length+1; j++,m++) {
					if(targetSource[j] == source[m]) {
						if(++j==targetSource.length) {
							return i;
						}
						continue label2;
					}else {
						continue label1;
					}
				}
			}
		}
		return -1;
	}
	
	
	
	
	
	
	
	
}
