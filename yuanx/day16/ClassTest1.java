package com.shsxt.yuanx;

import java.lang.reflect.Field;

//区分   Class 类   Class clz 实例    Person类   Person  p实例
public class ClassTest1 {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "zs";
		p.age = 18;

		MyClass clz = new MyClass();
		clz.className = "com.shsxt.yuanx.Person";
		clz.classFields[0] = " name";
		clz.classFields[1] = " age";
	}
}

class Person {
	public String name;
	public int age;

}

class MyClass {
	String className;
	Field[] classFields;

}