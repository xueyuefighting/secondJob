package com.bjdreamtech.dmt.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @author wp
 *  金额处理
 */
public class DMTMoneyUtil {
	/**
	 * 金额格式化
	 * 传入字符串
	 */
	public static String  moneyFormat(String str){
		if("".equals(str)||str==null){
			return "";
		}
		String temp ="";
		//如果没有小数点
		if(str.indexOf(".")==-1){
			temp=".00";
		}if(str.indexOf(".")!=-1&&str.substring(str.indexOf(".")+1,str.length()).length()==1){
			temp ="0";
		}if(str.indexOf(".")!=-1&&str.substring(str.length()-1, str.length()).equals("0")){
			temp="0";
		}if("00".equals(str.substring(str.indexOf(".")+1,str.length()))){
			temp=".00";
		}
		if("0".equals(str.substring(str.indexOf(".")+1,str.length()))){
			temp=".00";
		}
		
		
		
		NumberFormat format = new DecimalFormat("#,###.####");
	    return format.format(Double.valueOf(str).doubleValue())+temp;
	}

	
	/**
	 * 金额格式化
	 * BigDecimal转换
	 */
	public static String  moneyFormat(BigDecimal str){
		//转成字符串
		String strChg = String.valueOf(str);
		if("".equals(strChg)||strChg==null){
			return "";
		}
		String temp ="";
		//如果没有小数点
		if(strChg.indexOf(".")==-1){
			temp=".00";
		}if(strChg.indexOf(".")!=-1&&strChg.substring(strChg.indexOf(".")+1,strChg.length()).length()==1){
			temp ="0";
		}if(strChg.indexOf(".")!=-1&&strChg.substring(strChg.length()-1, strChg.length()).equals("0")){
			temp="0";
		}if("00".equals(strChg.substring(strChg.indexOf(".")+1,strChg.length()))){
			temp=".00";
		}
		if("0".equals(strChg.substring(strChg.indexOf(".")+1,strChg.length()))){
			temp=".00";
		}
		
		NumberFormat format = new DecimalFormat("#,###.####");
	    return format.format(Double.valueOf(str.toString()).doubleValue())+temp;
	}
	
	/**
     * 数字金额大写转换，思想先写个完整的然后将如零拾替换成零
     * 要用到正则表达式
     */
	public static String converamount(double number)
    {
        StringBuffer chineseNumber = new StringBuffer();
        String [] num={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        String [] unit = {"分","角","圆","拾","佰","仟","万","拾","佰","仟","亿","拾","佰","仟","万"};
        String tempNumber = String.valueOf(Math.round((number * 100)));
        int tempNumberLength = tempNumber.length();
        if ("0".equals(tempNumber))
        {
            return "零圆整";
        }
        if (tempNumberLength > 15)
        {
            try {
				throw new Exception("超出转化范围.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        boolean preReadZero = true;    //前面的字符是否读零
        for (int i=tempNumberLength; i>0; i--)
        {
            if ((tempNumberLength - i + 2) % 4 == 0)
            {
                //如果在（圆，万，亿，万）位上的四个数都为零,如果标志为未读零，则只读零，如果标志为已读零，则略过这四位
                if (i - 4 >= 0 && "0000".equals(tempNumber.substring(i - 4, i)))
                {
                    if (!preReadZero)
                    {
                        chineseNumber.insert(0, "零");
                        preReadZero = true;
                    }
                    i -= 3;    //下面还有一个i--
                    continue;
                }
                //如果当前位在（圆，万，亿，万）位上，则设置标志为已读零（即重置读零标志）
                preReadZero = true;
            }
            Integer digit = Integer.parseInt(tempNumber.substring(i - 1, i));
            if (digit == 0)
            {
                //如果当前位是零并且标志为未读零，则读零，并设置标志为已读零
                if (!preReadZero)
                {
                    chineseNumber.insert(0, "零");
                    preReadZero = true;
                }
                //如果当前位是零并且在（圆，万，亿，万）位上，则读出（圆，万，亿，万）
                if ((tempNumberLength - i + 2) % 4 == 0)
                {
                    chineseNumber.insert(0, unit[tempNumberLength - i]);
                }
            }
            //如果当前位不为零，则读出此位，并且设置标志为未读零
            else
            {
                chineseNumber.insert(0, num[digit] + unit[tempNumberLength - i]);
                preReadZero = false;
            }
        }
        //如果分角两位上的值都为零，则添加一个“整”字
        if (tempNumberLength - 2 >= 0 && "00".equals(tempNumber.substring(tempNumberLength - 2, tempNumberLength)))
        {
            chineseNumber.append("整");
        }
        return chineseNumber.toString();
    }
    
    public static void main(String [] args){
    	String st ="100.00";
    	System.out.println(converamount(5));
    	
    }
    
    
}
