package com.shsxt.yuanx;

public class ConstructorDemo2 {
	public static void main(String[] args) {
		Dog dog1 = new Dog("哈士奇", "huiheise");
		System.out.println(dog1.type);
		System.out.println(dog1.color);
	}

}

  class Dog {
	String type;
	String color;

	Dog(String type, String color) {
		System.out.println(type + color);
	}

	public String getType() {

		return type;

	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {

		return color;

	}

	public void setColor(String color) {
		this.color = color;
	}

}
