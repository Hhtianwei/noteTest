package com.shsxt.yuanxtest;

import java.util.Scanner;

public class RoundTest {
	public static void main(String[] args) {
		System.out.println("请输入一个不为负数得数");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		Round r = new Round(a);
		System.out.println(r.perimater());
		System.out.println(r.area());
	}

}
