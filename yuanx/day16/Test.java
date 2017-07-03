package com.shsxt.yuanx;

import java.lang.*;

public class Test {
	public static void test(Object obj) {
		Class clz = obj.getClass();
		System.out.println(clz.getName());
	}
}
