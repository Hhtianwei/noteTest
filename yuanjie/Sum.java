package com.shsxt.jie;
/*
 * ��1-n֮�䣬���Ա�a��b��������
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
					System.out.println("i��ֵ��" + i);
					break;
				}
			}
		}
		System.out.println("count:" + count);
	}
}
