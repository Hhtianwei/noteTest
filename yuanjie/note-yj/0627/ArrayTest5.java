package com.shsxt.array;

// 编写方法实现 将数组转成字符串，效果为:[10,10,10,7,4,7,9,5,0,8] 
public class ArrayTest5 {
	public static void main(String[] args) {
		int[] a = { 10, 10, 10, 7, 4, 7, 9, 5, 0, 8 };
		castString(a);
	}

	public static void castString(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (i < a.length - 1) {
				if (i == 0) {
					System.out.print("[");
				}
				System.out.print(a[i] + ",");
			} else {
				System.out.print(a[i] + "]");
			}
		}
	}
}
