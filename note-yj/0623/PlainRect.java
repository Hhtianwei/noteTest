package com.shsxt.test;

public class PlainRect extends Rect{
	int startX;
	int startY;
	
	public PlainRect(int startX,int startY,int width,int height){
		this.startX = startX;
		this.startX = startY;
		this.width = width;
		this.height = height;
	}
	
	public PlainRect(){
		this.startX = 0;
		this.startY = 0;
		this.width = 0;
		this.height = 0;
	}
	
	public boolean isInside(double x,double y){
		if(x>=startX&&x<=(startX+width)&&y<startY&&y>=(startY-height)){
			return true;
		}
		return false;
	}
}
