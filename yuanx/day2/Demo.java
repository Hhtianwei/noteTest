package com.shsht.yuanx;

public class Demo {
	public static void main(String[] args) {
		// boolean类型:通常用于逻辑运算和程序流程控制。
		System.out.println(true);
		System.out.println(false);
		
		
		/*
		 * 需求:给出一共有46条数据,要求每一页最多10条数据. 计算:一共多少页,
		 */
		int x, y;
		x = 46;
		y = 10;
		int a, b;
		a = x / y;
		b = x % y;
		int ret = b == 0 ? a : a + 1;
		System.out.println(ret);
	}
}
