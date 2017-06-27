package com.shsxt.yuanxtest;

public class PlainRectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PlainRect p=new PlainRect(10,10,10,20);
Rect r=new Rect(10,20);
System.out.println(r.perimeter());
System.out.println(r.area());
System.out.println(	p.isInside(25.5, 13));
	}

}
