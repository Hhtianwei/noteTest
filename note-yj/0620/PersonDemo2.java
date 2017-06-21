package com.shsxt.jie;

public class PersonDemo2 {
	public static void main(String[] args) {
		Person2 p = new Person2();
		p.setAge(30);
		Person2 p1 = new Person2();
		p1.setAge(30);
		System.out.println(p1.equalsAge(p));
		System.out.println("大家好，今年我" + p.getAge() + "岁");
	}
}