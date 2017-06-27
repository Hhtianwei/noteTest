package com.shsxt.test;

public class Test2 {
	public static void main(String[] args) {
		//单循环实现99乘法表
		int i, j;
		for (i = 1, j = 1; j <= 9; i++) {
			System.out.print(String.format("%s*%s=%s\t", i, j, i * j));

			if (i == j) {
				j++;
				i = 0;
				System.out.println();
			}
		}

	}
}
