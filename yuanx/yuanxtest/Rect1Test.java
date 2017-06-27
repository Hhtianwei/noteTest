package com.shsxt.yuanxtest;

public class Rect1Test {

	public static void main(String[] args) {
	Rect1 r=new Rect1();
	Rect1 r1=new Rect1(5);
	Rect1 r2=new Rect1(5,7);
	
	System.out.println(r.area());
	System.out.println(r.perimeter());
	System.out.println(r1.area());
	System.out.println(r1.perimeter());
	System.out.println(r2.area());
	System.out.println(r2.perimeter());
	
	}

}
