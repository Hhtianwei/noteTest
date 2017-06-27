package com.shsxt.yuanx2;

public class Animal {
	private String name;
	private int age;

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void say() {
		System.out.println(name + ",今年" + age);
	}
}
