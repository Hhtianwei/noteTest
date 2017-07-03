package com.shsxt.reflect.oper;

public class Student {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	private Student(String name){
		this.name = name;
		age = 20;
	}

	public Student() {
		super();
	}

	private void test() {
		System.out.println("test()");
	}

	public void test(int a) {
		System.out.println("test(int)");
	}
}
