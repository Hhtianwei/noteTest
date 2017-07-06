package com.shsxt.yuanx;

//冒泡排序
public class BubbleSort {
	public static void main(String[] args){
		int []arr={1,2,3,8,9,6,-2,-8};
		bubbleSort(arr);
		print(arr);
	}
	static void bubbleSort(int[] arr) {
		for (int count = 1; count < arr.length; count++) {
			for (int index = 0; index < arr.length - count; index++) {
				if (arr[index] > arr[index + 1]) {
					int temp = arr[index];
					arr[index] = arr[index + 1];
					arr[index + 1] = temp;
				}
			}
		}
	}

	static void print(int[] arr) {
		String str = "[";
		for (int i = 0; i < arr.length; i++) {
			str = str + arr[i];
			if (i != arr.length - 1) {
				str = str + ",";

			}

		}
		str = str + "]";
		System.out.println(str);
	}
}
