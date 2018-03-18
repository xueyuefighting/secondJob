package com.yonyou.scf.common.constant;

import java.util.concurrent.TimeUnit;

/*
 * 登录相关敞亮设置
 * @author zhangjlm
 *
 */
public class UserFaceConstant {
	
	//正式交互的token 过期策略
	public static int TIMEOUT = 3;//hours
	public static TimeUnit TIMEOUT_UNIT = TimeUnit.HOURS;
	
	//登录验证码 过期策略
	public static int VERIFYCODE_TIMEOUT = 3;//hours
	public static TimeUnit VERIFYCODE_UNIT = TimeUnit.HOURS;
}
