package com.shsxt.test;

public class TestRect1 {
	public static void main(String[] args) {
		Rect1 r1 = new Rect1();
		Rect1 r2 = new Rect1(3);
		Rect1 r3 = new Rect1(3,4);
		
		System.out.println("无参构造器求的面积为："+r1.area());
		System.out.println("无参构造器求的周长为："+r1.perimeter());
		System.out.println("一个参数构造器求的面积为："+r2.area());
		System.out.println("一个参数构造器求的周长为："+r2.perimeter());
		System.out.println("两个参数构造器求的面积为："+r3.area());
		System.out.println("两个参数构造器求的周长为："+r3.perimeter());
	}
}
