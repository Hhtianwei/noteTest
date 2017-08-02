package com.shsxt.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {

		Map<Integer, Student> map = new HashMap<Integer, Student>();
		map.put(1, new Student(1, "zhangsan"));
		map.put(2, new Student(2, "lisi"));
		map.put(3, new Student(3, "wangwu"));
		
		System.out.println(map.size());
		System.out.println(map.get(1));
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue(new Student(1,"zhangsan")));
		System.out.println(map.equals(new Student(1,"zhangsan")));
//		System.out.println(map);
		
		System.out.println("============entrySet()=============");
		Set<Entry<Integer,Student>> set = map.entrySet();
		System.out.println("==============增强for循环间接遍历map==============");
		for(Entry<Integer,Student> temp : set){
//			System.out.println(temp);
			System.out.println(temp.getKey()+"="+temp.getValue());
		}
		System.out.println("===============迭代器间接遍历map==================");
		Iterator<Entry<Integer,Student>> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("=================keySet()======================");
		Set<Integer> setKey = map.keySet();
		System.out.println("==============增强for循环间接遍历map==============");
		for(Integer temp : setKey){
			System.out.println(temp+"="+map.get(temp));
		}
		System.out.println("===============迭代器间接遍历map==================");
		Iterator<Integer> itKey = setKey.iterator();
		while(itKey.hasNext()){
			Integer i = itKey.next();
			System.out.println(i+"="+map.get(i));
		}
		
		System.out.println("=================values()======================");
		Collection<Student> setValue = map.values();
		System.out.println("==============增强for循环间接遍历map==============");
		for(Student temp : setValue){
			System.out.println(temp);
		}
		System.out.println("===============迭代器间接遍历map==================");
		Iterator<Student> itValue = setValue.iterator();
		while(itValue.hasNext()){
			Student stu = itValue.next();
			System.out.println(stu);
		}
		
	}
}































