package com.shsxt.jie;

public class Person {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0 && age < 120) {
			this.age = age;
		} else {
			System.out.println("您输入的信息有误");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("age=" + age + ",name" + name);
	}

}