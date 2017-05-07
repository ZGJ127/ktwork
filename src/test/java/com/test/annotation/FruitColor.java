package com.test.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitColor {
    /**
     * 枚举颜色
     * */
	public enum Color{
		BULE("蓝色", 0),
		RED("红色", 1),
		GREEN("绿色", 2);
		
		private String color;
		private int status;
		
		private Color(String color, int status){
			this.color = color;
			this.status = status;
		}
		
		public String getColor(){
			return color;
		}
		
		public void setColor(String color){
			this.color = color;
		}
		
		public int getStatus(){
			return status;
		}
		
		public void setStatus(int status){
			this.status = status;
		}
	};
	
	/**
	 * 颜色默认属性
	 * */
	Color fruitColor() default Color.RED;
}
