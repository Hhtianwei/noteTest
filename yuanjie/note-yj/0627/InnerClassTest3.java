package com.shsxt.inner;

public class InnerClassTest3 {
	public static void main(String[] args){
		//1.Test不能new接口2.Test对象中的test方法想要完成什么功能有你来定
		test(new Test(){
			@Override
			public void test(){
				System.out.println("想怎么实现就怎么实现");
			}
		});
	}
	//回调 
	public static void test(Test obj){
		obj.test();
	}
}

interface Test{
	void test();
}