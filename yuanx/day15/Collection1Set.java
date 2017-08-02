package com.shsxt.yuanx;

import java.util.*;
//Set 容器  无序不可重复

public class Collection1Set {
	public static void main(String[] args) {
		// 1 创建容器
		Set set = new HashSet();
		// 使用容器
		set.add(9);
		set.add("apple");
		set.add(1);
		set.add('g');
		// 查看元素个数
		int count = set.size();
		System.out.println(set.size());// 4
		set.add("apple");
		System.out.println(set.size());// 4 不可重复
		// 遍历
		for (Object temp : set) {
			System.out.println(temp);//
		}
	}
}
