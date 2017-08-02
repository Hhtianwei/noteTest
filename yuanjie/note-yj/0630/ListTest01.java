package com.shsxt.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/*
 * List: 有序可重复
 * 有序：   存储时按照先后顺序存放， 存储时可以指定位置存储，根据位置来获取数据
 */
public class ListTest01 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student stu1 = new Student(1,"zhangsan");
		Student stu2 = new Student(2,"lisi");
		Student stu3 = new Student(3,"wangwu");
		
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		
		// 根据List的特性新增的迭代方式
		// 有序， 有位置，能过获取到具体某个位置上的元素   size() + get(index)
		// 普通for循环遍历
		System.out.println("=====普通for循环遍历List集合======");
		for(int i = 0;i < list.size();i++){
			System.out.println(list.get(i));
		}
		
		System.out.println("======增强for循环遍历List集合=======");
		for(Student temp : list){
			System.out.println(temp);
		}
		
		// 使用迭代器  Iterator进行遍历
		// 1、获取对应容器的迭代器对象   iterator()
		// 2、利用迭代器判断是否还有下一个元素   hasNext()
		// 3、移动迭代器，并且获取当前元素
		System.out.println("=========迭代器ListIterator遍历List集合=========");
		ListIterator<Student> lit = list.listIterator();
		while(lit.hasNext()){
			Student stu = lit.next();
			System.out.println(stu);
		}
		
		// 1、先获取迭代器对象  ListIterator
		// 2、判断是否还有下一个元素（是否还有上一个元素）
		// 3、向后移动迭代器获取下一个元素（向前移动迭代器，获取上一个元素）
		//反向遍历之前必须先正向遍历
		System.out.println("========迭代器ListIterator反向遍历List集合==========");
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
		}
	}
}

class Student implements Comparable<Student>{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		super();
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Student stu = (Student)obj;
		return this.id == stu.id&&this.name.equals(stu.name);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		/*if(o!=null){
			if(this.id>o.id){
				return 1;
			}else if(this.id < o.id){
				return -1;
			}
		}
		return 0;*/
		return this.id-o.id;
	}
	
	
}
