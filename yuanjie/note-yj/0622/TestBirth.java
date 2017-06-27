package com.shsxt.jie;

public class TestBirth {
	public static void main(String[] args){
		TestBirth tb = new TestBirth();
		int date = 9;
		BirthDate d1 = new BirthDate(7,7,1970);
		BirthDate d2 = new BirthDate(1,1,2000);
		tb.change1(date);
		tb.change2(d1);
		tb.change3(d2);
		System.out.println(date);//9
		d1.disPlay();//7,7,1970
		d2.disPlay();//22,1,2000
	}
	void change1(int i){
		i = 1234;
	}
	void change2(BirthDate b){
		b = new BirthDate(22,2,2004);
	}
	void change3(BirthDate b){
		b.setDay(22);
	}
}
