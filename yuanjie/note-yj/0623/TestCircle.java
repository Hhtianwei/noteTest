package com.shsxt.test;

import java.util.Scanner;

public class TestCircle {
	public static void main(String[] args) {
		System.out.println("请输入圆的半径：");
		Scanner sc = new Scanner(System.in);
		double ra = sc.nextDouble();
		Circle circle = new Circle(ra);
		System.out.println("圆的面积为："+circle.area());
		System.out.println("圆的周长为："+circle.perimeter());
	}
}
