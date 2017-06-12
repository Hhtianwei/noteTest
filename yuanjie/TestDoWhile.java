package com.shsxt.jie;
/*
 * 	do {
				循环体语句;
			}while(判断条件语句);
			
			扩展格式：
			初始化语句;
			do {
				循环体语句;
				控制条件语句;
			}while(判断条件语句);
			

 */
public class TestDoWhile {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println(i);
			i++;//控制条件
		}while (i<1);
		
		while (i < 1){
			System.out.println(i);
			i++;
		}
	}
}
