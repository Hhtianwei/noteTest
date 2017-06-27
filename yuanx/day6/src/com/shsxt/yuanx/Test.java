package com.shsxt.yuanx;

public class Test {
	public static void main(String[] args) {
		String name="小花";
		new Person();//匿名对象
		new Person("小明");
		System.out.println( name);
	}

}

class Person {
	String name;
	int age;

	Person() {
		System.out.println("你好");
	}
	Person(String name){
		System.out.println("我的名字是"+name);
	}
}