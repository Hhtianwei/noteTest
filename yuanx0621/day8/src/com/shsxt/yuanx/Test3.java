package com.shsxt.yuanx;

//实现将两个整型数据类型数据交换位置
//给三个整数求最值
public class Test3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a=" + a + "  " + "b=" + b);
		int max = a - b;
		max = a - b > 0 ? a : b;
		max = max - c > 0 ? max : c;
		System.out.println(max);
	}
}
