package com.shsxt.jie;

public class Dog {
	String type;
	String color;
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
	
	@Override
	public boolean equals(Object obj){
		Dog dog = (Dog)obj;
		return this.type.equals(dog.type)&&this.color.equals(dog.color);
				
	}
}
