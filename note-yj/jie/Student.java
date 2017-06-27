package com.shsxt.jie;
/*
 * 学生类(Student)有两个字段：name(名字)和isFee(是否交学费的状态)，有一个方法：交学费(fees)。
每一个学生都是通过Student类new出来的一个对象，现在创建一个数组存放学生对象，再分别调用该数组里的这些学生交学费的方法。

 */
public class Student {
	String name;
	boolean isFee;
	
	
	public void fees(){
		if(isFee == true){
			System.out.println(name+",已交学费");
		}else{
			System.out.println(name+",你该交学费了");
		}
	}
}
