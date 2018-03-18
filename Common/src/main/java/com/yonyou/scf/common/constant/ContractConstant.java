package com.yonyou.scf.common.constant;

import java.io.Serializable;

import org.springframework.util.StringUtils;

import com.yonyou.scf.common.entity.ContractTemplate;

/**
 * 合同模版 通用静态类
 * 
 * 每加一份合同类型 都要做六步
 * 1:到sys_param表中 添加当前合同类型
 * 
 * 2:到contract_attribute 表中  添加 当前合同类型需要几方签署、流水号规则  和  循环规则
 * 
 * 3:在这个类中 写好常量，并把常量加入到方法exchangeType中
 * 
 * 4:将当前合同类型的数值 加入到‘REGISTER_COMMON_STR’数组中，自动排序数组
 * 
 * 5:实现IContractTool接口，做自己的贷前和融资申请合同号的规则  可参考TPNContractToolService类
 * 
 * 6:具体地方 调用IContractTool实现类取合同号
 * 
 * 注：签署方法已经封装好了，只需做自己的业务方法 调用签署方法即可（贷前和融资申请都有）
 * @author zhangjlm
 *
 */
public class ContractConstant implements Serializable {

	private static final long serialVersionUID = 7631942678452298255L;
	
	public static final String IS_SAVE_NO = "0";//0- 没有保存签署记录（确认页面传） 1-已保存签署记录（待办）
	public static final String IS_SAVE_YES = "1";//0- 没有保存签署记录（确认页面传） 1-已保存签署记录（待办）
	public static final String IS_SAVE_RESULT_OK = "ok";//确认页面是否全部签署完 ok-已全部签署  no-没有全部签署
	public static final String IS_SAVE_RESULT_NO = "no";//确认页面是否全部签署完 ok-已全部签署  no-没有全部签署
	
	
	public static final int CUSTOMER_FIN_TYPE = 20;//融资申请---商户端类型
	public static final int CUSTOMER_CRE_TYPE = 10;//贷前---商户端类型
	
	public static final String CONTRACT_BLHT_TYPE = "10";//保理合同类型
	public static final String CONTRACT_BLHT_TYPE_KEY = "bLContractNo";//保理合同类型
	public static final String CONTRACT_DJ_TYPE = "20";//保理登记类型
	public static final String CONTRACT_DJ_TYPE_KEY = "dJcontractNo";//保理登记类型
	public static final String CONTRACT_TZ_TYPE = "21";//保理通知类型
	public static final String CONTRACT_TZ_TYPE_KEY = "tZcontractNo";//保理通知类型
	
	public static final String CONTRACT_TPN_JJ_TYPE = "30";//太平鸟 借据合同类型
	public static final String CONTRACT_TPN_JJ_TYPE_KEY = "jJContractNo";//太平鸟 借据合同类型
	public static final String CONTRACT_TPN_JK_TYPE = "31";//太平鸟 借款合同类型
	public static final String CONTRACT_TPN_JK_TYPE_KEY = "jKContractNo";//太平鸟 借款合同类型
	public static final String CONTRACT_TPN_BZ_TYPE = "32";//太平鸟 保证合同类型
	public static final String CONTRACT_TPN_BZ_TYPE_KEY = "bZContractNo";//太平鸟 保证合同类型
	public static final String CONTRACT_TPN_FWF_TYPE = "33";//太平鸟 服务费合同类型  由于没有合同 没有key
	
	public static final String CONTRACT_QJS_JK_TYPE = "40";//青津所借款合同
	public static final String CONTRACT_QJS_JK_TYPE_KEY = "qJSJKContractNo";//青津所借款合同
	
	
	//签署关键字，动态取当前登陆方法人名字   如果是企业-取法人名字   如果是个人-取当前登陆人的名字
	public static final String CURRENT_LEGAL_NAME = "CURRENT_LEGAL_NAME";
	
	//启用共同合同模版模式
	public static final String[] REGISTER_COMMON_STR = {CONTRACT_TPN_JJ_TYPE,CONTRACT_TPN_JK_TYPE,CONTRACT_TPN_BZ_TYPE,CONTRACT_TPN_FWF_TYPE,CONTRACT_QJS_JK_TYPE};
	
	//将REGISTER_COMMON_STR 排序
	static{
		insertionStr(REGISTER_COMMON_STR, 0, REGISTER_COMMON_STR.length);
	}
	
	/*
	 * 字符串插入排序
	 * @param num
	 * @param left 从第几位开始
	 * @param right 到第几位结束  如果right 大于字符串数组最大长度  则以字符串长度最大值位准
	 * @return
	 */
	public static String[] insertionStr(String[] num, int left, int right) {
		if(left>right) {
			return num;
		}
		
		if(left<0) {
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
	
	
	public static String exchangeType(ContractTemplate contractTemplate) throws Exception {
		
		if(StringUtils.isEmpty(contractTemplate)) {
			throw new Exception("contractTemplate的对象为null");
		}
		
		String contractType = contractTemplate.getContractType();
		
		switch(contractType) {
			case CONTRACT_BLHT_TYPE:
				return CONTRACT_BLHT_TYPE_KEY;
			case CONTRACT_DJ_TYPE:
				return CONTRACT_DJ_TYPE_KEY;
			case CONTRACT_TZ_TYPE:
				return CONTRACT_TZ_TYPE_KEY;
			case CONTRACT_TPN_JJ_TYPE:
				return CONTRACT_TPN_JJ_TYPE_KEY;
			case  CONTRACT_TPN_JK_TYPE:
				return CONTRACT_TPN_JK_TYPE_KEY;
			case CONTRACT_TPN_BZ_TYPE:
				return CONTRACT_TPN_BZ_TYPE_KEY;
			case CONTRACT_QJS_JK_TYPE:
				return CONTRACT_QJS_JK_TYPE_KEY;
				default :
				 return "";
		}
	}
	
}
