package com.shsxt.jie;

public class ZiDemo extends Fu{
	private int age;
	
	public static void main(String[] args){
		new ZiDemo(20);
	}
	
	public ZiDemo(int age){
		this.age = age;
		System.out.println("super.age:"+super.age);	
		System.out.println("this.age:"+this.age);
	}
}

class Fu{
	int age;
}

