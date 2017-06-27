package com.shsxt.test;
/*
 * 十进制转换为二进制并输出
 */
public class Test3 {
	public static void main(String[] args) {
		int num = 5;
		String str = "";
		while (num > 0) {
			int temp = num % 2;// 当前的二进制位
			str = temp + str;
			num = num / 2;// 十进制本身发生改变
		}
		System.out.println(str);
	}
}
