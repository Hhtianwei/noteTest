package com.shsxt.yuanxtest;

public class Rect {
	double width;
	double height;

	Rect() {
		width = 10;
		height = 10;
	}

	Rect(double width, double height) {
		this.width = width;
		this.height = height;
	}

	double area() {
		return width * height;
	}

	double perimeter() {
		return (width + height) * 2;
	}
}
