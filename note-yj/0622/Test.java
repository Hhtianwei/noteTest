package com.shsxt.test;

public class Test {
	public static void main(String[] args){
//		Person p = new Person();
//		p.name = "张三";
//		
		Computer c = new Computer();
//		c.type = "Lenovo";
//		String str = c.info();
//		System.out.println(str);
//		
//		p.useComputer();
		
		Person p = new Person();
		p.age = 10;
		p.name = "lss";
		
		p.useComputer(c);
		
		Coder coder = new Coder();
		coder.name = "zs";
		coder.age = 20;		
		coder.c = c;
		coder.useComputer();
	}
}
