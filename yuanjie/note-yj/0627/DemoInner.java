package com.shsxt.inner;

public class DemoInner {
	public static void main(String[] args){
		//创建成员内部类实例
		Outer.In in = new Outer().new In();
		in.inPrint();
		Outer out = new Outer();
		out.outPrint();
		
		Outer1 out1 = new Outer1();
		out1.outPrint();
	}
}

class Outer{
	private int age = 10;
	class In{
		private int age = 20;
		private String name = "sxt";
		public void inPrint(){
			int age = 30;
			System.out.println("局部变量："+age);
			System.out.println("内部类成员变量："+this.age);
			System.out.println("外部类成员变量："+Outer.this.age);
		}
	}
	public void outPrint(){
		//外部类访问内部类的成员变量，要创建成员内部类对象
		In in = new In();
		System.out.println("内部类name："+in.name);
	}
}

class Outer1{
	private String name = "sxt";
	private int age = 12;
	private class In1{
		public void print(){
			System.out.println("age:"+age);
		}
	}
	public void outPrint(){
		System.out.println("name:"+name);
		//在外部类的方法中实例化内部类
		In1 in = new In1();
		in.print();
	}
}














