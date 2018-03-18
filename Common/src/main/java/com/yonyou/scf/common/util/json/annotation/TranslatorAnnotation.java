package com.yonyou.scf.common.util.json.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
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
public @interface TranslatorAnnotation {
    
    public enum TranslatorType {
        /**
         * 机构号
         */
        INSTITUTION,
        /**
         * 银行卡 ID
         */
        BANKID,
        /**
         * 交易类型
         */
        TXCODE
    }

    TranslatorType type();
}
