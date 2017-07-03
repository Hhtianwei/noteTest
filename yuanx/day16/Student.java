package com.shsxt.yuanx;

public class Student {
	String name;
	int age;

	public Student() {
	}

	private Student(int age) {
		this.age = age;
		this.name = "lss";
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {

		return "Student[name=" + name + ",age=" + age + "]";
	}

}