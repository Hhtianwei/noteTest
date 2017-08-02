package com.shsxt.yuanx;

public class StopTest {

}

class DoSomething implements Runnable {
	// 做什么事情
	String str;
	boolean flag = true;

	public DoSomething() {
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public void run() {
		while (flag) {
			System.out.println(Thread.currentThread().getName() + "--->" + str);
		}

	}
}