package com.shsxt.reflect;

public class User {
	private String name;
	private String uid;

	public User(String name, String uid) {
		super();
		this.name = name;
		this.uid = uid;
	}

	public User() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public void test(){
		System.out.println("test()");
	}
	public void test(int a){
		System.out.println("test(int)");
	}
	private void test(int a,int b){
		System.out.println("test(int,int)");
	}
}
