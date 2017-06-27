package com.shsxt.yuanx2;

public class Duck {
	private String name="小丑鸭";
	private int age=11;
	//覆盖Object的toString方法
	
	public String toString(){
		return this.name+this.age;
	}

}
