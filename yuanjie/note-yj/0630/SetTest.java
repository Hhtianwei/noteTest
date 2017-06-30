package com.shsxt.collection;

import java.util.HashSet;
import java.util.Set;

/*
* Set：无序， 不可重复的对象（hashCode, equals来区分两个对象是否相同）
* 在Set集合中判断两个对象是否重复（去重）
* 1、先判断两个对象的hashCode是否一样， 如果一样那就继续调用equals来判断。hashCode不一样，则在此时就确定两个对象不是一样的
* 2、根据equals判断的结果来 决定两个对象是否相同
* 
* 自定义对象在Set集合中怎样去重 hashCode， equals
*/
public class SetTest {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		Student stu1 = new Student(1,"");
		
	}
}
