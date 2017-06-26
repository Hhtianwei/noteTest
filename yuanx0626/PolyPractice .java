package com.shsxt.practice;
/*
 * 做题四大原则:
 * 1、继承链 、自己没有找父亲
 *   		A
 *   	  /   \
 *   	 B	   C
 * 2、编译看类型（确定方法表）、运行找对象
 * 
 * 3、就近最优原则：自己没有找父亲
 * 
 * 4、基类对子类新增方法不可见
 *   
 *      
 *   
 */
public class PolyPractice {
	public static void main(String[] args) {
		A a=new B();
		a.test(1.0);   
		a.test(1);  
		a.test('1');
		}
}
class A{
	public void test(){
		System.out.println("A----test()");
	}
	public void test(int a){
		System.out.println("A----test(int)");
	}
	public void test(double a){
		System.out.println("A----test(double)");
	}
}
class C extends A{
	public void test(){
		System.out.println("C----test()");
	}
	public void test(double a){
		System.out.println("C----test(double)");
	}
	public void test(int a){
		System.out.println("C----test(int)");
	}
}
class B extends A{
	public void test(){
		System.out.println("B----test()");
	}
	public void test(int a){
		System.out.println("B----test(int)");
	}
	//新增方法对父类引用不可见
	public void test(char a){
		System.out.println("B----test(char)");
	}
}