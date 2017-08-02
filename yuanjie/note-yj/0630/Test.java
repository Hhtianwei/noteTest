package com.shsxt.collection;

public class Test {
	public static void main(String[] args) {
		int[][] arr = { {22,66,44},{77,33,88},{25,45,65},{11,66,99} };
		for(int[] temp : arr){
			for(int a : temp){
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}
