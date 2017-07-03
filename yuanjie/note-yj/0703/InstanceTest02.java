package com.shsxt.reflect;

import java.lang.reflect.Constructor;

public class InstanceTest02 {
	public static void main(String[] args) throws Exception{
		Class<?> clz = Class.forName("com.shsxt.reflect.Student");
		//获取公开的构造方法
		//clz.getConstructor();
		
		//获取所有权限的构造方法
		Constructor<?> con = clz.getDeclaredConstructor(int.class);
		con.setAccessible(true);
		Student stu = (Student)con.newInstance(18);
		System.out.println(stu);
	}
}
