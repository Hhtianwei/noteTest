package com.shsxt.reflect;

public class Simple {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> clz1 = Class.forName("com.shsxt.reflect.Simple");
		Class<?> clz2 = Simple.class;
		Simple s = new Simple();
		Class<?> clz3 = s.getClass();
		System.out.println(clz1);
		System.out.println(clz2);
		System.out.println(clz3);
	}
}
