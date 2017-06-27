package com.shsxt.yuanxtest;

public class Square extends Rect {
	double side;

	Square() {
		side = 1;
	}

	Square(double side) {
		this.side = side;
	}

	double area() {
		return side * side;
	}

	double perimeter() {
		return side * 4;
	}
}
