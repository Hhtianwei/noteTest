package com.shsxt.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		map.put(1, new Student(1, "zhangsan"));
		map.put(2, new Student(2, "lisi"));
		map.put(3, new Student(3, "wangwu"));
		System.out.println(map);
		
		Set<Entry<Integer, Student>> set = map.entrySet();
		Iterator<Entry<Integer,Student>> it =  set.iterator();
		for(int i = 0;i < map.size();i++){
			Entry<Integer, Student> s = it.next();
			if(2==s.getKey()&&"lisi".equals(s.getValue().getName())){
				it.remove();
			}
		}
		System.out.println(map);
	}
}
