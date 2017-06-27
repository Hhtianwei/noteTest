package com.shsxt.yuanx;

public class Cookie {
	double salePrice;
	int stockNum;

	Cookie(double d, int i) {
		salePrice = d;
		stockNum = i;
	}

	public void display() {
		System.out.println("干货区有" + stockNum + "件饼干售卖，每件" + salePrice + "元");
	}
}
