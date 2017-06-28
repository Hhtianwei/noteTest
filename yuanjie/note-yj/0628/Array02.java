package com.shsxt.array;
/*
 * 数组中存放全班同学的身高
 * 1.数组变量，存放数组（地址） ---》数组声明
 * 2.数组空间，数组对象（有真是空间存放40个数组） ---》数组对象的创建
 * 3.有真实数据，并且将真实数据存入40个空间中 ---》数组元素的赋值
 * 
 * 1.找出最矮身高
 */
public class Array02 {
	public static void main(String[] args) {
		int[] arr;
		arr = new int[40];
		
		for(int i = 0;i < arr.length;i++){
			int temp = (int)(Math.random()*21+170);
			arr[i] = temp;
		}
		//找最小的
		int min = arr[0];
		for(int i = 0;i < arr.length;i++){
			if(min>arr[i]){
				min = arr[i];
			}
		}
		System.out.println("我们班最矮身高为："+min);
	}
}
