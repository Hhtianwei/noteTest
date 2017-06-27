package com.shsxt.jie;

public class Icecream {
	private double salesPrice;
	private int stockNum;
	
	public Icecream(double price,int num){
		salesPrice = price;
		stockNum = num;
	}
	
	public void display(){
		System.out.println("冰柜里有"+stockNum+"件雪糕售卖，每件"+salesPrice+"元");
	}
}
