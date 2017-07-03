package com.shsxt.reflect;

public class ClassTest {
	public static void main(String[] args) throws Exception {
		test(new Animal());
	}
	public static void test(Object obj) throws Exception{
		Class<?> clz = Class.forName("com.shsxt.reflect.ClassTest");
		obj = clz.newInstance();
		System.out.println(obj);
	}
}

class Animal{

	@Override
	public String toString() {
		return "我是一个animal对象";
	}
	
}