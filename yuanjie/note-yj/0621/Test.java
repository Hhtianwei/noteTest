package com.shsxt.test;

public class Test {
	public static void main(String[] args) {
		printJuXing(5, 5);
		nineMulti();
		System.out.println("5的阶层=" + addMul(5));
	}

	// 打印矩形
	public static void printJuXing(int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// 99乘法表
	public static void nineMulti() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}

	// 求n的阶层
	public static int addMul(int n) {
		int sum = 0;
		for (int i = n; i > 0; i--) {
			if (i == 1) {
				return 1;
			} else {
				return n * addMul(n - 1);
			}
		}
		return sum += n * addMul(n - 1);
	}
}
