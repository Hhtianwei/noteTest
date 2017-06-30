package com.shsxt.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		for(int i = 0;i < 100;i++){
			Student stu = new Student(i,"as"+i);
			set.add(stu);
		}
		System.out.println(set);
		
		Iterator<Student> it = set.iterator();
		for(int i = 0;i < set.size();i++){
			Student s = it.next();
			if("as41".equals(s.getName())){
//				set.remove(s);
				it.remove();
			}
		}
		System.out.println(set);
	}
	/*public static void main(String[] args) {
        Set<Object> obj = new HashSet<Object>();
        obj.add("a");
        obj.add("b");
        obj.add("c");
        System.out.println("移除前：" + obj.toString());
        Iterator<Object> it = obj.iterator();
        for(int i=0; i<obj.size(); i++){
            System.out.println(i);
            Object name = it.next();
            if("a".equals(name) || "b".equals(name)){
                it.remove();
                i--;
            }
        }
        System.out.println("移除后： " + obj.toString());
         
    }*/
}
