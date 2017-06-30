package com.shsxt.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		for(int i = 0;i < 100;i++){
			Student stu = new Student(i,"as"+i);
			list.add(stu);
		}
		System.out.println(list);
		list.remove(15);
		System.out.println(list);
		for(int i = 0;i < list.size();i++){
			Student s = list.get(i);
			if(s.getName().equals("as12")){
				list.remove(s);
			}
		}
		System.out.println(list);
	}
}
