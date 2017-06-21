package com.shsxt.yuanx;

public class BlockThisDemo {
	public static int a = 6;

	{
		a = 10;
		System.out.println( a);
	}

	static {
		a = 6;
		System.out.println( a);
	}

	public BlockThisDemo() {
		this(a);
		System.out.println( a);
		System.out.println(a);
	}

	public BlockThisDemo(int n) {
		System.out.println( n);
		System.out.println( this.a);//
	}

	public static void main(String[] args) {
		System.out.println("main");
		BlockThisDemo tsc = new BlockThisDemo();
	}
}
