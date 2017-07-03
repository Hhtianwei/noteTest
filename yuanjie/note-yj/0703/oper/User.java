package com.shsxt.reflect.oper;

public class User {
	private String uname;
	public String getUname(){
		return uname;
	}
	
	public void setUname(String uname){
		this.uname = uname;
	}
	private void test(){
		System.out.println("我要通过反射执行");
	}
	
	public void test(String str){
		System.out.println(str);
	}
	
	public void test(int i){
		System.out.println( i + " " + this.uname);
	}
	
	
	public static void T(){
		System.out.println("T()");
	}
}
