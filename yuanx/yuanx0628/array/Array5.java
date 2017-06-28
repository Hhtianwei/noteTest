package com.shsxt.array;

import java.util.Arrays;

/*Arrays工具类， 针对数组进行操作   ，  
打印数组的每一个元素（将数组当成字符串显示）； 排序， 查找， 比较， 拷贝*/
public class Array5 {
	public static void main(String[] args) {
		int[] arr1 = { 5, 2, 3 };
		int[] arr2 = { 5, 2, 3 };
		String str = Arrays.toString(arr1);
		System.out.println(str);
		// 打印数组 -》 替代不了for循环也替代不了增强for循环， 只是一个输出而已
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		/*
		 * 升序排序, 不需要也不能接受返回数据，因为没有返回值， 直接操作的就是实参数组
		 */
		Arrays.sort(arr1);
		arr1 = arr2;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		/*
		 * 数组的查找（二分查找， 折半查找） 数组必须是有序（默认升序）的, 返回的是下标
		 */
		int index = Arrays.binarySearch(arr2, 5);
		System.out.println(index);

		arr1 = new int[] { 5, 2, 3 };
		arr2 = new int[] { 5, 2, 3 };
		//Arrays.sort(arr1);比较俩个数组是否相同
		System.out.println(Arrays.equals(arr1, arr2));
		
		数组的拷贝  copyOf,
		
	}

}
