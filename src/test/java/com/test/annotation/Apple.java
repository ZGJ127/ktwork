package com.test.annotation;


import org.apache.commons.lang3.StringUtils;

import com.test.annotation.FruitColor.Color;

public class Apple {

	
	private String appleName;
	
	private Color appleColor;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple = new Apple();
		System.out.println(StringUtils.isEmpty(apple.getAppleName()));
		System.out.println(apple.getAppleColor()== null);
	}
	public String getAppleName() {
		return appleName;
	}
	@FruitName("Apple")
	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}
	public Color getAppleColor() {
		return appleColor;
	}
	@FruitColor
	public void setAppleColor(Color appleColor) {
		this.appleColor = appleColor;
	}
}
