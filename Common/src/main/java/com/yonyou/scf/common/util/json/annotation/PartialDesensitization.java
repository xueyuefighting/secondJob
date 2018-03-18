package com.yonyou.scf.common.util.json.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 脱敏用
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu      2017-03-16  Create this file
 * </pre>
 * 
 */
@Inherited
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PartialDesensitization {
    int prefix() default -1;
    int suffix() default -1;
    
    public enum DesensitizationType {
        /**
         * 脱敏中间字符，自己定制
         */
        NORMAL,
        /**
         * 银行卡 ，前面4位明文，后面4位明文
         */
        BANKCARD,
        /**
         * 证件号码 ，前面3位明文，后面2位明文
         */
        IDCARD,
        /**
         * 电话号码 ，前面3位明文，后面4位明文
         */
        PHONENUM
    }

    DesensitizationType type();
}
