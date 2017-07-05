package com.shsxt.thread;

/*
 * 停止线程的方式
 * 1、自然结束
 * 2、外部干涉
 * 
 * 1、meizhi聊天
 * 2、敲代码
 */
public class StopThread {
	public static void main(String[] args) throws InterruptedException {
		DoSomething ds1 = new DoSomething("chat");
		DoSomething ds2 = new DoSomething("coding");
		Thread t1 = new Thread(ds1, "ThreadChat");
		Thread t2 = new Thread(ds2, "ThreadCode");
		t1.start();
		t2.start();

		Thread.sleep(1000);
		ds1.setFlag(false);
		ds2.setFlag(false);

		System.out.println(Thread.currentThread().getName());
	}
}

class DoSomething implements Runnable {
	// 做什么事情
	private String str;// chat  --> 聊天        coding-->敲代码
	boolean flag = true;// 表示你还可以继续做事

	public DoSomething() {
		super();
	}

	public DoSomething(String str) {
		super();
		this.str = str;
	}
	// 为了能让外界干涉内部的执行
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	// 线程体， 真正做事情
	@Override
	public void run() {
		while (flag) {
			System.out.println(Thread.currentThread().getName() + "----->" + str);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
