package com.shsxt.test;

import java.util.Scanner;

/*
 * 输入10个数，统计负数的个数并求和
 * 1、键盘录入  （10次录入）
 * 2、判断每一个输入进来的数据
 * 3、判断数据是否是负数
 * 	是：  
 * 		a)、记录个数
 * 		b)、累加   ==》 sum
 *  不是：
 */
public class Test5 {
	public static void main(String[] args) {
		System.out.println("请输入：");
		Scanner sc = new Scanner(System.in);
		int count = 0;// 记录负数的个数
		int sum = 0;// 存储累加的和
		// for循环， 只是用来输入10次
		for (int i = 0; i < 10; i++) {
			// num 临时变量存储 每次录入数据
			int num = sc.nextInt();
			// 确定输入的数据就是负数
			if (num < 0) {
				count++;// count++; count = count + 1; count+=1;
				sum += num;
			}
		}
		System.out.println("总共有" + count + "个负数，它们的和是：" + sum);
	}
}
