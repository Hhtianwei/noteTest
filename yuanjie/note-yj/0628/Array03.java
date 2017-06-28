package com.shsxt.array;

public class Array03 {
	public static void main(String[] args) {
		int[] arr;
		arr = Util.createArray();
		
		//求平均值
		/*
		 * 求和/个数（数组长度）
		 */
		int sum = 0;//存储和
		for(int i = 0;i < arr.length;i++){
			sum += arr[i];
		}
		int avg = sum/arr.length;
		System.out.println("我们班的平均身高为："+avg);
		
		/*
		 * 查出比平均值小的数据的个数
		 */
		
		int shortyNum = 0;//存储矮人的个数
		for(int i = 0;i < arr.length;i++){
			if(arr[i]<avg){
				shortyNum++;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("拖后腿的人数有："+shortyNum);
	}
}
