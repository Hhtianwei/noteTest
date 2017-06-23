package com.shsxt.yuanxtest;

/*1、定义长方形类，含：

属性：宽、高（整型）；

方法：求周长、面积；

构造方法3个：（1）无参——宽、高默认值为1；（2）1个参数——宽、高均为参数值；（3）2个参数——宽、高各为参数值。

要求：进行测试。*/
public class Rect1 {
public	int width;
public	int height;

	int perimeter() {
		return (width + height) * 2;
	}

	int area() {
		return width * height;
	}

	Rect1() {
		this.width = 1;
		this.height = 1;

	}

	Rect1(int width) {
		this.width = width;
		this.height=width;

	}

	Rect1(int width, int height) {
		this.width = width;
		this.height = height;

	}
}
