package com.yonyou.scf.common.util.lccb;

import com.yonyou.scf.common.util.Timer;

/**
 * 流水编号成成规则
 * 传入LCCB 廊坊银行标识
 */

public class DMTSerialNum {
	
	//充值
	public static String rechargeSerialNum(String str){
		String param = str+"_RCHG"+Timer.getDateTimeNow(Timer.Role2);
		return  param;
	}
    //转账 
	public static String tranferSerialNum(String str){
		String param = str+"_TRFR"+Timer.getDateTimeNow(Timer.Role2);
		return  param;
	}
	//提现
	public static String cashSerialNum(String str){
		String param = str+"_CASH"+Timer.getDateTimeNow(Timer.Role2);
		return  param;
	}
	//还款
	public static String  repaymentSerialNum(String str){
		String param = str+"_REPM"+Timer.getDateTimeNow(Timer.Role2);
		return  param;
	}
	//放款
	public static String  lendingSerialNum(String str){
		String param = str+"_LEND"+Timer.getDateTimeNow(Timer.Role2);
		return  param;
	}
	//签约
	public static String signSerialNum(String str){
		String param = str+"_SIGN"+Timer.getDateTimeNow(Timer.Role2);
		return  param;
	}
	//绑卡
	public static String bindBankSerialNum(String str){
		String param = str+"_bdBK"+Timer.getDateTimeNow(Timer.Role2);
		return  param;
	}
	//清分
	public static String signClearingNum(String str){
		String param = str+"_SCGN"+Timer.getDateTimeNow(Timer.Role2);
		return  param;
	}
	//上送接口商户流水号
	public static String lccbBusiSerialNum(String str){
		
		String param = str+"_"+DMTRanDomUtils.Random(7); 
		
		return param;
	}
	
	//合同编号生成规则
	public static String creditPactNum(String str){
		
		String param = str+"_credit"+"";
		return param ;
	}
	//签约
	public static String bindUsbSerialNum(String str){
		String param = str+"_USBK"+Timer.getDateTimeNow(Timer.Role2);
		return  param;
	}
	//生成廊坊银行终端流水号
	public static String trmSeqNumLccb(){
		  //17位毫秒时间
		String dt = Timer.getDateTimeNow(Timer.Role2);
		//获取13位随机数字
	    String rodm= DMTRanDomUtils.Random(13);
		return dt+rodm;
	}
	public static void main(String [] args){
		System.out.println(trmSeqNumLccb());
	}
	
}