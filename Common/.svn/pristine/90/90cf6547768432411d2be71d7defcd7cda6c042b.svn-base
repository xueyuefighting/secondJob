package com.yonyou.scf.common.util;

import com.yonyou.scf.common.constant.FinanceConst;
import com.yonyou.scf.common.constant.SignBankConst;
import com.yonyou.scf.common.constant.SystemConst;
import com.yonyou.scf.common.constant.URLConst;

public class OperateUtil {
	//	public static String getUserName(String Id){
	//		String userName="";
	//		try {
	//			userName = HttpClientUtil.post(URLConst.URL_CUSTOMER+"/0001/"
	//							+ Id, new Object());
	//					//.get("http://localhost:6602/user/0001/"
	////					.get(URLConst.URL_CUSTOMER+"/0001/"
	////							+ Id);
	//			if(userName.contains("\"status\":404")){
	//				userName="No Found";
	//			}
	//		} catch (Exception e) {
	//			e.printStackTrace();
	//		}
	//		return userName;
	//	}

	/** 根据资方ID判断资方标志
	 *  融资申请用 BY 刘鸽 
	 *  2017-11-08 改为固定值*/
	public static String getCapitalNo(Long capitalId) {
		String capitalNo = "";
		String capitalIdStr = "";
		try {
			//青金所环境
			if(SystemConst.QJS_REAL.equals(URLConst.ACTIVE_SYS) || SystemConst.QJS_UAT.equals(URLConst.ACTIVE_SYS)){
				capitalNo = FinanceConst.capital_No_04;
			}else {
				capitalIdStr = capitalId.toString();
				if (capitalIdStr.equals(StringUtil.toString(SignBankConst.LF_BANK_CODE))) {
					capitalNo = FinanceConst.capital_No_02;
				} else if (capitalIdStr.equals(StringUtil.toString(SignBankConst.BL_BANK_CODE))) {
					capitalNo = FinanceConst.capital_No_01;
				} else if (capitalIdStr.equals(StringUtil.toString(SignBankConst.XD_BANK_CODE))) {
					capitalNo = FinanceConst.capital_No_03;
				} else if (capitalIdStr.equals(StringUtil.toString(SignBankConst.QJ_BANK_CODE))) {
					capitalNo = FinanceConst.capital_No_04;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return capitalNo;
	}

	/**
	 * 根据资方ID判断短信发送方式 以后要改为从数据库中取得
	 * 暂定1-用友保理 3-中新小贷 用易云平台 http://118.178.117.163/chif10/mtsms/
	 *     4-青金中心            用容联云 http://www.yuntongxun.com/doc/rest/sms/3_2_2_2.html
	 */
	public static String getSmsType(Long capitalId) {
		if (SignBankConst.BANKS_USE_YIYUN.contains(capitalId)) {
			return SignBankConst.YIYUN;
		} else if (SignBankConst.BANKS_USE_RONGLIANYUN.contains(capitalId)) {
			return SignBankConst.RONGLIANYUN;
		} else {
			return "";
		}
	}
}
