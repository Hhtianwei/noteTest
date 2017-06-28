package com.shsxt.array;

/*
 * 定义一个数组存放全班40个同学的身高
 * 1、有一个变量存放数组
 * 2、数组应该开辟40小空间来存储40个同学的身高 (cm)
 * 3、40个同学的身高应该明确， 并且存放如40个小空间中
 */
public class Array01 {
	public static void main(String[] args) {
		// 1、有一个变量存放数组
		int[] arr;
		// 2、实实在在的空间存储数据
		arr = new int[40];
		// 3、放入身高
		/*
		 * arr[0] = 150; arr[1] = 155;
		 */
		// 39...
		// 随机生成40个身高 [170, 190]
		for (int i = 0; i < arr.length; i++) {
			int temp = (int) (Math.random() * 21 + 170);// 单个身高
			arr[i] = temp;
		}

		int count = 1; // 存放的是第几个身高
		// 10 个10个为一行
		for (int temp : arr) {
			System.out.print(temp + "\t");
			count++;
			if (count > 10) {
				System.out.println();
				count = 1;
			}
		}

		// 请你找出我们班最高的身高是多少|找出一组数当中能够最大的哪个数
		/*
		 * 1、标准， 假设第一个就是最大 2、用你假设的最大的哪个值，和后面所有的数据进行比较，当遇到比假设的最大值还要大的值， 就取出当前这个大值
		 */

		int max = arr[0];// 假设第一个就是最大的
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("所有身高中最高身高为   " + max);

		

		// 请你找出我们最矮的身高
		int min = arr[0];// 假设第一个就是最小的
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("所有身高中最高身高为:" + min);

		// 请你算出我们班的平均身高
		// 请你找出那些拖后腿的人有几个
		int sum = 0;
		int avg = 0;
		count = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			avg = sum / arr.length;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < avg) {
				count++;
				// 请你找出那些拖后腿的人的座位号（下标）
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("平均身高为：" + avg + "  拖后腿的人的个数：" + count);

	}

}
