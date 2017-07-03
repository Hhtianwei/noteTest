package com.shsxt.yuanx;

import java.lang.reflect.*;

/*获取一个类的构造方法
1先获取描述这个类的Class对象
对象.getClass
类.class
Class.forName("")
获取构造方法*/
public class ConstructorTest {
	public static void main(String[] args) throws Exception {
		Student stu = new Student();
		Class clz = stu.getClass();
		clz = Student.class;
		clz = Class.forName("com.shsxt.yuanx.Student");

		Constructor[] cons = clz.getConstructors();
		for (Constructor con : cons) {
			System.out.println(con);
		}
		System.out.println("========");
		cons = clz.getDeclaredConstructors();
		for (Constructor con : cons) {
			System.out.println(con);
		}
		System.out.println("========");
		Constructor con = clz.getConstructor();//获取构造方法  public
		System.out.println(con);
		con = clz.getConstructor(String.class, int.class);//获取构造方法可以是 private 
		System.out.println(con);
		System.out.println("=================");
		con = clz.getDeclaredConstructor(int.class);
		System.out.println(con);
	}
}
