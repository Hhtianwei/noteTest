package com.shsxt.test;

/*
 * 定义一个“点”（Point）类来表示三维空间的点（有三个坐标）。要求如下： 
a) 可以生成具有特定坐标的点对象 
b) 提供可以计算该“点”距原点距离的平方 
c) 提供可以计算该“点”距离另外一个“点”距离的平方 
 */
public class Point {
	double x;
	double y;
	double z;

	public static void main(String[] args) {
		Point point = new Point(3.0, 4.0, 5.0);
		double pointDis = point.distance(0.0, 0.0, 0.0);
		double pointDis1 = point.distance(1.0, 2.0, 3.0);
		System.out.println("距离远点的平方为：" + pointDis);
		System.out.println("距离另一个点的平方为：" + pointDis1);
	}

	Point(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	double distance(double a, double b, double c) {
		return (x - a) * (x - a) + (y - b) * (y - b) + (z - c) * (z - c);
	}
}
