package com.shsxt.reflect;

import java.lang.reflect.Constructor;

public class ConstructorTest {
	public static void main(String[] args) throws Exception {
		Student stu = new Student();
		Class<?> clz = Class.forName("com.shsxt.reflect.Student");
		clz = stu.getClass();
		clz = Student.class;
		System.out.println(clz);
		System.out.println("====================");
		
		// 获取构造方法， 公开的构造方法 
		Constructor<?>[] cons = clz.getConstructors();
		for(Constructor<?> c : cons){
			System.out.println(c);
		}
		
		System.out.println("====================");
		// 获取构造方法，所有的构造方法
		cons = clz.getDeclaredConstructors();
		for(Constructor<?> c : cons){
			System.out.println(c);
		}
		System.out.println("====================");
		
		// 获取公开的无参构造方法，
		Constructor<?> con = clz.getConstructor();
		System.out.println(con);
		System.out.println("====================");
		
		// 获取公开的有参构造方法，
		con = clz.getConstructor(String.class,int.class);
		System.out.println(con);
	}
}
