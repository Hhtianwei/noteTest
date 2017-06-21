package com.shsxt.yuanx;

public class PersonTest1 {
	public static void main(String[] args) {
		Person1 p = new Person1();
		// p.age = 20;
		p.setAge(20);
		p.setName("Tom");
		System.out.println(p.getAge());
		System.out.println(p.getName());
		Person1 p2 = new Person1();
		p2.setAge(20);
		System.out.println(p2.equalsAge(p));
	}
}