package com.shsxt.collection;

import java.util.HashSet;
import java.util.Set;
/*
 * java.util 包
 * Collection :   容器的父接口， 看见Collection,这是一个容器， 可以存储多个数据， 并且大小可以根据内容的多少而改变
 * Set: 无序， 不可重复
 * List: 有序， 可重复
 * 
 * Map: <K,V>  Key  无序， 不可重复（Set）, Value无所谓
 * 
 * 容器的特点：
 * 	1、能够存储多个数据
 * 	2、存储数据的类型可以不同（不使用）
 * 	3、大小可以随着内容的多少而改变
 * 	4、只能存储引用类型（和数组进行区分）
 * 
 * List: 存储的是单个单个的对象，有序可重复
 * Set: 存储的是单个单个的对象，无序不可重复
 * Map: 存储的是键值对，键无序，不可重复（键， 值无所谓）
 * 
 * 容器的使用：
 * 	1、创建一个容器对象
 * ====   容器的操作    ====
 * 	2、存储数据
 * 	3、查看数据
 * 	4、获取数据
 *	5、删除数据
 *	6、清空容器
 *	7、查看容器的大小
 * 
 * 容器的遍历（使用）：
 * 
 * Set:无序不可重复
 * 创建
 * 添加数据
 * 查看大小
 * 获取数据（遍历）
 * 删除数据
 * 
 */
public class Collection01 {
	public static void main(String[] args) {
		// 1、创建容器
		Set set = new HashSet();
		// 2、使用容器
		// 存储数据
		set.add(5);
		set.add('5');
		set.add("five");
		// 查看容器的元素个数
		System.out.println(set.size());
		System.out.println("============");
		// 获取数据== Set 没有提供直接单个获取数据的方法
		// Set通过增强for循环的遍历
		// Set元素存储的顺序和我们添加元素的顺序不一致， 也不由我们控制， 所以我们说它是无序的
		// 注意： 无序只是针对存放顺序， 容器自己内容部有自己的排序规则
		for(Object temp : set){
			System.out.println(temp);
		}
		System.out.println("============");
		set.remove(5);
		// set 不可重复
		set.add("five");
		for(Object temp : set){
			System.out.println(temp);
		}
		System.out.println(set.size());
		
	}
}
