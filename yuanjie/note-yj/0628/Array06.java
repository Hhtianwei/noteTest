package com.shsxt.array;

import java.util.Arrays;

/*
 * Arrays工具类， 针对数组进行操作   ，    打印数组的每一个元素（将数组当成字符串显示）； 排序， 查找， 比较， 拷贝
 */
public class Array06 {
	public static void main(String[] args) {
		int[] arr1 = { 2, 1, 5, 3, 6, 4 };
		int[] arr2 = { 2, 1, 5, 3, 6, 4 };
		// 打印数组 -》 替代不了for循环也替代不了增强for循环， 只是一个输出而已
		String str = Arrays.toString(arr1);
		System.out.println(str);

		// 升序排序, 不需要也不能接受返回数据，因为没有返回值， 直接操作的就是实参数组
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));

		// 数组的查找（二分查找， 折半查找） 数组必须是有序（默认升序）的, 返回的是下标
		int index = Arrays.binarySearch(arr1, 3);
		System.out.println(index);

		// 比较两个数组是否想同
		arr1 = new int[] { 3, 4, 2 };
		arr2 = new int[] { 3, 4, 2 };
		System.out.println(Arrays.equals(arr1, arr2));
		Arrays.sort(arr1);
		System.out.println(Arrays.equals(arr1, arr2));

		// 数组的拷贝 copyOf， 方法内创建数组， 并且拷贝， 指定新数组的长度
		int[] copyArr1 = Arrays.copyOf(arr1, 3);
		int[] copyArr2 = Arrays.copyOf(arr1, 5);
		System.out.println(Arrays.toString(copyArr1));
		System.out.println(Arrays.toString(copyArr2));

		// System实现数组拷贝， 需要手动开辟空间
		int[] arrSys = new int[5];
		System.arraycopy(arr1, 0, arrSys, 1, 3);
		System.out.println(Arrays.toString(arrSys));
	}
}
