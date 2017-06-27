package com.shsxt.test;

public class TestSquare {
	public static void main(String[] args) {
		Square square = new Square(5);
		System.out.println("正方形的面积为："+square.area());
		System.out.println("正方形的边长为："+square.preimeter());
	}
}
