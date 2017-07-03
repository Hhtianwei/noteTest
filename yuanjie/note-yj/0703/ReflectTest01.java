package com.shsxt.reflect;

public class ReflectTest01 {
	public static void main(String[] args) throws Exception{
		test("com.shsxt.reflect.Animal1");
	}
	public static void test(String str)throws Exception{
		//根据给的字符串实例化出一个对象出来
		Class<?> clz = Class.forName(str);
		Object obj = clz.newInstance();
		
		//调用obj真实对象的toString方法
		System.out.println(obj);
	}
}

class Animal1{
	public String toString(){
		return "我是一个Animal对象";
	}
}
