package com.xgb.heliPay.quickPay.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Created by heli50 on 2018-06-25.
 */
@Target(FIELD)
@Retention(RUNTIME)
@Documented
public @interface FieldEncrypt {
	String value() default "";
}
