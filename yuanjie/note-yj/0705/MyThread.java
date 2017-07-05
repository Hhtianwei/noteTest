package com.shsxt.thread;

public class MyThread  extends Thread{
	@Override
	public void run() {
		for(int i = 0;i < 10;i++){
			System.out.println("MyThread...");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
