package com.shsxt.test;

public class Singleton {
	public static void main(String[] args) {
		Singleton s1 = SingletonTest.getInstance();
		Singleton s2 = SingletonTest.getInstance();
		System.out.println(s1 == s2);
	}

}

class SingletonTest {
	private static Singleton instance = new Singleton();

	private SingletonTest() {}

	public static Singleton getInstance() {
		return instance;
	}

}
