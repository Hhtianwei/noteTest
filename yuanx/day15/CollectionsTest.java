package com.shsxt.yuanx;

import java.util.*;

//Collection:针对容器的  工具类
public class CollectionsTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("小花");
		list.add("小白");
		list.add("小叶");
		list.add("小黑");
		list.add("晓丽");

		for (String temp : list) {
			System.out.print(temp + "  ");
		}

		Collections.sort(list);
		System.out.println(list);
		List<Student> list1 = new ArrayList<Student>();
		list1.add(new Student("zzz",15));
		list1.add(new Student("lll",19));
		list1.add(new Student("www",9));
		Collections.sort(list1);
		System.out.println(list1);
	}
}

class Student implements Comparable {
	String name;
	int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		return this.age - s.age;
	}

	@Override
	public String toString() {

		return "Student[name=" + name + ",age=" + age + "]";
	}

}