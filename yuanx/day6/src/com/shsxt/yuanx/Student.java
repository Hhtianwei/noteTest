package com.shsxt.yuanx;

public class Student {
	String name ;
	 boolean isfee=false;

	public  void fees(){
		if( isfee){System.out.println(name+"请交学费");}
		else{System.out.println(name+"good");}
}
}
