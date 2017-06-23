package com.shsxt.test;

public class Rect1 {
	int width;
	int height;
	
	public Rect1(){
		this.width = 1;
		this.height = 1;
	}
	
	public Rect1(int a){
		this.width = a;
		this.height = a;
	}
	
	public Rect1(int w,int h){
		this.width = w;
		this.height = h;
	}
	
	public int area(){
		return this.width*this.height;
	}
	
	public int perimeter(){
		return (this.width+this.height)*2;
	}
}
