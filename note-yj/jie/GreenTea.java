package com.shsxt.jie;

public class GreenTea {
	private double salesPrice;
	private int stockNum;
	
	public GreenTea(double price,int num){
		salesPrice = price;
		stockNum = num;
	}
	
	public void display(){
		System.out.println("饮料区有"+stockNum+"件绿茶售卖，每件"+salesPrice+"元");
	}
}
