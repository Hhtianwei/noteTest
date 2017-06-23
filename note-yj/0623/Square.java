package com.shsxt.test;

public class Square extends Rect{
	int side;
	
	public Square(){
		side = 1;
	}
	
	public Square(int side){
		this.side = side;
	}
	
	@Override
	public int area(){
		return this.side*this.side;
	}
	
	@Override
	public int preimeter() {
		return 4*this.side;
	}
	
}
