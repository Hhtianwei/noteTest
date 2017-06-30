package com.shsxt.yuanx;
import java.util.*;
public class Collection_List02 {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		List<String> list = new ArrayList<String>(); // new LinkedList();
		list.add("苹果");

		list.add("西瓜");
		list.add("麻辣烫");
		list.add(1, "冒牌火锅菜");

		for (String temp : list) {
			System.out.println(temp);
		}

		// 根据位置获取数据
		String str = list.get(0);
		System.out.println(str);//不存在打印-1
		// contains(obj);
		// 不仅可以检测容器中是否含有某个元素， 并且如果存在还将返回改元素所在的位置（索引|下标）
		int index = list.indexOf("梨");
		System.out.println(index);

		list.add("苹果");
		System.out.println(list.lastIndexOf("苹果"));
		list.set(0, "梨");
		System.out.println(list);
		// remove (obj) -> 根据元素内容来移除
		// remove(index) -> 根据位置|下标来移除
		list.remove(1);
		System.out.println(list);
		System.out.println("================");
		// 从起始位置截取到截至位置（注意第二个参数是位置， 而且不被包含在内）[)
		List subList = list.subList(1, 2);
		System.out.println(list);
		System.out.println(subList);

		System.out.println("===================");
		// Collection 的遍历方式 增强for循环
		for (String temp : list) {
			System.out.println(temp);
		}
		System.out.println("========================");
		// 使用迭代器 Iterator进行遍历
		// 1、获取对应容器的迭代器对象 iterator()
		// 2、利用迭代器判断是否还有下一个元素 hasNext()
		// 3、移动迭代器，并且获取当前元素
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String strTemp = it.next();
			System.out.println(strTemp);
		}
		System.out.println("========普通for循环遍历List集合=========");
		// 根据List的特性性增的地带方式
		// 有序， 有位置，能过获取到具体某个位置上的元素 size() + get(index)
		// 普通for循环遍历
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}

		System.out.println("============利用ListIterator遍历List集合==============");
		// 1、先获取迭代器对象 ListIterator
		// 2、判断是否还有下一个元素（是否还有上一个元素）
		// 3、向后移动迭代器获取下一个元素（向前移动迭代器，获取上一个元素）
		ListIterator<String> lit = list.listIterator();

		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("========利用ListIterator反向遍历List集合=========");
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}

	}
}
