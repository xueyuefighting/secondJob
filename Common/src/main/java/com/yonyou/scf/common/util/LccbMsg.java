package com.yonyou.scf.common.util;

import com.yonyou.scf.common.constant.LfConst;

public class LccbMsg {
	public static String LF_MSG="廊坊银行返回信息:";
	public static String getResutMsg(String resultCode){
		if(LfConst.resultCode_0.equals(resultCode)){
			return LfConst.resultCode_0_msg;
		}else if(LfConst.resultCode_1.equals(resultCode)){
			return LfConst.resultCode_1_msg;
		}else if(LfConst.resultCode_2.equals(resultCode)){
			return LfConst.resultCode_2_msg;
		}else if(LfConst.resultCode_3.equals(resultCode)){
			return LfConst.resultCode_3_msg;
		}
		return "";
	}
}
