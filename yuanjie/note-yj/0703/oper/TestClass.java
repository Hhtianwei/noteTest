package com.shsxt.reflect.oper;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestClass {
	public static void main(String[] args) throws Exception {
		Class<Student> clz = (Class<Student>)Class.forName("com.shsxt.reflect.oper.Student");
		//获取Student类中所有的方法
		System.out.println("========获取Student类中所有的方法=========");
		Method[] m = clz.getDeclaredMethods();
		for(Method ms : m){
			System.out.println("方法名："+ms.getName()+",方法修饰符："+ms.getModifiers()+"返回值类型："+ms.getReturnType());
			//判断是否是public
//			System.out.println(Modifier.isPublic(ms.getModifiers()));
			//判断是否是private
//			System.out.println(Modifier.isPrivate(ms.getModifiers()));
			
		}
		//获取Student类中所有的构造方法
		System.out.println("=======获取Student类中所有的构造方法========");
		Constructor<Student>[] con = (Constructor<Student>[]) clz.getDeclaredConstructors();
		for(Constructor<Student> cons : con){
			System.out.println("构造方法名："+cons.getName()+",构造方法修饰符："+cons.getModifiers());
		}
		//获取Student类中所有的属性
		System.out.println("=======获取Student类中所有的属性========");
		Field[] fs = clz.getDeclaredFields();
		for(Field f : fs){
			System.out.println("属性名："+f.getName()+",属性类型："+f.getType()+",属性修饰符："+f.getModifiers());
			
		}
		
		
	}
}
