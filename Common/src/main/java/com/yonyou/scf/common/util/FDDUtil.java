package com.yonyou.scf.common.util;

import com.yonyou.scf.common.constant.FddConst;
import com.yonyou.scf.common.constant.UserConst;

/**
 * @author zhangjlm
 *
 */
public class FDDUtil {
	/*转换法大大和系统中用户方 状态字段
	 * @return
	 */
	public static String transferStatus(String systemStatus) {
		switch(systemStatus) {
			case UserConst.user_role_type_1://核心企业
			return String.valueOf(FddConst.Fdd_file_sign_Client_role_Core_enterprise);
			
			case UserConst.user_role_type_2://出借方
			return String.valueOf(FddConst.Fdd_file_sign_Client_role_Investor);
			
			case UserConst.user_role_type_3://借款方
			return String.valueOf(FddConst.Fdd_file_sign_Client_role_Borrower);
			
			case UserConst.user_role_type_4://担保方
			return String.valueOf(FddConst.Fdd_file_sign_Client_role_Guarantor);
			
			case UserConst.user_role_type_5://共借方
			return String.valueOf(FddConst.Fdd_file_sign_Client_role_Borrower);
			
			case UserConst.user_role_type_6://平台
				return String.valueOf(FddConst.Fdd_file_sign_Client_role_Core_enterprise);
				
			default:
				return String.valueOf(FddConst.Fdd_file_sign_Client_role_Other);
		}
	}
	
}
