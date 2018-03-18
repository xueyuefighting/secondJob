package com.yonyou.scf.gateway.validate;

import com.yonyou.scf.tools.system.CodeException;

public abstract class AbstractEntityValidator{

	/**
	 * 实体类成员变量 注解的验证
	 * @param t
	 * @param br
	 * @throws ValidFormHaveErrorsExcption 
	 */
	public <T> void formValidator(T t) throws CodeException{
		//校验工具类
		EntityValidation<T> ev =  new EntityValidation<T>(t);
		if(ev.hasErrors()){
			throw new CodeException(ev.getFirstErrorMessage());
		}
	}

}

