package com.shsxt.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
 * Iterator:迭代器
 */
public class Collection04 {
	public static void main(String[] args){
		Collection<String> col = new ArrayList<String>();
		col.add("张三");
		col.add("李四");
		col.add("王五");
		col.remove("张三");
		
		// Collection的遍历方式
		
		// Collection获取不到具体的某一个元素， 可以通过遍历的方式获取
		// 1、增强for循环
		for(String temp : col){
			System.out.println(temp);
		}
		System.out.println("=================");
		// 迭代器 来遍历容器
		// 1、获取当前容器相关的迭代器对象
		Iterator<String> it = col.iterator();
		// 2、判断是否有下一个元素
		while(it.hasNext()){
			// 3、 将迭代器指向下一个元素， 获取当前元素
			String str = it.next();
			System.out.println(str);
		}
		
	}
}
