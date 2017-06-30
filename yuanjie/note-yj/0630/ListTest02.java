package com.shsxt.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("鲁班七号");
		list.add("诸葛亮");
		list.add("貂蝉");
		list.add("兰陵王");
		list.add("宫本武藏");
		
		System.out.println("========升序========");
		Collections.sort(list);
		for(String temp : list){
			System.out.println(temp);
		}
		
		System.out.println("========逆序排列========");
		Collections.reverse(list);
		for(String temp : list){
			System.out.println(temp);
		}
		
		System.out.println("========折半查找========");
		int lb = Collections.binarySearch(list, "兰陵王");
		System.out.println(lb);
		
		System.out.println("========随机排列========");
		Collections.shuffle(list);
		for(String temp : list){
			System.out.println(temp);
		}
		
		System.out.println("========特定对象重写list========");
		Collections.fill(list,"成吉思汗");
		for(String temp : list){
			System.out.println(temp);
		}
		
		List<Student> list1 = new ArrayList<Student>();
		Student stu1 = new Student(1,"zhangsan");
		Student stu2 = new Student(2,"lisi");
		Student stu3 = new Student(3,"wangwu");
		
		list1.add(stu1);
		list1.add(stu2);
		list1.add(stu3);
		
		System.out.println("========升序========");
		Collections.sort(list1);
		for(Student temp : list1){
			System.out.println(temp);
		}
		
		System.out.println("========逆序排列========");
		Collections.reverse(list1);
		for(Student temp : list1){
			System.out.println(temp);
		}
		
		System.out.println("========折半查找========");
		int lb1 = Collections.binarySearch(list1, stu2);//有问题
		System.out.println(lb1);
		
		System.out.println("========随机排列========");
		Collections.shuffle(list1);
		for(Student temp : list1){
			System.out.println(temp);
		}
		
		System.out.println("========特定对象重写list========");
		Collections.fill(list1,stu2);
		for(Student temp : list1){
			System.out.println(temp);
		}
	}
}
