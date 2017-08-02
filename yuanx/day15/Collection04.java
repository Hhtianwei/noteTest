package com.shsxt.yuanx;

import java.util.*;

public class Collection04 {

	public static void main(String[] args) {
		Collection<String> names = new ArrayList<String>();
		names.add("小花");
		names.add("小敏");
		names.add("小军");
//Collection的遍历		
		for (String temp : names) {
			System.out.println(temp);
		}
		System.out.println(names);
		System.out.println("============");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}

}
