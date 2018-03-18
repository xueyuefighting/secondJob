package com.yonyou.scf.common.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * 金额格式工具类
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu		2017-03-16	Create this file
 * 
 * zhangjlm     2017-10-03   add method 'moneyNumberTransferToChinese','upperNumber','dispose','formatMoneyString'
 * </pre>
 * 
 */
public class AmountFormat {

	private static DecimalFormat df = new DecimalFormat("##,###,###,##0.00");

	public static String fen2Yuan(long fen) {
		double yuan = fen * 1.0 / 100;
		return df.format(yuan);
	}

	public static String fen2Yuan(int fen) {
		double yuan = fen * 1.0 / 100;
		return df.format(yuan);
	}
	
	/*
	 * 格式化  xxxxxxx.xx 的金钱 x,xxx,xxx.xx
	 * @param money
	 * @return
	 */
	public static String formatMoneyString(String money) {
		NumberFormat nf = new DecimalFormat("#,###.##");
		String subfix = "";
		String prefix = "";
		if(money.indexOf(".")<0) {
			subfix = money.substring(money.length()-2);
			prefix = money.substring(0,money.length()-2);
			money = nf.format(Long.parseLong(prefix))+"."+subfix;
		}else {
			subfix = money.substring(money.length()-3);
			prefix = money.substring(0,money.length()-3);
			money = nf.format(Long.parseLong(prefix))+subfix;
		}
        return money;
	}
	
	public static long yuan2Fen(double amount) {
		if (amount == 0) {
			return 0;
		} else {
			return new BigDecimal(amount * 100).setScale(2,
					BigDecimal.ROUND_HALF_UP).longValue();
		}
	}
	/*
	 * 将金钱小写数字转换为汉字大写  eg:21万元=》贰拾壹万元
	 * @param money
	 * @return
	 * @throws Exception
	 */
	public static String moneyNumberTransferToChinese(String money) throws Exception {
//		 if(!money.matches("^[0-9]+[0-9]*.?[0-9]*$") || !money.matches("^[0-9]+[0-9]*.?[0-9]*$")){
//	         throw new Exception("钱数格式错误！");
//	     }
	     String result = packageMoney(money);
	     return dispose(result);
	 }
	public static String moneyFenNumberTransferToChinese(String money) throws Exception {
//		if(!money.matches("^[0-9]+[0-9]*.?[0-9]*$")){
//			throw new Exception("钱数格式错误！");
//		}
		String result = packageMoney(money);
		return disposeFen(result);
	}
	public static String moneyNumberTransferToChinese_wanyuan(String money) throws Exception {
//		if(!money.matches("^[0-9]+[0-9]*.?[0-9]*$")){
//			throw new Exception("钱数格式错误！");
//		}
		String result = packageMoney_wanyuan(money);
		return dispose_wanyuan(result);
	}

	private static String packageMoney(String money) {
		String[] part= money.split("\\.");
	     StringBuffer integer = new StringBuffer();
	     for(int i=0;i<part[0].length();i++){
	         char perchar = part[0].charAt(i);
	         integer.append(upperNumber(perchar));
	         integer.append(upperNumber(part[0].length()-i-1));
	     }
	     StringBuffer decimal = new StringBuffer();
	        if(part.length>1){
	            int length = part[1].length()>=2?2:part[1].length();
	            for(int i=0;i<length;i++){
	                char perchar = part[1].charAt(i);
	                decimal.append(upperNumber(perchar));
	                if(i==0)decimal.append('角');
	                if(i==1)decimal.append('分');
	            }
	        }
	     String result = integer.toString()+decimal.toString();
		return result;
	}
	private static String packageMoney_wanyuan(String money) {
		String[] part= money.split("\\.");
		StringBuffer integer = new StringBuffer();
		for(int i=0;i<part[0].length();i++){
			char perchar = part[0].charAt(i);
			integer.append(upperNumber(perchar));
			integer.append(upperNumber(part[0].length()-i-1));
		}
		StringBuffer decimal = new StringBuffer();
		if(part.length>1){
			int length = part[1].length()>=2?2:part[1].length();
			
			if(length>0) decimal.append("点");
			
			int j = 0;
			
			for(int i=0;i<length;i++){
				char perchar = part[1].charAt(i);
				
				if(!"0".equals(String.valueOf(perchar))) {
					j++;
				}
				decimal.append(upperNumber(perchar));
			}
			
			if(j==0) {
				decimal = new StringBuffer();
			}
		}
		String result = integer.toString()+decimal.toString();
		return result;
	}
	private static  char upperNumber(char number){
	     switch(number){
	         case '0': return '零';
	         case '1': return '壹';
	         case '2': return '贰';
	         case '3': return '叁';
	         case '4': return '肆';
	         case '5': return '伍';
	         case '6': return '陆';
	         case '7': return '柒';
	         case '8': return '捌';
	         case '9': return '玖';
	     }
	     return 0;
	 }
	 private static  char upperNumber(int index){
		 switch(index){
		 case 0: return '圆';
		 case 1: return '拾';
		 case 2: return '佰';
		 case 3: return '仟';
		 case 4: return '万';
		 case 5: return '拾';
		 case 6: return '佰';
		 case 7: return '仟';
		 case 8: return '亿';
		 case 9: return '拾';
		 case 10: return '佰';
		 case 11: return '仟';
		 }
		 return 0;
	 }
	 private static String dispose_wanyuan(String result){
	     result = result.replaceAll("零仟零佰零拾|零仟零佰|零佰零拾|零仟|零佰|零拾", "零")
	             .replaceAll("零+", "零").replace("零亿", "亿");
	         result = result.matches("^.*亿零万[^零]仟.*$" )?result.replace("零万", "零")
	             :result.replace("零万", "万");
	         result = result.replace("亿万", "亿");
	             
	         if(result.startsWith("零")) {
	        	 	result = result.replace("零圆", "零");
	         }else {
	        	 	result = result.replace("零圆", "");
	         }
	         
	         result = result.replace("零分", "").replace("圆", "").replaceAll("圆零角零分|圆零角$|圆$" , "");
	         return result;
	     }
	 private static String dispose(String result){
		 result = result.replaceAll("零仟零佰零拾|零仟零佰|零佰零拾|零仟|零佰|零拾", "零")
				 .replaceAll("零+", "零").replace("零亿", "亿");
		 result = result.matches("^.*亿零万[^零]仟.*$" )?result.replace("零万", "零")
				 :result.replace("零万", "万");
		 result = result.replace("亿万", "亿").replace("零圆", "圆").replace("零分", "")
				 .replaceAll("圆零角零分|圆零角$|圆$" , "");
		 return result;
	 }
	 private static String disposeFen(String result){
		 result = result.replaceAll("零仟零佰零拾|零仟零佰|零佰零拾|零仟|零佰|零拾", "零")
				 .replaceAll("零+", "零").replace("零亿", "亿");
		 result = result.matches("^.*亿零万[^零]仟.*$" )?result.replace("零万", "零")
				 :result.replace("零万", "万");
		 result = result.replace("亿万", "亿").replace("零圆", "圆").replace("零分", "")
				 .replaceAll("圆零角零分|圆零角$|圆$" , "圆整");
		 return result;
	 }

}
