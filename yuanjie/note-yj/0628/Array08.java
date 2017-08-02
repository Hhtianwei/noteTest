package com.shsxt.array;

import java.util.Arrays;

/*
 * 数组的排序：当一个数组中存储的元素是引用类型时， 如果要使用Arrays进行排序，需要指定比较的标准， 实现一个Comparable接口重写CompareTo方法, 
 * CompareTo方法指明比较的标准（属性）
 */
public class Array08 {
	public static void main(String[] args) {
		Person[] p1 = { new Person("zs", 5), new Person("ls", 2) };
		Arrays.sort(p1);
		System.out.println(Arrays.toString(p1));
	}
}
