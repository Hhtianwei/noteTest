package com.shsxt.yuanx1;

public class Penguin extends Bird {
	public void fly() {
		System.out.println("我想飞");
	}

	public void swimming() {
		super.fly();
		this.fly();
		System.out.println("虽然我飞不起来，但我游泳很好");
	}
}