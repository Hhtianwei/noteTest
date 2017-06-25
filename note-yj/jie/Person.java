package com.shsxt.jie;

public class Person {
	private String name;
	private Computer computer;
	
	Person (String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void user(Computer computer){
		System.out.println(name+"在使用"+computer.type+"电脑");
	}
}
