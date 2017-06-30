package com.shsxt.collection;

import java.util.ArrayList;
import java.util.List;

/*
 * List: 有序，可重复
 * ArrayList:
 * LinkedList:
 * 
 * 
 * 以后使用容器时都将泛型加上，方便添加也方便取出
 */
public class Collection02 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add("苹果");
		list.add("苹果");
		list.add(2);
		list.add(3);
		System.out.println(list.size());
		for(Object temp : list){
			System.out.println(temp);
		}
		/*
		 * "苹果" -》 存储时 存的数据本来就是String类型的
		 * 容器有一个特性：在一个容器中可以存储多种数据类型， 并且全都是引用类型 Object
		 * 进行强转还原为原来的数据类型。
		 * 强转可以还原类型，但是可能存在类型转换异常
		 * 以后在使用中我们一般不会使用同一个容器存储多种数据类型的优点。并且我们会强制使用者，不使用该特性
		 * 泛型 
		 */
		/*String str = (String)list.get(0);// 类型不匹配
		System.out.println(str);*/
		
		System.out.println("============");
		List<String> list1 = new ArrayList<String>();
		list1.add("apple");
		list1.add("pear");
		list1.add("banana");
		// 在指定位置插入元素
		list1.add(0,"banana");
		System.out.println(list1.size());
		// List有序可重复， 存储元素的顺序是按照添加的先后顺序， 指定的位置来存储的
		for(String temp : list1){
			System.out.println(temp);
		}
		System.out.println("============");
		list1.remove(2);
		// 取出下标为1的元素
		String str = list1.get(1);
		System.out.println("下标为1的元素为："+str);
		System.out.println(list1.size());
		for(String temp : list1){
			System.out.println(temp);
		}
		
	}
}
