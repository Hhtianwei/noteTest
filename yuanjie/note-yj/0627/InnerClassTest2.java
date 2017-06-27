package com.shsxt.inner;

public class InnerClassTest2 {
	public static void main(String[] args){
		Outter5 out = new Outter5();
		System.out.println(out.makeInner(" ghi"));
	}
}

class Outter5{
	public Object makeInner(String str){
		return new Object(){
			private String a = "def";
			@Override
			public String toString(){
				return "abc "+a+str;
			}
		};
	}
}
