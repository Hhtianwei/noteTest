package com.shsxt.yuanx;

public class ExtendsDemo extends Father {
	private int age;
	private String name;

	public ExtendsDemo(int age) {
		this.age = age;
		System.out.println(this.age);
		System.out.println(super.age);
	}

	public static void main(String[] args) {
		new ExtendsDemo(10);
	}
}

class Father {
	int age;
	String name;

}
