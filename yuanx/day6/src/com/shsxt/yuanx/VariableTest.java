package com.shsxt.yuanx;

public class VariableTest {
	public static void main(String[] args) {

		Variable var = new Variable();
		System.out.println(var.getName() + "--->" + var.getAge());// 进行赋值
		var.setName("xiaowang");// 进行赋值
		System.out.println(var.getName());// 为私有的age赋值
		var.setAge(30);// 取私有的age值
		System.out.println(var.getAge());
	}
}
