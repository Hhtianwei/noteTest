package com.shsxt.reflect;

import java.lang.reflect.Constructor;

public class InstanceTest01 {
	public static void main(String[] args) throws Exception {
		Student stu = new Student();
		Class<?> clz = Class.forName("com.shsxt.reflect.Student");
		System.out.println("=======通过Class对象实例化对象==========");
		stu = (Student) clz.newInstance();
		stu.setAge(18);
		stu.setName("zs");
		System.out.println("age:" + stu.getAge());
		System.out.println("name:" + stu.getName());

		System.out.println("========通过Constructor对象实例化对象=========");
		// 获取无参构造器
		Constructor<?> con = clz.getConstructor();
		stu = (Student) con.newInstance();
		System.out.println(stu);

		System.out.println("========获取带参构造器实例对象=========");
		// 获取带参构造
		con = clz.getConstructor(String.class, int.class);
		stu = (Student) con.newInstance("ls", 19);
		System.out.println(stu);

		System.out.println("=========获取int类型私有构造器实例对象========");
		// 获取int类型参数私有构造器
		con = clz.getDeclaredConstructor(int.class);
		// 打开权限
		con.setAccessible(true);
		stu = (Student) con.newInstance(20);
		System.out.println(stu);
		System.out.println("=======获取String类型参数私有构造器实例对象=========");
		// 获取String类型参数私有构造器
		con = clz.getDeclaredConstructor(String.class);
		con.setAccessible(true);
		Student stu1 = (Student) con.newInstance("lyf");
		Student stu2 = (Student) con.newInstance("wld");
		System.out.println(stu1);
		System.out.println(stu2);
	}
}
