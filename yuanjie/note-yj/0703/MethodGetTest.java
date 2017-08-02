package com.shsxt.reflect;

import java.lang.reflect.Method;

public class MethodGetTest {
	public static void main(String[] args) throws Exception{
		Class<?> clz = Class.forName("com.shsxt.reflect.User");
		//获取所有方法（本类中，包括私有）
		Method[] mt = clz.getDeclaredMethods();
		for(Method m : mt){
			System.out.println(m.getName());
		}
		System.out.println("====================");
		
		//获取所有公共方法（本类，包括父类的）
		mt = clz.getMethods();
		for(Method m : mt){
			System.out.println(m.getName());
		}
		
		//获取某个方法，可以是私有
		System.out.println("====================");
		Method me = clz.getDeclaredMethod("test",int.class,int.class);
		System.out.println(me.getName());
	
		//获取某个方法，只能是公开的
		System.out.println("====================");
		me = clz.getMethod("setName",String.class);
		System.out.println(me.getName());
	}
	
}
