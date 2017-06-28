package com.shsxt.array;

import java.util.Arrays;
/*
 * 冒泡排序
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {23,5,9,26,24,6,2,1,67,4};
		bubble(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubble(int[] arr){
		for(int i = 0;i < arr.length;i++){
			for(int j = 0;j < arr.length-1-i;j++){
				//升序
				/*if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}*/
				//降序
				if(arr[j] < arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
