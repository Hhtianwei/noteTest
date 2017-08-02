package com.shsxt.yuanx;

import java.util.*;

public class Collection03 {
	public static void main(String[] args) {
		// 创建一个表格
		Collection<String> names = new ArrayList();
		// 判断语句

		System.out.println(names.isEmpty());
		names.add("张学友");
		names.add("黎明");
		names.add("郭富城");
		names.add("小花");
		names.add("张学友");
		System.out.println(names.size());
		// 查看是否在
		System.out.println(names.contains("张学友"));
		// 比较两个容器内容是否相同
		Collection<String> col = new ArrayList<String>();
		col.add("如花");
		col.add("赵四");
		col.add("刘能");
		System.out.println(names.equals(col));
		// 清空容器 容器清空但是还存在
		col.clear();
		col.add("小花");
		System.out.println(col);
		boolean flag = col.retainAll(names); // 留下两个容器相同的内容， 在 col中，
												// 返回一个boolean值，代表 col是否被修改
		System.out.println(names); // 能直接显示容器中元素内容
		System.out.println(col);
		System.out.println(flag);
	}

}
