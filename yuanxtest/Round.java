package com.shsxt.yuanxtest;

/*定义圆类，它有一个变量radius(半径)。从键盘输入数据，通过构造方法传递给radius，编程计算并输出圆的周长和面积（确保输入的数据不为负数）。

要求：进行测试*/
public class Round {
	double radius;

	Round(double radius) {
		this.radius = radius;
	}

	double perimater() {

		return 2 * radius * Math.PI;
	}

	double area() {
		return Math.PI * radius * radius;
	}

}
