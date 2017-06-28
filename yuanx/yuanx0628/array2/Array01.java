package com.shsxt.array2;

import java.util.Arrays;

/*
 * 数组的比较   和  元素排序
 * 比较：
 * 	1、数组元素的个数
 * 	2、元素的内容
 * 
 * 当使用Arrays去比较两个存放引用类型元素的数组时， 需要按需重写equals方法
 */
public class Array01 {
	public static void main(String[] args) {
		int[] arr1 = { 4, 5, 6 };
		int[] arr2 = { 4, 5, 6 };
		Object obj = new Object();
		Object[] arrObj1 = { new Object() {

			@Override
			public boolean equals(Object obj) {

				return true;
			}

		} };
		Object[] arrObj2 = { new Object() {

			@Override
			public boolean equals(Object obj) {

				return true;
			}

		}

		};
		System.out.println(arrObj1 == arrObj2);// 引用比较要用equals
		System.out.println(arr1.equals (arr2));
		System.out.println(Arrays.equals(arrObj1, arrObj2));
	}
}