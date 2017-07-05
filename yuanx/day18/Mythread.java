package com.shsxt.yuanx;

public class Mythread {
	public static void main(String[] args) throws Exception {
		
		new MyThread1().start();
		for (int i = 0; i < 10; i++) {
			System.out.println("我是主方法的线程");
			Thread.sleep(1);
		}
		

	}
}

class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("我是调用方法的线程");
		}

	}

}
class Mythread2 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}