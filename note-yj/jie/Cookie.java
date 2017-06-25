package com.shsxt.jie;

public class Cookie {
	private double salesPrice;
	private int stockNum;
	
	public Cookie(double price,int num){
		salesPrice = price;
		stockNum = num;
	}
	
	public void diaplay(){
		System.out.println("干货区有"+stockNum+"件饼干售卖，每件"+salesPrice+"元");
	}
}
