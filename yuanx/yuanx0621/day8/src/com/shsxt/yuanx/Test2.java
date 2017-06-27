package com.shsxt.yuanx;

import java.util.Scanner;

//从键盘上获取10个数统计并输出其中负责谷的个数与负数之和
public class Test2 {
	public static void main(String[] args) {
		// 获取十个数
		System.out.println("请输入十个数");
		// System.out.println();
		Scanner sc = new Scanner(System.in);
		int conut = 0;
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int inNum = sc.nextInt();// 输入十个数
			// 统计负数的个数

			if (inNum < 0) {
				conut++;

				sum += inNum;
			}

		}
		System.out.println("负数的个数是" + conut + "和为" + sum);
	}
}
