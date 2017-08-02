package com.shsxt.yuanx;

public class ReflectTest01 {
	public static void main(String[] args) throws Exception {

		test("com.shsxt.yuanx.Animal");
	}

	public static void test(String str) throws Exception {
		Class clz = Class.forName(str);
		Object obj = clz.newInstance();
		System.out.println(obj);
	}
}

class Animal {

	@Override
	public String toString() {

		return "我是一个animal对象";
	}

}