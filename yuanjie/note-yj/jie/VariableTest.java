package com.shsxt.jie;

public class VariableTest {
	public static void main(String[] args){
		Variable var = new Variable();
		System.out.println("name:"+var.name+" age:"+var.getAge());
		var.name = "DELL";
		System.out.println("name:"+var.name+" age:"+var.getAge());
		var.setAge(2);
		System.out.println("name:"+var.name+" age:"+var.getAge());
		
	}
}
