package com.shsxt.yuanx;

import java.util.*;

public class Collection05 {
	public static void main(String[] args) {
		Collection<Person> people = new ArrayList<Person>();
		Person p1 = new Person("zs", 18);
		Person p2 = new Person("ls", 18);
		Person p3 = new Person("ww", 18);

		people.add(p1);
		people.add(p2);
		people.add(p3);
		System.out.println(people);

		Person p4 = new Person("zs", 18);

		// System.out.println(people.contains(p4));

		boolean f = people.remove(p4);
		System.out.println(f);
		System.out.println(people.size());

		System.out.println(p1); // zs, 18
		System.out.println(p4); // zs, 18

		p1 = null;
		System.out.println(p1);
		System.out.println(p4);
		System.out.println("============");
		for (Person temp : people) {
			temp.setName("123");
		}

		System.out.println(people);
		System.out.println(p2); // 123
		System.out.println(p3); // 123

		p2.setAge(100);

		System.out.println(people);
	}
}

class Person {
	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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

	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		if (this.name.equals(p.name) && this.age == p.age) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person[name=" + name + ",age=" + age + "]";
	}

}