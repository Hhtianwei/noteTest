package com.shsxt.jie;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person("赵四");
		Computer computer = new Computer();
		computer.type = "Lenovo";
		person.user(computer);
	}
}
