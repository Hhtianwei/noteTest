package com.shsxt.array2;

import java.util.Arrays;

/*根据Person的名称和年龄判断两个人是否是同一个人
 数组中判断每个位置上的人是否是同一个， 以及数组里边的人数相同，
 则这两个数组视为相同的两个数组*/
public class Array02 {
	public static void main(String[] args) {
		Person[] p1 = { new Person("zs", 1), new Person("ls", 2) };
		Person[] p2 = { new Person("zs", 1), new Person("ls", 2) };

		System.out.println(Arrays.equals(p1, p2)); // true
		Person p = new Person("ww", 18);
		Person pp = new Person("ww", 20);

		p1[0] = p;
		p2[0] = pp;
		System.out.println(Arrays.equals(p1, p2)); // false
	}

}

class Person implements Comparable {
	private String name;
	private int age;

	Person(String name, int age) {
		this.name = name;
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

	// 指明比较的标准（排序）
	// 相等（0） 大于（+） 小于（-）
	// 按照年龄为标准比较
	@Override
	public int compareTo(Object o) {
		Person temp = (Person) o;
		if (this.age > temp.age) {
			return 1;
		} else if (this.age < temp.age) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}