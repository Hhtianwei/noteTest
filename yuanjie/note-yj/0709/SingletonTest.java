package com.shsxt.test;

public class SingletonTest {
	public static void main(String[] args) {
		SingletonTest s1 = SingletonTest.getInstance();
		SingletonTest s2 = SingletonTest.getInstance();
		System.out.println("s1 == s2?-->" + (s1 == s2));
		Singleton ss = Singleton.getInstance();
		Singleton sl = Singleton.getInstance();
		System.out.println("ss == sl?-->" + (ss == sl));
	}
	//懒汉，因为懒，所以用的时候才给它new对象
	private static SingletonTest instance;

	private SingletonTest() {
	}

	public static SingletonTest getInstance() {
		if (instance == null) {
			instance = new SingletonTest();
		}
		return instance;
	}

}

class Singleton {
	//饿汉，因为饿，所以类加载的时候就给它new对象
	private static Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}
}