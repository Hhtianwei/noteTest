package com.shsxt.thread;

public class SynchronizedTest {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		new A(obj1, obj2).start();
		new B(obj1, obj2).start();

	}
}

class A extends Thread {
	Object obj1;
	Object obj2;

	public A() {
		super();
	}

	public A(Object obj1, Object obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	@Override
	public void run() {
		synchronized (obj1) {
			System.out.println("obj1-->A");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			synchronized (obj2) {
				System.out.println("给我烟");
			}
		}
	}
}

class B extends Thread {
	Object obj1;
	Object obj2;

	public B() {
		super();
	}

	public B(Object obj1, Object obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	@Override
	public void run() {
		synchronized (obj2) {
			System.out.println("obj1-->B");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			synchronized (obj1) {
				System.out.println("给我钱");
			}
		}
	}
}
