package com.shsxt.array;

//数组中存放全班同学的身高
public class array2 {
	public static void main(String[] args) {
		int[] arr;
		arr = new int[40];

		for (int i = 0; i < arr.length; i++) {
			int temp = (int) (Math.random() * 21 + 170);
			arr[i] = temp;
		}
		// 找最小的;
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
