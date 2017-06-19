
package com.shsxt.yuanx;

/*学生类(Student)有两个字段：name(名字)和isFee(是否交学费的状态)，有一个方法：交学费(fees)。

每一个学生都是通过Student类new出来的一个对象，现在创建一个数组存放学生对象，再分别调用该数组里的这些学生交学费的方法。
*/
public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "小明";
		s1.isfee = false;
		Student s2 = new Student();
		s2.name ="小花";
		s2.isfee=false;
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();

		Student[] arr = new Student[] { s1, s2, s3, s4, s5 };

		if (s1.isfee) {
			s1.fees();
		}
		if (s2.isfee) {
			s2.fees();
		}
	}

}