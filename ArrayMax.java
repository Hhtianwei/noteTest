package com.shsxt.yuanx;

//数组的最大值
public class ArrayMax {
	public static void main(String[] args) {
		int[] array = new int[] { 2, 9, 34, 6, 8 };
		getMax(array);
		System.out.println(getMax(array));
	}

	public static int getMax(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				array[0]=array[i];
				array[i]=max;
			}

		}
		return max;
	}
}
