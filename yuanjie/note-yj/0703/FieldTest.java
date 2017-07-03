package com.shsxt.reflect;

import java.lang.reflect.Field;

public class FieldTest {
	public static void main(String[] args) throws Exception{
		Class<?> clz = Student.class;
		Field f = clz.getDeclaredField("name");
		//获取属性名称
		System.out.println(f.getName());
		//获取属性类型
		System.out.println(f.getType());
		//获取属性访问修饰符
		//default==>0
		//public==>1
		//protected==>4
		//private==>2
		System.out.println(f.getModifiers());
	}
}
