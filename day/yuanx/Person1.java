package com.shsxt.yuanx;

//私有化
public class Person1 {
	/*
	 * int age; String name;
	 */
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println("age=" + age + ",name=" + name);
	}

	// 判断是否为同龄人
	public boolean equalsAge(Person1 p) {
		/*
		 * 使用当前调用该equalsAge方法对象的age和传递进来p的age进行比较
		 * 由于无法确定具体是哪一个对象调用equalsAge方法，这里就可以使用this来代
		 */
		if (this.age == p.age) {
			return true;
		}
		return false;
		// return this.age==p.age;
	}
}
