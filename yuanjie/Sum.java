package com.shsxt.jie;
/*
 * 求1-n之间，可以被a，b整除的数
 */
public class Sum {
	public static void main(String[] args) {
		int[] a = { 2, 3, 5 };
		SunNumber(10, a);
	}

	public static void SunNumber(int n, int[] m) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int index = 0; index < m.length; index++) {

				if (i % m[index] == 0) {
					count++;
					System.out.println("i的值：" + i);
					break;
				}
			}
		}
		System.out.println("count:" + count);
	}
}
