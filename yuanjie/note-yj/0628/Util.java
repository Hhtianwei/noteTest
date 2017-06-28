package com.shsxt.array;
/*
 * 工具类
 * 1.可以生产一个数组，大小40个元素，里面元素值随机，并且在[170,190]之间
 */
public class Util {
	public static int[] createArray(){
		int[] arr = new int[40];
		
		for(int i = 0;i < arr.length;i++){
			arr[i] = (int)(Math.random()*21+170);
		}
		return arr;
	}
}
