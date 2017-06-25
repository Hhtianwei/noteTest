package com.shsxt.yuanx;

public class Icecream {
	double salesPrice;
	int stockNum;
	
	public Icecream(double d, int i) {
		salesPrice = d;
		stockNum = i;}
	public void display(){
		System.out.println("冰柜里有"+stockNum+"件雪糕售卖，每件"+salesPrice+"元。");
	}
}
