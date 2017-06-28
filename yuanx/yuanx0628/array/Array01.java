package com.shsxt.array;

/**
 * 定义一个数组存放全班40个同学的身高 1、有一个变量存放数组 2、数组应该开辟40小空间来存储40个同学的身高 (cm) 3、40个同学的身高应该明确，
 * 并且存放如40个小空间中
 */
public class Array01 {
	public static void main(String[] args) {
		int[] arr;// 定义一个数组
		arr = new int[40];// 初始化
		// 遍历
		for (int i = 0; i < arr.length; i++) {
			int temp = (int) (Math.random() * 21 + 170);// 随机生成单个身高
			arr[i] = temp;
		}
		int count = 1;// 计数
		//十个一行
		for (int temp : arr) {
			System.out.print(temp + "\t");
			count++;
			if (count > 10) {
				System.out.println();
				count = 1;
			}
		}
		int max = arr[0];// 取最大值
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("所有身高中最高身高为" + max);

	}
}
