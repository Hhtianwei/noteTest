package com.shsxt.reflect.oper;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MethodOperator01 {
	public static void main(String[] args) throws Exception{
		User u1 = new User();
		User u2 = new User();
		
		Class<?> clz1 = u1.getClass();
//		Class<?> clz2 = u2.getClass();
		
//		System.out.println(clz1 == clz2);
		Field f1 = clz1.getDeclaredField("uname");
//		Field f2 = clz1.getDeclaredField("uname");
//		System.out.println(f1 == f2);
		f1.setAccessible(true);
		
		f1.set(u1,"zs");
		f1.set(u2,"ls");
		
		Method m = clz1.getMethod("test",int.class);
		m.invoke(u1,10);
		m.invoke(u2,100);
		
		System.out.println(u1.getUname());
		System.out.println(u2.getUname());
		
		m = clz1.getMethod("T");
		m.invoke(null);
	}
}
