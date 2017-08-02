package com.shsxt.reflect.oper;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * 别人提供的User对象
 * 希望你去设定一下所有属性的内容， 属性内容直接设定为属性名称
 * set属性名首字母大写
 * 
 * 1、获取所有的属性
 * 2、根据属性的名称拼接 setter
 * 3、获取方法对象
 * 4、执行方法 setter
 * 5、通过getter去获取对象所有的属性值
 */
public class MethodOperator02 {
	public static void main(String[] args) throws Exception {
		User u = new User();
		Class<?> clz = u.getClass();
		Field[] f = clz.getDeclaredFields();
		for (Field fs : f) {
			// System.out.println(fs);
			String name = fs.getName();
			// set+ name的首字母大写
			String methodName = "set" + name.substring(0, 1).toUpperCase() + name.substring(1);
			System.out.println("set:"+methodName);
			Method m = clz.getMethod(methodName, String.class);
			Object obj = m.invoke(u, name);
			System.out.println("obj:"+obj);
			
			//get+name的首字母大写
			String getMethod = "get" + name.substring(0,1).toUpperCase() +name.substring(1);
			System.out.println("get:"+getMethod);
		}
		System.out.println("U:"+u.getUname());
	}
}
