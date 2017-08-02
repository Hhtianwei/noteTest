package com.shsxt.thread;

public class TestThread {
	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		mt.start();
		
		for(int i = 0;i < 10;i++){
			System.out.println("Main...Thread");
			Thread.sleep(10);
		}
	}
}
