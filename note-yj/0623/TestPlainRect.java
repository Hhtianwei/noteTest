package com.shsxt.test;

public class TestPlainRect {
	public static void main(String[] args) {
		PlainRect pr = new PlainRect(10,10, 10, 20);
		System.out.println("矩形面积为："+pr.area());
		System.out.println("矩形周长为："+pr.preimeter());
		System.out.println(pr.isInside(25.5,13));
	}
}
