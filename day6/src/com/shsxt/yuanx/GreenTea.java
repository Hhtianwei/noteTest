package com.shsxt.yuanx;

public class GreenTea {
	double salePrice;
	int stockNum;

	GreenTea(double d, int i) {
		salePrice = d;
		stockNum = i;
	}

	public void display() {
		System.out.println("饮料区有" + stockNum + "件绿茶售卖，每件" + salePrice + "元");
	}
}
