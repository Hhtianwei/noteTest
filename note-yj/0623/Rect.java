package com.shsxt.test;

public class Rect {
	protected int width;
	protected int height;
	
	public Rect(){
		this.width = 10;
		this.height = 10;
	}
	
	public Rect(int width,int height){
		this.width = width;
		this.height = height;
	}
	
	public int area(){
		return this.width*this.height;
	}
	
	public int preimeter(){
		return (this.width+this.height)*2;
	}
}
