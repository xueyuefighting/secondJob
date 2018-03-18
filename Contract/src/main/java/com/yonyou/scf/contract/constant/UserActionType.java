package com.yonyou.scf.contract.constant;

/**
 * 操作员日志记录类型
 * 不存在的类型，请核实添加
 * @author zhangjlm
 *
 */
public enum UserActionType {
	
	LOGIN("登录"),
	
	MODIFY_PWD("修改密码"),
	
	MODIFY_TEL("修改手机"),
	
	MODIFY_MAIL("修改邮箱"),
	
	BIND_USB("绑定u盾");

	private UserActionType(String name) {
	}
	
}
