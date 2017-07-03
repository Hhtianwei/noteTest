package com.shsxt.reflect.oper;

import java.lang.reflect.Field;

/*
 * 通过反射操作某个对象的属性值
 */
public class FieldOperator01 {
	public static void main(String[] args) throws Exception {
		// 1.获取class对象
		Class<?> clz = Class.forName("com.shsxt.reflect.oper.User");
		// 2.获取对象
		User u = (User) clz.newInstance();
		// 3.设置属性
		Field f = clz.getDeclaredField("uname");
		// 4.打开权限
		f.setAccessible(true);
		f.set(u, "0523");
		// 5.获取此属性
		System.out.println(f.get(u));
	}
}
