package com.shsxt.yuanx;

public class Person1 {
	String name;
	Computer computer;

	public  Person1(String n){name=n;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void use(Computer computer) {
		System.out.println(name + "在使用" + computer.type + "的电脑");
	}

}
