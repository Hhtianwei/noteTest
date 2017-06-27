package com.shsxt.jie;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "张一";
		s1.isFee = true;
		Student s2 = new Student();
		s2.name = "张二";
		s2.isFee = false;
		Student s3 = new Student();
		s3.name = "张三";
		s3.isFee = true;
		Student s4 = new Student();
		s4.name = "张四";
		s4.isFee = false;
		Student s5 = new Student();
		s5.name = "张五";
		s5.isFee = true;
		
		Student[] students = new Student[]{s1,s2,s3,s4,s5};
		
		for(Student student:students){
			if(!student.isFee){
				student.fees();
			}else{
				student.fees();
			}
		}
	}
}
