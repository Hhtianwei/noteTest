package com.shsxt.reflect;

import java.lang.reflect.Field;

public class FieldTest02 {
	public static void main(String[] args) {
		Class<?> clz = FieldGetSon.class;
		// getDeclaredFields 本类所有的属性
		Field[] fs = clz.getDeclaredFields();
		for (Field f : fs) {
			System.out.println(f.getName());
		}
		
		System.out.println("===================");
		//getFields 本类及父类所有的公共(公开)属性
		Field[] fls = clz.getFields();
		for (Field f : fls) {
			System.out.println(f.getName());
		}
	}
}

class FieldGet {
	private String strPrivate;
	public String strPublic;
}

class FieldGetSon extends FieldGet {
	private String strSPrivate;
	public String strSPUblic;
}
