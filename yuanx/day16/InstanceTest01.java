package com.shsxt.yuanx;

import java.lang.*;
import java.lang.reflect.*;

public class InstanceTest01 {
	public static void main(String[] args) throws Exception {
		Class clz = Class.forName("com.shsxt.yuanx.Student");
		// 实例化一个Student对象
		System.out.println(clz);
		System.out.println("==通过Class对象实例化对象===");
		Student stu = (Student) clz.newInstance();
		System.out.println(stu);
		stu.age = 10;
		stu.name = "xiaohua";
		System.out.println(stu.name);
		System.out.println(stu.age);
		System.out.println("===通过Constructor对象实例化对象=====");
		Constructor con = clz.getConstructor();
	}
}
