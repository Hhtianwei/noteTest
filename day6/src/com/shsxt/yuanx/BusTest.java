package com.shsxt.yuanx;

public class BusTest {
	public static void main(String[] args){
		Bus bus=new Bus();
		bus.speed=70.0;
		if (bus.speed>60){bus.notice();}else{System.out.println("老司机");}
	}

}
