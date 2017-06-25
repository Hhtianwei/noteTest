package com.shsxt.jie;

import java.util.Scanner;

public class BusTest {
	public static void main(String[] args) {
		Bus bus = new Bus();
		System.out.println("您正在行驶的速度是：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		bus.notice(num);
	}
}
