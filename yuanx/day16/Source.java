package com.shsxt.yuanx;

public class Source {
	public static void mian(String[] args) throws ClassNotFoundException {
		Source s = new Source();
		Class c1 = s.getClass();
		Class c2 = Source.class;
		Class c3 = null;
		c3 = Class.forName("com.shsxt.ref.simple.Source");
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());

	}
}
