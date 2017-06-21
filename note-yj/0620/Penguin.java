package com.shsxt.jie;

public class Penguin extends Bird{
	public void fly(){
		System.out.println("我想飞，确怎么样也飞不高");
	}
	
	public void swimming(){
		super.fly();
		this.fly();
		System.out.println("虽然我飞不高，但是我会游泳，啦啦啦");
	}
}
