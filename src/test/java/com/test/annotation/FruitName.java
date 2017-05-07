package com.test.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})//该括号内可以填多个值，用逗号分隔
@Retention(RetentionPolicy.RUNTIME)//表明该注解被保留的长短
@Documented
public @interface FruitName {
    String value() default "";
}
