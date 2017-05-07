package com.test.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitColor {
    /**
     * ö����ɫ
     * */
	public enum Color{
		BULE("��ɫ", 0),
		RED("��ɫ", 1),
		GREEN("��ɫ", 2);
		
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
	 * ��ɫĬ������
	 * */
	Color fruitColor() default Color.RED;
}
