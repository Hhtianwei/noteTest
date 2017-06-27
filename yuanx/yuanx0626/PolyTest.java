package com.shsxt.test;

/*
 * 做题四大原则:
 * 一、继承链:自己没有找父
 * 		A
 * 		|
 * 		B
 * 	 /    \
 *  C	   D
 * 二、 编译看类型、确定方法，运行找对象
 * 
 * 三、就近最优原则
 * 
 * 四、父类引用对子类新增方法不可见
 */

public class PolyTest {
	public static void main(String[] args) {
	
		A a1=new A();
	
		A a2=new B();
	
		B b =new B();
		C c=new C();
		D d =new D();	
	
		System.out.println(a1.show(b));

		System.out.println(a1.show(c));
	
		System.out.println(a1.show(d));
	
		System.out.println(a2.show(b));
						
		System.out.println(a2.show(c));
							
		System.out.println(a2.show(d));

		System.out.println(b.show(b));
	
		System.out.println(b.show(c));
	
		System.out.println(b.show(d));
	}

}
class A{
	public String show(D obj){
		return ("A and D");
	}
	public String show(A obj){
		return ("A and A");
	}
}
class B extends A{
	public String show(B obj){
		return ("B and B");
	}
	public String show(A obj){
		return ("B and A");
	}
}
class C extends B{
}
class D extends B{
}


