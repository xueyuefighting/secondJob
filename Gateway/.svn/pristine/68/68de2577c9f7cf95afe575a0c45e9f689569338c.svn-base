package com.yonyou.scf.gateway.validate;

import com.yonyou.scf.tools.system.CodeException;

public class ValidActor<T> extends AbstractEntityValidator {
	
	private T t;
	
	public ValidActor(T t) {
		this.t = t;
	}


	public void validate() throws CodeException {

		T fg = this.t;
		
		//验证表单注解的成员变量
		super.formValidator(fg);
	}
}
