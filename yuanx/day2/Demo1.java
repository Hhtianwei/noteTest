package com.shsht.yuanx;
//变量的分类  定义  注意事项
/*变量的定义:表示存储空间，可用来存放某一类型的常量，没有固定值，并可以重复使用，也可以用来存储某种类型的未知数据。
好比饭店雅间的名字. 
变量的特点：
①　占据着内存中的某一块存储区域；
②　该区域有自己的名称（变量名）和类型（数据类型）；
③　可以被重复使用;
④　该区域的数据可以在同一类型范围内不断变化；
变量的定义：
	先定义变量,再赋值:
			数据类型  变量名;
			变量名 = 值;
	或在声明时同时赋值:
		数据类型  变量名  =  初始化值；
注：格式是固定的，记住格式，以不变应万变。
不推荐:同时定义多个变量.
解决两个操作数求和，差，积，商的问题：*/
public class Demo1 {
	public static void main(String[] args) {
		//定义一个名字
		String name;
		name="小明";
		String name2 = "小强";
		System.out.println(name);
		System.out.println(name2);
		char c = 'A';
		char i = (char) (c + 12);// 强制转换
		System.out.println(i);
		System.out.println("AAA" + 7 + 3);// AAA73
		System.out.println(7 + 3 + "AAA");// 10AAA
//		算术异常:/by zero
		System.out.println(1/0);//不能除0
		System.out.println(1.0/0);//
	}
}