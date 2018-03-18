package com.yonyou.scf.contract.constant;

import com.yonyou.scf.common.util.Timer;

@SuppressWarnings("all")
public class Constant {
	public final static String CODE_1000 = "1000";
	public final static String MSG_1000 = "操作失败";
	public final static String CODE_File_1000 = "1000";
	public final static String MSG_File_1000 = "文件id不存在";
	public final static String MSG_FILEREDIS_1000 = "文件id在redis中失效";
	
	public final static String MSG_TOKEN_1000 = "token失效";
	public final static String MSG_TOKEN_1001 = "token的key不存在";
	
	public final static String MSG_PARAM_NOTENOUGH_1000 = "参数不全";
	
	public final static String MSG_EXIST_1000 = "操作的数据已经重复";
	
	public final static String CODE_2000 = "2000";
	public final static String MSG_2000 = "操作成功";
	
	public final static String CODE_1500 = "1500";
	public final static String MSG_1500 = "当前合同已经签署，请勿重复签署";
	
	public final static String SIGN_TIME_10 = "10";//签署时点-授信-贷前
	public final static String SIGN_TIME_20 = "20";//签署时点-融资申请
	
	public final static String CODE_ERROR_OUTOFTIME = "8888";
	public final static String MSG_ERROR_OUTOFTIME = "操作时间过长，请重新登录";
	
	//法大大结果通知回调页面
	public final static String FDD_RETURN_URL = "www.baidu.com";
	
	//页面显示时间格式
	public final static String TIME_FORMAT = "yyyy-MM-dd HH:mm";
	
	//合同编号替换规则，如果修改  需要修改 同时修改以下两项
	public  final static String CONTRACT_NO_RULE = "yyyyMMdd";
	public  final static String CONTRACT_NO_RULE_PYN = "yyyy";
	
	//contract_sign  0-未签署  1-已签署
	public final static int SIGN_NOT_0 = 0;
	public final static int SIGN_YES_1 = 1;
}
