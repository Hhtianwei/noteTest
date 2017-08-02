package com.shsxt.yuanx;

public class SynchronizedTest {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		new A(obj1, obj2).start();

		new Thread(new B(obj1, obj2)).start();
	}
}

class A extends Thread {
	Object obj1;
	Object obj2;

	public A() {
	}

	public A(Object obj1, Object obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	@Override
	public void run() {
		synchronized (obj1) {

		}
		synchronized (obj2) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println("给我烟");
		}
	}
}

class B implements Runnable {
	Object obj1;
	Object obj2;

	public B() {
	}

	public B(Object obj1, Object obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	@Override
	public void run() {
		synchronized (obj2) {

			synchronized (obj1) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				System.out.println("给我钱");
			}

		}
	}

}
