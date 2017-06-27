package com.shsxt.yuanxtest;

public class PlainRect extends Rect {
	double startX;
	double startY;

	PlainRect() {
		startX = 0;
		startY = 0;
		width = 0;
		height = 0;
	}

	PlainRect(double startX, double startY, double width, double height) {
		this.startX = startX;
		this.startY = startY;
		this.width = width;
		this.height = height;
	}

	public boolean isInside(double x, double y) {
		if (x >= startX && x <= (startX + width) && y < startY && y >= (startY - height)) {
			return true;
		} else {
			return false;
		}
	}

}
