package com.shsxt.jie;
/*
 * 定义3个商品类，分别是饼干（Cookie），绿茶（GreenTea），雪糕（Icecream）
 * 属性：售价（salesPrice），库存量（stockNum）
 * 构造方法，用来初始化商品的各个属性字段
 * display方法，打印商品中文名称、售价、库存量
 */
public class TestDisplay {
	public static void main(String[] args){
		Cookie cookie = new Cookie(5.0,30);
		GreenTea gt = new GreenTea(3.5,20);
		Icecream icecream = new Icecream(3.0,10);
		
		cookie.diaplay();
		gt.display();
		icecream.display();
	}
}

