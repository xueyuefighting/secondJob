package com.yonyou.scf.gateway.validate;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import com.yonyou.scf.tools.system.CodeException;



/**
 * 验证T实体对象是否包含错误信息，这些信息是在实体类中自拟的。
 * 会抛出两个异常，如下：
 * IllegalArgumentException - 当前验证对象为空
 * ValidationException 猜测为编写逻辑错误，待验证
 * @author zhangjinliang
 * 2017年3月29日 下午4:55:21
 * 
 * @param <T>
 */
public class EntityValidation<T>{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private T t;
	private Validator validator;
	private Set<ConstraintViolation<T>> validators;
	private String firstErrorMessage;
	private List<String> allErrorMessage;

	public EntityValidation(T t) {
		this.t = t;
		parseT();
	}
	
	/**
	 * 验证的核心方法
	 * 开始验证T对象
	 */
	private void parseT() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
		validators = validator.validate(t);
	}

	/**
	 * 是否包含错误信息
	 * @return
	 * @throws ValidFormHaveErrorsExcption 
	 */
	public boolean hasErrors() throws CodeException{
		if(validators!=null && validators.size()>0){
			logger.warn("hasErrors","实体验证出现错误");
			throw new CodeException("0008","实体验证出现错误");
		}
		return false;
	}
	
	/**
	 * 当有错误信息的时候，返回第一条错误信息
	 * @return
	 * @throws ValidFormHaveErrorsExcption 
	 */
	public String getFirstErrorMessage() throws CodeException{
		
		Assert.isTrue(hasErrors(), "当前验证没有错误信息，请重新校对...resource class is EntityValidation.getFirstErrorMessage()");
		
		this.firstErrorMessage = validators.iterator().next().getMessage();
		
		logger.warn("getFirstErrorMessage","实体验证出现错误，错误信息为："+this.firstErrorMessage);
		
		return firstErrorMessage;
		
	}
	
	/**
	 * 当有错误信息的时候，返回所有错误信息
	 * @return
	 * @throws ValidFormHaveErrorsExcption 
	 */
	public List<String> getAllErrorMessage() throws CodeException{
		
		Assert.isTrue(hasErrors(), "当前验证没有错误信息，请重新校对...resource class is EntityValidation.getAllErrorMessage()");
		
		List<String> list = new ArrayList<String>();
		
		for (ConstraintViolation<T> constraintViolation  : validators) {
			list.add(constraintViolation.getMessage());
		}
		
		this.allErrorMessage = list;
		
		logger.warn("getAllErrorMessage","实体验证出现错误，错误信息为："+this.allErrorMessage.toArray().toString());
		
		return Collections.unmodifiableList(allErrorMessage);
		
	}
	/**
	 * 验证object实体类中的成员变量是否为指定值intNo
	 * @param intNo
	 * @param object
	 * @return
	 */
	public static boolean validateIntNo(String intNo, String fieldName, Object object){
		
		Method[] methods = object.getClass().getDeclaredMethods();
		
		for (Method method : methods) {
			String methodName = method.getName();
			if(methodName.startsWith("get") && methodName.substring(3).equalsIgnoreCase(fieldName)){
				String resourceIntNo = "";
				try {
					resourceIntNo = (String) method.invoke(object, null);
				} catch (IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					e.printStackTrace();
				}
				
				if(intNo==null && intNo==resourceIntNo){
					return true;
				}
				
				if(intNo.equals(resourceIntNo)){
					return true;
				}
			}
		}
		
		return false;
	}
}
