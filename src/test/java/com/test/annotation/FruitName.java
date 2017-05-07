package com.test.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})//�������ڿ�������ֵ���ö��ŷָ�
@Retention(RetentionPolicy.RUNTIME)//������ע�ⱻ�����ĳ���
@Documented
public @interface FruitName {
    String value() default "";
}
