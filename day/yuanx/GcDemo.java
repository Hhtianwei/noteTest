package com.shsxt.yuanx;

public class GcDemo {

	public static void main(String[] args) {

		/*
		 * 1、匿名对象
		 */
		new GcDemo();
		System.gc();// 通知
		/*
		 * 2、对象无引用状态
		 */
		GcDemo gcDemo = new GcDemo();
		gcDemo = null;
		System.gc();// 通知
		/*
		 * 注意：该对象没有任何引用的前提、会执行到 若此时还有其他引用指向该对象、则不会执行
		 */
		GcDemo gcDemo1 = new GcDemo();
		GcDemo gcDemo2 = gcDemo1;
		gcDemo1 = null;
		System.gc();// 通知
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("over....");
	}

}
