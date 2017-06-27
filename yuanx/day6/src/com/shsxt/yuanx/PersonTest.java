package com.shsxt.yuanx;

public class PersonTest {
	public static void main(String[] args) {

		Person1 p = new Person1("李老板");
		Computer computer = new Computer();
		computer.type = "大苹果";
		p.use(computer);
	}

}
