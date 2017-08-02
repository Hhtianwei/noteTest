package com.shsxt.array;
/*
 * 选择排序
 */
public class Test {
	public static void main(String[] args) {
		int[] arr = {3,5,13,67,234,1,34};
		selectSort(arr);
		for(int temp:arr){
			System.out.println(temp);
		}
	}
	
	public static void selectSort(int[] arr){
		int min = arr[0];
		for(int i = 0;i < arr.length;i++){
			for(int j = i+1;j < arr.length;j++){
				if(min>arr[j]){
					min = arr[j];
					arr[j] = arr[i];
				}
			}
		}
	}
}
