package com.shsxt.jie;

public class TestEquals {
		public static void main(String[] args){
			Dog dog1 = new Dog();
			dog1.color = "yellow";
			dog1.type = "大黄";
			Dog dog2 = new Dog();
			dog2.color = "yellow";
			dog2.type = "大黄";
			System.out.println(dog1 == dog2);
			System.out.println(dog1.equals(dog2));
			
		}
}
