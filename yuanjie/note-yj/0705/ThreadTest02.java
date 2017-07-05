package com.shsxt.thread;

public class ThreadTest02 {
	public static void main(String[] args) throws InterruptedException {
		MyThread02 mt = new MyThread02();
		Thread t = new Thread(mt);
		t.start();
		

		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadTest02...");
			Thread.sleep(20);
		}
	}
}

class MyThread02 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("I am MyThread02");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}