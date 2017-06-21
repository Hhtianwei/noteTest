package com.shsxt.yuanx;

import java.util.Scanner;

/*需求：从键盘上获取数字判定输出
1.从键盘上获取数字判定
2.对应输出*/
public class Test1 {
	public static void main(String[] args) {
		System.out.println("请输入0~6的数字");// 提示
		Scanner sc = new Scanner(System.in);
		int intNum = sc.nextInt(); // 获取键盘输入的数字

		if (intNum == 0) {
			System.out.println();
		} else if (intNum == 1) {
			System.out.println("Monday");
		} else if (intNum == 2) {
		} else if (intNum == 3) {
		} else if (intNum == 4) {
		} else if (intNum == 5) {
		} else if (intNum == 6) {
		} else {
			System.out.println("您的输入有误");
		}

		switch (intNum) {
		case 0: {
			System.out.println();
		}
			break;
		case 1: {
			System.out.println("Monday");
		}
			break;
		case 2: {
			System.out.println();
		}
		case 3: {
			System.out.println();
		}
		case 4: {
			System.out.println();
		}
		case 5: {
			System.out.println();
		}
		default: {
		}
		}
	}
}
