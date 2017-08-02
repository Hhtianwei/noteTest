package com.shsxt.yuanx;

import java.util.*;

public class Collection2List {
	public static void main(String[] args) {
//创建容器
		List<String> list=new ArrayList<String>();//加泛型
//存储数据
		list.add("apple");
		list.add("Hello");
		list.add("banana");
		list.add("1");
//在指定位置插入元素
		list.add(2, "插入的");
//遍历
		for(String temp: list){
			System.out.println(temp);
			System.out.println(list);
			}
//指定位置移除		
		list.remove(1);
		System.out.println(list);
//得到指定位置的元素
		list.get(2);
		System.out.println(list.get(2));
	}
}
